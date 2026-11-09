package com.transsnet.palmpay.credit.bean.resp;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data;", "setData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreditIncreaseInfo extends CommonResult {

    @Nullable
    private Data data;

    public CreditIncreaseInfo(@Nullable Data data) {
        this.data = data;
    }

    public static /* synthetic */ CreditIncreaseInfo copy$default(CreditIncreaseInfo creditIncreaseInfo, Data data, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            data = creditIncreaseInfo.data;
        }
        return creditIncreaseInfo.copy(data);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final CreditIncreaseInfo copy(@Nullable Data data) {
        return new CreditIncreaseInfo(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreditIncreaseInfo) && Intrinsics.c(this.data, ((CreditIncreaseInfo) other).data);
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public final void setData(@Nullable Data data) {
        this.data = data;
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "CreditIncreaseInfo(data=" + this.data + ")";
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data;", "", "okCardQuotaLogList", "", "Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;", "<init>", "(Ljava/util/List;)V", "getOkCardQuotaLogList", "()Ljava/util/List;", "setOkCardQuotaLogList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OkCardQuotaLog", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {

        @Nullable
        private List<OkCardQuotaLog> okCardQuotaLogList;

        public Data(@Nullable List<OkCardQuotaLog> list) {
            this.okCardQuotaLogList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = data.okCardQuotaLogList;
            }
            return data.copy(list);
        }

        @Nullable
        public final List<OkCardQuotaLog> component1() {
            return this.okCardQuotaLogList;
        }

        @NotNull
        public final Data copy(@Nullable List<OkCardQuotaLog> okCardQuotaLogList) {
            return new Data(okCardQuotaLogList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.okCardQuotaLogList, ((Data) other).okCardQuotaLogList);
        }

        @Nullable
        public final List<OkCardQuotaLog> getOkCardQuotaLogList() {
            return this.okCardQuotaLogList;
        }

        public int hashCode() {
            List<OkCardQuotaLog> list = this.okCardQuotaLogList;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final void setOkCardQuotaLogList(@Nullable List<OkCardQuotaLog> list) {
            this.okCardQuotaLogList = list;
        }

        @NotNull
        public String toString() {
            return "Data(okCardQuotaLogList=" + this.okCardQuotaLogList + ")";
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 T2\u00020\u0001:\u0001TB\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0012\u0010\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0003H\u0016J\b\u0010=\u001a\u00020\u0003H\u0016J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010G\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010H\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJª\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\t\u0010R\u001a\u00020SHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001e\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R\u001e\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001f¨\u0006U"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;", "Landroid/os/Parcelable;", "accountType", "", "changeQuota", "", "currQuota", "lastQuota", "remainingDays", "changedInterestRatio", "", "preInterestRatio", "interestRatio", "preServiceFeeRatio", "serviceFeeRatio", "changedServiceFeeRatio", "exceptSaveAmount", "exceptSaveServiceFeeAmount", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAccountType", "()Ljava/lang/Integer;", "setAccountType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getChangeQuota", "()Ljava/lang/Long;", "setChangeQuota", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrQuota", "setCurrQuota", "getLastQuota", "setLastQuota", "getRemainingDays", "setRemainingDays", "getChangedInterestRatio", "()Ljava/lang/Double;", "setChangedInterestRatio", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPreInterestRatio", "setPreInterestRatio", "getInterestRatio", "setInterestRatio", "getPreServiceFeeRatio", "setPreServiceFeeRatio", "getServiceFeeRatio", "setServiceFeeRatio", "getChangedServiceFeeRatio", "setChangedServiceFeeRatio", "getExceptSaveAmount", "setExceptSaveAmount", "getExceptSaveServiceFeeAmount", "setExceptSaveServiceFeeAmount", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OkCardQuotaLog implements Parcelable {

            /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Nullable
            private Integer accountType;

            @Nullable
            private Long changeQuota;

            @Nullable
            private Double changedInterestRatio;

            @Nullable
            private Double changedServiceFeeRatio;

            @Nullable
            private Long currQuota;

            @Nullable
            private Long exceptSaveAmount;

            @Nullable
            private Long exceptSaveServiceFeeAmount;

            @Nullable
            private Double interestRatio;

            @Nullable
            private Long lastQuota;

            @Nullable
            private Double preInterestRatio;

            @Nullable
            private Double preServiceFeeRatio;

            @Nullable
            private Integer remainingDays;

            @Nullable
            private Double serviceFeeRatio;

            /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.resp.CreditIncreaseInfo$Data$OkCardQuotaLog$CREATOR, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion implements Parcelable.Creator<OkCardQuotaLog> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public OkCardQuotaLog createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OkCardQuotaLog(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public OkCardQuotaLog[] newArray(int size) {
                    return new OkCardQuotaLog[size];
                }
            }

            public OkCardQuotaLog(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num2, @Nullable Double d2, @Nullable Double d10, @Nullable Double d11, @Nullable Double d12, @Nullable Double d13, @Nullable Double d14, @Nullable Long l10, @Nullable Long l11) {
                this.accountType = num;
                this.changeQuota = l5;
                this.currQuota = l6;
                this.lastQuota = l8;
                this.remainingDays = num2;
                this.changedInterestRatio = d2;
                this.preInterestRatio = d10;
                this.interestRatio = d11;
                this.preServiceFeeRatio = d12;
                this.serviceFeeRatio = d13;
                this.changedServiceFeeRatio = d14;
                this.exceptSaveAmount = l10;
                this.exceptSaveServiceFeeAmount = l11;
            }

            public static /* synthetic */ OkCardQuotaLog copy$default(OkCardQuotaLog okCardQuotaLog, Integer num, Long l5, Long l6, Long l8, Integer num2, Double d2, Double d10, Double d11, Double d12, Double d13, Double d14, Long l10, Long l11, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    num = okCardQuotaLog.accountType;
                }
                return okCardQuotaLog.copy(num, (i7 & 2) != 0 ? okCardQuotaLog.changeQuota : l5, (i7 & 4) != 0 ? okCardQuotaLog.currQuota : l6, (i7 & 8) != 0 ? okCardQuotaLog.lastQuota : l8, (i7 & 16) != 0 ? okCardQuotaLog.remainingDays : num2, (i7 & 32) != 0 ? okCardQuotaLog.changedInterestRatio : d2, (i7 & 64) != 0 ? okCardQuotaLog.preInterestRatio : d10, (i7 & 128) != 0 ? okCardQuotaLog.interestRatio : d11, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? okCardQuotaLog.preServiceFeeRatio : d12, (i7 & 512) != 0 ? okCardQuotaLog.serviceFeeRatio : d13, (i7 & 1024) != 0 ? okCardQuotaLog.changedServiceFeeRatio : d14, (i7 & 2048) != 0 ? okCardQuotaLog.exceptSaveAmount : l10, (i7 & 4096) != 0 ? okCardQuotaLog.exceptSaveServiceFeeAmount : l11);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Integer getAccountType() {
                return this.accountType;
            }

            @Nullable
            /* JADX INFO: renamed from: component10, reason: from getter */
            public final Double getServiceFeeRatio() {
                return this.serviceFeeRatio;
            }

            @Nullable
            /* JADX INFO: renamed from: component11, reason: from getter */
            public final Double getChangedServiceFeeRatio() {
                return this.changedServiceFeeRatio;
            }

            @Nullable
            /* JADX INFO: renamed from: component12, reason: from getter */
            public final Long getExceptSaveAmount() {
                return this.exceptSaveAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component13, reason: from getter */
            public final Long getExceptSaveServiceFeeAmount() {
                return this.exceptSaveServiceFeeAmount;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Long getChangeQuota() {
                return this.changeQuota;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Long getCurrQuota() {
                return this.currQuota;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Long getLastQuota() {
                return this.lastQuota;
            }

            @Nullable
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Integer getRemainingDays() {
                return this.remainingDays;
            }

            @Nullable
            /* JADX INFO: renamed from: component6, reason: from getter */
            public final Double getChangedInterestRatio() {
                return this.changedInterestRatio;
            }

            @Nullable
            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Double getPreInterestRatio() {
                return this.preInterestRatio;
            }

            @Nullable
            /* JADX INFO: renamed from: component8, reason: from getter */
            public final Double getInterestRatio() {
                return this.interestRatio;
            }

            @Nullable
            /* JADX INFO: renamed from: component9, reason: from getter */
            public final Double getPreServiceFeeRatio() {
                return this.preServiceFeeRatio;
            }

            @NotNull
            public final OkCardQuotaLog copy(@Nullable Integer accountType, @Nullable Long changeQuota, @Nullable Long currQuota, @Nullable Long lastQuota, @Nullable Integer remainingDays, @Nullable Double changedInterestRatio, @Nullable Double preInterestRatio, @Nullable Double interestRatio, @Nullable Double preServiceFeeRatio, @Nullable Double serviceFeeRatio, @Nullable Double changedServiceFeeRatio, @Nullable Long exceptSaveAmount, @Nullable Long exceptSaveServiceFeeAmount) {
                return new OkCardQuotaLog(accountType, changeQuota, currQuota, lastQuota, remainingDays, changedInterestRatio, preInterestRatio, interestRatio, preServiceFeeRatio, serviceFeeRatio, changedServiceFeeRatio, exceptSaveAmount, exceptSaveServiceFeeAmount);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OkCardQuotaLog)) {
                    return false;
                }
                OkCardQuotaLog okCardQuotaLog = (OkCardQuotaLog) other;
                return Intrinsics.c(this.accountType, okCardQuotaLog.accountType) && Intrinsics.c(this.changeQuota, okCardQuotaLog.changeQuota) && Intrinsics.c(this.currQuota, okCardQuotaLog.currQuota) && Intrinsics.c(this.lastQuota, okCardQuotaLog.lastQuota) && Intrinsics.c(this.remainingDays, okCardQuotaLog.remainingDays) && Intrinsics.c(this.changedInterestRatio, okCardQuotaLog.changedInterestRatio) && Intrinsics.c(this.preInterestRatio, okCardQuotaLog.preInterestRatio) && Intrinsics.c(this.interestRatio, okCardQuotaLog.interestRatio) && Intrinsics.c(this.preServiceFeeRatio, okCardQuotaLog.preServiceFeeRatio) && Intrinsics.c(this.serviceFeeRatio, okCardQuotaLog.serviceFeeRatio) && Intrinsics.c(this.changedServiceFeeRatio, okCardQuotaLog.changedServiceFeeRatio) && Intrinsics.c(this.exceptSaveAmount, okCardQuotaLog.exceptSaveAmount) && Intrinsics.c(this.exceptSaveServiceFeeAmount, okCardQuotaLog.exceptSaveServiceFeeAmount);
            }

            @Nullable
            public final Integer getAccountType() {
                return this.accountType;
            }

            @Nullable
            public final Long getChangeQuota() {
                return this.changeQuota;
            }

            @Nullable
            public final Double getChangedInterestRatio() {
                return this.changedInterestRatio;
            }

            @Nullable
            public final Double getChangedServiceFeeRatio() {
                return this.changedServiceFeeRatio;
            }

            @Nullable
            public final Long getCurrQuota() {
                return this.currQuota;
            }

            @Nullable
            public final Long getExceptSaveAmount() {
                return this.exceptSaveAmount;
            }

            @Nullable
            public final Long getExceptSaveServiceFeeAmount() {
                return this.exceptSaveServiceFeeAmount;
            }

            @Nullable
            public final Double getInterestRatio() {
                return this.interestRatio;
            }

            @Nullable
            public final Long getLastQuota() {
                return this.lastQuota;
            }

            @Nullable
            public final Double getPreInterestRatio() {
                return this.preInterestRatio;
            }

            @Nullable
            public final Double getPreServiceFeeRatio() {
                return this.preServiceFeeRatio;
            }

            @Nullable
            public final Integer getRemainingDays() {
                return this.remainingDays;
            }

            @Nullable
            public final Double getServiceFeeRatio() {
                return this.serviceFeeRatio;
            }

            public int hashCode() {
                Integer num = this.accountType;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Long l5 = this.changeQuota;
                int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
                Long l6 = this.currQuota;
                int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
                Long l8 = this.lastQuota;
                int iHashCode4 = (iHashCode3 + (l8 == null ? 0 : l8.hashCode())) * 31;
                Integer num2 = this.remainingDays;
                int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Double d2 = this.changedInterestRatio;
                int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
                Double d10 = this.preInterestRatio;
                int iHashCode7 = (iHashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31;
                Double d11 = this.interestRatio;
                int iHashCode8 = (iHashCode7 + (d11 == null ? 0 : d11.hashCode())) * 31;
                Double d12 = this.preServiceFeeRatio;
                int iHashCode9 = (iHashCode8 + (d12 == null ? 0 : d12.hashCode())) * 31;
                Double d13 = this.serviceFeeRatio;
                int iHashCode10 = (iHashCode9 + (d13 == null ? 0 : d13.hashCode())) * 31;
                Double d14 = this.changedServiceFeeRatio;
                int iHashCode11 = (iHashCode10 + (d14 == null ? 0 : d14.hashCode())) * 31;
                Long l10 = this.exceptSaveAmount;
                int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
                Long l11 = this.exceptSaveServiceFeeAmount;
                return iHashCode12 + (l11 != null ? l11.hashCode() : 0);
            }

            public final void setAccountType(@Nullable Integer num) {
                this.accountType = num;
            }

            public final void setChangeQuota(@Nullable Long l5) {
                this.changeQuota = l5;
            }

            public final void setChangedInterestRatio(@Nullable Double d2) {
                this.changedInterestRatio = d2;
            }

            public final void setChangedServiceFeeRatio(@Nullable Double d2) {
                this.changedServiceFeeRatio = d2;
            }

            public final void setCurrQuota(@Nullable Long l5) {
                this.currQuota = l5;
            }

            public final void setExceptSaveAmount(@Nullable Long l5) {
                this.exceptSaveAmount = l5;
            }

            public final void setExceptSaveServiceFeeAmount(@Nullable Long l5) {
                this.exceptSaveServiceFeeAmount = l5;
            }

            public final void setInterestRatio(@Nullable Double d2) {
                this.interestRatio = d2;
            }

            public final void setLastQuota(@Nullable Long l5) {
                this.lastQuota = l5;
            }

            public final void setPreInterestRatio(@Nullable Double d2) {
                this.preInterestRatio = d2;
            }

            public final void setPreServiceFeeRatio(@Nullable Double d2) {
                this.preServiceFeeRatio = d2;
            }

            public final void setRemainingDays(@Nullable Integer num) {
                this.remainingDays = num;
            }

            public final void setServiceFeeRatio(@Nullable Double d2) {
                this.serviceFeeRatio = d2;
            }

            @NotNull
            public String toString() {
                Integer num = this.accountType;
                Long l5 = this.changeQuota;
                Long l6 = this.currQuota;
                Long l8 = this.lastQuota;
                Integer num2 = this.remainingDays;
                Double d2 = this.changedInterestRatio;
                Double d10 = this.preInterestRatio;
                Double d11 = this.interestRatio;
                Double d12 = this.preServiceFeeRatio;
                Double d13 = this.serviceFeeRatio;
                Double d14 = this.changedServiceFeeRatio;
                Long l10 = this.exceptSaveAmount;
                Long l11 = this.exceptSaveServiceFeeAmount;
                StringBuilder sb2 = new StringBuilder("OkCardQuotaLog(accountType=");
                sb2.append(num);
                sb2.append(", changeQuota=");
                sb2.append(l5);
                sb2.append(", currQuota=");
                q0.w(sb2, l6, ", lastQuota=", l8, ", remainingDays=");
                sb2.append(num2);
                sb2.append(", changedInterestRatio=");
                sb2.append(d2);
                sb2.append(", preInterestRatio=");
                sb2.append(d10);
                sb2.append(", interestRatio=");
                sb2.append(d11);
                sb2.append(", preServiceFeeRatio=");
                sb2.append(d12);
                sb2.append(", serviceFeeRatio=");
                sb2.append(d13);
                sb2.append(", changedServiceFeeRatio=");
                sb2.append(d14);
                sb2.append(", exceptSaveAmount=");
                sb2.append(l10);
                sb2.append(", exceptSaveServiceFeeAmount=");
                sb2.append(l11);
                sb2.append(")");
                return sb2.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.writeValue(this.accountType);
                parcel.writeValue(this.changeQuota);
                parcel.writeValue(this.currQuota);
                parcel.writeValue(this.lastQuota);
                parcel.writeValue(this.remainingDays);
                parcel.writeValue(this.changedInterestRatio);
                parcel.writeValue(this.preInterestRatio);
                parcel.writeValue(this.interestRatio);
                parcel.writeValue(this.preServiceFeeRatio);
                parcel.writeValue(this.serviceFeeRatio);
                parcel.writeValue(this.changedServiceFeeRatio);
                parcel.writeValue(this.exceptSaveAmount);
                parcel.writeValue(this.exceptSaveServiceFeeAmount);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public OkCardQuotaLog(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Class cls = Integer.TYPE;
                Object value = parcel.readValue(cls.getClassLoader());
                Integer num = value instanceof Integer ? (Integer) value : null;
                Class cls2 = Long.TYPE;
                Object value2 = parcel.readValue(cls2.getClassLoader());
                Long l5 = value2 instanceof Long ? (Long) value2 : null;
                Object value3 = parcel.readValue(cls2.getClassLoader());
                Long l6 = value3 instanceof Long ? (Long) value3 : null;
                Object value4 = parcel.readValue(cls2.getClassLoader());
                Long l8 = value4 instanceof Long ? (Long) value4 : null;
                Object value5 = parcel.readValue(cls.getClassLoader());
                Integer num2 = value5 instanceof Integer ? (Integer) value5 : null;
                Class cls3 = Double.TYPE;
                Object value6 = parcel.readValue(cls3.getClassLoader());
                Double d2 = value6 instanceof Double ? (Double) value6 : null;
                Object value7 = parcel.readValue(cls3.getClassLoader());
                Double d10 = value7 instanceof Double ? (Double) value7 : null;
                Object value8 = parcel.readValue(cls3.getClassLoader());
                Double d11 = value8 instanceof Double ? (Double) value8 : null;
                Object value9 = parcel.readValue(cls3.getClassLoader());
                Double d12 = value9 instanceof Double ? (Double) value9 : null;
                Object value10 = parcel.readValue(cls3.getClassLoader());
                Double d13 = value10 instanceof Double ? (Double) value10 : null;
                Object value11 = parcel.readValue(cls3.getClassLoader());
                Double d14 = value11 instanceof Double ? (Double) value11 : null;
                Object value12 = parcel.readValue(cls3.getClassLoader());
                Long l10 = value12 instanceof Long ? (Long) value12 : null;
                Object value13 = parcel.readValue(cls3.getClassLoader());
                this(num, l5, l6, l8, num2, d2, d10, d11, d12, d13, d14, l10, value13 instanceof Long ? (Long) value13 : null);
            }
        }
    }
}
