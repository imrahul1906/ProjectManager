Start Page : MainActivity.java

MainActivity.Java :
    - All the projects list will be shown.
    - A valid user can add/remove project.
    - selecting a project will take the user to SCREEN -2 : UserHomePage.java

UserHomePage.java
    - Employee ID and Name will be passed to User's Home page.
    - Task list will be shown here on the page :
        1) Manager : All the task in a given project
        2) Team Member : All the task that are in user's name will be shown.
    - A valid user an add/delete team member from the list of members in a given project.
    - A user is initialized based on userType(Manager / TeamMember) using "ProjectManagerFactory.class".

    The flow of the code is as following :

    UserHomePage.java : UserHomePage (Has-A) IUser
    Manager.java : Manager (IS-A) User
    TeamMember.java : Team Member (IS-A) user.
    IUser.java : user implements IUser to achieve total abstraction and loos coupling.
    User.java : Abstract class for all type of users.

ProjectManagerFactory : A factory class to initialize the user based on user type.

ProjectManagerUtil.java
    - A util class that handles System apis , calculations etc.

ProjectErrorHandler.java
    - A error handler class that handles any error thrown a run time.

ProjectInfo.java
    - A class that contains all the information related to Project.

ProjectDatabaseModel.java
    - A class that is used as a bundle when DB operations are done.