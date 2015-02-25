package com.payment

import org.grails.paypal.Payment
import org.grails.paypal.PaymentItem

class PaypalPaymentController {

    def index() {
        redirect(action: 'pay')
    }


    def pay() {
        render(template: '/paypalPayment/paypalButton')
    }

    def success() {
        println("*****************************************")
        println("paypal payment success")
        println("*****************************************")
    }

    def cancel() {
        println("*****************************************")
        println("paypal payment cancel")
        println("*****************************************")
    }
}
