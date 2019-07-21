package com.efery.web.shops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @RequestMapping(path="/shops", method = RequestMethod.GET)
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }

    @RequestMapping(path="/shops/{shopId}", method = RequestMethod.GET)
    public Shop getShopById(@PathVariable Integer shopId) {
        return shopService.getShopById(shopId);
    }
}
