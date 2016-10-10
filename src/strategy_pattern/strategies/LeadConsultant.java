package strategy_pattern.strategies;

public class LeadConsultant implements Role {
    @Override
    public String describeResponsibilities() {
        return "Lead consultant is responsible for...";
    }
}
