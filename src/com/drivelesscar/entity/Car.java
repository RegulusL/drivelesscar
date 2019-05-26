package com.drivelesscar.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Car {
   private int positionX;
   private int positionY;
    // (0,1) as north, (0,-1) as south, (1,0) as east, (-1,0) as west;
    private int orientationEast;
    private int orientationNorth;

    public Car(int positionX, int positionY, int orientationEast, int orientationNorth) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.orientationEast = orientationEast;
        this.orientationNorth = orientationNorth;
    }
}
