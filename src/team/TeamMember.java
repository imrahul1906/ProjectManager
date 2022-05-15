package src.team;

import src.TaskDataBaseModel;
import src.exception.InvalidAccessException;
import src.task.TaskController;

import java.util.List;

/**
 * A class to handle the functionality when user is anyone but manager.
 */
public class TeamMember extends User {

    public TeamMember(String empID) {
        super(empID);
    }

    @Override
    public boolean addTeamMember(String empID, String mProjectName) throws InvalidAccessException {
        throw new InvalidAccessException("This user can not add team members");
    }

    @Override
    public boolean removeTeamMember(String empID) throws InvalidAccessException {
        throw new InvalidAccessException("This user can not add team members");
    }

    @Override
    public List<TaskDataBaseModel> getProjectTask() {
        // A request to the database will be made to get the task of the user.
        return TaskController.getInstance().getTaskByEmployeeID(mEmployeeID);
    }
}
