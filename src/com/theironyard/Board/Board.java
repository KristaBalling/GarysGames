package com.theironyard.Board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.theironyard.Units.Unit;

public class Board {

    private int width, height;
    private List tiles;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        initialize();
    }

    private void initialize(){
        tiles = new ArrayList(width);
        for (int i=0; i<width; i++) {
            tiles.add(i, new ArrayList(height));
            for(int j=0; j<height; j++) {
                ((ArrayList)tiles.get(i)).add(j, new Tile());
            }
        }
    }
}
