package com.virtualBank.card.controller;

import com.virtualBank.card.service.PreloginLOPService;
import com.virtualBank.card.vo.Offer;
import com.virtualBank.card.vo.StandLoanAddRq;
import com.virtualBank.card.vo.StandLoanAddRs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(description = "Pre login LOP")
@RestController
@RequestMapping("/prelop")
public class PreloginLOPController {
    @Autowired
    PreloginLOPService preloginLOPService;
    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
    @GetMapping(value = "/getOfferDetails")
    @ApiOperation(value = "get customer offer details", notes = "using offer id to get customer offer details.")
    @ApiImplicitParam(name = "offerId", value = "offerId", paramType = "query", required = true, dataType = "String")
    public Offer getOfferDetails(@RequestParam(name = "offerId")String offerId){
        Offer offer = preloginLOPService.getOfferDetails(offerId);
        return offer;
    }

    @PostMapping(value = "/standLoanAdd")
    @ApiOperation(value = "loan on line", notes = "Stand Loan Online")
    public StandLoanAddRs standLoanAdd(@RequestBody StandLoanAddRq standLoandAddRq) {
        String applicationId = "abc123456";
        StandLoanAddRs standLoanAddRs = new StandLoanAddRs();
        standLoanAddRs.setApplicationId(applicationId);
        return standLoanAddRs;
    }
}
