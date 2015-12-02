package filter_pattern;

import filter_pattern.model.Laptop;

import java.util.Arrays;
import java.util.List;

public class LaptopFactory {
    public static List<Laptop> manufactureInBulk() {
        return Arrays.asList(
               new Laptop(100, "250GB", "i5", "4GB", "MAC", "15inch"),
               new Laptop(101, "250GB", "i5", "2GB", "MAC", "13inch"),
               new Laptop(102, "150GB", "i3", "2GB", "MAC", "13inch"),
               new Laptop(103, "500GB", "i7", "4GB", "MAC", "15inch"),

               new Laptop(104, "250GB", "i5", "4GB", "UBUNTU", "13inch"),
               new Laptop(105, "250GB", "i5", "2GB", "UBUNTU", "13inch"),
               new Laptop(106, "500GB", "i7", "8GB", "UBUNTU", "15inch"),
               new Laptop(107, "200GB", "i3", "2GB", "UBUNTU", "13inch"),

               new Laptop(108, "200GB", "i3", "2GB", "WINDOWS", "15inch"),
               new Laptop(109, "250GB", "i7", "4GB", "WINDOWS", "15inch"),
               new Laptop(110, "500GB", "i7", "8GB", "WINDOWS", "13inch")
        );
    }
}
