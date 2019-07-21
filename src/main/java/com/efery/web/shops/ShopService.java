package com.efery.web.shops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> getAllShops() {
        List<Shop> shops = new ArrayList<Shop>();
        shopRepository.findAll().forEach(shops::add);
        return shops;
    }

    public Shop getShopById(Integer shopId) {
        return shopRepository.findById(shopId).get();
    }
}
