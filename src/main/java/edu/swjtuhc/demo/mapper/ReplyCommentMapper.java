package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.ReplyComment;

@Mapper
public interface ReplyCommentMapper {
    int addReplyCommentMapper(ReplyComment replyComment);
    List<ReplyComment> getReplyCommentsByCommentId(int id);
}
