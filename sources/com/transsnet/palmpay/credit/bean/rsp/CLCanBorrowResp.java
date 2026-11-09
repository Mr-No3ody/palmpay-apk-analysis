package com.transsnet.palmpay.credit.bean.rsp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/CLCanBorrowResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/rsp/CLCanBorrowData;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/rsp/CLCanBorrowData;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCanBorrowResp extends CommonResult {

    @JvmField
    @Nullable
    public final CLCanBorrowData data;

    public CLCanBorrowResp(@Nullable CLCanBorrowData cLCanBorrowData) {
        this.data = cLCanBorrowData;
    }
}
