package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\b\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/BankSdkManagerParams;", "", "key", "", "orderNo", "transType", "orderAmount", "", "isNoPullCashier", "", "payerAccountId", "payeeAccountType", "calculationExtInfo", "subTransType", "jsonExtras", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getOrderNo", "getTransType", "getOrderAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPayerAccountId", "getPayeeAccountType", "getCalculationExtInfo", "getSubTransType", "getJsonExtras", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/core/rnbridge/bridge/BankSdkManagerParams;", "equals", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BankSdkManagerParams {

    @Nullable
    private final String calculationExtInfo;

    @Nullable
    private final Boolean isNoPullCashier;

    @Nullable
    private final String jsonExtras;

    @Nullable
    private final String key;

    @Nullable
    private final Long orderAmount;

    @Nullable
    private final String orderNo;

    @Nullable
    private final String payeeAccountType;

    @Nullable
    private final String payerAccountId;

    @Nullable
    private final String subTransType;

    @Nullable
    private final String transType;

    public BankSdkManagerParams() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ BankSdkManagerParams copy$default(BankSdkManagerParams bankSdkManagerParams, String str, String str2, String str3, Long l5, Boolean bool, String str4, String str5, String str6, String str7, String str8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bankSdkManagerParams.key;
        }
        if ((i7 & 2) != 0) {
            str2 = bankSdkManagerParams.orderNo;
        }
        if ((i7 & 4) != 0) {
            str3 = bankSdkManagerParams.transType;
        }
        if ((i7 & 8) != 0) {
            l5 = bankSdkManagerParams.orderAmount;
        }
        if ((i7 & 16) != 0) {
            bool = bankSdkManagerParams.isNoPullCashier;
        }
        if ((i7 & 32) != 0) {
            str4 = bankSdkManagerParams.payerAccountId;
        }
        if ((i7 & 64) != 0) {
            str5 = bankSdkManagerParams.payeeAccountType;
        }
        if ((i7 & 128) != 0) {
            str6 = bankSdkManagerParams.calculationExtInfo;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str7 = bankSdkManagerParams.subTransType;
        }
        if ((i7 & 512) != 0) {
            str8 = bankSdkManagerParams.jsonExtras;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        Boolean bool2 = bool;
        String str13 = str4;
        return bankSdkManagerParams.copy(str, str2, str3, l5, bool2, str13, str11, str12, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getJsonExtras() {
        return this.jsonExtras;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getOrderAmount() {
        return this.orderAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsNoPullCashier() {
        return this.isNoPullCashier;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPayerAccountId() {
        return this.payerAccountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayeeAccountType() {
        return this.payeeAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCalculationExtInfo() {
        return this.calculationExtInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSubTransType() {
        return this.subTransType;
    }

    @NotNull
    public final BankSdkManagerParams copy(@Nullable String key, @Nullable String orderNo, @Nullable String transType, @Nullable Long orderAmount, @Nullable Boolean isNoPullCashier, @Nullable String payerAccountId, @Nullable String payeeAccountType, @Nullable String calculationExtInfo, @Nullable String subTransType, @Nullable String jsonExtras) {
        return new BankSdkManagerParams(key, orderNo, transType, orderAmount, isNoPullCashier, payerAccountId, payeeAccountType, calculationExtInfo, subTransType, jsonExtras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankSdkManagerParams)) {
            return false;
        }
        BankSdkManagerParams bankSdkManagerParams = (BankSdkManagerParams) other;
        return Intrinsics.c(this.key, bankSdkManagerParams.key) && Intrinsics.c(this.orderNo, bankSdkManagerParams.orderNo) && Intrinsics.c(this.transType, bankSdkManagerParams.transType) && Intrinsics.c(this.orderAmount, bankSdkManagerParams.orderAmount) && Intrinsics.c(this.isNoPullCashier, bankSdkManagerParams.isNoPullCashier) && Intrinsics.c(this.payerAccountId, bankSdkManagerParams.payerAccountId) && Intrinsics.c(this.payeeAccountType, bankSdkManagerParams.payeeAccountType) && Intrinsics.c(this.calculationExtInfo, bankSdkManagerParams.calculationExtInfo) && Intrinsics.c(this.subTransType, bankSdkManagerParams.subTransType) && Intrinsics.c(this.jsonExtras, bankSdkManagerParams.jsonExtras);
    }

    @Nullable
    public final String getCalculationExtInfo() {
        return this.calculationExtInfo;
    }

    @Nullable
    public final String getJsonExtras() {
        return this.jsonExtras;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Long getOrderAmount() {
        return this.orderAmount;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getPayeeAccountType() {
        return this.payeeAccountType;
    }

    @Nullable
    public final String getPayerAccountId() {
        return this.payerAccountId;
    }

    @Nullable
    public final String getSubTransType() {
        return this.subTransType;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.orderAmount;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool = this.isNoPullCashier;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.payerAccountId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payeeAccountType;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.calculationExtInfo;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subTransType;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.jsonExtras;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNoPullCashier() {
        return this.isNoPullCashier;
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.orderNo;
        String str3 = this.transType;
        Long l5 = this.orderAmount;
        Boolean bool = this.isNoPullCashier;
        String str4 = this.payerAccountId;
        String str5 = this.payeeAccountType;
        String str6 = this.calculationExtInfo;
        String str7 = this.subTransType;
        String str8 = this.jsonExtras;
        StringBuilder sbF = F.f("BankSdkManagerParams(key=", str, ", orderNo=", str2, ", transType=");
        sbF.append(str3);
        sbF.append(", orderAmount=");
        sbF.append(l5);
        sbF.append(", isNoPullCashier=");
        sbF.append(bool);
        sbF.append(", payerAccountId=");
        sbF.append(str4);
        sbF.append(", payeeAccountType=");
        u.x(sbF, str5, ", calculationExtInfo=", str6, ", subTransType=");
        return G.s(sbF, str7, ", jsonExtras=", str8, ")");
    }

    public BankSdkManagerParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l5, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.key = str;
        this.orderNo = str2;
        this.transType = str3;
        this.orderAmount = l5;
        this.isNoPullCashier = bool;
        this.payerAccountId = str4;
        this.payeeAccountType = str5;
        this.calculationExtInfo = str6;
        this.subTransType = str7;
        this.jsonExtras = str8;
    }

    public /* synthetic */ BankSdkManagerParams(String str, String str2, String str3, Long l5, Boolean bool, String str4, String str5, String str6, String str7, String str8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : l5, (i7 & 16) != 0 ? null : bool, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str7, (i7 & 512) != 0 ? null : str8);
    }
}
