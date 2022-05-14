package src.team;

import src.IUser;
import src.common.ProjectManagerUtil;
import src.task.TaskCreateView;

/**
 * Class to handle the common functionalities of all User types.
 */
abstract class User implements IUser {
    String mEmployeeID;
    String mEmployeeName;
    private TaskCreateView mTaskCreator;

    User(String empID) {
        mEmployeeID = empID;
        mEmployeeName = ProjectManagerUtil.getEmployeeName(empID);
    }

    @Override
    public void createTask() {
        // A call to load TaskCreateView class will be made and screen where task's info is to be filled and task
        // is created will be opened.
    }
}
