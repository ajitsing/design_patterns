package filter_pattern;

import filter_pattern.filter_criteria.AndCriteria;
import filter_pattern.filter_criteria.HardDisk250GB;
import filter_pattern.filter_criteria.I5Processor;
import filter_pattern.filter_criteria.Macintosh;
import filter_pattern.model.Laptop;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Laptop> laptops = LaptopFactory.manufactureInBulk();

        AndCriteria searchCriteria = new AndCriteria(new HardDisk250GB(), new Macintosh(), new I5Processor());
        List<Laptop> filteredLaptops = searchCriteria.meets(laptops);

        filteredLaptops.stream().forEach(Laptop::prettyPrint);
    }
}
