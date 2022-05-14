package src;

import src.common.ProjectErrorHandler;

import java.util.List;

public interface IUser {

    /**
     * The method to add team member for a project.
     *
     * @param empId - ID of the employee who is to be added.
     * @param mProjectName - Project name where member needs to be added.
     * @return true if successfully added in the database else false.
     */
    boolean addTeamMember(String empId, String mProjectName) throws ProjectErrorHandler.InvalidAccessException;


    /**
     * The method to remove team member for a project.
     *
     * @param empId - ID of the employee who is to be removed.
     * @return true if successfully removed from the database else false.
     */
    boolean removeTeamMember(String empId) throws ProjectErrorHandler.InvalidAccessException;

    /**
     * The method will be used to get all the tasks.
     *
     * @return for Manager, it will return all the tasks.
     * for TeamMember, It will return the task of the said member.
     */
    List<TaskDataBaseModel> getProjectTask();

    /**
     * The method to create task.
     */
    void createTask();
}
