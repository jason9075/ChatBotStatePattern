package com.jason9075.statepatternsample;

import com.jason9075.statepatternsample.response.R000Ignore;
import com.jason9075.statepatternsample.response.R001Start;
import com.jason9075.statepatternsample.response.ResponseAbstract;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class ChatBot {

    private ResponseAbstract response;

    private ChatBotListener listener;

    public ChatBot() {
        setResponse(new R001Start());
    }

    private void setResponse(ResponseAbstract response) {
        this.response = response;
    }

    public void popUpResponse() {
        listener.onResponse(response.getResponseMessage());
    }

    public void userSay(String userMessage) {
        ResponseAbstract botResponse = response.userInputMessage(userMessage);
        if (!(botResponse instanceof R000Ignore))
            response = botResponse;
    }

    interface ChatBotListener {
        void onResponse(String message);
    }

    public void setListener(ChatBotListener listener) {
        this.listener = listener;
    }
}
