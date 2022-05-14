package src;

import src.task.TaskInfo;

import java.util.Date;

/**
 * Information model of database.
 */
public class TaskDataBaseModel {
    private String mSummary;
    private String mDescription;
    private String mReporter;
    private int mPriority;
    private int mTaskStatus;
    private String mAssignee;
    private String[] mSubTask;
    private String mTaskID;
    private Date mDateCreatedOn;
    private Date mDeadLine;

    public static TaskDataBaseModel createDatabaseMode(TaskInfo taskInfo) {
        TaskDataBaseModel dataBaseModel = new TaskDataBaseModel();
        // Fill all the values from task info to database model.
        return dataBaseModel;
    }

    public String getTaskID() {
        return mTaskID;
    }

    public String[] getSubTasks() {
        return mSubTask;
    }

    public Date getDeadLine() {
        return mDeadLine;
    }
}
