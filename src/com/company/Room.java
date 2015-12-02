package com.company;

/**
 * Created by BennettIronYard on 12/1/15.
 */
public class Room {
    int row;
    int col;
    boolean wasVisited = false;
    boolean hasBottom = true;
    boolean hasRight = true;
    boolean isEnd = false;
    boolean isStart = false;

    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
