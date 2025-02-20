public class CaffeinatedBeverage
{
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
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    public CaffeinatedBeverage(CaffeinatedBeverage original)
    {
        if(original != null)
        {
            this.name = original.name;
            this.ounces = original.ounces;
            this.price = original.price;
        }
    }

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
    }

    //Create toString method Format: "Caffeinated Beverage: (name), (ounces), $(price)" 

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name);
    }
    
    @Override
    public String toString() 
    {
        return String.format("Caffeinated Beverage: %s, %d ounces, $%.2f", this.name, this.ounces, this.price);
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