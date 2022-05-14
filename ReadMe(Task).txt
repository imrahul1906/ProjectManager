User.java --> TaskCreateView.java :  This is a page where TaskType is selected and details are filled and task is created.
    1) It creates 3 type of tasks
        a) TaskTypeBug.java
        b) TaskTypeImprovement.java
        c) TaskTypeNewFeature.java
    2) TaskTypeBase.java : There is base class for all the task types to handle the common functionalities of these
    task types.
    3) ITaskTypeBase.java : Interface that :TaskTypeBase.java implements to achieve total abstractions.

    The summary of the above classes are  :
        - TaskCreateView (HAS-A) TaskTypeBase.
        - TaskTypeBug (IS-A) TaskTypeBase.
        - TaskTypeImprovement (IS-A) TaskTypeBase.
        - TaskTypeNewFeature (IS-A) TaskTypeBase.
     And User (HAS-A) TaskCreateView.

     TaskInfo.java : A class that contains all the information related to a task that user is going to create.

     TaskController.java : A class that handles all the DB related operations of a task.

     TaskExpandView.java :
        a) This is a Page that is opened when user clicks on any task.
        b) User can edit the task info from here.
        c) Once opened , all the db info is dumped here.

     TaskAttributes.java : A class that contains constants for each task's attributes.
     TaskConstants.java : A constant class for tasks.
     TaskDatabaseModel.java : A class that is used as a bundle for task info when DB operations are performed.

NOTIFICATION :
    - A service can be created that will keep observing the expiration time for each task.
    - Once task is expired , this information will be uploaded in the Message queue with user info like (user name ,
    email id , message, taskID etc.)
    - And then this information will be handled by another module by sending notification(Email) to the user.