package src.team;

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
    public boolean getProjectTask() {
        // Return all the task present.
        return false;
    }
}
