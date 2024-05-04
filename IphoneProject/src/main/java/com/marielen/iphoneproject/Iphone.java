/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.marielen.iphoneproject;

/**
 *
 * @author CCE
 */
public class Iphone implements MusicPlayer, Telephone, Browser {

    /**
     * @param args the command line arguments
     */
    

    @Override
    public void playMusic(String song) {
        System.out.println("Tocando música: " + song);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando Música");
    }

    @Override
    public void nextTrack() {
        System.out.println("Próxima faixa");
    }

    @Override
    public void previousTrack() {
        System.out.println("Faixa Anterior");
    }

    @Override
    public void makeCall(long number) {
        System.out.println("Fazendo ligação para o número: " + number);
    }

    @Override
    public void answerCall(long number) {
        System.out.println("Atendendo ligação do número: " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Encerrendo ligação");
    }

    @Override
    public void openURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void closeURL(String url) {
        System.out.println("Fechando URL: " + url);
    }
    
}
