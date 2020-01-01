package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ReplyCommentMapper;
import edu.swjtuhc.demo.model.ReplyComment;
import edu.swjtuhc.demo.service.ReplyCommentService;

@Service
public class ReplyCommentServiceImpl implements ReplyCommentService {
    
	@Autowired
    private ReplyCommentMapper replyCommentMapper;
    
	@Override
    public int addReplyCommentMapper(ReplyComment replyComment) {
        return replyCommentMapper.addReplyCommentMapper(replyComment);
    }
}

