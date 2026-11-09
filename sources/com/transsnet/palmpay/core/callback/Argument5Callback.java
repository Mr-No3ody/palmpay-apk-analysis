package com.transsnet.palmpay.core.callback;

import com.transsnet.palmpay.core.bean.bill.TransType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u0000*\u0006\b\u0002\u0010\u0003 \u0000*\u0006\b\u0003\u0010\u0004 \u0000*\u0006\b\u0004\u0010\u0005 \u00002\u00020\u0006J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u00022\u0006\u0010\f\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0004H¦\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/callback/Argument5Callback;", "P1", "P2", "P3", "P4", "P5", "", "invoke", "", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "p3", TransType.TRANS_TYPE_SPLIT_BILL, TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Argument5Callback<P1, P2, P3, P4, P5> {
    void invoke(P1 p3, P2 p10, P3 p11, P4 p12, P5 p13);
}
