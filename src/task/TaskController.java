package src.task;

import src.ITaskController;
import src.TaskDataBaseModel;

import java.util.ArrayList;

/**
 * A class to handle DB related operation of a task.
 */
public class TaskController implements ITaskController {
    private static ITaskController sTaskController;

    /**
     * Method to get the instance of the class. To achieve consistency creating only one object and using lock.
     *
     * @return instance of the current class
     */
    public static ITaskController getInstance() {
        if (sTaskController == null) {
            synchronized (TaskController.class) {
                if (sTaskController == null) sTaskController = new TaskController();
            }
        }
        return sTaskController;
    }

    @Override
    public void insertTaskData(TaskDataBaseModel dataBaseModel) {

    }

    @Override
    public ArrayList<TaskDataBaseModel> getTaskByEmployeeID(String EmpID) {
        return null;
    }

    @Override
    public ArrayList<TaskDataBaseModel> getAllTasks() {
        return null;
    }

    @Override
    public boolean updateTaskPriority(String taskID) {
        return false;
    }

    @Override
    public boolean updateTaskStatus(String taskID, int wip) {
        return false;
    }

    @Override
    public int getTaskStatus(String task) {
        return 0;
    }

    private TaskController() {
    }
}
