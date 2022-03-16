package by.parakhnevich.likon.mapper;

import by.parakhnevich.likon.entity.RatingEntity;
import by.parakhnevich.likon.model.RatingClientModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RatingModelMapper {
    RatingClientModel toClientModel(RatingEntity rating);
    RatingEntity toEntity(RatingClientModel rating);
}
