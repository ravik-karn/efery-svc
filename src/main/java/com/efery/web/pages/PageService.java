package com.efery.web.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PageService {
    @Autowired
    private PageRepository pageRepository;

    public List<Page> getAllPages() {
        List<Page> pages = new ArrayList<Page>();
        pageRepository.findAll().forEach(pages::add);
        return pages;
    }

    public Optional<Page> getPageById(Integer pageId) {
        return pageRepository.findById(pageId);

    }

    public Page getPageByTitle(String pageTitle) {
        return pageRepository.findBypageTitle(pageTitle).get();
    }


}
