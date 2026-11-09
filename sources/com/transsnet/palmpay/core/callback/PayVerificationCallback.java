package com.transsnet.palmpay.core.callback;

/* JADX INFO: loaded from: classes3.dex */
public interface PayVerificationCallback {
    void gotoAddCardWebPage(String url);

    void gotoCheckVoucherCode();

    void payLoading();

    void queryDefinitePayResult(String token, String channelTransactionId);

    void queryPayResult(String token, String channelTransactionId);

    void showAlertDialog(CharSequence msg);

    void verifyPayMethod(String verifyCode, int verifyMethod);

    void verifyPayMethodWithReference(String verifyCode, int verifyMethod, String reference);
}
