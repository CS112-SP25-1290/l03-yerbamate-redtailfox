public class CaffeinatedBeverage
{

    public static final String DEFAULT_NAME = " caffeine fix";
    public static final int DEFAULT_OUNCES = 16;
    public static final double DEFAULT_PRICE = 0.99;

    protected String name;
    protected int ounces;
    protected double price;




    public CaffeinatedBeverage(String name, int ounces, double price) 
    {
        if (this.setAll(name, ounces, price)) {
            System.out.println("ERROR: data given to full Caffeinted constructor");
            System.exit(0);
        }
    }

    /*** DEFAULT CONSTRUCTOR */

    public CaffeinatedBeverage() {
        this(DEFAULT_NAME, DEFAULT_OUNCES, DEFAULT_PRICE);
    }

    /*** COPY CINSTRUCTOR */

    public CaffeinatedBeverage(CaffeinatedBeverage original) {
        if (original != null) {
            this.setAll(original.name, original.ounces, original.price);
        } else {
            System.out.println("ERROR: null dont give to copy CaffeinatedBeverage constructor.");
            System.exit(0);
        }
    }
    
    public boolean setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }
    

    public boolean setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAll(String name, int ounces, double price) {
        return this.setName(name) && this.setOunces(ounces) && this.setPrice(price);
    }

    /**
     * name if the beverage 
     * @return name of beverage
     */

    public String getName() {
        return this.name;
    }
    
    /**
     * Get number of fluid ounces in container
     * 
     * @return number of fluid ounces that is present in beverage container 
     */


    public int getOunces() {
        return this.ounces;
    }

    /**
     * get price of the beverage 
     * 
     * @return price of the beverage, either purchased or material cost 
     */


    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other instanceof CaffeinatedBeverage) {
            return false;
        }
        CaffeinatedBeverage otherCaffeine = (CaffeinatedBeverage) other;
        return this.ounces == otherCaffeine.ounces &&  Double.compare(this.price, otherCaffeine.price) == 0 && this.name.equals(otherCaffeine.name);
        
    }
    @Override
    public String toString() {
        return String.format("CaffeinatedBeverage: name = %s, %d fl. oz., $%.2f", this.name, this.ounces, this.price);    
    }

    public boolean sip(int sipAmount)
    {
        boolean isValid = false;
        if (sipAmount <= this.ounces) {
            this.ounces -= sipAmount;
            if (ounces != 0) {
                isValid = true;
            }
        } else {
            isValid = false;
        }

        return isValid;
    }
    public boolean isEmpty()
    {
        boolean isValid = false;
        if(this.ounces == 0)
        {
            isValid = true;
        }
        else
        {
            isValid = false;
        }

        return isValid;
    }
}