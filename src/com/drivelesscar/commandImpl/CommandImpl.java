package com.drivelesscar.commandImpl;

import com.drivelesscar.exception.CarForwardException;
import com.drivelesscar.command.Command;
import com.drivelesscar.entity.Car;

public class CommandImpl implements Command {


    @Override
    public void clockwise(Car car) {
        int orientationEast = car.getOrientationEast();
        int orientationNorth = car.getOrientationNorth();
        if (orientationEast == 0) {
            orientationEast = orientationNorth == 1 ? 1 : -1;
            orientationNorth = 0;
        } else if (orientationNorth == 0) {
            orientationNorth = orientationEast == 1 ? -1 : 1;
            orientationEast = 0;
        }
        car.setOrientationEast(orientationEast);
        car.setOrientationNorth(orientationNorth);
    }

    @Override
    public void forward(Car car) throws CarForwardException {
        int presentX = car.getPositionX() + car.getOrientationEast();
        int presentY = car.getPositionY() + car.getOrientationNorth();
        if (presentX <= 0 || presentY <= 0) {
            throw new CarForwardException("Car Forward Exception");
        }
        car.setPositionX(presentX);
        car.setPositionY(presentY);
    }

}
