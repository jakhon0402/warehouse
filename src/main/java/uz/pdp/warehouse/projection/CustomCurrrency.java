package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrrency {
    Integer getId();

    String getName();

    String getActive();

}
