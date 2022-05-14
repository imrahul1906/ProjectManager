package src;

import src.common.ProjectManagerUtil;
import src.task.*;
import src.team.Manager;
import src.team.TeamMember;

import java.util.ArrayList;
import java.util.List;

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

    public static List<ITaskTypeBase> crateTaskType(TaskConstants.TaskType[] taskTypes) {
        ITaskTypeBase taskType = null;
        List<ITaskTypeBase> taskTypeList = new ArrayList<>();
        for (TaskConstants.TaskType t : taskTypes) {
            switch (t) {
                case BUG:
                    taskType = new TaskTypeBug();
                    break;
                case IMPROVEMENT:
                    taskType = new TaskTypeImprovement();
                    break;
                case NEW_FEATURE:
                    taskType = new TaskTypeNewFeature();
                    break;
                default:
            }
            taskTypeList.add(taskType);
        }
        return taskTypeList;
    }
}
