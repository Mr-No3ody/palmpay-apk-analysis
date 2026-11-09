package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/TriggerFullExemptionData;", "", "triggerStatus", "", "promptMessage", "", "applyNo", "outstandingAmount", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getTriggerStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPromptMessage", "()Ljava/lang/String;", "getApplyNo", "getOutstandingAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/credit/bean/resp/TriggerFullExemptionData;", "equals", "", "other", "hashCode", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TriggerFullExemptionData {

    @Nullable
    private final String applyNo;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final String promptMessage;

    @Nullable
    private final Integer triggerStatus;

    public TriggerFullExemptionData(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Long l5) {
        this.triggerStatus = num;
        this.promptMessage = str;
        this.applyNo = str2;
        this.outstandingAmount = l5;
    }

    public static /* synthetic */ TriggerFullExemptionData copy$default(TriggerFullExemptionData triggerFullExemptionData, Integer num, String str, String str2, Long l5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = triggerFullExemptionData.triggerStatus;
        }
        if ((i7 & 2) != 0) {
            str = triggerFullExemptionData.promptMessage;
        }
        if ((i7 & 4) != 0) {
            str2 = triggerFullExemptionData.applyNo;
        }
        if ((i7 & 8) != 0) {
            l5 = triggerFullExemptionData.outstandingAmount;
        }
        return triggerFullExemptionData.copy(num, str, str2, l5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTriggerStatus() {
        return this.triggerStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPromptMessage() {
        return this.promptMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplyNo() {
        return this.applyNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @NotNull
    public final TriggerFullExemptionData copy(@Nullable Integer triggerStatus, @Nullable String promptMessage, @Nullable String applyNo, @Nullable Long outstandingAmount) {
        return new TriggerFullExemptionData(triggerStatus, promptMessage, applyNo, outstandingAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerFullExemptionData)) {
            return false;
        }
        TriggerFullExemptionData triggerFullExemptionData = (TriggerFullExemptionData) other;
        return Intrinsics.c(this.triggerStatus, triggerFullExemptionData.triggerStatus) && Intrinsics.c(this.promptMessage, triggerFullExemptionData.promptMessage) && Intrinsics.c(this.applyNo, triggerFullExemptionData.applyNo) && Intrinsics.c(this.outstandingAmount, triggerFullExemptionData.outstandingAmount);
    }

    @Nullable
    public final String getApplyNo() {
        return this.applyNo;
    }

    @Nullable
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final String getPromptMessage() {
        return this.promptMessage;
    }

    @Nullable
    public final Integer getTriggerStatus() {
        return this.triggerStatus;
    }

    public int hashCode() {
        Integer num = this.triggerStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.promptMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.applyNo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l5 = this.outstandingAmount;
        return iHashCode3 + (l5 != null ? l5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TriggerFullExemptionData(triggerStatus=" + this.triggerStatus + ", promptMessage=" + this.promptMessage + ", applyNo=" + this.applyNo + ", outstandingAmount=" + this.outstandingAmount + ")";
    }
}
