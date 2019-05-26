package com.drivelesscar.service;

import com.drivelesscar.entity.Car;

public interface CarService {
    /**
     *  move the car
     * @param car the car
     * @param command command
     */
    void move(Car car, String command);

    /**
     * get  of the car
     * @param car the car
     * @return positionX
     */
    int getPositionX(Car car);

    /**
     * get positionY of the car
     * @param car the car
     * @return  positionY
     */
    int getPositionY(Car car);

    /**
     * get orientation of the car
     * @param car the car
     * @return  orientation
     */
    String getOrientation(Car car);
}
