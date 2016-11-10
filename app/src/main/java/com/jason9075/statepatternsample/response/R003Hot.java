package com.jason9075.statepatternsample.response;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class R003Hot extends ResponseAbstract{
    R003Hot() {
        super("本週熱門商品如下：");
    }

    @Override
    public ResponseAbstract userInputMessage(String userMessage) {
        return new R999End();
    }
}
