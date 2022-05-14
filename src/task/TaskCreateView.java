package src.task;

import src.ITaskTypeBase;
import src.ProjectManagerFactory;
import src.TaskDataBaseModel;

import java.util.List;

/**
 * A class responsible for creating a task.
 */
public class TaskCreateView {

    // A list of each type of task's instances.
    private List<ITaskTypeBase> mTaskTypeList;
    private ITaskTypeBase mTaskType;

    enum TaskStatus {
        TODO, WIP, IN_REVIEW, COMPLETED
    }

    enum TaskPriority {
        CRITICAL, NORMAL, MINOR
    }

    private void initTaskTypes() {
        TaskConstants.TaskType[] taskTypes = TaskConstants.TaskType.values();
        // create task type
        mTaskTypeList = ProjectManagerFactory.crateTaskType(taskTypes);
        // create the list that contains the attribute that should not be shown for a task type
        mTaskType.createNotAllowedAttributesList();
    }

    /**
     * Method to update the create task view when user selects Task Type.
     * @param taskType the tasktype that user selected.
     */
    private void onTaskTypeChanged(TaskConstants.TaskType taskType) {
        int index = taskType.ordinal();
        mTaskType = mTaskTypeList.get(index);
        updateTaskAttributesViews();
    }

    /**
     * Method to update the visibility of various task attributes based on the selection user makes
     * in the task type field while creating task.
     */
    private void updateTaskAttributesViews() {
        TaskAttributes.Attributes[] attributes = TaskAttributes.Attributes.values();
        for (TaskAttributes.Attributes attrs : attributes) {
            boolean shouldShow = mTaskType.shouldAttrBeVisible(attrs.ordinal());
            updateVisibility(shouldShow, attrs);
            if (shouldShow) {
                String title = mTaskType.getAttributesTitle(attrs.ordinal());
                updateTitle(attrs, title);
            }
        }
    }

    private void updateTitle(TaskAttributes.Attributes attrs, String title) {
        switch (attrs) {
            case TITLE :
                // titleView.SetText(title);
                break;
            case SUMMARY:
                // summaryView.SetText(title);
                break;
            case DESCRIPTION:
                // descriptionView.SetText(title);
                break;
            case TARGET_VERSION:
                // targetVersionView.SetText(title);
                break;
            default:
                break;
        }
    }

    private void updateVisibility(boolean shouldShow, TaskAttributes.Attributes attrs) {
        switch (attrs) {
            case TITLE :
                // titleView.setVisibility(shouldShow);
                break;
            case SUMMARY:
                // summaryView.setVisibility(shouldShow);
                break;
            case DESCRIPTION:
                // descriptionView.setVisibility(shouldShow);
                break;
            case TARGET_VERSION:
                // targetVersionView.setVisibility(shouldShow);
                break;
            default:
                break;
        }
    }

    /**
     * Method to update all the task info in the database when user presses submit.
     * @param taskInfo Object of TaskInfo that contains all the information of a task.
     */
    public void createTask(TaskInfo taskInfo) {
        TaskDataBaseModel dataBaseModel = TaskDataBaseModel.createDatabaseMode(taskInfo);
        TaskController.getInstance().insertTaskData(dataBaseModel);
    }
}
