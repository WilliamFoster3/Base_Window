package com.machine.main;

import java.awt.*;

public abstract class GameObject {
    protected int x, y;
    protected id id;
    protected int velX, velY;

    public GameObject(int x, int y, id id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
    public abstract void tick();
    public abstract void render(Graphics g);

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setID(id id) {
        this.id = id;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public id getID() {
        return id;
    }
    public void setVelX(int velX) {
        this.velX = velX;
    }
    public void setVelY(int velY) {
        this.velY = velY;
    }
    public int getVelX() {
        return velX;
    }
    public int getVelY() {
        return velY;
    }
}

