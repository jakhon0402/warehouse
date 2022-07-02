package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();

    String getName();

    String getActive();
}
