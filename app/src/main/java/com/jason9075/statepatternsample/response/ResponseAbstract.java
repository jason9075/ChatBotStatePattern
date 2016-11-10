package com.jason9075.statepatternsample.response;

/**
 * Created by jason9075 on 2016/11/10.
 */
public abstract class ResponseAbstract {
    private String responseMessage;

    ResponseAbstract(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    /* 用於判斷使用者輸入的method */
    public abstract ResponseAbstract userInputMessage(String userMessage);
}
