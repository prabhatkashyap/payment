<form id="paypalForm" action="${createLink(controller: 'paypal', action: 'buy')}" method="post">

    <input type="hidden" name="itemName" value="Item1" id="itemName">
    <input type="hidden" name="itemNumber" value="Item No 1" id="itemNumber">
    <input type="hidden" name="amount" value="100" id="amount">
    <input type="hidden" name="discountAmount" value="0" id="discountAmount">
    <input type="hidden" name="tax" value="0.0" id="tax">
    <input type="hidden" name="buyerId" value="1111" id="buyerId">
    <input type="hidden" name="currency" value="GBP" id="currency">
    <input type="hidden" name="returnAction" value="success">
    <input type="hidden" name="returnController" value="paypalPayment">
    <input type="hidden" name="cancelAction" value="cancel">
    <input type="hidden" name="cancelController" value="paypalPayment">
    <input type="submit" name="Pay" class="btn-primary btn" value="Pay By Paypal"/>
</form>
