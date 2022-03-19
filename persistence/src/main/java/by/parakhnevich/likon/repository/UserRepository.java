package by.parakhnevich.likon.repository;

import by.parakhnevich.likon.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByNickname(String nickname);

    @Modifying
    @Query(value = "update user u set u.mail = ?1, u.password = ?2, u.role = ?3 where u.id = ?4",
    nativeQuery = true)
    void update(String mail, String password, String role, long id);
}
