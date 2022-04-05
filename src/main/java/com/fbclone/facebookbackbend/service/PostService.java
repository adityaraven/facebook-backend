package com.fbclone.facebookbackbend.service;

import com.fbclone.facebookbackbend.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
