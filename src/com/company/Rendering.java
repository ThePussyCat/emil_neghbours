package com.company;


import javafx.scene.canvas.GraphicsContext;

public class Rendering {
    public void renderWorld (GraphicsContext g, int worldSize, int dotSize, Plot[][] world) // render world
    {
        g.clearRect(0, 0, worldSize * (dotSize), worldSize * (dotSize));
        for (int i = 0; i < worldSize; i++) {
            for (int j = 0; j < worldSize; j++) {
                int x = dotSize * j;
                int y = dotSize * i;

                g.setFill(world[i][j].color);
                g.fillOval(x, y, dotSize, dotSize);
            }
        }
    }
}
