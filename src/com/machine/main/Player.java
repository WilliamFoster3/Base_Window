package com.machine.main;

import java.awt.*;

public class Player extends GameObject {

    public Player(int x, int y, id id) {
        super(x, y, id);
        velY = 1;
        velX = 1;
    }
    public void tick() {
       y += velY;
       x += velX;
    }
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 35, 35);
    }
}
