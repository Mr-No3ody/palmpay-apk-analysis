package com.transsnet.palmpay.managemoney.bean.resp;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxBeforeOrderConfigResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxBeforeOrderConfigResp$CashBoxBeforeOrderConfig;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxBeforeOrderConfigResp$CashBoxBeforeOrderConfig;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxBeforeOrderConfigResp$CashBoxBeforeOrderConfig;", "CashBoxBeforeOrderConfig", "CashBoxConfig", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetCashBoxBeforeOrderConfigResp extends CommonResult {

    @Nullable
    private final CashBoxBeforeOrderConfig data;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u000bHÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxBeforeOrderConfigResp$CashBoxBeforeOrderConfig;", "", "buyMinLimit", "", "buyMaxLimit", "protocolUrl", "", "cashLevel", "", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxBeforeOrderConfigResp$CashBoxConfig;", "couponShowFlag", "", "<init>", "(JJLjava/lang/String;Ljava/util/List;I)V", "getBuyMinLimit", "()J", "setBuyMinLimit", "(J)V", "getBuyMaxLimit", "setBuyMaxLimit", "getProtocolUrl", "()Ljava/lang/String;", "getCashLevel", "()Ljava/util/List;", "getCouponShowFlag", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CashBoxBeforeOrderConfig {
        private long buyMaxLimit;
        private long buyMinLimit;

        @Nullable
        private final List<CashBoxConfig> cashLevel;
        private final int couponShowFlag;

        @Nullable
        private final String protocolUrl;

        public CashBoxBeforeOrderConfig(long j6, long j10, @Nullable String str, @Nullable List<CashBoxConfig> list, int i7) {
            this.buyMinLimit = j6;
            this.buyMaxLimit = j10;
            this.protocolUrl = str;
            this.cashLevel = list;
            this.couponShowFlag = i7;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CashBoxBeforeOrderConfig copy$default(CashBoxBeforeOrderConfig cashBoxBeforeOrderConfig, long j6, long j10, String str, List list, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j6 = cashBoxBeforeOrderConfig.buyMinLimit;
            }
            long j11 = j6;
            if ((i10 & 2) != 0) {
                j10 = cashBoxBeforeOrderConfig.buyMaxLimit;
            }
            long j12 = j10;
            if ((i10 & 4) != 0) {
                str = cashBoxBeforeOrderConfig.protocolUrl;
            }
            String str2 = str;
            if ((i10 & 8) != 0) {
                list = cashBoxBeforeOrderConfig.cashLevel;
            }
            List list2 = list;
            if ((i10 & 16) != 0) {
                i7 = cashBoxBeforeOrderConfig.couponShowFlag;
            }
            return cashBoxBeforeOrderConfig.copy(j11, j12, str2, list2, i7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getBuyMinLimit() {
            return this.buyMinLimit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getBuyMaxLimit() {
            return this.buyMaxLimit;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getProtocolUrl() {
            return this.protocolUrl;
        }

        @Nullable
        public final List<CashBoxConfig> component4() {
            return this.cashLevel;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getCouponShowFlag() {
            return this.couponShowFlag;
        }

        @NotNull
        public final CashBoxBeforeOrderConfig copy(long buyMinLimit, long buyMaxLimit, @Nullable String protocolUrl, @Nullable List<CashBoxConfig> cashLevel, int couponShowFlag) {
            return new CashBoxBeforeOrderConfig(buyMinLimit, buyMaxLimit, protocolUrl, cashLevel, couponShowFlag);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashBoxBeforeOrderConfig)) {
                return false;
            }
            CashBoxBeforeOrderConfig cashBoxBeforeOrderConfig = (CashBoxBeforeOrderConfig) other;
            return this.buyMinLimit == cashBoxBeforeOrderConfig.buyMinLimit && this.buyMaxLimit == cashBoxBeforeOrderConfig.buyMaxLimit && Intrinsics.c(this.protocolUrl, cashBoxBeforeOrderConfig.protocolUrl) && Intrinsics.c(this.cashLevel, cashBoxBeforeOrderConfig.cashLevel) && this.couponShowFlag == cashBoxBeforeOrderConfig.couponShowFlag;
        }

        public final long getBuyMaxLimit() {
            return this.buyMaxLimit;
        }

        public final long getBuyMinLimit() {
            return this.buyMinLimit;
        }

        @Nullable
        public final List<CashBoxConfig> getCashLevel() {
            return this.cashLevel;
        }

        public final int getCouponShowFlag() {
            return this.couponShowFlag;
        }

        @Nullable
        public final String getProtocolUrl() {
            return this.protocolUrl;
        }

        public int hashCode() {
            int iB = q0.b(Long.hashCode(this.buyMinLimit) * 31, 31, this.buyMaxLimit);
            String str = this.protocolUrl;
            int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
            List<CashBoxConfig> list = this.cashLevel;
            return Integer.hashCode(this.couponShowFlag) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        public final void setBuyMaxLimit(long j6) {
            this.buyMaxLimit = j6;
        }

        public final void setBuyMinLimit(long j6) {
            this.buyMinLimit = j6;
        }

        @NotNull
        public String toString() {
            long j6 = this.buyMinLimit;
            long j10 = this.buyMaxLimit;
            String str = this.protocolUrl;
            List<CashBoxConfig> list = this.cashLevel;
            int i7 = this.couponShowFlag;
            StringBuilder sbR = u.r(j6, "CashBoxBeforeOrderConfig(buyMinLimit=", ", buyMaxLimit=");
            sbR.append(j10);
            sbR.append(", protocolUrl=");
            sbR.append(str);
            sbR.append(", cashLevel=");
            sbR.append(list);
            sbR.append(", couponShowFlag=");
            sbR.append(i7);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxBeforeOrderConfigResp$CashBoxConfig;", "", FirebaseAnalytics.Param.LEVEL, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CashBoxConfig {

        @Nullable
        private final String level;

        @Nullable
        private final String value;

        public CashBoxConfig(@Nullable String str, @Nullable String str2) {
            this.level = str;
            this.value = str2;
        }

        public static /* synthetic */ CashBoxConfig copy$default(CashBoxConfig cashBoxConfig, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = cashBoxConfig.level;
            }
            if ((i7 & 2) != 0) {
                str2 = cashBoxConfig.value;
            }
            return cashBoxConfig.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final CashBoxConfig copy(@Nullable String level, @Nullable String value) {
            return new CashBoxConfig(level, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashBoxConfig)) {
                return false;
            }
            CashBoxConfig cashBoxConfig = (CashBoxConfig) other;
            return Intrinsics.c(this.level, cashBoxConfig.level) && Intrinsics.c(this.value, cashBoxConfig.value);
        }

        @Nullable
        public final String getLevel() {
            return this.level;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.level;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return G.q("CashBoxConfig(level=", this.level, ", value=", this.value, ")");
        }
    }

    public GetCashBoxBeforeOrderConfigResp(@Nullable CashBoxBeforeOrderConfig cashBoxBeforeOrderConfig) {
        this.data = cashBoxBeforeOrderConfig;
    }

    @Nullable
    public final CashBoxBeforeOrderConfig getData() {
        return this.data;
    }
}
