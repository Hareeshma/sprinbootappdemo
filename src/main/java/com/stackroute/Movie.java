package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {

//generate getter and setter
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Autowired
    private Actor actor;
//generate to string method
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

}
