package src;

import src.common.ProjectErrorHandler;
import src.common.ProjectManagerUtil;

import java.util.List;

/**
 * A class to handle all the information regarding a project
 */
public class ProjectInfo {
    private String mProjectLead;
    private String mProjectName;
    private String mProjectKey;
    private List<String> mProjectMembers;

    /**
     * Method to set project name
     * @param projectName Name that needs to be set
     */
    public void setProjectName(String projectName) {
        try {
            if (ProjectManagerUtil.isValidName(projectName)) mProjectName = projectName;
        } catch (ProjectErrorHandler.InvalidNameException e) {
            // print crash stack or customized message based in the requirement.
        }
    }

    /**
     * Method to set the leader of the project.
     * @param projectLead Leader id that needs to be set.
     */
    public void setProjectLead(String projectLead) {
        mProjectLead = projectLead;
    }
}
