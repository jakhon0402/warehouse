package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouse.entity.AttachmentContent;

public interface AttachmentContentRepo extends JpaRepository<AttachmentContent,Integer> {
}
