package com.transsnet.palmpay.managemoney.bean.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0015\u0012\f\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$BeforeOrderBean;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$BeforeOrderBean;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$BeforeOrderBean;", "BeforeOrderBean", "StateInfo", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetBeforeOrderResp extends CommonResult {

    @Nullable
    private final BeforeOrderBean data;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010D\u001a\u0004\u0018\u00010*R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\"\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001a\u00107\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001a\u0010:\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\u0014\u0010=\u001a\u00020>X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010\u0015¨\u0006E"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$BeforeOrderBean;", "", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp;)V", "productId", "", "getProductId", "()J", "setProductId", "(J)V", "durationDay", "getDurationDay", "setDurationDay", "maxDurationDay", "getMaxDurationDay", "setMaxDurationDay", "memberGrade", "", "getMemberGrade", "()I", "setMemberGrade", "(I)V", "memberBalance", "getMemberBalance", "setMemberBalance", "memberMaxBalance", "getMemberMaxBalance", "setMemberMaxBalance", "memberDailyMaxBalance", "getMemberDailyMaxBalance", "setMemberDailyMaxBalance", "todayUsedBalance", "getTodayUsedBalance", "setTodayUsedBalance", "buyMinLimit", "getBuyMinLimit", "setBuyMinLimit", "buyMaxLimit", "getBuyMaxLimit", "setBuyMaxLimit", "stateInfoList", "", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;", "getStateInfoList", "()Ljava/util/List;", "setStateInfoList", "(Ljava/util/List;)V", "defaultStateInfo", "getDefaultStateInfo", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;", "setDefaultStateInfo", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;)V", "startDate", "getStartDate", "setStartDate", "endDate", "getEndDate", "setEndDate", "cashBoxBalance", "getCashBoxBalance", "setCashBoxBalance", "annualizedIncomeRatio", "", "getAnnualizedIncomeRatio", "()F", "autoRenewal", "getAutoRenewal", "setAutoRenewal", "getStateInfo", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BeforeOrderBean {
        private final float annualizedIncomeRatio;
        private int autoRenewal;
        private long buyMaxLimit;
        private long buyMinLimit;
        private long cashBoxBalance;

        @Nullable
        private StateInfo defaultStateInfo;
        private long maxDurationDay;
        private long memberBalance;
        private long memberDailyMaxBalance;
        private long memberMaxBalance;
        private long productId;

        @Nullable
        private List<StateInfo> stateInfoList;
        private long todayUsedBalance;
        private int memberGrade = 1;
        private long startDate = System.currentTimeMillis();
        private long durationDay;
        private long endDate = (this.durationDay * 86400000) + System.currentTimeMillis();

        public BeforeOrderBean() {
        }

        public final float getAnnualizedIncomeRatio() {
            return this.annualizedIncomeRatio;
        }

        public final int getAutoRenewal() {
            return this.autoRenewal;
        }

        public final long getBuyMaxLimit() {
            return this.buyMaxLimit;
        }

        public final long getBuyMinLimit() {
            return this.buyMinLimit;
        }

        public final long getCashBoxBalance() {
            return this.cashBoxBalance;
        }

        @Nullable
        public final StateInfo getDefaultStateInfo() {
            return this.defaultStateInfo;
        }

        public final long getDurationDay() {
            return this.durationDay;
        }

        public final long getEndDate() {
            return this.endDate;
        }

        public final long getMaxDurationDay() {
            return this.maxDurationDay;
        }

        public final long getMemberBalance() {
            return this.memberBalance;
        }

        public final long getMemberDailyMaxBalance() {
            return this.memberDailyMaxBalance;
        }

        public final int getMemberGrade() {
            return this.memberGrade;
        }

        public final long getMemberMaxBalance() {
            return this.memberMaxBalance;
        }

        public final long getProductId() {
            return this.productId;
        }

        public final long getStartDate() {
            return this.startDate;
        }

        @Nullable
        public final StateInfo getStateInfo() {
            StateInfo stateInfo = this.defaultStateInfo;
            if (stateInfo != null) {
                return stateInfo;
            }
            List<StateInfo> list = this.stateInfoList;
            if (list == null || list.isEmpty()) {
                return this.defaultStateInfo;
            }
            List<StateInfo> list2 = this.stateInfoList;
            if (list2 != null) {
                return list2.get(0);
            }
            return null;
        }

        @Nullable
        public final List<StateInfo> getStateInfoList() {
            return this.stateInfoList;
        }

        public final long getTodayUsedBalance() {
            return this.todayUsedBalance;
        }

        public final void setAutoRenewal(int i7) {
            this.autoRenewal = i7;
        }

        public final void setBuyMaxLimit(long j6) {
            this.buyMaxLimit = j6;
        }

        public final void setBuyMinLimit(long j6) {
            this.buyMinLimit = j6;
        }

        public final void setCashBoxBalance(long j6) {
            this.cashBoxBalance = j6;
        }

        public final void setDefaultStateInfo(@Nullable StateInfo stateInfo) {
            this.defaultStateInfo = stateInfo;
        }

        public final void setDurationDay(long j6) {
            this.durationDay = j6;
        }

        public final void setEndDate(long j6) {
            this.endDate = j6;
        }

        public final void setMaxDurationDay(long j6) {
            this.maxDurationDay = j6;
        }

        public final void setMemberBalance(long j6) {
            this.memberBalance = j6;
        }

        public final void setMemberDailyMaxBalance(long j6) {
            this.memberDailyMaxBalance = j6;
        }

        public final void setMemberGrade(int i7) {
            this.memberGrade = i7;
        }

        public final void setMemberMaxBalance(long j6) {
            this.memberMaxBalance = j6;
        }

        public final void setProductId(long j6) {
            this.productId = j6;
        }

        public final void setStartDate(long j6) {
            this.startDate = j6;
        }

        public final void setStateInfoList(@Nullable List<StateInfo> list) {
            this.stateInfoList = list;
        }

        public final void setTodayUsedBalance(long j6) {
            this.todayUsedBalance = j6;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;", "Landroid/os/Parcelable;", "stateCode", "", "stateName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getStateCode", "()Ljava/lang/String;", "setStateCode", "(Ljava/lang/String;)V", "getStateName", "setStateName", "writeToParcel", "", "flags", "", "describeContents", "toString", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "CREATOR", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StateInfo implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private String stateCode;

        @Nullable
        private String stateName;

        /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp$StateInfo$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/managemoney/bean/resp/GetBeforeOrderResp$StateInfo;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<StateInfo> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public StateInfo createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StateInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public StateInfo[] newArray(int size) {
                return new StateInfo[size];
            }
        }

        public StateInfo(@Nullable String str, @Nullable String str2) {
            this.stateCode = str;
            this.stateName = str2;
        }

        public static /* synthetic */ StateInfo copy$default(StateInfo stateInfo, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = stateInfo.stateCode;
            }
            if ((i7 & 2) != 0) {
                str2 = stateInfo.stateName;
            }
            return stateInfo.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStateCode() {
            return this.stateCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStateName() {
            return this.stateName;
        }

        @NotNull
        public final StateInfo copy(@Nullable String stateCode, @Nullable String stateName) {
            return new StateInfo(stateCode, stateName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateInfo)) {
                return false;
            }
            StateInfo stateInfo = (StateInfo) other;
            return Intrinsics.c(this.stateCode, stateInfo.stateCode) && Intrinsics.c(this.stateName, stateInfo.stateName);
        }

        @Nullable
        public final String getStateCode() {
            return this.stateCode;
        }

        @Nullable
        public final String getStateName() {
            return this.stateName;
        }

        public int hashCode() {
            String str = this.stateCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.stateName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setStateCode(@Nullable String str) {
            this.stateCode = str;
        }

        public final void setStateName(@Nullable String str) {
            this.stateName = str;
        }

        @NotNull
        public String toString() {
            String str = this.stateName;
            return str == null ? "" : str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.stateCode);
            parcel.writeString(this.stateName);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateInfo(@NotNull Parcel parcel) {
            this(parcel.readString(), parcel.readString());
            Intrinsics.checkNotNullParameter(parcel, "parcel");
        }
    }

    public GetBeforeOrderResp(@Nullable BeforeOrderBean beforeOrderBean) {
        this.data = beforeOrderBean;
    }

    @Nullable
    public final BeforeOrderBean getData() {
        return this.data;
    }
}
