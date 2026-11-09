package com.transsnet.palmpay.managemoney.bean.resp;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxAccountInfoResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxAccountInfoResp$CashBoxAccountInfo;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxAccountInfoResp$CashBoxAccountInfo;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxAccountInfoResp$CashBoxAccountInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "CashBoxAccountInfo", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetCashBoxAccountInfoResp extends CommonResult {

    @Nullable
    private final CashBoxAccountInfo data;

    public GetCashBoxAccountInfoResp(@Nullable CashBoxAccountInfo cashBoxAccountInfo) {
        this.data = cashBoxAccountInfo;
    }

    public static /* synthetic */ GetCashBoxAccountInfoResp copy$default(GetCashBoxAccountInfoResp getCashBoxAccountInfoResp, CashBoxAccountInfo cashBoxAccountInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cashBoxAccountInfo = getCashBoxAccountInfoResp.data;
        }
        return getCashBoxAccountInfoResp.copy(cashBoxAccountInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CashBoxAccountInfo getData() {
        return this.data;
    }

    @NotNull
    public final GetCashBoxAccountInfoResp copy(@Nullable CashBoxAccountInfo data) {
        return new GetCashBoxAccountInfoResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetCashBoxAccountInfoResp) && Intrinsics.c(this.data, ((GetCashBoxAccountInfoResp) other).data);
    }

    @Nullable
    public final CashBoxAccountInfo getData() {
        return this.data;
    }

    public int hashCode() {
        CashBoxAccountInfo cashBoxAccountInfo = this.data;
        if (cashBoxAccountInfo == null) {
            return 0;
        }
        return cashBoxAccountInfo.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "GetCashBoxAccountInfoResp(data=" + this.data + ")";
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bD\b\u0086\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\u0013HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\nHÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003Jð\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020\u00132\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\nHÖ\u0001J\t\u0010V\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u00106R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%¨\u0006W"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxAccountInfoResp$CashBoxAccountInfo;", "", "cashBoxBalance", "", "yesterdayIncome", "totalIncome", "stateCode", "", "stateName", "status", "", "msg", "accountStatus", "tierLimitAmount", "", "experienceGoldYesterdayIncome", "experienceGoldBalance", "experienceGoldUnclaimed", "experienceGoldIsOpen", "", "experienceGoldStatus", "activityIsOpen", LoanHomeSource.BANNER, "experienceGoldShowType", "interestSwitchStatus", "canBeDepositFromBalance", "frozenBalance", "frozenBalanceRemark", "<init>", "(JLjava/lang/Long;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/util/List;JJJZIZLjava/lang/String;IIJJLjava/lang/String;)V", "getCashBoxBalance", "()J", "getYesterdayIncome", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalIncome", "getStateCode", "()Ljava/lang/String;", "getStateName", "getStatus", "()I", "getMsg", "getAccountStatus", "getTierLimitAmount", "()Ljava/util/List;", "getExperienceGoldYesterdayIncome", "getExperienceGoldBalance", "getExperienceGoldUnclaimed", "getExperienceGoldIsOpen", "()Z", "getExperienceGoldStatus", "getActivityIsOpen", "getBanner", "setBanner", "(Ljava/lang/String;)V", "getExperienceGoldShowType", "getInterestSwitchStatus", "getCanBeDepositFromBalance", "getFrozenBalance", "getFrozenBalanceRemark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(JLjava/lang/Long;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/util/List;JJJZIZLjava/lang/String;IIJJLjava/lang/String;)Lcom/transsnet/palmpay/managemoney/bean/resp/GetCashBoxAccountInfoResp$CashBoxAccountInfo;", "equals", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CashBoxAccountInfo {
        private final int accountStatus;
        private final boolean activityIsOpen;

        @NotNull
        private String banner;
        private final long canBeDepositFromBalance;
        private final long cashBoxBalance;
        private final long experienceGoldBalance;
        private final boolean experienceGoldIsOpen;
        private final int experienceGoldShowType;
        private final int experienceGoldStatus;
        private final long experienceGoldUnclaimed;
        private final long experienceGoldYesterdayIncome;
        private final long frozenBalance;

        @NotNull
        private final String frozenBalanceRemark;
        private final int interestSwitchStatus;

        @Nullable
        private final String msg;

        @Nullable
        private final String stateCode;

        @Nullable
        private final String stateName;
        private final int status;

        @Nullable
        private final List<String> tierLimitAmount;
        private final long totalIncome;

        @Nullable
        private final Long yesterdayIncome;

        public CashBoxAccountInfo(long j6, @Nullable Long l5, long j10, @Nullable String str, @Nullable String str2, int i7, @Nullable String str3, int i10, @Nullable List<String> list, long j11, long j12, long j13, boolean z3, int i11, boolean z8, @NotNull String banner, int i12, int i13, long j14, long j15, @NotNull String frozenBalanceRemark) {
            Intrinsics.checkNotNullParameter(banner, "banner");
            Intrinsics.checkNotNullParameter(frozenBalanceRemark, "frozenBalanceRemark");
            this.cashBoxBalance = j6;
            this.yesterdayIncome = l5;
            this.totalIncome = j10;
            this.stateCode = str;
            this.stateName = str2;
            this.status = i7;
            this.msg = str3;
            this.accountStatus = i10;
            this.tierLimitAmount = list;
            this.experienceGoldYesterdayIncome = j11;
            this.experienceGoldBalance = j12;
            this.experienceGoldUnclaimed = j13;
            this.experienceGoldIsOpen = z3;
            this.experienceGoldStatus = i11;
            this.activityIsOpen = z8;
            this.banner = banner;
            this.experienceGoldShowType = i12;
            this.interestSwitchStatus = i13;
            this.canBeDepositFromBalance = j14;
            this.frozenBalance = j15;
            this.frozenBalanceRemark = frozenBalanceRemark;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CashBoxAccountInfo copy$default(CashBoxAccountInfo cashBoxAccountInfo, long j6, Long l5, long j10, String str, String str2, int i7, String str3, int i10, List list, long j11, long j12, long j13, boolean z3, int i11, boolean z8, String str4, int i12, int i13, long j14, long j15, String str5, int i14, Object obj) {
            String str6;
            long j16;
            long j17 = (i14 & 1) != 0 ? cashBoxAccountInfo.cashBoxBalance : j6;
            Long l6 = (i14 & 2) != 0 ? cashBoxAccountInfo.yesterdayIncome : l5;
            long j18 = (i14 & 4) != 0 ? cashBoxAccountInfo.totalIncome : j10;
            String str7 = (i14 & 8) != 0 ? cashBoxAccountInfo.stateCode : str;
            String str8 = (i14 & 16) != 0 ? cashBoxAccountInfo.stateName : str2;
            int i15 = (i14 & 32) != 0 ? cashBoxAccountInfo.status : i7;
            String str9 = (i14 & 64) != 0 ? cashBoxAccountInfo.msg : str3;
            int i16 = (i14 & 128) != 0 ? cashBoxAccountInfo.accountStatus : i10;
            List list2 = (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? cashBoxAccountInfo.tierLimitAmount : list;
            long j19 = (i14 & 512) != 0 ? cashBoxAccountInfo.experienceGoldYesterdayIncome : j11;
            long j20 = (i14 & 1024) != 0 ? cashBoxAccountInfo.experienceGoldBalance : j12;
            long j21 = (i14 & 2048) != 0 ? cashBoxAccountInfo.experienceGoldUnclaimed : j13;
            boolean z10 = (i14 & 4096) != 0 ? cashBoxAccountInfo.experienceGoldIsOpen : z3;
            int i17 = (i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? cashBoxAccountInfo.experienceGoldStatus : i11;
            boolean z11 = z10;
            boolean z12 = (i14 & 16384) != 0 ? cashBoxAccountInfo.activityIsOpen : z8;
            String str10 = (i14 & 32768) != 0 ? cashBoxAccountInfo.banner : str4;
            int i18 = (i14 & 65536) != 0 ? cashBoxAccountInfo.experienceGoldShowType : i12;
            int i19 = (i14 & 131072) != 0 ? cashBoxAccountInfo.interestSwitchStatus : i13;
            boolean z13 = z12;
            long j22 = (i14 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? cashBoxAccountInfo.canBeDepositFromBalance : j14;
            long j23 = (i14 & 524288) != 0 ? cashBoxAccountInfo.frozenBalance : j15;
            if ((i14 & 1048576) != 0) {
                j16 = j23;
                str6 = cashBoxAccountInfo.frozenBalanceRemark;
            } else {
                str6 = str5;
                j16 = j23;
            }
            return cashBoxAccountInfo.copy(j17, l6, j18, str7, str8, i15, str9, i16, list2, j19, j20, j21, z11, i17, z13, str10, i18, i19, j22, j16, str6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCashBoxBalance() {
            return this.cashBoxBalance;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final long getExperienceGoldYesterdayIncome() {
            return this.experienceGoldYesterdayIncome;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final long getExperienceGoldBalance() {
            return this.experienceGoldBalance;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final long getExperienceGoldUnclaimed() {
            return this.experienceGoldUnclaimed;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final boolean getExperienceGoldIsOpen() {
            return this.experienceGoldIsOpen;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final int getExperienceGoldStatus() {
            return this.experienceGoldStatus;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final boolean getActivityIsOpen() {
            return this.activityIsOpen;
        }

        @NotNull
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getBanner() {
            return this.banner;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final int getExperienceGoldShowType() {
            return this.experienceGoldShowType;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final int getInterestSwitchStatus() {
            return this.interestSwitchStatus;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final long getCanBeDepositFromBalance() {
            return this.canBeDepositFromBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getYesterdayIncome() {
            return this.yesterdayIncome;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final long getFrozenBalance() {
            return this.frozenBalance;
        }

        @NotNull
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getFrozenBalanceRemark() {
            return this.frozenBalanceRemark;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTotalIncome() {
            return this.totalIncome;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getStateCode() {
            return this.stateCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getStateName() {
            return this.stateName;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getAccountStatus() {
            return this.accountStatus;
        }

        @Nullable
        public final List<String> component9() {
            return this.tierLimitAmount;
        }

        @NotNull
        public final CashBoxAccountInfo copy(long cashBoxBalance, @Nullable Long yesterdayIncome, long totalIncome, @Nullable String stateCode, @Nullable String stateName, int status, @Nullable String msg, int accountStatus, @Nullable List<String> tierLimitAmount, long experienceGoldYesterdayIncome, long experienceGoldBalance, long experienceGoldUnclaimed, boolean experienceGoldIsOpen, int experienceGoldStatus, boolean activityIsOpen, @NotNull String banner, int experienceGoldShowType, int interestSwitchStatus, long canBeDepositFromBalance, long frozenBalance, @NotNull String frozenBalanceRemark) {
            Intrinsics.checkNotNullParameter(banner, "banner");
            Intrinsics.checkNotNullParameter(frozenBalanceRemark, "frozenBalanceRemark");
            return new CashBoxAccountInfo(cashBoxBalance, yesterdayIncome, totalIncome, stateCode, stateName, status, msg, accountStatus, tierLimitAmount, experienceGoldYesterdayIncome, experienceGoldBalance, experienceGoldUnclaimed, experienceGoldIsOpen, experienceGoldStatus, activityIsOpen, banner, experienceGoldShowType, interestSwitchStatus, canBeDepositFromBalance, frozenBalance, frozenBalanceRemark);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashBoxAccountInfo)) {
                return false;
            }
            CashBoxAccountInfo cashBoxAccountInfo = (CashBoxAccountInfo) other;
            return this.cashBoxBalance == cashBoxAccountInfo.cashBoxBalance && Intrinsics.c(this.yesterdayIncome, cashBoxAccountInfo.yesterdayIncome) && this.totalIncome == cashBoxAccountInfo.totalIncome && Intrinsics.c(this.stateCode, cashBoxAccountInfo.stateCode) && Intrinsics.c(this.stateName, cashBoxAccountInfo.stateName) && this.status == cashBoxAccountInfo.status && Intrinsics.c(this.msg, cashBoxAccountInfo.msg) && this.accountStatus == cashBoxAccountInfo.accountStatus && Intrinsics.c(this.tierLimitAmount, cashBoxAccountInfo.tierLimitAmount) && this.experienceGoldYesterdayIncome == cashBoxAccountInfo.experienceGoldYesterdayIncome && this.experienceGoldBalance == cashBoxAccountInfo.experienceGoldBalance && this.experienceGoldUnclaimed == cashBoxAccountInfo.experienceGoldUnclaimed && this.experienceGoldIsOpen == cashBoxAccountInfo.experienceGoldIsOpen && this.experienceGoldStatus == cashBoxAccountInfo.experienceGoldStatus && this.activityIsOpen == cashBoxAccountInfo.activityIsOpen && Intrinsics.c(this.banner, cashBoxAccountInfo.banner) && this.experienceGoldShowType == cashBoxAccountInfo.experienceGoldShowType && this.interestSwitchStatus == cashBoxAccountInfo.interestSwitchStatus && this.canBeDepositFromBalance == cashBoxAccountInfo.canBeDepositFromBalance && this.frozenBalance == cashBoxAccountInfo.frozenBalance && Intrinsics.c(this.frozenBalanceRemark, cashBoxAccountInfo.frozenBalanceRemark);
        }

        public final int getAccountStatus() {
            return this.accountStatus;
        }

        public final boolean getActivityIsOpen() {
            return this.activityIsOpen;
        }

        @NotNull
        public final String getBanner() {
            return this.banner;
        }

        public final long getCanBeDepositFromBalance() {
            return this.canBeDepositFromBalance;
        }

        public final long getCashBoxBalance() {
            return this.cashBoxBalance;
        }

        public final long getExperienceGoldBalance() {
            return this.experienceGoldBalance;
        }

        public final boolean getExperienceGoldIsOpen() {
            return this.experienceGoldIsOpen;
        }

        public final int getExperienceGoldShowType() {
            return this.experienceGoldShowType;
        }

        public final int getExperienceGoldStatus() {
            return this.experienceGoldStatus;
        }

        public final long getExperienceGoldUnclaimed() {
            return this.experienceGoldUnclaimed;
        }

        public final long getExperienceGoldYesterdayIncome() {
            return this.experienceGoldYesterdayIncome;
        }

        public final long getFrozenBalance() {
            return this.frozenBalance;
        }

        @NotNull
        public final String getFrozenBalanceRemark() {
            return this.frozenBalanceRemark;
        }

        public final int getInterestSwitchStatus() {
            return this.interestSwitchStatus;
        }

        @Nullable
        public final String getMsg() {
            return this.msg;
        }

        @Nullable
        public final String getStateCode() {
            return this.stateCode;
        }

        @Nullable
        public final String getStateName() {
            return this.stateName;
        }

        public final int getStatus() {
            return this.status;
        }

        @Nullable
        public final List<String> getTierLimitAmount() {
            return this.tierLimitAmount;
        }

        public final long getTotalIncome() {
            return this.totalIncome;
        }

        @Nullable
        public final Long getYesterdayIncome() {
            return this.yesterdayIncome;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.cashBoxBalance) * 31;
            Long l5 = this.yesterdayIncome;
            int iB = q0.b((iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31, 31, this.totalIncome);
            String str = this.stateCode;
            int iHashCode2 = (iB + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.stateName;
            int iB2 = u.b(this.status, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            String str3 = this.msg;
            int iB3 = u.b(this.accountStatus, (iB2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
            List<String> list = this.tierLimitAmount;
            return this.frozenBalanceRemark.hashCode() + q0.b(q0.b(u.b(this.interestSwitchStatus, u.b(this.experienceGoldShowType, G.c(u.d(u.b(this.experienceGoldStatus, u.d(q0.b(q0.b(q0.b((iB3 + (list != null ? list.hashCode() : 0)) * 31, 31, this.experienceGoldYesterdayIncome), 31, this.experienceGoldBalance), 31, this.experienceGoldUnclaimed), 31, this.experienceGoldIsOpen), 31), 31, this.activityIsOpen), 31, this.banner), 31), 31), 31, this.canBeDepositFromBalance), 31, this.frozenBalance);
        }

        public final void setBanner(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.banner = str;
        }

        @NotNull
        public String toString() {
            long j6 = this.cashBoxBalance;
            Long l5 = this.yesterdayIncome;
            long j10 = this.totalIncome;
            String str = this.stateCode;
            String str2 = this.stateName;
            int i7 = this.status;
            String str3 = this.msg;
            int i10 = this.accountStatus;
            List<String> list = this.tierLimitAmount;
            long j11 = this.experienceGoldYesterdayIncome;
            long j12 = this.experienceGoldBalance;
            long j13 = this.experienceGoldUnclaimed;
            boolean z3 = this.experienceGoldIsOpen;
            int i11 = this.experienceGoldStatus;
            boolean z8 = this.activityIsOpen;
            String str4 = this.banner;
            int i12 = this.experienceGoldShowType;
            int i13 = this.interestSwitchStatus;
            long j14 = this.canBeDepositFromBalance;
            long j15 = this.frozenBalance;
            String str5 = this.frozenBalanceRemark;
            StringBuilder sb2 = new StringBuilder("CashBoxAccountInfo(cashBoxBalance=");
            sb2.append(j6);
            sb2.append(", yesterdayIncome=");
            sb2.append(l5);
            u.v(sb2, ", totalIncome=", j10, ", stateCode=");
            u.x(sb2, str, ", stateName=", str2, ", status=");
            sb2.append(i7);
            sb2.append(", msg=");
            sb2.append(str3);
            sb2.append(", accountStatus=");
            sb2.append(i10);
            sb2.append(", tierLimitAmount=");
            sb2.append(list);
            sb2.append(", experienceGoldYesterdayIncome=");
            sb2.append(j11);
            u.v(sb2, ", experienceGoldBalance=", j12, ", experienceGoldUnclaimed=");
            sb2.append(j13);
            sb2.append(", experienceGoldIsOpen=");
            sb2.append(z3);
            sb2.append(", experienceGoldStatus=");
            sb2.append(i11);
            sb2.append(", activityIsOpen=");
            sb2.append(z8);
            sb2.append(", banner=");
            sb2.append(str4);
            sb2.append(", experienceGoldShowType=");
            sb2.append(i12);
            sb2.append(", interestSwitchStatus=");
            sb2.append(i13);
            sb2.append(", canBeDepositFromBalance=");
            sb2.append(j14);
            u.v(sb2, ", frozenBalance=", j15, ", frozenBalanceRemark=");
            return G.r(sb2, str5, ")");
        }

        public /* synthetic */ CashBoxAccountInfo(long j6, Long l5, long j10, String str, String str2, int i7, String str3, int i10, List list, long j11, long j12, long j13, boolean z3, int i11, boolean z8, String str4, int i12, int i13, long j14, long j15, String str5, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0L : j6, l5, (i14 & 4) != 0 ? 0L : j10, str, str2, i7, str3, i10, list, (i14 & 512) != 0 ? 0L : j11, (i14 & 1024) != 0 ? 0L : j12, (i14 & 2048) != 0 ? 0L : j13, (i14 & 4096) != 0 ? false : z3, i11, (i14 & 16384) != 0 ? false : z8, (32768 & i14) != 0 ? "" : str4, (65536 & i14) != 0 ? 0 : i12, (131072 & i14) != 0 ? 1 : i13, (262144 & i14) != 0 ? 0L : j14, (524288 & i14) != 0 ? 0L : j15, (i14 & 1048576) != 0 ? "" : str5);
        }
    }
}
