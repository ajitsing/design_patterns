package filter_pattern.filter_criteria;

import filter_pattern.model.Laptop;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ScreenSize13Inch implements Criteria {
    @Override
    public List<Laptop> meets(List<Laptop> laptops) {
        return laptops.stream().filter(laptop -> laptop.getScreenSize().equals("13inch")).collect(toList());
    }
}
