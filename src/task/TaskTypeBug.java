package src.task;

import java.util.ArrayList;

/**
 * A class to handle functionalities of task type - Bug
 */
public class TaskTypeBug extends TaskTypeBase {
    private static ArrayList<TaskAttributes.Attributes> sNotAllowedAttributesList = new ArrayList<>();

    /**
     * method to create a list that contains all the attribute that should not be shown for this
     * task type.
     */
    @Override
    public void createNotAllowedAttributesList() {
        sNotAllowedAttributesList.add(TaskAttributes.Attributes.TARGET_BRANCH);
        sNotAllowedAttributesList.add(TaskAttributes.Attributes.COMPONENTS);
    }

    /**
     * Method to check if attribute should be visible on the task creating view for this task type.
     *
     * @param attrs whose visibility needs to be checked.
     * @return true if it should be visible else false.
     */
    @Override
    public boolean shouldAttrBeVisible(int attrs) {
        return !sNotAllowedAttributesList.contains(attrs);
    }

    /**
     * Method to return the title of the attribute.
     *
     * @param attribute whose title needs to be returned.
     * @return a string value of the title of the attribute.
     */
    @Override
    public String getAttributesTitle(int attribute) {
        if (attribute == TaskAttributes.Attributes.SUMMARY.ordinal()) return "Bug Summary";
        if (attribute == TaskAttributes.Attributes.DESCRIPTION.ordinal()) return "Bug Description";

        return super.getAttributesTitle(attribute);
    }
}
