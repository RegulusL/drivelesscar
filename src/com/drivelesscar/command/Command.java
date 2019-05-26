package com.drivelesscar.command;

import com.drivelesscar.exception.CarForwardException;
import com.drivelesscar.entity.Car;

public interface Command {
   /**
    * turning clockwise
    * @param car the car
    */
   void clockwise(Car car);

   /**
    * moving forward
    * @param car the car
    * @throws CarForwardException
    */
   void forward(Car car) throws CarForwardException;
}
