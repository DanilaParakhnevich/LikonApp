package by.parakhnevich.likon.repository;

import by.parakhnevich.likon.entity.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, Long > {
    @Query(value = "select from rating r where r.id_user = ?1",
    nativeQuery = true)
    List<RatingEntity> findAllByUserId(long id);

    @Query(value = "select from rating r where r.id_publication = ?1",
            nativeQuery = true)
    List<RatingEntity> findAllByPublicationId(long id);
}
