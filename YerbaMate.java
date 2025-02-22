public class YerbaMate extends Tea {

    //constant variable 
    
    public static final int DEFAULT_NUM_PASSES = 0;
    //Instance Variable 
    private int numPasses;
    

    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        if (!this.setNumPasses(numPasses)) {
            System.out.println("ERROR : Bad data given to full YerbaMate constructor");
            System.exit(0);
        }

    }
    
    public YerbaMate(String name, int ounces, double price, int brewTemp) {
        this(name, ounces, price, brewTemp, DEFAULT_NUM_PASSES);
    }

    public YerbaMate() {
        super();
        this.setNumPasses(DEFAULT_NUM_PASSES);
    }

    public YerbaMate(YerbaMate original) {
        if (original != null) {
            this.setAll(original.getName(), original.getOunces(), original.getPrice(), original.getBrewTemp(),
                    original.numPasses);
        } else {
            System.out.println("ERROR: null data given to copy YerbaMate constructor");
            System.exit(0);
        }
    }




    private boolean setNumPasses(int numPasses) {
        if (numPasses >= 0) {
            this.numPasses = numPasses;
            return true;
        } else {
            return false;
        }
    }

    private boolean setAll(String name, int ounces, double price, int brewTemp, int numPasses) {
        return super.setAll(name, ounces, price, brewTemp) && this.setNumPasses(numPasses);
    }

    public void passMate() {
        this.numPasses++;
        System.out.println("Passed the mate, current # of passes: " + this.numPasses);
    }

    public void refill(int ounces) {
        if (ounces > 0) {
            this.setOunces(this.getOunces() + ounces);
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        YerbaMate otherMate = (YerbaMate) other;
        return super.equals(otherMate) && this.numPasses == otherMate.numPasses;
    }
    @Override
    public String toString()
    {
        String teaString = super.toString();
        int colonloaction = teaString.indexOf(":");
        teaString = teaString.substring(colonloaction + 2);

        return String.format("YerbaMate: %s, %d passes as far",teaString, this.numPasses);
        }
    
}
