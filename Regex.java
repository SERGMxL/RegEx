/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.regex;
import java.util.regex.Pattern;

public class Regex {
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String PHONE_REGEX = "^\\d{3}-\\d{3}-\\d{4}$";
    private static final String URL_REGEX = "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$";

    public static boolean isEmail(String text) {
        return Pattern.matches(EMAIL_REGEX, text);
    }

    public static boolean isPhoneNumber(String text) {
        return Pattern.matches(PHONE_REGEX, text);
    }

    public static boolean isURL(String text) {
        return Pattern.matches(URL_REGEX, text);
    }
}