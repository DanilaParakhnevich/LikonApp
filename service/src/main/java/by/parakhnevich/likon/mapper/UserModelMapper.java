package by.parakhnevich.likon.mapper;

import by.parakhnevich.likon.entity.UserEntity;
import by.parakhnevich.likon.model.UserClientModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserModelMapper {
    UserClientModel toClientModel(UserEntity user);
    UserEntity toEntity(UserClientModel user);
}
