package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Client;
import uz.pdp.warehouse.projection.CustomClient;

@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = CustomClient.class)
public interface ClientRepo extends JpaRepository<Client,Integer> {
}
