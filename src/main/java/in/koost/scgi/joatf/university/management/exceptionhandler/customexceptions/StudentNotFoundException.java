package in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message){
        super(message);
    }
}
