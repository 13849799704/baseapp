package pub.gll.retrofit.base;

import java.io.Serializable;

public class BaseModel implements Serializable {
    private int code;

    public BaseModel(String message, int code) {
        this.code = code;
    }
    public BaseModel(int code) {
        this.code = code;
    }
    public int getErrcode() {
        return code;
    }

    public void setErrcode(int code) {
        this.code = code;
    }

}