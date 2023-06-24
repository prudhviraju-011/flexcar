package com.flexcar.service;

import com.flexcar.model.Elevator;
import com.flexcar.model.ElevatorContext;
import com.flexcar.model.ElevatorRequest;

import java.util.ArrayList;
import java.util.List;

public class CalculateWaitingTimeForElevatorRequestsImpl implements CalculateWaitingTimeForElevatorRequests {



    public int calculateMinWaitingTimeAndAssignElevator(ElevatorContext elevatorContext, ElevatorRequest elevatorRequest) {
        Elevator optimumElevator = null;
        int waitingTime = Integer.MAX_VALUE;
        for(Elevator elevator: elevatorContext.getElevators()) {
            if(waitingTime > Math.abs(elevator.getFloorPosition() - elevatorRequest.getStartingFloor())) {
                waitingTime = Math.abs(elevator.getFloorPosition() - elevatorRequest.getStartingFloor());
                optimumElevator = elevator;
            }
        }
        if(elevatorRequest.getStatus() == ElevatorRequest.Status.UP) {
            optimumElevator.setStatus(Elevator.Status.UP);
        }else {
            optimumElevator.setStatus(Elevator.Status.DOWN);
        }
        optimumElevator.setFloorPosition(elevatorRequest.getEndingFloor());
        return waitingTime + Math.abs(elevatorRequest.getEndingFloor() - elevatorRequest.getStartingFloor());
    }
}
