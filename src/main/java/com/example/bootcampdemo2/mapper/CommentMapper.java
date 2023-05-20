package com.example.bootcampdemo2.mapper;

import com.example.bootcampdemo2.dto.CommentDTO;
import com.example.bootcampdemo2.dto.CommentSaveRequest;
import com.example.bootcampdemo2.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);
    Comment saveRequestToComment(CommentSaveRequest commentSaveRequest);
    CommentDTO commentToCommentDto(Comment comment);
    List<CommentDTO> commentListToCommentDtoList(List<Comment> comments);
}
