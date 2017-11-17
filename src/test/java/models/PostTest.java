package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PostTest {
    Post post;

    @BeforeEach
    public void before(){
        post = new Post(1, "First Post", "Hi! This is my first blog post!");
    }


    @Test
    public void canGetPostId(){
        int actual = post.getId();
        int expected = 1;
       assertEquals(expected, actual);

    }

    @Test void canGetPostTitle(){

    }
}
