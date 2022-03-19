package by.parakhnevich.likon.mapper;

import by.parakhnevich.likon.entity.CommentEntity;
import by.parakhnevich.likon.model.CommentClientModel;

public interface CommentModelMapper {
    CommentClientModel toClientModel(CommentEntity comment);
    CommentEntity toEntity(CommentClientModel comment);
}

