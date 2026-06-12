package com.sagar.SocialMedia;

import java.util.ArrayList;

public class SimplePostList implements PostList{
    ArrayList<Post> postList;

    void init() {// this run just after the object is created
        Post post = new SimplePost();
        post.setMessage("Hello World from DB");
        postList.add(post);
    }

    SimplePostList() {
        this.postList = new ArrayList<Post>();
    }

    @Override
    public ArrayList<Post> getAllPosts() {
        return postList;
    }

    @Override
    public Post getPost(int i) {
        return postList.get(i);
    }

    @Override
    public void addPost(Post post) {
        postList.add(post);
    }

    @Override
    public int size() {
        return postList.size();
    }
}
