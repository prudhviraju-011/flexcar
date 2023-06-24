package com.flexcar.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ElevatorRequest {

    public static enum  Status{
        UP, DOWN;
    }

    int startingFloor;
    int endingFloor;
    Status status;

}
