package com.jason9075.statepatternsample.response;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class R001Start extends ResponseAbstract {

    public R001Start() {
        super("哈囉, 我是ChatBot!, 有任何問題可以輸入數字讓我幫你解決喔！\n" +
                "1.我想買商品\n" +
                "2.我想知道本週熱門商品\n" +
                "3.我想詢問產品的相關問題\n");
    }

    @Override
    public ResponseAbstract userInputMessage(String userMessage) {
        switch (userMessage){
            case "1":
                return new R002Buy();
            case "2":
                return new R003Hot();
            case "3":
                return new R004Ask();
        }
        return new R000Ignore();
    }
}
