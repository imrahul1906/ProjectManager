package src.common;

public class ProjectManagerUtil {

    /**
     * Method to knwo if the name string is valid or not.
     * @param projectName Name that needs to be checked.
     * @return true is the name is valid .
     * @throws ProjectErrorHandler.InvalidNameException
     */
    public static boolean isValidName(String projectName) throws ProjectErrorHandler.InvalidNameException {
        if (projectName == null) throw new ProjectErrorHandler.InvalidNameException("The name can not be null or empty");
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
     * @param empID ID that is used to know the user type.
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
     * @param projectName where user needs to be validated
     * @param empID Id of the user who needs to be validated.
     * @return true if user is belongs to the project.
     */
    private static boolean isValidUser(String projectName, String empID) {
        if (!isEmpIncludedInProject(projectName , empID)) return false;
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

}
