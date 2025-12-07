package in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }
}
