package by.parakhnevich.likon.mapper;

import by.parakhnevich.likon.entity.RoleEntity;
import by.parakhnevich.likon.model.RoleClientModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleModelMapper {
    RoleClientModel toClientModel(RoleEntity rating);
    RoleEntity toEntity(RoleClientModel rating);
}
