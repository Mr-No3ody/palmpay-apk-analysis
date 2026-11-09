package com.transsnet.palmpay.credit.bean;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/FaceRecParam;", "", "key", "", "scene", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getScene", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FaceRecParam {

    @Nullable
    private final String key;

    @Nullable
    private final String scene;

    /* JADX WARN: Multi-variable type inference failed */
    public FaceRecParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FaceRecParam copy$default(FaceRecParam faceRecParam, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = faceRecParam.key;
        }
        if ((i7 & 2) != 0) {
            str2 = faceRecParam.scene;
        }
        return faceRecParam.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @NotNull
    public final FaceRecParam copy(@Nullable String key, @Nullable String scene) {
        return new FaceRecParam(key, scene);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceRecParam)) {
            return false;
        }
        FaceRecParam faceRecParam = (FaceRecParam) other;
        return Intrinsics.c(this.key, faceRecParam.key) && Intrinsics.c(this.scene, faceRecParam.scene);
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scene;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return G.q("FaceRecParam(key=", this.key, ", scene=", this.scene, ")");
    }

    public FaceRecParam(@Nullable String str, @Nullable String str2) {
        this.key = str;
        this.scene = str2;
    }

    public /* synthetic */ FaceRecParam(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }
}
