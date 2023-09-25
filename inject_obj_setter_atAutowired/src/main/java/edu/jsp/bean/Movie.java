package edu.jsp.bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Actor actor;

    // Setter method for Actor injection
    @Autowired
    public void setActor(Actor actor) {
    	actor.setName("Rajni");
        this.actor = actor;
    }

    public void displayInfo() {
        System.out.println("Movie stars: " + actor.getName());
    }
}
