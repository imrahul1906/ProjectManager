package src.team;

import src.common.ProjectErrorHandler;

/**
 * A class to handle the functionality when user is anyone but manager.
 */
public class TeamMember extends User {

    public TeamMember(String empID) {
        super(empID);
    }

    @Override
    public boolean addTeamMember(String empID, String mProjectName) throws ProjectErrorHandler.InvalidAccessException {
        throw new ProjectErrorHandler.InvalidAccessException("This user can not add team members");
    }

    @Override
    public boolean removeTeamMember(String empID) throws ProjectErrorHandler.InvalidAccessException {
        throw new ProjectErrorHandler.InvalidAccessException("This user can not add team members");
    }

    @Override
    public boolean getProjectTask() {
        // A request to the database will be made to get the task of the user.
        return false;
    }
}
