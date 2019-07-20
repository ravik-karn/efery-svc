package com.efery.web.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerService {
    @Autowired
    private BannerRepository bannerRepository;

    public List<Banner> getAllBanners() {
        List<Banner> banners = new ArrayList<Banner>();
        bannerRepository.findAll().forEach(banners::add);
        return banners;
    }
}
