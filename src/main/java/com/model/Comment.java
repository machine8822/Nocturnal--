package com.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Comment {
    private String text;
    private UUID authorId;
    private LocalDateTime timestamp;
    private boolean isEdited;
    private int upvoteCount;
    private int downvoteCount;
    private List<Comment> replies;

    public Comment(String text, UUID authorId) {
        this.text = text;
        this.authorId = authorId;
        this.timestamp = LocalDateTime.now();
        this.isEdited = false;
        this.upvoteCount = 0;
        this.downvoteCount = 0;
        this.replies = new ArrayList<>();
    }

    public void edit(String newText) {
        this.text = newText;
        this.isEdited = true;
        this.timestamp = LocalDateTime.now();
    }

    public void upvote() {
        upvoteCount++;
    }
    
    public void downvote() {
        downvoteCount++;
    }

    public int getVoteScore() {
        return upvoteCount - downvoteCount;
    }

    public void addReply(Comment reply) {
        replies.add(reply);
    }

    public List<Comment> getReplies() {
        return replies;
    }

}
