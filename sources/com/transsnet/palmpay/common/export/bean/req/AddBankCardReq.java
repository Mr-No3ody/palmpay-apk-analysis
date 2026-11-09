package com.transsnet.palmpay.common.export.bean.req;

import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/common/export/bean/req/AddBankCardReq;", "Lcom/transsnet/palmpay/core/bean/payment/PayByOrderReq;", "<init>", "()V", "cardBusinessType", "", "module_common_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddBankCardReq extends PayByOrderReq {

    @JvmField
    @NotNull
    public Number cardBusinessType = 0;
}
