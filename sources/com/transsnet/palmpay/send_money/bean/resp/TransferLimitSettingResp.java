package com.transsnet.palmpay.send_money.bean.resp;

import N8.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJV\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransferLimitSettingResp;", "", "singleLimit", "", "dailyLimit", "dailyLimitMin", "dailyLimitMax", "singleLimitMin", "singleLimitMax", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getSingleLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDailyLimit", "getDailyLimitMin", "getDailyLimitMax", "getSingleLimitMin", "getSingleLimitMax", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/send_money/bean/resp/TransferLimitSettingResp;", "equals", "", "other", "hashCode", "", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransferLimitSettingResp {

    @Nullable
    private final Long dailyLimit;

    @Nullable
    private final Long dailyLimitMax;

    @Nullable
    private final Long dailyLimitMin;

    @Nullable
    private final Long singleLimit;

    @Nullable
    private final Long singleLimitMax;

    @Nullable
    private final Long singleLimitMin;

    public TransferLimitSettingResp() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ TransferLimitSettingResp copy$default(TransferLimitSettingResp transferLimitSettingResp, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = transferLimitSettingResp.singleLimit;
        }
        if ((i7 & 2) != 0) {
            l6 = transferLimitSettingResp.dailyLimit;
        }
        if ((i7 & 4) != 0) {
            l8 = transferLimitSettingResp.dailyLimitMin;
        }
        if ((i7 & 8) != 0) {
            l10 = transferLimitSettingResp.dailyLimitMax;
        }
        if ((i7 & 16) != 0) {
            l11 = transferLimitSettingResp.singleLimitMin;
        }
        if ((i7 & 32) != 0) {
            l12 = transferLimitSettingResp.singleLimitMax;
        }
        Long l13 = l11;
        Long l14 = l12;
        return transferLimitSettingResp.copy(l5, l6, l8, l10, l13, l14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getSingleLimit() {
        return this.singleLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDailyLimit() {
        return this.dailyLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getDailyLimitMin() {
        return this.dailyLimitMin;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDailyLimitMax() {
        return this.dailyLimitMax;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSingleLimitMin() {
        return this.singleLimitMin;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getSingleLimitMax() {
        return this.singleLimitMax;
    }

    @NotNull
    public final TransferLimitSettingResp copy(@Nullable Long singleLimit, @Nullable Long dailyLimit, @Nullable Long dailyLimitMin, @Nullable Long dailyLimitMax, @Nullable Long singleLimitMin, @Nullable Long singleLimitMax) {
        return new TransferLimitSettingResp(singleLimit, dailyLimit, dailyLimitMin, dailyLimitMax, singleLimitMin, singleLimitMax);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferLimitSettingResp)) {
            return false;
        }
        TransferLimitSettingResp transferLimitSettingResp = (TransferLimitSettingResp) other;
        return Intrinsics.c(this.singleLimit, transferLimitSettingResp.singleLimit) && Intrinsics.c(this.dailyLimit, transferLimitSettingResp.dailyLimit) && Intrinsics.c(this.dailyLimitMin, transferLimitSettingResp.dailyLimitMin) && Intrinsics.c(this.dailyLimitMax, transferLimitSettingResp.dailyLimitMax) && Intrinsics.c(this.singleLimitMin, transferLimitSettingResp.singleLimitMin) && Intrinsics.c(this.singleLimitMax, transferLimitSettingResp.singleLimitMax);
    }

    @Nullable
    public final Long getDailyLimit() {
        return this.dailyLimit;
    }

    @Nullable
    public final Long getDailyLimitMax() {
        return this.dailyLimitMax;
    }

    @Nullable
    public final Long getDailyLimitMin() {
        return this.dailyLimitMin;
    }

    @Nullable
    public final Long getSingleLimit() {
        return this.singleLimit;
    }

    @Nullable
    public final Long getSingleLimitMax() {
        return this.singleLimitMax;
    }

    @Nullable
    public final Long getSingleLimitMin() {
        return this.singleLimitMin;
    }

    public int hashCode() {
        Long l5 = this.singleLimit;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.dailyLimit;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.dailyLimitMin;
        int iHashCode3 = (iHashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.dailyLimitMax;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.singleLimitMin;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.singleLimitMax;
        return iHashCode5 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l5 = this.singleLimit;
        Long l6 = this.dailyLimit;
        Long l8 = this.dailyLimitMin;
        Long l10 = this.dailyLimitMax;
        Long l11 = this.singleLimitMin;
        Long l12 = this.singleLimitMax;
        StringBuilder sb2 = new StringBuilder("TransferLimitSettingResp(singleLimit=");
        sb2.append(l5);
        sb2.append(", dailyLimit=");
        sb2.append(l6);
        sb2.append(", dailyLimitMin=");
        q0.w(sb2, l8, ", dailyLimitMax=", l10, ", singleLimitMin=");
        sb2.append(l11);
        sb2.append(", singleLimitMax=");
        sb2.append(l12);
        sb2.append(")");
        return sb2.toString();
    }

    public TransferLimitSettingResp(@Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        this.singleLimit = l5;
        this.dailyLimit = l6;
        this.dailyLimitMin = l8;
        this.dailyLimitMax = l10;
        this.singleLimitMin = l11;
        this.singleLimitMax = l12;
    }

    public /* synthetic */ TransferLimitSettingResp(Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l5, (i7 & 2) != 0 ? null : l6, (i7 & 4) != 0 ? null : l8, (i7 & 8) != 0 ? null : l10, (i7 & 16) != 0 ? null : l11, (i7 & 32) != 0 ? null : l12);
    }
}
