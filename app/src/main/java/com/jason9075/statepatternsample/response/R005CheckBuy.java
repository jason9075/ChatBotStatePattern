package com.jason9075.statepatternsample.response;

import java.util.Arrays;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class R005CheckBuy extends ResponseAbstract{
    R005CheckBuy(String productName) {
        super("你確定要購買" + productName + "?\n"+
        "1. 是的 \n" +
        "2. 不買了\n");
    }

    @Override
    public ResponseAbstract userInputMessage(String userMessage) {
        switch (userMessage){
            case "1":
                return new R999End();
            case "2":
                return new R001Start();
        }
        return new R000Ignore();
    }
}
