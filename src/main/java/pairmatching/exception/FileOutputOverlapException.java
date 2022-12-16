package pairmatching.exception;

public class FileOutputOverlapException extends IllegalArgumentException{

    public static final String OVERLAP_MESSAGE
        = "같은 이름이 포함되어 있습니다.";

    public FileOutputOverlapException() {
        super(OVERLAP_MESSAGE);
    }

}
