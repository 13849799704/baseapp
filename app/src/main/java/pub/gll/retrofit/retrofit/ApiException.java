package pub.gll.retrofit.retrofit;


public class ApiException extends RuntimeException {
    private int errorCode;


    public ApiException(int code, String msg) {
        super(msg);
        this.errorCode = code;

    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

}
