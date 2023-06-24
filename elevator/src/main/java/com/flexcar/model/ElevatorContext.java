package com.flexcar.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
public class ElevatorContext {

    int totalFloors;

    List<Elevator> elevators;

}
