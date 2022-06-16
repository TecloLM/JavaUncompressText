package com.uncompresstext;

import java.lang.*;

public class StringUtils {
    public static String uncompressText(String text) {
        String[] textToChart = text.split("");
        String returnResult = "";
        String lastChar = "";

        for (String currentChar : textToChart) {
            if (currentChar.matches("\\d")){
                returnResult += lastChar.repeat(Integer.parseInt(currentChar)-1);
            } else {
                returnResult += currentChar;
                lastChar = currentChar;
            }
        }
        return returnResult;
    }
}
