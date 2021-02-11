package com.americanfirstfinance.account.service;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.americanfirstfinance.account.form.DownPayment;

@Path("/poc/account/downpayment")
@RegisterRestClient(configKey = "account-api")
public interface AccountService {

    @POST
    Response postDownPayment(DownPayment payment);
}