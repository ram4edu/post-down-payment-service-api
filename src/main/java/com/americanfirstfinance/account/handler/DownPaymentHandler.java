package com.americanfirstfinance.account.handler;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.americanfirstfinance.account.form.DownPayment;
import com.americanfirstfinance.account.service.AccountService;
import com.americanfirstfinance.account.view.Receipt;

import java.util.UUID;

@ApplicationScoped
public class DownPaymentHandler {


	@Inject
    @RestClient
	AccountService accountService;

    
    public Response handleDownPayment(DownPayment payment) {
        //return new Receipt(UUID.randomUUID().toString(), "1-234567-1", "$100.00");
        return accountService.postDownPayment(payment);
    }

}
