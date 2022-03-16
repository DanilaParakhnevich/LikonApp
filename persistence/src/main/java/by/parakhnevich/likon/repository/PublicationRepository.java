package by.parakhnevich.likon.repository;

import by.parakhnevich.likon.entity.PublicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationRepository extends JpaRepository<PublicationEntity, Long> {
    @Query(value = "select * from publication p where p.id > ?1 and p.id <= ?2",nativeQuery = true)
    List<PublicationEntity> findAllBetween(long from, long to);

    @Query(value = "select count(id) from publication",nativeQuery = true)
    long findCountOfPublications();
}
