package com.jason9075.statepatternsample.response;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class R999End extends ResponseAbstract {
    R999End() {
        super("感謝您使用本ChatBot 如果有需要改進的地方歡迎指教");
    }

    @Override
    public ResponseAbstract userInputMessage(String userMessage) {
        return new R001Start();
    }
}
