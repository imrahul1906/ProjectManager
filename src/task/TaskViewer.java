package src.task;

import src.TaskDataBaseModel;
import src.exception.InvalidStatusException;

/**
 * A class to handle functionalities when a particular task is opened.
 */
public class TaskViewer {
    private TaskDataBaseModel mDataBaseModel;

    /**
     * A method to update the status of a task.
     *
     * @param taskStatus Status that should be updated for the said task.
     * @return true if update is successful else false.
     */
    boolean changeTaskStatus(int taskStatus) {
        // status can only be changed when all of its subtask's status matches.
        try {
            if (canChangeStatus(taskStatus)) {
                TaskController.getInstance().updateTaskStatus(mDataBaseModel.getTaskID(), taskStatus);
            }
        } catch (InvalidStatusException e) {
            // print crash stack or customized message based in the requirement.
            return false;
        }
        return true;
    }

    /**
     * A method to know if the status of a task can be changed to completed
     *
     * @return true if all its subtask are completed else false.
     */
    private boolean canChangeStatus(int taskStatus) throws InvalidStatusException {
        String[] subTasks = mDataBaseModel.getSubTasks();
        // If All the subtasks has the same status , then only the status can be changed.
        // if subtasks are not WIP then parent task can not be WIP
        // If subtasks are not IN-REVIEW then parent task can not be in IN_REVIEW and so on.
        for (String task : subTasks) {
            int status = TaskController.getInstance().getTaskStatus(task);
            if (status != taskStatus)
                throw new InvalidStatusException(
                        "The subtask/subtasks's status is different. So status can not be changed.");
        }
        return true;
    }
}
