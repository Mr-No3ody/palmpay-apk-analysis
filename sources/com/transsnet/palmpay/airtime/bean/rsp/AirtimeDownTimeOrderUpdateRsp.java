package com.transsnet.palmpay.airtime.bean.rsp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeDownTimeOrderUpdateRsp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeDownTimeOrderUpdateRsp$AirtimeDownTimeOrderUpdate;", "getData", "()Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeDownTimeOrderUpdateRsp$AirtimeDownTimeOrderUpdate;", "setData", "(Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeDownTimeOrderUpdateRsp$AirtimeDownTimeOrderUpdate;)V", "AirtimeDownTimeOrderUpdate", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AirtimeDownTimeOrderUpdateRsp extends CommonResult {

    @Nullable
    private AirtimeDownTimeOrderUpdate data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeDownTimeOrderUpdateRsp$AirtimeDownTimeOrderUpdate;", "Ljava/io/Serializable;", "<init>", "()V", "amount", "", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "billerName", "", "getBillerName", "()Ljava/lang/String;", "setBillerName", "(Ljava/lang/String;)V", "statusDesc", "getStatusDesc", "setStatusDesc", "phone", "getPhone", "setPhone", "status", "getStatus", "setStatus", "transType", "getTransType", "setTransType", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AirtimeDownTimeOrderUpdate implements Serializable {

        @Nullable
        private Long amount = 0L;

        @Nullable
        private String billerName = "";

        @Nullable
        private String statusDesc = "";

        @Nullable
        private String phone = "";

        @Nullable
        private Long status = 0L;

        @Nullable
        private String transType = "";

        @Nullable
        public final Long getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getBillerName() {
            return this.billerName;
        }

        @Nullable
        public final String getPhone() {
            return this.phone;
        }

        @Nullable
        public final Long getStatus() {
            return this.status;
        }

        @Nullable
        public final String getStatusDesc() {
            return this.statusDesc;
        }

        @Nullable
        public final String getTransType() {
            return this.transType;
        }

        public final void setAmount(@Nullable Long l5) {
            this.amount = l5;
        }

        public final void setBillerName(@Nullable String str) {
            this.billerName = str;
        }

        public final void setPhone(@Nullable String str) {
            this.phone = str;
        }

        public final void setStatus(@Nullable Long l5) {
            this.status = l5;
        }

        public final void setStatusDesc(@Nullable String str) {
            this.statusDesc = str;
        }

        public final void setTransType(@Nullable String str) {
            this.transType = str;
        }
    }

    @Nullable
    public final AirtimeDownTimeOrderUpdate getData() {
        return this.data;
    }

    public final void setData(@Nullable AirtimeDownTimeOrderUpdate airtimeDownTimeOrderUpdate) {
        this.data = airtimeDownTimeOrderUpdate;
    }
}
