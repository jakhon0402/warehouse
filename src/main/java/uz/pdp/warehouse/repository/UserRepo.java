package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Supplier;
import uz.pdp.warehouse.entity.User;
import uz.pdp.warehouse.projection.CustomSupplier;
import uz.pdp.warehouse.projection.CustomUser;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = CustomUser.class)
public interface UserRepo extends JpaRepository<User,Integer> {
}
