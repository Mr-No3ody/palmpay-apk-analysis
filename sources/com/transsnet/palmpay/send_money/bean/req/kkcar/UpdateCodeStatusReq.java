package com.transsnet.palmpay.send_money.bean.req.kkcar;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/kkcar/UpdateCodeStatusReq;", "", "codeStatus", "", "token", "", "blackBox", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCodeStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToken", "()Ljava/lang/String;", "getBlackBox", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/send_money/bean/req/kkcar/UpdateCodeStatusReq;", "equals", "", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateCodeStatusReq {

    @Nullable
    private final String blackBox;

    @Nullable
    private final Integer codeStatus;

    @Nullable
    private final String token;

    public UpdateCodeStatusReq() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UpdateCodeStatusReq copy$default(UpdateCodeStatusReq updateCodeStatusReq, Integer num, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = updateCodeStatusReq.codeStatus;
        }
        if ((i7 & 2) != 0) {
            str = updateCodeStatusReq.token;
        }
        if ((i7 & 4) != 0) {
            str2 = updateCodeStatusReq.blackBox;
        }
        return updateCodeStatusReq.copy(num, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCodeStatus() {
        return this.codeStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBlackBox() {
        return this.blackBox;
    }

    @NotNull
    public final UpdateCodeStatusReq copy(@Nullable Integer codeStatus, @Nullable String token, @Nullable String blackBox) {
        return new UpdateCodeStatusReq(codeStatus, token, blackBox);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCodeStatusReq)) {
            return false;
        }
        UpdateCodeStatusReq updateCodeStatusReq = (UpdateCodeStatusReq) other;
        return Intrinsics.c(this.codeStatus, updateCodeStatusReq.codeStatus) && Intrinsics.c(this.token, updateCodeStatusReq.token) && Intrinsics.c(this.blackBox, updateCodeStatusReq.blackBox);
    }

    @Nullable
    public final String getBlackBox() {
        return this.blackBox;
    }

    @Nullable
    public final Integer getCodeStatus() {
        return this.codeStatus;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        Integer num = this.codeStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.token;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blackBox;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.codeStatus;
        String str = this.token;
        String str2 = this.blackBox;
        StringBuilder sb2 = new StringBuilder("UpdateCodeStatusReq(codeStatus=");
        sb2.append(num);
        sb2.append(", token=");
        sb2.append(str);
        sb2.append(", blackBox=");
        return G.r(sb2, str2, ")");
    }

    public UpdateCodeStatusReq(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.codeStatus = num;
        this.token = str;
        this.blackBox = str2;
    }

    public /* synthetic */ UpdateCodeStatusReq(Integer num, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2);
    }
}
