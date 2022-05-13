package src;

import src.common.ProjectManagerUtil;
import src.team.Manager;
import src.team.TeamMember;

/**
 * A factory class for users and Tasks.
 */
public class ProjectManagerFactory {

    public static IUser createUser(ProjectManagerUtil.UserType userType, String empID) {
        switch (userType) {
            case MANAGER:
                return new Manager(empID);
            case TEAM_MEMBER:
                return new TeamMember(empID);
            default:
                return null;
        }
    }
}
