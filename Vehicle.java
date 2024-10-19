public class Vehicle {
    
    //Instance Variables
    private int seating;
    private int gasMileage;
    private String make;
    private String model;
    private int year;
    private int topSpeed
    private double rentalPrice;

    //Default Constructor
    public Vehicle() {
        this.seating = 0;
        this.gasMileage = 0;
        this.make = " ";
        this.model = " ";
        this.year = 0;
        this.topSpeed = 0;
        this.rentalPrice = 0.0;
    }

    //Full Constructor
    public Vehicle(int seating, int gasMileage, String make, String model, int year, int topSpeed, double rentalPrice) {
        this.seating = seating;
        this.gasMileage = gasMileage;
        this.make = make;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
        this.rentalPrice = rentalPrice;
    }

    //Getters / Accessors
    public int getSeating() {
        return this.seating;
    }
    public int getGasMileage() {
        return this.gasMileage;
    }
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public int getTopSpeed() {
        return this.topSpeed;
    }
    public double getRentalPrice() {
        return this.rentalPrice;
    }

    //Setters / Mutators
    public void setSeating() {
        this.seating = seating;
    }
    public void setGasMileage() {
        this.gasMileage = gasMileage;
    }
    public void setMake() {
        this.make = make;
    }
    public void setModel() {
        this.model = model;
    }
    public void setYear() {
        this.year = year;
    }
    public void setTopSpeed() {
        this.topSpeed = topSpeed;
    }
    public void setRentalPrice() {
        this.rentalPrice = rentalPrice;
    }

    //Other Methods
    public String toString() {
        return String.format("Seating: %d Seats\nGas Mileage: %d mi\nMake: %s\nModel: %s\nYear: %d\nTop Speed: %d mph\nRental Price: $%0.2f", this.seating, this.gasMileage, this.make, this.model, this.year, this.topSpeed, this.rentalPrice);
    }

    public boolean equals(Vehicle other) {
        return (this.seating == other.seating && this.gasMileage == other.gasMileage && this.make == other.make && this.model == other.model && this.year == other.year && this.topSpeed == other.topSpeed && this.rentalPrice == other.rentalPrice);
    }


}