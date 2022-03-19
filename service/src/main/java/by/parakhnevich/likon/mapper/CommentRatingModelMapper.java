package by.parakhnevich.likon.mapper;

import by.parakhnevich.likon.entity.CommentRatingEntity;
import by.parakhnevich.likon.model.CommentRatingClientModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentRatingModelMapper {
    CommentRatingClientModel toClientModel(CommentRatingEntity rating);
    CommentRatingEntity toEntity(CommentRatingClientModel rating);
}
