package src.task;

import src.TaskDataBaseModel;
import src.ITaskTypeBase;

/**
 * An abstract class to handle the functionalities of a task types.
 */
public abstract class TaskTypeBase implements ITaskTypeBase {

    /**
     * Method to return the title of the attribute that are common for all the task types.
     * @param attribute whose title needs to be returned.
     * @return a string value of the title of the attribute.
     */
    @Override
    public String getAttributesTitle(int attribute) {
        if (attribute == TaskAttributes.Attributes.ASSIGNEE.ordinal()) return "Assignee";
        if (attribute == TaskAttributes.Attributes.REPORTER.ordinal()) return "Reporter";
        // Similarly all the attributes whose title does not change with task type can be defined here.
        return null;
    }
}
