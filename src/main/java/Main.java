import java.util.HashMap;
import java.util.Map;

import br.com.mariojp.solid.ocp.DiscountCalculator;
import br.com.mariojp.solid.ocp.DiscountPolicy;
import br.com.mariojp.solid.ocp.PartnerPolicy;
import br.com.mariojp.solid.ocp.PremiumPolicy;
import br.com.mariojp.solid.ocp.RegularPolicy;

public class Main {
    public static void main(String[] args) {
        Map<String, DiscountPolicy> policyMap = new HashMap<>();
        policyMap.put("regular", new RegularPolicy());
        policyMap.put("premium", new PremiumPolicy());
        policyMap.put("partner", new PartnerPolicy());

        DiscountCalculator calculator = new DiscountCalculator(policyMap);

        System.out.println(calculator.calculate("regular", 100));  // 95.0
        System.out.println(calculator.calculate("premium", 100));  // 90.0
        System.out.println(calculator.calculate("partner", 100));  // 85.0
        System.out.println(calculator.calculate("unknown", 100));  // 100.0
    }
}
