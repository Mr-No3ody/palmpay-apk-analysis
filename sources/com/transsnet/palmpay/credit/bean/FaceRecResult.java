package com.transsnet.palmpay.credit.bean;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/FaceRecResult;", "", "result", "param", "", "errorMessage", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "getParam", "()Ljava/lang/String;", "setParam", "(Ljava/lang/String;)V", "getErrorMessage", "setErrorMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FaceRecResult {

    @Nullable
    private String errorMessage;

    @Nullable
    private String param;

    @Nullable
    private Object result;

    public FaceRecResult() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ FaceRecResult copy$default(FaceRecResult faceRecResult, Object obj, String str, String str2, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = faceRecResult.result;
        }
        if ((i7 & 2) != 0) {
            str = faceRecResult.param;
        }
        if ((i7 & 4) != 0) {
            str2 = faceRecResult.errorMessage;
        }
        return faceRecResult.copy(obj, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final FaceRecResult copy(@Nullable Object result, @Nullable String param, @Nullable String errorMessage) {
        return new FaceRecResult(result, param, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceRecResult)) {
            return false;
        }
        FaceRecResult faceRecResult = (FaceRecResult) other;
        return Intrinsics.c(this.result, faceRecResult.result) && Intrinsics.c(this.param, faceRecResult.param) && Intrinsics.c(this.errorMessage, faceRecResult.errorMessage);
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    @Nullable
    public final Object getResult() {
        return this.result;
    }

    public int hashCode() {
        Object obj = this.result;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.param;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setResult(@Nullable Object obj) {
        this.result = obj;
    }

    @NotNull
    public String toString() {
        Object obj = this.result;
        String str = this.param;
        String str2 = this.errorMessage;
        StringBuilder sb2 = new StringBuilder("FaceRecResult(result=");
        sb2.append(obj);
        sb2.append(", param=");
        sb2.append(str);
        sb2.append(", errorMessage=");
        return G.r(sb2, str2, ")");
    }

    public FaceRecResult(@Nullable Object obj, @Nullable String str, @Nullable String str2) {
        this.result = obj;
        this.param = str;
        this.errorMessage = str2;
    }

    public /* synthetic */ FaceRecResult(Object obj, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : obj, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2);
    }
}
