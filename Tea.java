public class Tea extends CaffeinatedBeverage {
    protected int brewTemp;

    public Tea() 
    {
        super();
        this.brewTemp = 0;
    }

    public Tea(String name, int ounces, double price, int brewTemp)
    {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }

    //Ideal tea temp ranges from 65-100 degrees celsius
    public boolean setBrewTemp(int brewTemp) 
    {
        boolean isValid = false;
        if (brewTemp >= 65 && brewTemp <= 100) {
            isValid = true;
            this.brewTemp = brewTemp;
        } else {
            isValid = false;
        }
        return isValid;
    }

    public int getBrewTemp() 
    {
        return this.brewTemp;
    }

    @Override
    public String toString() 
    {
        String output = String.format("Tea: %s, %d ounces, brewed @ %d°C, $%.2f", super.name, super.ounces,
                this.brewTemp, super.price);
        return output;
    }

    @Override
    public boolean equals(Object other) 
    {
        if (other == null) {
            return false;
        } else if (this.getClass() != other.getClass()) {
            return false;
        } else {
            Tea otherTea = (Tea) other;
            return super.equals(otherTea) && this.brewTemp == otherTea.brewTemp;
        }
    }
}
