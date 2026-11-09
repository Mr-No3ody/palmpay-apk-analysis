package com.transsnet.palmpay.send_money.bean.resp.kkcar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodePollOrderRsp;", "", "qrCodeOrderDTO", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", "<init>", "(Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;)V", "getQrCodeOrderDTO", "()Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$QrCodeOrderDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KkCarQrCodePollOrderRsp {

    @Nullable
    private final KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO;

    /* JADX WARN: Multi-variable type inference failed */
    public KkCarQrCodePollOrderRsp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KkCarQrCodePollOrderRsp copy$default(KkCarQrCodePollOrderRsp kkCarQrCodePollOrderRsp, KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            qrCodeOrderDTO = kkCarQrCodePollOrderRsp.qrCodeOrderDTO;
        }
        return kkCarQrCodePollOrderRsp.copy(qrCodeOrderDTO);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KkCarQrCodeRsp.QrCodeOrderDTO getQrCodeOrderDTO() {
        return this.qrCodeOrderDTO;
    }

    @NotNull
    public final KkCarQrCodePollOrderRsp copy(@Nullable KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO) {
        return new KkCarQrCodePollOrderRsp(qrCodeOrderDTO);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KkCarQrCodePollOrderRsp) && Intrinsics.c(this.qrCodeOrderDTO, ((KkCarQrCodePollOrderRsp) other).qrCodeOrderDTO);
    }

    @Nullable
    public final KkCarQrCodeRsp.QrCodeOrderDTO getQrCodeOrderDTO() {
        return this.qrCodeOrderDTO;
    }

    public int hashCode() {
        KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO = this.qrCodeOrderDTO;
        if (qrCodeOrderDTO == null) {
            return 0;
        }
        return qrCodeOrderDTO.hashCode();
    }

    @NotNull
    public String toString() {
        return "KkCarQrCodePollOrderRsp(qrCodeOrderDTO=" + this.qrCodeOrderDTO + ")";
    }

    public KkCarQrCodePollOrderRsp(@Nullable KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO) {
        this.qrCodeOrderDTO = qrCodeOrderDTO;
    }

    public /* synthetic */ KkCarQrCodePollOrderRsp(KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : qrCodeOrderDTO);
    }
}
