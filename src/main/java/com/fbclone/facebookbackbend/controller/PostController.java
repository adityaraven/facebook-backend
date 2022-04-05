package com.fbclone.facebookbackbend.controller;

import com.fbclone.facebookbackbend.model.Post;
import com.fbclone.facebookbackbend.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/post")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post addPost(@RequestParam Map<String, String> requestParam) throws Exception {
        String strPost = requestParam.get("post");
        String email = requestParam.get("email");
        String name = requestParam.get("name");
        String file = requestParam.get("file");
        String profilePic = requestParam.get("profilePic");

//        creating object of post
        Post post = Post.builder()
                .file(file)
                .name(name)
                .email(email)
                .post(strPost)
                .profilePic(profilePic)
                .timeStamp(new Date().toString())
                .build();

        post = postService.addPost(post);
        return  post;
    }

    @GetMapping
    public List<Post> getPost(){

        return postService.getPost();
    }

}
