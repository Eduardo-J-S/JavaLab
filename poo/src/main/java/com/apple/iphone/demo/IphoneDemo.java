package com.apple.iphone.demo;

import com.apple.iphone.features.Phone;
import com.apple.iphone.features.WebBrowser;
import com.apple.iphone.features.MusicPlayer;

public class IphoneDemo {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Phone phone = new Phone();
        WebBrowser browser = new WebBrowser();
        
        player.play();
        player.start();
        player.play();
        player.selectSong("Música 1");
        player.pause();
        player.play();
        player.play();
        player.pause();
        player.stop();

        System.out.println("--------------------------------------------------");
      
        phone.dial("1234-5678");
        phone.start();
        phone.dial("1234-5678");
        phone.answer();
        phone.startVoicemail();
        phone.endCall();
        phone.stop();

        System.out.println("--------------------------------------------------");

        browser.start();
        browser.displayPage("http://example.com");
        browser.addNewTab();
        browser.refreshPage();
        browser.stop();

        WebBrowser browser2 = new WebBrowser();
        browser2.displayPage("http://example.com");
        browser2.addNewTab();
        browser2.refreshPage();
    }
}
