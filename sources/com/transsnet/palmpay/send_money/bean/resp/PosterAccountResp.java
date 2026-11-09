package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/PosterAccountResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/send_money/bean/resp/Data;", "getData", "()Lcom/transsnet/palmpay/send_money/bean/resp/Data;", "setData", "(Lcom/transsnet/palmpay/send_money/bean/resp/Data;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PosterAccountResp extends CommonResult {

    @Nullable
    private Data data;

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public final void setData(@Nullable Data data) {
        this.data = data;
    }
}
