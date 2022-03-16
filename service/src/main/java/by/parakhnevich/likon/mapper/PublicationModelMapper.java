package by.parakhnevich.likon.mapper;

import by.parakhnevich.likon.entity.PublicationEntity;
import by.parakhnevich.likon.model.PublicationClientModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublicationModelMapper {
    PublicationClientModel toClientModel(PublicationEntity publication);
    PublicationEntity toEntity(PublicationClientModel publication);
}
