package src;

import src.common.ProjectManagerUtil;
import src.exception.InvalidUserException;

import java.util.List;

/**
 * First screen that user sees
 */
public class MainActivity {
    private String mEmpID;

    /**
     * Method to get all the projects available.
     */
    private List<ProjectDatabaseModel> getAllProjects() {
        // A call to database is made to get all the projects available in database.
        return null;
    }

    /**
     * Method to add project in the database.
     *
     * @param projectInfo contains all the project related info like name / key / leader etc.
     */
    private void addProject(ProjectInfo projectInfo) {
        try {
            if (ProjectManagerUtil.isManager(mEmpID)) {
                // Request to add in db.
            }
        } catch (InvalidUserException e) {
        }
    }

    /**
     * Method to remove project from db.
     *
     * @param projectName Name of the project that we want to remove.
     */
    private void removeProject(String projectName) {
        try {
            if (ProjectManagerUtil.isManager(mEmpID)) {
                // Request to remove from db.
            }
        } catch (InvalidUserException e) {

        }
    }

    private void openProject() {
        // a call to open User Home page is made here.
        // Project and user information is passed to UserHomePage based on the project clicked.
    }
}
