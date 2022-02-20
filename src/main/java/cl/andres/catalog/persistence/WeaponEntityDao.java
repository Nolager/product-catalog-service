package cl.andres.catalog.persistence;

import cl.andres.catalog.model.WeaponEntity;

import java.util.List;

public interface WeaponEntityDao {
    List<WeaponEntity> findAll();
}
