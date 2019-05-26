package com.drivelesscar.run;

import com.drivelesscar.entity.Car;
import com.drivelesscar.serviceImpl.CarServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarDriveMain {

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        CarServiceImpl carServiceImpl = new CarServiceImpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Car entering the parking lot!");
        System.out.println("The car initially positioned at X = 1 and Y = 1");
        System.out.println("Please select which direction the car is facing:");
        System.out.println("1  ---> north");
        System.out.println("2  ---> east");
        System.out.println("3  ---> west");
        System.out.println("4  ---> south");
        System.out.println("5  ---> Car leaving the parking lot");
        int direction = 1;
        try {
            direction = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (direction == 5) {
            System.out.println("bye~~~");
            return;
        }
        switch (direction) {
            case 1:
                car = new Car(1, 1, 0, 1);
                break;
            case 2:
                car = new Car(1, 1, 1, 0);
                break;
            case 3:
                car = new Car(1, 1, -1, 0);
                break;
            case 4:
                car = new Car(1, 1, 0, -1);
                break;
            default:
                break;
        }
        while (true) {
            System.out.println("Please select the command:");
            System.out.println("1 ---> clockwise");
            System.out.println("2 ---> forward");
            System.out.println("3 ---> drop out");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            int command = 0;
            try {
                command = Integer.valueOf(br1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (command) {
                case 1:
                    carServiceImpl.move(car, "clockwise");
                    break;
                case 2:
                    carServiceImpl.move(car, "forward");
                    break;
                case 3:
                    System.out.println("bye~~");
                    return;
                default:
                    System.out.println("Invalid instruction");
            }
            System.out.println("facing:" + carServiceImpl.getOrientation(car));
            System.out.print("position(" + carServiceImpl.getPositionX(car) + "," + carServiceImpl.getPositionY(car) + ")");

        }
    }

}
