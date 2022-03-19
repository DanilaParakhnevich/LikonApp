package by.parakhnevich.likon.mapper;

import by.parakhnevich.likon.entity.PublicationRatingEntity;
import by.parakhnevich.likon.model.PublicationRatingClientModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface PublicationRatingModelMapper {
    PublicationRatingClientModel toClientModel(PublicationRatingEntity rating);
    PublicationRatingEntity toEntity(PublicationRatingClientModel rating);
}
