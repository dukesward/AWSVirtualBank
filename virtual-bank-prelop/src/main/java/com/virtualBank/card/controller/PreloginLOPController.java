package com.virtualBank.card.controller;

import com.virtualBank.card.vo.Offer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "Pre login LOP")
@RestController
@RequestMapping("/prelop")
public class PreloginLOPController {
    @RequestMapping(method = RequestMethod.GET,value = "/getOfferDetails")
    @ApiOperation(value = "get customer offer details", notes = "using offer id to get customer offer details.")
    @ApiImplicitParam(name = "offerId", value = "offerId", paramType = "query", required = true, dataType = "String")
    public Offer getOfferDetails(@RequestParam(name = "offerId")String offerId){
        if(!"ABC".equals(offerId)) {
            return null;
        }
        Offer offer = new Offer();
        offer.setAccountNo("4009900887712215");
        offer.setWaveId("O9ieDG7se");
        offer.setCampaignId("DerSET43RS");
        offer.setCardNumber("5003322332258709");
        offer.setCustomerName("test");
        offer.setLatestOfferStatus("M");
        offer.setProductCode("PRD");
        offer.setUserField1("");
        offer.setUserField2("");
        offer.setUserField3("");
        offer.setUserField4("");
        offer.setUserField5("");
        offer.setUserField6("");
        offer.setUserField7("");
        offer.setUserField8("");
        offer.setUserField9("");
        offer.setUserField10("");

        return offer;
    }


}
