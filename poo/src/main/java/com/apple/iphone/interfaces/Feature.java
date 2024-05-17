package com.apple.iphone.interfaces;

public abstract class Feature implements Iphone {
    private boolean started;

    @Override
    public void start() {
        started = true;
        System.out.println(this.getClass().getSimpleName() + " started.");
    }

    @Override
    public void stop() {
        started = false;
        System.out.println(this.getClass().getSimpleName() + " stopped.");
    }

    public boolean isStarted() {
        return started;
    }
}