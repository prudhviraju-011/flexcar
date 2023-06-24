package com.flexcar.service;

import com.flexcar.model.Elevator;
import com.flexcar.model.ElevatorContext;
import com.flexcar.model.ElevatorRequest;

import java.util.Queue;

interface CalculateWaitingTimeForElevatorRequests {

    int calculateMinWaitingTimeAndAssignElevator(ElevatorContext elevatorContext, ElevatorRequest elevatorRequest);
}
