package com.flexibank.sdk.cashier.bean;

import W3.f;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/a;", "LW3/f;", "<init>", "()V", "Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;", "e", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;", "setData", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f {

    @Nullable
    private FlexiBankPayByOrderResp.DataBean data;

    public a() {
        super(0);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final FlexiBankPayByOrderResp.DataBean getData() {
        return this.data;
    }
}
