package cl.andres.catalog.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"uid", "weaponType", "material", "size", "price"})
public class WeaponEntity {
    private String uid;
    private String weaponType;
    private String material;
    private String size;
    private float price;
}
