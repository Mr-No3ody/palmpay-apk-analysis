package com.transsnet.palmpay.credit.bean.req;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcUploadALiFaceResultReq;", "", "filePath", "", "applyId", "product", "takePhotoOperateType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getApplyId", "getProduct", "getTakePhotoOperateType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OcUploadALiFaceResultReq {

    @Nullable
    private final String applyId;

    @Nullable
    private final String filePath;

    @Nullable
    private final String product;

    @Nullable
    private final String takePhotoOperateType;

    public OcUploadALiFaceResultReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.filePath = str;
        this.applyId = str2;
        this.product = str3;
        this.takePhotoOperateType = str4;
    }

    public static /* synthetic */ OcUploadALiFaceResultReq copy$default(OcUploadALiFaceResultReq ocUploadALiFaceResultReq, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = ocUploadALiFaceResultReq.filePath;
        }
        if ((i7 & 2) != 0) {
            str2 = ocUploadALiFaceResultReq.applyId;
        }
        if ((i7 & 4) != 0) {
            str3 = ocUploadALiFaceResultReq.product;
        }
        if ((i7 & 8) != 0) {
            str4 = ocUploadALiFaceResultReq.takePhotoOperateType;
        }
        return ocUploadALiFaceResultReq.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTakePhotoOperateType() {
        return this.takePhotoOperateType;
    }

    @NotNull
    public final OcUploadALiFaceResultReq copy(@Nullable String filePath, @Nullable String applyId, @Nullable String product, @Nullable String takePhotoOperateType) {
        return new OcUploadALiFaceResultReq(filePath, applyId, product, takePhotoOperateType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcUploadALiFaceResultReq)) {
            return false;
        }
        OcUploadALiFaceResultReq ocUploadALiFaceResultReq = (OcUploadALiFaceResultReq) other;
        return Intrinsics.c(this.filePath, ocUploadALiFaceResultReq.filePath) && Intrinsics.c(this.applyId, ocUploadALiFaceResultReq.applyId) && Intrinsics.c(this.product, ocUploadALiFaceResultReq.product) && Intrinsics.c(this.takePhotoOperateType, ocUploadALiFaceResultReq.takePhotoOperateType);
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

    public int hashCode() {
        String str = this.filePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applyId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.product;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.takePhotoOperateType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.filePath;
        String str2 = this.applyId;
        return G.s(F.f("OcUploadALiFaceResultReq(filePath=", str, ", applyId=", str2, ", product="), this.product, ", takePhotoOperateType=", this.takePhotoOperateType, ")");
    }
}
