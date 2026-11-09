package com.flexibank.sdk.cashier.ui.activity;

import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/flexibank/sdk/cashier/ui/activity/FlexiBankPayVerificationLauncher$PayVerificationResult", "", "Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;", "result", "", "onPayVerificationSuccess", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;)V", "", "errorCode", "errorMsg", "onPayVerificationFail", "(Ljava/lang/String;Ljava/lang/String;)V", "onPayVerificationComplete", "()V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankPayVerificationLauncher$PayVerificationResult {
    void onPayVerificationComplete();

    void onPayVerificationFail(@NotNull String errorCode, @NotNull String errorMsg);

    void onPayVerificationSuccess(@Nullable FlexiBankPayByOrderResp.DataBean result);
}
