package com.bankofapis.web.controller;

import com.bankofapis.core.model.accounts.*;
import com.bankofapis.web.service.AispService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.bankofapis.core.model.common.Constants.CONSENT_ID_HEADER;
import static com.bankofapis.remote.common.Endpoints.*;

@RestController
@RequestMapping("/open-banking/*/fdp")
public class FlexDebtController {

    private AispService aispService;

    @Autowired
    public FlexDebtController(AispService aispService) {
        this.aispService = aispService;
    }

   
    @GetMapping(value = ACCOUNT_LIST_ENDPOINT)
    public OBReadDataResponse<OBReadAccountList> getAccounts() {
        return aispService.getAccountDetails();
    }

    
}