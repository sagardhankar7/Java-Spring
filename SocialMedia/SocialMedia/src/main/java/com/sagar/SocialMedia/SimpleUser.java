package com.sagar.SocialMedia;

public class SimpleUser implements User{
    private String userName;
    private PostList postList;

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public PostList getPostList() {
        return this.postList;
    }

    @Override
    public void setPostList(PostList postList) {
        this.postList = postList;
    }

}
