package cl.andres.catalog.controller;

import cl.andres.catalog.model.WeaponEntity;
import cl.andres.catalog.persistence.WeaponEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCatalogController {

    @Autowired
    private WeaponEntityDao dao;

    @GetMapping("/weapons")
    public List<WeaponEntity> readAll() {
        return dao.findAll();
    }
}
