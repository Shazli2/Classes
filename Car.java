public interface Car {

        void run ();
        void stop ();
        void repair ();
    }

//Car <Interface>
//it should have run, stop, repair functions.

public abstract class FourDoorCar implements Car {
    private String model;
    private String brand;
    private int year;

    // Constructor to initialize common attributes
    public FourDoorCar(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    // Implement run, stop, and repair methods
    @Override
    public void run() {
        System.out.println(brand + " " + model + " is running.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }

    @Override
    public void repair() {
        System.out.println(brand + " " + model + " is being repaired.");
    }

    // Getters for the attributes
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

// Create FourDoorCar and TwoDoorCar abstract classes.
//Implement necessary functions and get necessary attributes from constructor

public abstract class TwoDoorCar implements Car {
    private String model;
    private String brand;
    private int year;

    // Constructor to initialize common attributes
    public TwoDoorCar(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    // Implement run, stop, and repair methods
    @Override
    public void run() {
        System.out.println(brand + " " + model + " is running.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }

    @Override
    public void repair() {
        System.out.println(brand + " " + model + " is being repaired.");
    }

    // Getters for the attributes
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

// Create FourDoorToyota, FourDoorBMW,  FourDoorFord,
// FourDoorHyundai classes, inherited from FourDoorCar.
//Implement necessary functions and write constructor.

    public class FourDoorToyota extends FourDoorCar {
        public FourDoorToyota(int year) {
            super("Toyota", year);
        }

        @Override
        public void repair() {
            System.out.println("Rearing Car Four Door" + getYear());
        }
    }

    public class FourDoorBMW extends FourDoorCar {
        public FourDoorBMW(int year) {
            super("BMW", year);
        }

        @Override
        public void repair() {
            System.out.println("Repairing BMW Four-Door from " + getYear());
        }
    }

    public class FourDoorFord extends FourDoorCar {
        public FourDoorFord(int year) {
            super("Ford", year);
        }

        @Override
        public void repair() {
            System.out.println("Repairing Ford Four-Door from " + getYear());
        }
    }

    public class FourDoorHyundai extends FourDoorCar {
        public FourDoorHyundai(int year) {
            super("Hyundai", year);
        }

        @Override
        public void repair() {
            System.out.println("Repairing Hyundai Four-Door from " + getYear());
        }
    }
   /* Create TwoDoorToyota, TwoDoorBMW,  TwoDoorFord,
   TwoDoorHyundai classes, inherited from TwoDoorCar.
Implement necessary functions and write constructor.
    */
   public class TwoDoorToyota extends TwoDoorCar {
       public TwoDoorToyota(int year) {
           super("Toyota", year);
       }

       @Override
       public void repair() {
           System.out.println("Repairing Toyota Two-Door from " + getYear());
       }
   }

public class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW(int year) {
        super("BMW", year);
    }

    @Override
    public void repair() {
        System.out.println("Repairing BMW Two-Door from " + getYear());
    }
}
public class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord(int year) {
        super("Ford", year);
    }

    @Override
    public void repair() {
        System.out.println("Repairing Ford Two-Door from " + getYear());
    }
}
public class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai(int year) {
        super("Hyundai", year);
    }

    @Override
    public void repair() {
        System.out.println("Repairing Hyundai Two-Door from " + getYear());
    }

    public static void main(String[] args) {
        public class Main {
            public static void main(String[] args) {
                // Test with Four-Door Toyota
                FourDoorToyota fourDoorToyota = new FourDoorToyota("Camry", 2022);
                fourDoorToyota.run();
                fourDoorToyota.stop();
                fourDoorToyota.repair();

                // Test with Two-Door BMW
                TwoDoorBMW twoDoorBMW = new TwoDoorBMW("M4", 2021);
                twoDoorBMW.run();
                twoDoorBMW.stop();
                twoDoorBMW.repair();

                // Test with Four-Door Ford
                FourDoorFord fourDoorFord = new FourDoorFord("Focus", 2020);
                fourDoorFord.run();
                fourDoorFord.stop();
                fourDoorFord.repair();

                // Test with Two-Door Hyundai
                TwoDoorHyundai twoDoorHyundai = new TwoDoorHyundai("Veloster", 2023);
                twoDoorHyundai.run();
                twoDoorHyundai.stop();
                twoDoorHyundai.repair();
            }
        }

    }
}














