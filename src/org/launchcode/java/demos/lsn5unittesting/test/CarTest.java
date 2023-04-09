package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)


    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void emptyTest(){
         assertEquals(10,10,.001);
     }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
         test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testInitialGasTanksss(){

        test_car = new Car("bmw", "model 3x",12,69);
                assertFalse(test_car.getMilesPerGallon() == 20);
    }

    //exercises

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving(){
        test_car = new Car("Toyota", "Prius", 10, 50);
        test_car.drive(50);
        assertEquals(9,test_car.getGasTankLevel(),002);

    }


    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void testGasTankAfterExceedingTankRange(){
        test_car = new Car("chevy","model 2", 10, 3);
        test_car.drive(500);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }
    //TODO: can't have more gas than tank size, expect an exception

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");



    }



    }
