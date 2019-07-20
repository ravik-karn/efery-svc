package com.efery.web.sidebar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SidebarController {
    @Autowired
    private SidebarService sidebarService;

    @RequestMapping(path = "/sidebar", method = RequestMethod.GET)
    public Sidebar getSidebar() {
        return sidebarService.getSidebar();
    }
}
