package com.payment.stripe

public enum StripeErrorResponse {

    incorrect_number("The card number is incorrect."),
    invalid_number("The card number is not a valid credit card number."),
    invalid_expiry_month("The card's expiration month is invalid."),
    invalid_expiry_year("The card's expiration year is invalid."),
    invalid_cvc("The card's security code is invalid."),
    expired_card("The card has expired."),
    incorrect_cvc("The card's security code is incorrect."),
    incorrect_zip("The card's zip code failed validation."),
    card_declined("The card was declined."),
    missing("There is no card on a customer that is being charged."),
    processing_error("An error occurred while processing the card."),


    final String value

    StripeErrorResponse(String value) {
        this.value = value
    }

    String toString() {
        return value
    }

    public String getKey() {
        return name()
    }

    public String getValue() {
        return value
    }

    public static List<StripeErrorResponse> list() {

        return [processing_error, missing, card_declined, incorrect_number, invalid_number, invalid_expiry_month, invalid_expiry_year, invalid_cvc, expired_card, incorrect_cvc, incorrect_zip]
    }
}