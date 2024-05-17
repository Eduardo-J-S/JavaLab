package com.apple.iphone.features;

import java.util.ArrayList;
import java.util.List;

import com.apple.iphone.interfaces.Feature;


public class WebBrowser extends Feature {
    private List<String> openPages = new ArrayList<>();
    private int currentTab = -1;

    public void displayPage(String url) {
        if (!isStarted()) {
            System.out.println("Web browser is not initialized.");
            return;
        }
        openPages.add(url);
        currentTab = openPages.size() - 1;
        System.out.println("Displaying page: " + url);
    }

    public void addNewTab() {
        if (!isStarted()) {
            System.out.println("Web browser is not initialized.");
            return;
        }
        openPages.add("New tab");
        currentTab = openPages.size() - 1;
        System.out.println("New tab added.");
    }

    public void refreshPage() {
        if (!isStarted()) {
            System.out.println("Web browser is not initialized.");
            return;
        }
        if (currentTab >= 0) {
            System.out.println("Page refreshed: " + openPages.get(currentTab));
        } else {
            System.out.println("No tab open to refresh.");
        }
    }
}