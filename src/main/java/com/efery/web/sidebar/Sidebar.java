package com.efery.web.sidebar;

import java.util.List;

public class Sidebar {
    private List<Navigation> navigation;
    private List<Page> pages;

    public Sidebar(List<Navigation> navigation, List<Page> pages) {
        this.navigation = navigation;
        this.pages = pages;
    }

    public List<Navigation> getNavigation() {
        return navigation;
    }

    public void setNavigation(List<Navigation> navigation) {
        this.navigation = navigation;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
}
