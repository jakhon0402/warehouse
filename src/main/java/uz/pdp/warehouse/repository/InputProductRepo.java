package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Input;
import uz.pdp.warehouse.entity.InputProduct;
import uz.pdp.warehouse.projection.CustomInput;
import uz.pdp.warehouse.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputProducy", collectionResourceRel = "list",excerptProjection = CustomInputProduct.class)
public interface InputProductRepo extends JpaRepository<InputProduct,Integer> {
}
