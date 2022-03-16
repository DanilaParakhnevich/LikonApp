package by.parakhnevich.likon.model;

import by.parakhnevich.likon.entity.RatingEntity;
import by.parakhnevich.likon.entity.Role;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class UserClientModel implements ClientModel {
    private long id;
    private String nickname;
    private String mail;
    private String password;
    private Role role;
    private LocalDateTime createDate;
    private List<RatingEntity> ratings;
}
