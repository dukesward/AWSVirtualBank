package com.virtualBank.card.service.impl;

import com.virtualBank.card.service.PreloginLOPService;
import com.virtualBank.card.vo.Offer;
import org.springframework.stereotype.Service;

@Service
public class PreloginLOPServiceImpl implements PreloginLOPService {
    @Override
    public Offer getOfferDetails(String offerId) {
        if(!"ABC".equals(offerId)) {
            return null;
        }
        Offer offer = new Offer();
        offer.setAccountNo("1234567890");
        offer.setWaveId("O9ieDG7se");
        offer.setCampaignId("DerSET43RS");
        offer.setCardNumber("5003322332258709");
        offer.setCustomerName("Leon");
        offer.setLatestOfferStatus("M");
        offer.setProductCode("PRD");
        offer.setMonthlyRepaymentAmountList("4444|3333|2222|1111");
        offer.setTenorList("3|6|9|12");
        offer.setEffectiveInterestRateList("8.1|7.1|6.1|5.1");
        offer.setLoanAmount("20000");
        offer.setUserField1("12345");
        offer.setUserField2("888");
        offer.setUserField3("3434534");
        offer.setUserField4("11");
        offer.setUserField5("11");
        offer.setUserField6("12344");
        offer.setUserField7("500");
        offer.setUserField8("130000");
        offer.setUserField9("30000.9");
        offer.setUserField10("40");
        offer.setUserField11("Anijapper");
        offer.setUserField12("5003322332258709");
        offer.setUserField13("Partial");
        offer.setUserField14("5");
        offer.setUserField15("60");
        offer.setUserField16("40");
        offer.setUserField17("11");
        offer.setUserField18("11");
        offer.setUserField19("11");
        offer.setUserField20("RC");
        offer.setUserField20("11");
        offer.setUserField21("R");
        offer.setUserField22("11");
        offer.setUserField23("V");
        offer.setUserField24("90");
        offer.setUserField25("100");
        offer.setUserField26("20001");
        offer.setUserField27("L");
        offer.setUserField28("8.1|7.1|6.1|5.1");
        offer.setUserField29("11");
        offer.setUserField30("F");
        return offer;
    }
}
