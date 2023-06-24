package com.flexcar.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Elevator {

    public static enum Status {
        UP, DOWN, STOPPED;
    }

    int floorPosition;
    int id;
    Status status;


}
