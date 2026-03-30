package org.example.oop.player;

public class Player {
    String username;
    int level;
    int health;
    Player(String username){
        this.username = username;
        this.level = 1;
        this.health = 100;
    }
    void displayStats(){
        System.out.println("Username: " + username);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
    }
}
