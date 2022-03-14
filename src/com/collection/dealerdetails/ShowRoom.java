package com.collection.dealerdetails;
/*
Dealer details

Honda Gachibowli, Gachibowli, 9123456780

      Civic     , 20,         1500000
      City      , 10,          1200000


 Sundaram Honda , Vijayawada , 9087654321

    Civic ,       10         , 150000
    City,        5            , 1200000
    Jazz ,       10          , 900000

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowRoom {

    public void method() {
        Car car1 = new Car();
        car1.setName("Civic");
        car1.setQuantity(20);
        car1.setPrice(150000);

        Car car2 = new Car();
        car2.setName("City");
        car2.setQuantity(10);
        car2.setPrice(1200000);

        Car car3 = new Car();
        car3.setName("jazz");
        car3.setQuantity(10);
        car3.setPrice(900000);

        DealerDetails dealerDetails1 = new DealerDetails();

        dealerDetails1.setName("HondaGachibowli");
        dealerDetails1.setAddress("Gachibowli");
        dealerDetails1.setPhoneNo("9123456780");

        dealerDetails1.setCars(Arrays.asList(car1, car2));

        DealerDetails dealerDetails2 = new DealerDetails();

        dealerDetails2.setName("SundaramHonda");
        dealerDetails2.setAddress("Vijayawada");
        dealerDetails2.setPhoneNo("9087654321");

        dealerDetails2.setCars(Arrays.asList(car1, car2, car3));

        List<DealerDetails> dealers = new ArrayList<>();

        dealers.add(dealerDetails1);
        dealers.add(dealerDetails2);


        for (DealerDetails dd : dealers) {

            System.out.println("Dealer Name : " + dd.getName() + " Address : " + dd.getAddress() +
                    " phone number " + dd.getPhoneNo());


            for (Car car : dd.getCars()) {

                System.out.println("Name Of Car :" + car.getName() + "Quantity of Cars : " + car.getQuantity() +
                        " Price : " + car.getPrice());

            }
        }

    }

    public static void main(String[] args) {
        ShowRoom showRoom = new ShowRoom();

        showRoom.method();

    }


}
