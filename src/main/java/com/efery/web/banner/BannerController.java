package com.efery.web.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @RequestMapping(path = "{shopId}/banners", method = RequestMethod.GET)
    public List<Banner> getAllBanners(@PathVariable Integer shopId) {
        return bannerService.getAllBanners();
    }
}
