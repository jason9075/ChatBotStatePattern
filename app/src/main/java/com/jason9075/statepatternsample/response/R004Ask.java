package com.jason9075.statepatternsample.response;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class R004Ask extends ResponseAbstract{
    R004Ask() {
        super("請問你的問題是？");
    }

    @Override
    public ResponseAbstract userInputMessage(String userMessage) {
        return new R999End();
    }
}
