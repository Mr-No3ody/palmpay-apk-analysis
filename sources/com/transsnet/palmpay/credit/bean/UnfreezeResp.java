package com.transsnet.palmpay.credit.bean;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/UnfreezeResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/UnfreezeResp$Data;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/UnfreezeResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/UnfreezeResp$Data;", "Data", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnfreezeResp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/UnfreezeResp$Data;", "", "unfreezeStatus", "", "<init>", "(I)V", "getUnfreezeStatus", "()I", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {
        private final int unfreezeStatus;

        public Data(int i7) {
            this.unfreezeStatus = i7;
        }

        public final int getUnfreezeStatus() {
            return this.unfreezeStatus;
        }
    }

    public UnfreezeResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
