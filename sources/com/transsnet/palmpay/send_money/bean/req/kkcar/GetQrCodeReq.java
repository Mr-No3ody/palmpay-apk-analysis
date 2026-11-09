package com.transsnet.palmpay.send_money.bean.req.kkcar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/kkcar/GetQrCodeReq;", "", "qrCode", "", "forceNew", "", "<init>", "(Ljava/lang/String;Z)V", "getQrCode", "()Ljava/lang/String;", "getForceNew", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetQrCodeReq {
    private final boolean forceNew;

    @Nullable
    private final String qrCode;

    /* JADX WARN: Multi-variable type inference failed */
    public GetQrCodeReq() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetQrCodeReq copy$default(GetQrCodeReq getQrCodeReq, String str, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = getQrCodeReq.qrCode;
        }
        if ((i7 & 2) != 0) {
            z3 = getQrCodeReq.forceNew;
        }
        return getQrCodeReq.copy(str, z3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getForceNew() {
        return this.forceNew;
    }

    @NotNull
    public final GetQrCodeReq copy(@Nullable String qrCode, boolean forceNew) {
        return new GetQrCodeReq(qrCode, forceNew);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetQrCodeReq)) {
            return false;
        }
        GetQrCodeReq getQrCodeReq = (GetQrCodeReq) other;
        return Intrinsics.c(this.qrCode, getQrCodeReq.qrCode) && this.forceNew == getQrCodeReq.forceNew;
    }

    public final boolean getForceNew() {
        return this.forceNew;
    }

    @Nullable
    public final String getQrCode() {
        return this.qrCode;
    }

    public int hashCode() {
        String str = this.qrCode;
        return Boolean.hashCode(this.forceNew) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "GetQrCodeReq(qrCode=" + this.qrCode + ", forceNew=" + this.forceNew + ")";
    }

    public GetQrCodeReq(@Nullable String str, boolean z3) {
        this.qrCode = str;
        this.forceNew = z3;
    }

    public /* synthetic */ GetQrCodeReq(String str, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? false : z3);
    }
}
