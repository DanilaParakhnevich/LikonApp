package by.parakhnevich.likon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "\"user\"")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nickname;
    private String password;
    @Transient
    private transient String confirmPassword;
    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<RoleEntity> roles;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<PublicationEntity> publications;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<CommentEntity> comments;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<PublicationRatingEntity> publicationRatings;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<CommentRatingEntity> commentRatings;
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
