/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.regex;

/**
 *
 * @author elosw
 */
public class Interfaz {
    private String text;

    public Interfaz(String text) {
        this.text = text;
    }

    public boolean isEmail() {
        return Regex.isEmail(text);
    }

    public boolean isPhoneNumber() {
        return Regex.isPhoneNumber(text);
    }

    public boolean isURL() {
        return Regex.isURL(text);
    }
}
