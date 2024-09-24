package CarValue;

public class Car {
    private int modelYear; 
    private int purchasePrice;
    private int currentValue;
    
    public void setModelYear(int userYear){
       modelYear = userYear;
    }
    
    public int getModelYear() {
       return modelYear;
    }
    

    public void setPurchasePrice(int userPrice) {
        purchasePrice = userPrice;
    }

    

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getCurrentValue(){
        return currentValue;
    }
    
    
    public void calcCurrentValue(int currentYear) {
       double depreciationRate = 0.15;
       int carAge = currentYear - modelYear;
       
       // Car depreciation formula
       currentValue = (int) 
          Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
    }
    

    public void printInfo(){
        System.out.println("Car's information:");
      System.out.println("  Model year: " + getModelYear());
      System.out.println("  Purchase price: $" + getPurchasePrice());
      System.out.println("  Current value: $" + getCurrentValue());
    }

 }