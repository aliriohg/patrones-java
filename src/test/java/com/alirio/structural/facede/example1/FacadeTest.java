package com.alirio.structural.facede.example1;

import com.ali.structural.facade.example1.CreditMarket;
import org.junit.Test;

public class FacadeTest {

    @Test
    private static void probarFacade() {
        CreditMarket creditMarket = new CreditMarket();
        creditMarket.showCreditGold();
        creditMarket.showCreditSilver();
        creditMarket.showCreditGold();
    }

}
