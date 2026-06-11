package com.sagar.SocialMedia;

import java.util.ArrayList;

public interface PostList {
    ArrayList<Post> getAllPosts();
    Post getPost(int i);
    void addPost(Post post);
    int size();
}
