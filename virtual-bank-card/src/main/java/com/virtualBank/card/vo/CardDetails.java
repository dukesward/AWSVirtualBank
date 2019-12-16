package com.virtualBank.card.vo;

public class CardDetails {
    String cardId;
    String displayCardNumber;
    String localCardActivationIndicator;
    String overseasCardActivationIndicator;
    Double currentCreditLimitAmount;
    Double maximumPermanentCreditLimitAmount;
    Double maximumTemporaryCreditLimitAmount;
    Double currentOutstandingAmount;
    String subCardType;
    String cardHolderType;
    String cardIssueReason;
    String embossName;
    String organization;
    String logo;
    String productName;
    String cardSubStatus;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getDisplayCardNumber() {
        return displayCardNumber;
    }

    public void setDisplayCardNumber(String displayCardNumber) {
        this.displayCardNumber = displayCardNumber;
    }

    public String getLocalCardActivationIndicator() {
        return localCardActivationIndicator;
    }

    public void setLocalCardActivationIndicator(String localCardActivationIndicator) {
        this.localCardActivationIndicator = localCardActivationIndicator;
    }

    public String getOverseasCardActivationIndicator() {
        return overseasCardActivationIndicator;
    }

    public void setOverseasCardActivationIndicator(String overseasCardActivationIndicator) {
        this.overseasCardActivationIndicator = overseasCardActivationIndicator;
    }

    public Double getCurrentCreditLimitAmount() {
        return currentCreditLimitAmount;
    }

    public void setCurrentCreditLimitAmount(Double currentCreditLimitAmount) {
        this.currentCreditLimitAmount = currentCreditLimitAmount;
    }

    public Double getMaximumPermanentCreditLimitAmount() {
        return maximumPermanentCreditLimitAmount;
    }

    public void setMaximumPermanentCreditLimitAmount(Double maximumPermanentCreditLimitAmount) {
        this.maximumPermanentCreditLimitAmount = maximumPermanentCreditLimitAmount;
    }

    public Double getMaximumTemporaryCreditLimitAmount() {
        return maximumTemporaryCreditLimitAmount;
    }

    public void setMaximumTemporaryCreditLimitAmount(Double maximumTemporaryCreditLimitAmount) {
        this.maximumTemporaryCreditLimitAmount = maximumTemporaryCreditLimitAmount;
    }

    public Double getCurrentOutstandingAmount() {
        return currentOutstandingAmount;
    }

    public void setCurrentOutstandingAmount(Double currentOutstandingAmount) {
        this.currentOutstandingAmount = currentOutstandingAmount;
    }

    public String getSubCardType() {
        return subCardType;
    }

    public void setSubCardType(String subCardType) {
        this.subCardType = subCardType;
    }

    public String getCardHolderType() {
        return cardHolderType;
    }

    public void setCardHolderType(String cardHolderType) {
        this.cardHolderType = cardHolderType;
    }

    public String getCardIssueReason() {
        return cardIssueReason;
    }

    public void setCardIssueReason(String cardIssueReason) {
        this.cardIssueReason = cardIssueReason;
    }

    public String getEmbossName() {
        return embossName;
    }

    public void setEmbossName(String embossName) {
        this.embossName = embossName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCardSubStatus() {
        return cardSubStatus;
    }

    public void setCardSubStatus(String cardSubStatus) {
        this.cardSubStatus = cardSubStatus;
    }
}
