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

    public abstract ResponseAbstract userInputMessage(String userMessage);
}
