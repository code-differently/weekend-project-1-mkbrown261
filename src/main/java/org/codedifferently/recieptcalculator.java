package org.codedifferently;

import java.util.Random;

public class recieptcalculator {

    private int itemid;
    private double itemprice;
    private double taxrate;
    private double tax;
    private double item2price;
    private double item3price;
    public boolean rewardmember = true;
    public double memberpricing;
    public recieptcalculator() {
        Random random = new Random();
        itemid = random.nextInt(1000) + 100;
        taxrate = random.nextInt((7)) + 3 /100.0;
        itemprice = random.nextInt(400) + 19;
        item2price = random.nextInt(30) +1;
        item3price = random.nextInt(60) +4;

    }

    public double calculatetax() {
    return Round((itemprice +item2price + item3price) * taxrate) / 100;
    }
    public double calculatetotal(){

        return itemprice + item2price + item3price + calculatetax() + tax;
    }
    public String generatethereceipt() {
        String reciept = "";

        reciept += "Item ID: " + itemid + "\n";
        reciept += "Price: $" + (itemprice) + "\n";
        reciept += "Price: $" +  (item2price) + "\n";
        reciept += "Price: $" +  (item3price) + "\n";
        reciept += "Tax rate:" +  (taxrate )  + "\n";
        reciept += "Tax:" + calculatetax() +  "\n";
        if (rewardmember==true){
            memberpricing = calculatetotal() / 2;
            reciept += "Total: $" + memberpricing + "\n";
        }else {
            reciept += "Total: $" + calculatetotal() + "\n";
        }
        if (rewardmember == true) {
            memberpricing = calculatetotal() / 2;
            reciept += "Total (Rounded):" + Round( memberpricing) + "\n";
        }else{
            reciept += "Total (Rounded):" + Round(calculatetotal()) + "\n";


        }



        return reciept;

    }
    private double Round(double valuerounded) {
      return Math.round(valuerounded * 100) / 100;
    }


}


