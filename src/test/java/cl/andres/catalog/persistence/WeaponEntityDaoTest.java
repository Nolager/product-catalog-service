package cl.andres.catalog.persistence;

import cl.andres.catalog.model.WeaponEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class WeaponEntityDaoTest {

    @Autowired
    private WeaponEntityDao dao;

    @Test
    public void testFindAll() {
        List<WeaponEntity> weapons = dao.findAll();

        assertNotNull(weapons);
    }
}