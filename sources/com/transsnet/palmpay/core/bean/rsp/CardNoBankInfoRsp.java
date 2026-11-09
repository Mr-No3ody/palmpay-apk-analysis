package com.transsnet.palmpay.core.bean.rsp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/CardNoBankInfoRsp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/BankInfo;", "<init>", "(Lcom/transsnet/palmpay/core/bean/BankInfo;)V", "getData", "()Lcom/transsnet/palmpay/core/bean/BankInfo;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CardNoBankInfoRsp extends CommonResult {

    @Nullable
    private final BankInfo data;

    public CardNoBankInfoRsp(@Nullable BankInfo bankInfo) {
        this.data = bankInfo;
    }

    @Nullable
    public final BankInfo getData() {
        return this.data;
    }
}
