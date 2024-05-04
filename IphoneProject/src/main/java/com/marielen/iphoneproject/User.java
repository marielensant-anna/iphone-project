/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.iphoneproject;

/**
 *
 * @author CCE
 */
public class User {
    
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();
        
        iphone.playMusic("Black to Black Parade");
        iphone.pauseMusic();
        iphone.nextTrack();
        iphone.previousTrack();
        iphone.makeCall(63981203448l);
        iphone.answerCall(63999794953l);
        iphone.endCall();
        iphone.openURL("www.dio.me");
        iphone.closeURL("www.google.com");
        // TODO code application logic herepla
    }
    
}
