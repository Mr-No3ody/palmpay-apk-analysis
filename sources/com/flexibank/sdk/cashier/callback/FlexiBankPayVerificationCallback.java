package com.flexibank.sdk.cashier.callback;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\f\u001a\u00020\u0003H&J\u001c\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u0010\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/flexibank/sdk/cashier/callback/FlexiBankPayVerificationCallback;", "", "verifyPayMethod", "", "verifyCode", "", "verifyMethod", "", "verifyPayMethodWithReference", "reference", "gotoAddCardWebPage", "url", "gotoCheckVoucherCode", "queryPayResult", "token", "channelTransactionId", "queryDefinitePayResult", "payLoading", "showAlertDialog", "msg", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankPayVerificationCallback {
    void gotoAddCardWebPage(@Nullable String url);

    void gotoCheckVoucherCode();

    void payLoading();

    void queryDefinitePayResult(@Nullable String token, @Nullable String channelTransactionId);

    void queryPayResult(@Nullable String token, @Nullable String channelTransactionId);

    void showAlertDialog(@Nullable CharSequence msg);

    void verifyPayMethod(@Nullable String verifyCode, int verifyMethod);

    void verifyPayMethodWithReference(@Nullable String verifyCode, int verifyMethod, @Nullable String reference);
}
