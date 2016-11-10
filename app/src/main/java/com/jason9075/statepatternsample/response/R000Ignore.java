package com.jason9075.statepatternsample.response;

import android.util.Log;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class R000Ignore extends ResponseAbstract{
    R000Ignore() {
        super("Error!");
        Log.e("Chatbot","不該執行此處");
    }

    @Override
    public ResponseAbstract userInputMessage(String userMessage) {
        throw new RuntimeException("Ignore 不會回應Response");
    }
}
