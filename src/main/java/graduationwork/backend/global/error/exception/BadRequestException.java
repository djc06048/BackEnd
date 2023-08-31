package graduationwork.backend.global.error.exception;

public class BadRequestException extends BusinessException {
    public BadRequestException(ErrorCode errorCode) {
        super(errorCode);
    }
    public BadRequestException() {
        super(ErrorCode.BAD_REQUEST);
    }
}
