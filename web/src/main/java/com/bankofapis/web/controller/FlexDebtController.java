package com.bankofapis.web.controller;

import com.bankofapis.core.model.accounts.*;
import com.bankofapis.core.model.common.OBGenericResponse;
import com.bankofapis.core.model.payments.OBWriteDomestic;
import com.bankofapis.core.model.payments.OBWriteDomesticResponse;
import com.bankofapis.web.service.AispService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.bankofapis.core.model.common.Constants.CONSENT_ID_HEADER;
import static com.bankofapis.remote.common.Endpoints.*;

import java.util.UUID;

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

    @PostMapping(value = "/extend-payments")
    public ResponseEntity<OBGenericResponse> submitExtendPayments(@RequestBody(required = false) OBWriteDomestic obWriteDomestic2) throws Exception {
    	OBGenericResponse obGenericResponse= new OBGenericResponse();
    	obGenericResponse.data(UUID.randomUUID().toString());
    	return new ResponseEntity<>(obGenericResponse, HttpStatus.CREATED);
    }
}