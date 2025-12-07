package in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions;

public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException(String message){
        super(message);
    }
}
