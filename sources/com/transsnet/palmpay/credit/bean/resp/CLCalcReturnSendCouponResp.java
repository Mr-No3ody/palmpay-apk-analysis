package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLCalcReturnSendCouponResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/CLCalcReturnSendCouponResp$Data;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/CLCalcReturnSendCouponResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/CLCalcReturnSendCouponResp$Data;", "Data", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCalcReturnSendCouponResp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLCalcReturnSendCouponResp$Data;", "", "couponCode", "", "nominaValue", "", "loanProduct", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getCouponCode", "()Ljava/lang/String;", "getNominaValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoanProduct", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        @Nullable
        private final String couponCode;

        @Nullable
        private final String loanProduct;

        @Nullable
        private final Long nominaValue;

        public Data(@Nullable String str, @Nullable Long l5, @Nullable String str2) {
            this.couponCode = str;
            this.nominaValue = l5;
            this.loanProduct = str2;
        }

        @Nullable
        public final String getCouponCode() {
            return this.couponCode;
        }

        @Nullable
        public final String getLoanProduct() {
            return this.loanProduct;
        }

        @Nullable
        public final Long getNominaValue() {
            return this.nominaValue;
        }
    }

    public CLCalcReturnSendCouponResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
