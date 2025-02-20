public class CaffeinatedBeverage
{
    private String name;
    private int ounces;
    private double price;

    public CaffeinatedBeverage(String name, int ounces, double price) 
    {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getOunces() {
        return this.ounces;
    }
    //Change setOunces so that it validates the parameter value
    public void setOunces(int ounces) {
        this.ounces = ounces;
    }

    public double getPrice() {
        return this.price;
    }
    //Change setPrice so that it validates the parameter value
    public void setPrice(double price) 
    {
        this.price = price;
    }

    //Create a setAll method

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