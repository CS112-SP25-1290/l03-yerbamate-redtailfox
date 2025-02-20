public class CaffeinatedBeverage
{
    protected String name;
    protected int ounces;
    protected double price;

    public CaffeinatedBeverage()
    {
        this.name = null;
        this.ounces = 0;
        this.price = 0.0;
    }
    
    public CaffeinatedBeverage(String name, int ounces, double price) {
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

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 && this.name.equals(that.name);
    }

    //Special methods
    /**
     * The sip amount is subtracted from the amount of ounces in the CaffeintedBeverage object,
     * if the sip amount is less than or equal to the amount of ounces
     * @param sipAmount the amount of ounces that were sipped from beverage
     * @return boolean if there is enough ounces in CaffeinatedBeverage to be sipped or not
     */
    public boolean sip(int sipAmount)
    {
        boolean isValid = false;
        if(sipAmount <= this.ounces) 
        {
            this.ounces -= sipAmount;
            if (ounces != 0) {
                isValid = true;
            }
        } 
        else 
        {
            isValid = false;
        }

        return isValid;
    }
    /**
     * Checks if the CaffeinatedBevarage object is empty (0 ounces)
     * @return boolean if object is empty or not
     */
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