package com.jason9075.statepatternsample.response;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class R002Buy extends ResponseAbstract{
    R002Buy() {
        super("可以購買的東西如下");
    }

    @Override
    public ResponseAbstract userInputMessage(String userMessage) {
        return new R999End();
    }
}
