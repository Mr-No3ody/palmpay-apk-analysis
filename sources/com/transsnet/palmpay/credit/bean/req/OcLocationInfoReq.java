package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcLocationInfoReq;", "", "latitude", "", "longitude", "applyId", "", "live", "", "uploadNode", "uploadNodeDetail", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getApplyId", "()Ljava/lang/String;", "getLive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUploadNode", "getUploadNodeDetail", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcLocationInfoReq {

    @Nullable
    private final String applyId;

    @Nullable
    private final Double latitude;

    @Nullable
    private final Boolean live;

    @Nullable
    private final Double longitude;

    @Nullable
    private final String uploadNode;

    @Nullable
    private final String uploadNodeDetail;

    public OcLocationInfoReq(@Nullable Double d2, @Nullable Double d10, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3) {
        this.latitude = d2;
        this.longitude = d10;
        this.applyId = str;
        this.live = bool;
        this.uploadNode = str2;
        this.uploadNodeDetail = str3;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Boolean getLive() {
        return this.live;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getUploadNode() {
        return this.uploadNode;
    }

    @Nullable
    public final String getUploadNodeDetail() {
        return this.uploadNodeDetail;
    }

    public /* synthetic */ OcLocationInfoReq(Double d2, Double d10, String str, Boolean bool, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, d10, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? Boolean.FALSE : bool, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? null : str3);
    }
}
