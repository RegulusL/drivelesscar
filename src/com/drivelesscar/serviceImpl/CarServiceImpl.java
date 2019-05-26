package com.drivelesscar.serviceImpl;

import com.drivelesscar.exception.CarForwardException;
import com.drivelesscar.command.Command;
import com.drivelesscar.commandImpl.CommandImpl;
import com.drivelesscar.common.Constant;
import com.drivelesscar.entity.Car;
import com.drivelesscar.service.CarService;

public class CarServiceImpl implements CarService {

    private Command commandImpl = new CommandImpl();

    @Override
    public void move(Car car, String command) {
        if (command.equals(Constant.CLOCKWISE)) {
            commandImpl.clockwise(car);
        } else if (command.equals(Constant.FORWARD)) {
            try {
                commandImpl.forward(car);
            } catch (CarForwardException e) {
                e.printStackTrace();
                System.out.println("The car can not turn west!Please reset the car!");
            }
        } else {
            System.out.println("Can not find this command!");
        }

    }

    @Override
    public int getPositionX(Car car) {
        return car.getPositionX();
    }

    @Override
    public int getPositionY(Car car) {
        return car.getPositionY();
    }

    @Override
    public String getOrientation(Car car) {
        String temp = "";
        if (car.getOrientationNorth() == 0) {
            temp = car.getOrientationEast() > 0 ? Constant.EAST : Constant.WEST;
        } else {
            temp = car.getOrientationNorth() > 0 ? Constant.NORTH : Constant.SOUTH;
        }
        return temp;
    }

}
