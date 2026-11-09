package com.flexibank.sdk.core.callback;

import com.transsnet.palmpay.core.bean.bill.TransType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H¦\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/flexibank/sdk/core/callback/FlexiBankArgument2Callback;", "P1", "P2", "", "invoke", "", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "(Ljava/lang/Object;Ljava/lang/Object;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankArgument2Callback<P1, P2> {
    void invoke(P1 p3, P2 p10);
}
