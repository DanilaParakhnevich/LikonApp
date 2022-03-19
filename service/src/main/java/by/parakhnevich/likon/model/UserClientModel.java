package by.parakhnevich.likon.model;

import by.parakhnevich.likon.entity.RoleEntity;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class UserClientModel implements ClientModel {
    private long id;
    private String nickname;
    private String mail;
    private String password;
    private RoleEntity role;
    private LocalDateTime createDate;
    private List<CommentRatingClientModel> commentRatings;
    private List<PublicationRatingClientModel> publicationRatings;
}
