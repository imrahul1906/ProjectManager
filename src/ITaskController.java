package src;

import java.util.ArrayList;

/**
 * An interface for class {@link src.task.TaskController} that handles DB related operations.
 */
public interface ITaskController {
    void insertTaskData(TaskDataBaseModel dataBaseModel);

    ArrayList<TaskDataBaseModel> getTaskByEmployeeID(String EmpID);

    ArrayList<TaskDataBaseModel> getAllTasks();

    boolean updateTaskPriority(String taskID);

    boolean updateTaskStatus(String taskID, int wip);

    int getTaskStatus(String task);
}
