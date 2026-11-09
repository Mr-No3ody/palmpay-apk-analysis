package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/MultiMediaReq;", "", "uploadNode", "", "applyId", "pictNum", "", "videoNum", "dcType", "uploadNodeDetail", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V", "getUploadNode", "()Ljava/lang/String;", "getApplyId", "getPictNum", "()I", "getVideoNum", "getDcType", "getUploadNodeDetail", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiMediaReq {

    @Nullable
    private final String applyId;
    private final int dcType;
    private final int pictNum;

    @Nullable
    private final String uploadNode;

    @Nullable
    private final String uploadNodeDetail;
    private final int videoNum;

    public MultiMediaReq(@Nullable String str, @Nullable String str2, int i7, int i10, int i11, @Nullable String str3) {
        this.uploadNode = str;
        this.applyId = str2;
        this.pictNum = i7;
        this.videoNum = i10;
        this.dcType = i11;
        this.uploadNodeDetail = str3;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    public final int getDcType() {
        return this.dcType;
    }

    public final int getPictNum() {
        return this.pictNum;
    }

    @Nullable
    public final String getUploadNode() {
        return this.uploadNode;
    }

    @Nullable
    public final String getUploadNodeDetail() {
        return this.uploadNodeDetail;
    }

    public final int getVideoNum() {
        return this.videoNum;
    }

    public /* synthetic */ MultiMediaReq(String str, String str2, int i7, int i10, int i11, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i7, i10, (i12 & 16) != 0 ? 1 : i11, str3);
    }
}
