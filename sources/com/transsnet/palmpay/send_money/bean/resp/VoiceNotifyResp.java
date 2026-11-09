package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/VoiceNotifyResp;", "", "memberId", "", "businessType", "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMemberId", "()Ljava/lang/String;", "getBusinessType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "setStatus", "(Ljava/lang/Integer;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/transsnet/palmpay/send_money/bean/resp/VoiceNotifyResp;", "equals", "", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VoiceNotifyResp {

    @Nullable
    private final Integer businessType;

    @NotNull
    private final String memberId;

    @Nullable
    private Integer status;

    public VoiceNotifyResp(@NotNull String memberId, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        this.memberId = memberId;
        this.businessType = num;
        this.status = num2;
    }

    public static /* synthetic */ VoiceNotifyResp copy$default(VoiceNotifyResp voiceNotifyResp, String str, Integer num, Integer num2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = voiceNotifyResp.memberId;
        }
        if ((i7 & 2) != 0) {
            num = voiceNotifyResp.businessType;
        }
        if ((i7 & 4) != 0) {
            num2 = voiceNotifyResp.status;
        }
        return voiceNotifyResp.copy(str, num, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @NotNull
    public final VoiceNotifyResp copy(@NotNull String memberId, @Nullable Integer businessType, @Nullable Integer status) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        return new VoiceNotifyResp(memberId, businessType, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceNotifyResp)) {
            return false;
        }
        VoiceNotifyResp voiceNotifyResp = (VoiceNotifyResp) other;
        return Intrinsics.c(this.memberId, voiceNotifyResp.memberId) && Intrinsics.c(this.businessType, voiceNotifyResp.businessType) && Intrinsics.c(this.status, voiceNotifyResp.status);
    }

    @Nullable
    public final Integer getBusinessType() {
        return this.businessType;
    }

    @NotNull
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.memberId.hashCode() * 31;
        Integer num = this.businessType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    @NotNull
    public String toString() {
        return "VoiceNotifyResp(memberId=" + this.memberId + ", businessType=" + this.businessType + ", status=" + this.status + ")";
    }
}
