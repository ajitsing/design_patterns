package strategy_pattern.strategies;

public class SeniorConsultant implements Role {
    @Override
    public String describeResponsibilities() {
        return "Senior consultant is responsible for...";
    }
}
