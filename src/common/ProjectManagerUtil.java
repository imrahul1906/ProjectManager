package src.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectManagerUtil {

    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int DAYS_PER_WEEK = 7;
    private static final int MILLIS_OFFSET = 1000;
    private static final int INVALID_DAYS = 0;

    /**
     * Method to know if the name string is valid or not.
     *
     * @param projectName Name that needs to be checked.
     * @return true is the name is valid .
     * @throws ProjectErrorHandler.InvalidNameException
     */
    public static boolean isValidName(String projectName) throws ProjectErrorHandler.InvalidNameException {
        if (projectName == null)
            throw new ProjectErrorHandler.InvalidNameException("The name can not be null or empty");
        return true;
    }

    /**
     * Enum for type of user that can use the tool.
     */
    public enum UserType {
        MANAGER, TEAM_MEMBER
    }

    /**
     * Method to know the user type (manager / TeamMember).
     *
     * @param empID       ID that is used to know the user type.
     * @param projectName used to validate the user if one belongs to the project or not.
     * @return User type .
     * @throws ProjectErrorHandler.InvalidUserException
     */
    public static UserType getUserType(String empID, String projectName) throws ProjectErrorHandler.InvalidUserException {
        if (!isValidUser(projectName, empID)) throw new ProjectErrorHandler.InvalidUserException("Invalid user");

        if (isManager(empID)) return UserType.MANAGER;
        return UserType.TEAM_MEMBER;
    }

    /**
     * Method to know if the user is manager
     *
     * @param empID ID that is used to identify the user type.
     * @return true if the user is Manager.
     * @throws ProjectErrorHandler.InvalidUserException
     */
    public static boolean isManager(String empID) throws ProjectErrorHandler.InvalidUserException {
        // There will exist an exposed api to know if the  given employee id is manager or not.
        return false;
    }

    /**
     * Method to validate the user
     *
     * @param projectName where user needs to be validated
     * @param empID       Id of the user who needs to be validated.
     * @return true if user is belongs to the project.
     */
    private static boolean isValidUser(String projectName, String empID) {
        if (!isEmpIncludedInProject(projectName, empID)) return false;
        // There will exist an exposed api to know if the  given employee is included in the project or not.
        return true;
    }

    private static boolean isEmpIncludedInProject(String projectName, String empID) {
        // get project info from database -- List<ProjectDataBaseModel> list
        // check if "mProjectMembers" contains the employee or not. -- list.contains(empID)
        // if yes then return true else false;
        return false;
    }

    /**
     * Method to get Employee name from emp ID.
     *
     * @param empID Id of the Employee
     * @return Name of the employee
     */
    public static String getEmployeeName(String empID) {
        return null;
    }

    /**
     * A Method to return the remaining months/week/days before deadline.
     *
     * @param expDate deadline dates and time in milliseconds.
     * @return remaining days before deadline.
     */
    public static String getRemainingDaysBeforeDeadLine(Date expDate) {
        long expDateInMillis = getDateInMillis(expDate);
        long expDateInSeconds = expDateInMillis / MILLIS_OFFSET;
        long todayDate = System.currentTimeMillis() / MILLIS_OFFSET;
        long diff = expDateInMillis - todayDate;
        int days = (int) (diff / (SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY));
        int week = days / DAYS_PER_WEEK;
        if (week > 1) return String.format("Expiring in %d weeks", week);
        if (week == 1) return "Expiring in one week";
        if (days > 1) return String.format("Expiring in %d days", days);
        if (days == 1) return "Expiring in one day";
        if (days == INVALID_DAYS) return "Expiring Today";
        return "Expired";
    }

    private static long getDateInMillis(Date expDate) {
        DateFormat s1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String date = s1.format(expDate);
        return Long.parseLong(date);
    }
}
