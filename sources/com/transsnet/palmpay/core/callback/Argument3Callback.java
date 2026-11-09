package com.transsnet.palmpay.core.callback;

import com.transsnet.palmpay.core.bean.bill.TransType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u0000*\u0006\b\u0002\u0010\u0003 \u00002\u00020\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0002H¦\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/callback/Argument3Callback;", "P1", "P2", "P3", "", "invoke", "", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Argument3Callback<P1, P2, P3> {
    void invoke(P1 p3, P2 p10, P3 p11);
}
