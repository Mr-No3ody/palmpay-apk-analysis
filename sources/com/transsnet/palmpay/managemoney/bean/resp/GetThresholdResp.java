package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetThresholdResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetThresholdResp$Data;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetThresholdResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetThresholdResp$Data;", "Data", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetThresholdResp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetThresholdResp$Data;", "", "hasAccount", "", "memberId", "", "opened", "couponId", "nominalValue", "", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;J)V", "getHasAccount", "()Z", "getMemberId", "()Ljava/lang/String;", "getOpened", "getCouponId", "getNominalValue", "()J", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        @Nullable
        private final String couponId;
        private final boolean hasAccount;

        @Nullable
        private final String memberId;
        private final long nominalValue;
        private final boolean opened;

        public Data(boolean z3, @Nullable String str, boolean z8, @Nullable String str2, long j6) {
            this.hasAccount = z3;
            this.memberId = str;
            this.opened = z8;
            this.couponId = str2;
            this.nominalValue = j6;
        }

        @Nullable
        public final String getCouponId() {
            return this.couponId;
        }

        public final boolean getHasAccount() {
            return this.hasAccount;
        }

        @Nullable
        public final String getMemberId() {
            return this.memberId;
        }

        public final long getNominalValue() {
            return this.nominalValue;
        }

        public final boolean getOpened() {
            return this.opened;
        }
    }

    public GetThresholdResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
