package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouse.entity.Attachment;

public interface AttachmentRepo extends JpaRepository<Attachment,Integer> {
}
