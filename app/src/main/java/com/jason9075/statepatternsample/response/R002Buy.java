package com.jason9075.statepatternsample.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason9075 on 2016/11/10.
 */

public class R002Buy extends ResponseAbstract{
    private List<String> products = new ArrayList<>();

    R002Buy() {
        super("可以購買的東西如下:\n");
    }

    public void setProducts(List<String> products) {
        this.products = products;
        responseMessage = "可以購買的東西如下:\n" + makeListString(products);
    }

    private String makeListString(List<String> products) {

        String output = "";
        for (int i = 0; i < products.size(); i++) {
            output += (i+1) + ". " + products.get(i)+"\n";
        }
        return output;
    }


    @Override
    public ResponseAbstract userInputMessage(String userMessage) {
        int value;
        try{
            value = Integer.valueOf(userMessage);
        } catch(NumberFormatException e) {
            value = 0;
        }
        if(value <= 0 || products.size() < value)
            return new R000Ignore();

        return new R005CheckBuy(products.get(value - 1));
    }
}
