package filter_pattern.filter_criteria;


import filter_pattern.model.Laptop;

import java.util.List;

public interface Criteria {
    List<Laptop> meets(List<Laptop> laptops);
}
