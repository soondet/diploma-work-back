package kz.iitu.bussystem.service.stripe;

import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import kz.iitu.bussystem.dto.stripe.ChargeRequest;
import kz.iitu.bussystem.entity.Route;

import java.util.Collection;


import com.stripe.Stripe;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;

public interface StripeService {
    public abstract Charge charge(ChargeRequest chargeRequest) throws StripeException;

}
