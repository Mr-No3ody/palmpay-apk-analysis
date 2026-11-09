package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcMarqueeResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/transsnet/palmpay/credit/bean/resp/OcMarqueeData;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcMarqueeResp extends CommonResult {

    @NotNull
    private final List<OcMarqueeData> data;

    public OcMarqueeResp(@NotNull List<OcMarqueeData> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    public final List<OcMarqueeData> getData() {
        return this.data;
    }
}
