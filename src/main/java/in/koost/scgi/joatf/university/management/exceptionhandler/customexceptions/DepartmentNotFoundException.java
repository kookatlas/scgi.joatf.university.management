package in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions;

public class DepartmentNotFoundException extends RuntimeException{
    public DepartmentNotFoundException(String message){
        super(message);
    }

}
