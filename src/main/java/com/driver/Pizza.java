package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private int toppingPrice;

    private int paperBagPrice;

    private boolean isCheeseAdded;

    private boolean isToppingAdded;

    private boolean isPaperBagAdded;

    private int totalPrice;

    private int basePrice;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg == true){
            basePrice = 300;
            toppingPrice = 70;
        }else{
            basePrice = 400;
            toppingPrice = 120;
        }
        cheesePrice = 80;
        paperBagPrice = 20;

        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: "+basePrice+"\n";
    }

    public int getPrice(){

        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here

        if(isCheeseAdded == false){
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false){
            totalPrice = totalPrice + toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            isPaperBagAdded = true;
            totalPrice = totalPrice + paperBagPrice;

        }

    }

    public String getBill(){
        // your code goes here

        if(!isBillGenerated){
            isBillGenerated = true;

            if(isCheeseAdded){
                bill = bill + "Extra Cheese Added: "+cheesePrice+"\n";
            }

            if(isToppingAdded){
                bill = bill + "Extra Topping Added: "+toppingPrice+"\n";
            }
            if(isPaperBagAdded){
                bill = bill + "Paperbag Added: "+paperBagPrice+"\n";
            }


            bill = bill + totalPrice+"\n";
        }
        return this.bill;
    }
}
