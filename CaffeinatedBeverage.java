public class CaffeinatedBeverage
{

    public static final String DEFAULT_NAME = " caffeine fix";
    public static final int DEFAULT_OUNCES = 16;
    public static final double DEFAULT_PRICE = 0.99;

    protected String name;
    protected int ounces;
    protected double price;




    public CaffeinatedBeverage()
    {
        this.name = null;
        this.ounces = 0;
        this.price = 0;
    }
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
    
    public boolean setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public int getOunces() {
        return this.ounces;
    }
    //Change setOunces so that it validates the parameter value
<<<<<<< HEAD
    public boolean setOunces(int ounces) 
    {
        if(ounces >= 0)
        {
            this.ounces = ounces;
            return true;
        }
        else 
        {
            return false;
        }
        
=======
    public boolean setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
            return true;
        } else {
            return false;
        }
>>>>>>> origin/HEAD
    }

    public double getPrice() {
        return this.price;
    }
    //Change setPrice so that it validates the parameter value
    public boolean setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            return true;
        } else {
            return false;
        }
    }

    //Create a setAll method
<<<<<<< HEAD
    public boolean setAll(String name, int ounces, double price) 
    {
        if (this.setOunces(ounces) && this.setPrice(price))
        {
            this.setName(name);
            this.setOunces(ounces);
            this.setPrice(price);
            return true;

        }
        else 
        {
            return false;
        }
=======
    public boolean setAll(String name, int ounces, double price) {
        return this.setName(name) && this.setOunces(ounces) && this.setPrice(price);
>>>>>>> origin/HEAD
    }

    //Create toString method Format: "Caffeinated Beverage: (name), (ounces), $(price)" 
    

    @Override
    public boolean equals(Object other) {
        if (other == null || other instanceof CaffeinatedBeverage) {
            return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
               this.name.equals(that.name);
    }
    
    @Override
<<<<<<< HEAD
    public String toString() 
    {
        return String.format("Caffeinated Beverage: %s, %d ounces, $%.2f", this.name, this.ounces, this.price);
=======
    public String toString() {
        return String.format("caffeinated Beverage: name %s,  %d.  ");
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