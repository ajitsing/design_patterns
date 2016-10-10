package strategy_pattern.strategies;

public class Consultant implements Role {
    @Override
    public String describeResponsibilities() {
        return "Consultant is responsible for...";
    }
}
