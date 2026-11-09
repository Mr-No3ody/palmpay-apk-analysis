package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.managemoney.bean.CouponRecord;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/OpenCashBoxAccountResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/OpenCashBoxAccountResp$Data;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/OpenCashBoxAccountResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/OpenCashBoxAccountResp$Data;", "Data", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenCashBoxAccountResp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/OpenCashBoxAccountResp$Data;", "", "records", "", "Lcom/transsnet/palmpay/managemoney/bean/CouponRecord;", "<init>", "(Ljava/util/List;)V", "getRecords", "()Ljava/util/List;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        @Nullable
        private final List<CouponRecord> records;

        public Data(@Nullable List<CouponRecord> list) {
            this.records = list;
        }

        @Nullable
        public final List<CouponRecord> getRecords() {
            return this.records;
        }
    }

    public OpenCashBoxAccountResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
