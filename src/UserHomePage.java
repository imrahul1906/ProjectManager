package src;

import src.common.ProjectErrorHandler;
import src.common.ProjectManagerUtil;

import java.util.Date;
import java.util.List;

/**
 * Class to handle all home page operation of Project manager Tool.
 */
public class UserHomePage {
    // The user can be manager or Team member and home page might differ in functionalities.
    // for ex. Manager will see all the task on the home page but team member will only see their own.
    private ProjectManagerUtil.UserType mUserType;

    // Interface UserOperation is defined to achieve abstraction.
    private IUser mUser;

    private String mProjectName;
    private String mEmpID;

    /**
     * Method to instantiate the users type using the emp id.
     */
    private void initToolUser() {
        try {
            mUserType = ProjectManagerUtil.getUserType(mEmpID, mProjectName);
            mUser = ProjectManagerFactory.createUser(mUserType, mEmpID);
        } catch (ProjectErrorHandler.InvalidUserException e) {
            // print crash stack or customized message based in the requirement.
        }
    }

    /**
     * Method to initialize the task list.
     */
    private void initTaskList() {
        List<TaskDataBaseModel> taskList = mUser.getProjectTask();
        for (TaskDataBaseModel model : taskList) {
            Date expiredDate = model.getDeadLine();
            String remainingTime = ProjectManagerUtil.getRemainingDaysBeforeDeadLine(expiredDate);
            // this remaining time can be used to notify the user about the time constraint.
        }
    }

    private void addTeamMemberInProject(String empID) {
        try {
            mUser.addTeamMember(empID, mProjectName);
        } catch (ProjectErrorHandler.InvalidAccessException e) {
            // print crash stack or customized message based in the requirement.
        }
    }

    private void removeTeamMemberFromProject(String empID) {
        try {
            mUser.removeTeamMember(empID);
        } catch (ProjectErrorHandler.InvalidAccessException e) {
            // print crash stack or customized message based in the requirement.
        }
    }

    private void createTask() {
       mUser.createTask();
    }
}
