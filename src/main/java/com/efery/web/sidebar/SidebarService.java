package com.efery.web.sidebar;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SidebarService {

    public Sidebar getSidebar() {
        List<Page> pages = Arrays.asList(
                new Page(1, "About us"),
                new Page(2, "Contact us")
        );
        List<Navigation> navigation = Arrays.asList(
                new Navigation(1, 1, "House Work", null, "category"),
                new Navigation(2, 2, "Tour Package", null, "category"),
                new Navigation(3, 3, "Event Management", null, "category")
        );
        return new Sidebar(navigation, pages);
    }
}
