package cl.andres.catalog.persistence.impl;

import cl.andres.catalog.model.WeaponEntity;
import cl.andres.catalog.persistence.WeaponEntityDao;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class WeaponEntityDaoImpl implements WeaponEntityDao {

    @Value("classpath:weapon-catalog.csv")
    private Resource csvFile;

    @Override
    public List<WeaponEntity> findAll() {
        List<WeaponEntity> weapons = new ArrayList<>();

        try {
            new CsvMapper()
                    .readerWithTypedSchemaFor(WeaponEntity.class)
                    // FIXME throws null pointer exception
//                    .<WeaponEntity>readValues(csvFile.getInputStream())
                    .<WeaponEntity>readValues(Paths.get("weapon-catalog.csv").toFile())
                    .readAll(weapons);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return weapons;
    }
}
