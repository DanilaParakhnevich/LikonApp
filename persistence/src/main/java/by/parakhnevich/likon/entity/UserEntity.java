package by.parakhnevich.likon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "\"user\"")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nickname;
    private String mail;
    private String password;
    private String role;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @OneToMany(mappedBy = "userEntity", fetch = FetchType.LAZY)
    private List<RatingEntity> rating;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
