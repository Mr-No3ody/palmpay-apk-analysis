package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLComparePhotoReq;", "", "applyId", "", "filePath", "product", "takePhotoOperateType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplyId", "()Ljava/lang/String;", "getFilePath", "getProduct", "getTakePhotoOperateType", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLComparePhotoReq {

    @Nullable
    private final String applyId;

    @Nullable
    private final String filePath;

    @Nullable
    private final String product;

    @Nullable
    private final String takePhotoOperateType;

    public CLComparePhotoReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.applyId = str;
        this.filePath = str2;
        this.product = str3;
        this.takePhotoOperateType = str4;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    public final String getTakePhotoOperateType() {
        return this.takePhotoOperateType;
    }
}
