package src.task;

/**
 * A class to handle functionalities of task type - new Feature
 */
public class TaskTypeNewFeature extends TaskTypeBase {

    /**
     * Method to check if attribute should be visible on the task creating view for this task type.
     * @param attrs whose visibility needs to be checked.
     * @return true if it should be visible else false.
     */
    @Override
    public boolean shouldAttrBeVisible(int attrs) {
        return false;
    }

    /**
     * method to create a list that contains all the attribute that should not be shown for this
     * task type.
     */
    @Override
    public void createNotAllowedAttributesList() {

    }

    /**
     * Method to return the title of the attribute.
     * @param attribute whose title needs to be returned.
     * @return a string value of the title of the attribute.
     */
    @Override
    public String getAttributesTitle(int attribute) {
        if(attribute == TaskAttributes.Attributes.SUMMARY.ordinal()) return "New Feature Summary";
        if(attribute == TaskAttributes.Attributes.DESCRIPTION.ordinal()) return "New Feature Description";

        return super.getAttributesTitle(attribute);
    }
}
