package com.transsnet.palmpay.send_money.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/SaveTransferLimitSettingReq;", "", "singleLimit", "", "dailyLimit", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getSingleLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDailyLimit", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/send_money/bean/req/SaveTransferLimitSettingReq;", "equals", "", "other", "hashCode", "", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SaveTransferLimitSettingReq {

    @Nullable
    private final Long dailyLimit;

    @Nullable
    private final Long singleLimit;

    public SaveTransferLimitSettingReq(@Nullable Long l5, @Nullable Long l6) {
        this.singleLimit = l5;
        this.dailyLimit = l6;
    }

    public static /* synthetic */ SaveTransferLimitSettingReq copy$default(SaveTransferLimitSettingReq saveTransferLimitSettingReq, Long l5, Long l6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = saveTransferLimitSettingReq.singleLimit;
        }
        if ((i7 & 2) != 0) {
            l6 = saveTransferLimitSettingReq.dailyLimit;
        }
        return saveTransferLimitSettingReq.copy(l5, l6);
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

    @NotNull
    public final SaveTransferLimitSettingReq copy(@Nullable Long singleLimit, @Nullable Long dailyLimit) {
        return new SaveTransferLimitSettingReq(singleLimit, dailyLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveTransferLimitSettingReq)) {
            return false;
        }
        SaveTransferLimitSettingReq saveTransferLimitSettingReq = (SaveTransferLimitSettingReq) other;
        return Intrinsics.c(this.singleLimit, saveTransferLimitSettingReq.singleLimit) && Intrinsics.c(this.dailyLimit, saveTransferLimitSettingReq.dailyLimit);
    }

    @Nullable
    public final Long getDailyLimit() {
        return this.dailyLimit;
    }

    @Nullable
    public final Long getSingleLimit() {
        return this.singleLimit;
    }

    public int hashCode() {
        Long l5 = this.singleLimit;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.dailyLimit;
        return iHashCode + (l6 != null ? l6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SaveTransferLimitSettingReq(singleLimit=" + this.singleLimit + ", dailyLimit=" + this.dailyLimit + ")";
    }
}
