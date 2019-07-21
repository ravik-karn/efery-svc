package com.efery.web.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PageController {
    @Autowired
    private PageService pageService;

    @RequestMapping(path = "{shopId}/pages", method = RequestMethod.GET)
    public List<Page> getAllPages(@PathVariable Integer shopId) {
        return pageService.getAllPages();
    }

    @RequestMapping(path = "{shopId}/page-id/{pageId}", method = RequestMethod.GET)
    public Page getPagesById(@PathVariable Integer shopId, @PathVariable Integer pageId) {
        return pageService.getPageById(pageId).get();
    }

    @RequestMapping(path = "{shopId}/page-title/{pageTitle}", method = RequestMethod.GET)
    public Page getPagesByTitle(@PathVariable Integer shopId, @PathVariable String pageTitle) {
        return pageService.getPageByTitle(pageTitle).get();
    }
}
