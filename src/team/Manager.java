package src.team;

import src.ITaskController;
import src.TaskDataBaseModel;
import src.task.TaskController;

import java.util.List;

/**
 * A class to handle the functionality when user type is manager.
 */
public class Manager extends User {

    public Manager(String empID) {
        super(empID);
    }

    @Override
    public boolean addTeamMember(String empID, String mProjectName) {
        // add database call to add the member.
        return true;
    }

    @Override
    public boolean removeTeamMember(String empID) {
        // add database call to remove the member.
        return false;
    }

    @Override
    public List<TaskDataBaseModel> getProjectTask() {
        // Return all the task present.
        return TaskController.getInstance().getAllTasks();
    }
}
