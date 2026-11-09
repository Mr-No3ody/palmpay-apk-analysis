package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/ReferEarnHomeResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/ReferEarnHome;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/ReferEarnHome;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/ReferEarnHome;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnHomeResp extends CommonResult {

    @NotNull
    private final ReferEarnHome data;

    public ReferEarnHomeResp(@NotNull ReferEarnHome data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    public final ReferEarnHome getData() {
        return this.data;
    }
}
