package com.payment

import com.stripe.exception.CardException
import com.stripe.model.Charge

class StripeController {

    def index() {
        render(view: 'paymentForm')
    }

    def calculation(String stripeToken, Double amount) {
        Charge charge

        BigDecimal amountInCents = (amount * 100) as Integer
        Map<String, Object> chargeParams = new HashMap<String, Object>();
        chargeParams.put("amount", amountInCents);
        chargeParams.put("currency", "gbp");
        chargeParams.put("card", stripeToken);
        chargeParams.put("description", "Collection ");
        Map<String, String> initialMetadata = new HashMap<String, String>();
        initialMetadata.put("id", '1111');
        chargeParams.put("metadata", initialMetadata);
        Boolean flag = false
        try {
            charge = Charge.create(chargeParams)
            println("********************charge.id***************" + charge.id)
            flag = true
        } catch (CardException e) {
            println("****************************************")
            println(e.getParam())
            println(e.getCode())
            println("****************************************")

        }
        catch (Exception e) {
        }
        if (flag) {
            render "**** Success ****"
        } else {
            render "**** Fail ****"
        }
    }
}
