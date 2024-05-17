package com.apple.iphone.features;

import com.apple.iphone.interfaces.Feature;

public class Phone extends Feature {
    private String currentNumber;
    private boolean inCall;

    public void dial(String number) {
        if (!isStarted()) {
            System.out.println("Telephone set has not been started.");
            return;
        }
        if (inCall) {
            System.out.println("Already in a call with: " + currentNumber);
            return;
        }
        this.currentNumber = number;
        this.inCall = true;
        System.out.println("Dialing: " + number);
    }

    public void answer() {
        if (!isStarted()) {
            System.out.println("Telephone set has not been started.");
            return;
        }
        if (inCall) {
            System.out.println("Answering the call with: " + currentNumber);
        } else {
            System.out.println("No call to answer.");
        }
    }

    public void startVoicemail() {
        if (!isStarted()) {
            System.out.println("Telephone set has not been started.");
            return;
        }
        System.out.println("Starting voicemail.");
    }

    public void endCall() {
        if (inCall) {
            System.out.println("Ending call with: " + currentNumber);
            inCall = false;
        } else {
            System.out.println("No call to end.");
        }
    }
}