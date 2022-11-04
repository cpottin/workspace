package interface_examples;

public class TeacherClient{
    public static void main(String[] args) {
        Teacher liveOne = new Trainer();
        Teacher remoteOne = new OnlineTutorial();
        beginClass("Java", liveOne);

    }
    public static void  beginClass(String courseTitle, Teacher teacher){

    }

    public static void endClass(String courseTitle, Trainer trainer){
        trainer.teach("Python");
        trainer.gradeHW();
    }
    public static Teacher getTeacher(){
        return new OnlineTutorial();
    }
}
