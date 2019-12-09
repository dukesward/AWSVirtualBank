package com.virtualBank.card.vo;

public class StandLoanAddRq {
    String cardNo;
    String DestinationAccountNo;
    String bankCode;
    String bankBranchCode;
    String cardholderTenor;
    String loanCreateDate;
    String loanType;
    String merchantNo;
    String merchantOrg;
    String merchantTenor;
    String paymentMode;
    String promotionId;
    String loanAmount;
    String loanDescription;
    String agentCode;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDestinationAccountNo() {
        return DestinationAccountNo;
    }

    public void setDestinationAccountNo(String destinationAccountNo) {
        DestinationAccountNo = destinationAccountNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankBranchCode() {
        return bankBranchCode;
    }

    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }

    public String getCardholderTenor() {
        return cardholderTenor;
    }

    public void setCardholderTenor(String cardholderTenor) {
        this.cardholderTenor = cardholderTenor;
    }

    public String getLoanCreateDate() {
        return loanCreateDate;
    }

    public void setLoanCreateDate(String loanCreateDate) {
        this.loanCreateDate = loanCreateDate;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerchantOrg() {
        return merchantOrg;
    }

    public void setMerchantOrg(String merchantOrg) {
        this.merchantOrg = merchantOrg;
    }

    public String getMerchantTenor() {
        return merchantTenor;
    }

    public void setMerchantTenor(String merchantTenor) {
        this.merchantTenor = merchantTenor;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanDescription() {
        return loanDescription;
    }

    public void setLoanDescription(String loanDescription) {
        this.loanDescription = loanDescription;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }
}
