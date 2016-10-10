package strategy_pattern.strategies;

public class PrincipalConsultant implements Role {
    @Override
    public String describeResponsibilities() {
        return "Principal consultant is responsible for...";
    }
}
