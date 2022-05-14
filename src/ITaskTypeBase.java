package src;

import src.task.TaskInfo;

/**
 * Interface for class {@link src.task.TaskTypeBase}
 */
public interface ITaskTypeBase {

    /**
     * A method to check if an attribute is supported in a Task Type.
     *
     * @return true if the attribute is supported else false.
     */
    boolean shouldAttrBeVisible(int attrs);

    /**
     * A method to create a list of attributes which are not supported by each task type.
     */
    void createNotAllowedAttributesList();

    /**
     * A Method to get title text for an attribute.
     * @param attribute for which title needs to be fetched.
     * @return title.
     */
    String getAttributesTitle(int attribute);
}
