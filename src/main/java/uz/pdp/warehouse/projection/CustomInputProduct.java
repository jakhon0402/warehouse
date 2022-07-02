package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.*;

import java.sql.Date;
import java.util.Currency;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    Integer getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
