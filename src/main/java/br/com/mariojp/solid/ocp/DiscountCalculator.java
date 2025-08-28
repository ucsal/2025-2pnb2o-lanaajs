package br.com.mariojp.solid.ocp;

import java.util.Map;

public class DiscountCalculator {

    private Map<String, DiscountPolicy> politica;

    public DiscountCalculator(Map<String, DiscountPolicy> policies) {
        this.politica = policies;
    }

    public double calculate(String customerType, double amount) {
        DiscountPolicy policy = politica.getOrDefault(customerType, amount1 -> amount1); // sem desconto padrão
        return policy.apply(amount);
    }
}
