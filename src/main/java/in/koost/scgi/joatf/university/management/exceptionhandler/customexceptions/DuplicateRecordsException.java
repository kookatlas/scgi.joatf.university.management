package in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions;

public class DuplicateRecordsException extends RuntimeException{

    public DuplicateRecordsException(String message){
        super(message);
    }
}
