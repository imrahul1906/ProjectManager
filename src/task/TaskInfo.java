package src.task;

import java.util.Date;

/**
 * A class to handle all the information regarding a task item.
 */
public class TaskInfo {
    private String mSummary;
    private String mDescription;
    private String mReporter;
    private TaskCreateView.TaskPriority mPriority;
    private TaskCreateView.TaskStatus mTaskStatus;
    private String[] mAssignee;
    // array to keep track if the current task is dependent on any other tasks.
    private String[] mSubTask;
    private Date mDeadLine;
    // To store all the comments on a specific task
    private Comment[] mComments;


    class Comment {
        String mComment;
        String mEmpID;
        String mCommentTime;
    }
}
