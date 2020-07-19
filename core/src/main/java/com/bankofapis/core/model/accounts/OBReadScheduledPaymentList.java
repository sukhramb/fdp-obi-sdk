package com.bankofapis.core.model.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OBReadScheduledPaymentList {

    @JsonProperty("StandingOrder")
    private List<OBReadStandingOrder> standingOrderList = null;

    public List<OBReadStandingOrder> getStandingOrderList() {
        return standingOrderList;
    }

    public void setStandingOrderList(List<OBReadStandingOrder> standingOrderList) {
        this.standingOrderList = standingOrderList;
    }
}