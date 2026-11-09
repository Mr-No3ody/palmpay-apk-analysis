package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/MfbRequestParams;", "", "key", "", FirebaseAnalytics.Param.METHOD, "path", "body", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getMethod", "getPath", "getBody", "getParams", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MfbRequestParams {

    @Nullable
    private final String body;

    @Nullable
    private final String key;

    @Nullable
    private final String method;

    @Nullable
    private final String params;

    @Nullable
    private final String path;

    public MfbRequestParams() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MfbRequestParams copy$default(MfbRequestParams mfbRequestParams, String str, String str2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = mfbRequestParams.key;
        }
        if ((i7 & 2) != 0) {
            str2 = mfbRequestParams.method;
        }
        if ((i7 & 4) != 0) {
            str3 = mfbRequestParams.path;
        }
        if ((i7 & 8) != 0) {
            str4 = mfbRequestParams.body;
        }
        if ((i7 & 16) != 0) {
            str5 = mfbRequestParams.params;
        }
        String str6 = str5;
        String str7 = str3;
        return mfbRequestParams.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParams() {
        return this.params;
    }

    @NotNull
    public final MfbRequestParams copy(@Nullable String key, @Nullable String method, @Nullable String path, @Nullable String body, @Nullable String params) {
        return new MfbRequestParams(key, method, path, body, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfbRequestParams)) {
            return false;
        }
        MfbRequestParams mfbRequestParams = (MfbRequestParams) other;
        return Intrinsics.c(this.key, mfbRequestParams.key) && Intrinsics.c(this.method, mfbRequestParams.method) && Intrinsics.c(this.path, mfbRequestParams.path) && Intrinsics.c(this.body, mfbRequestParams.body) && Intrinsics.c(this.params, mfbRequestParams.params);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getParams() {
        return this.params;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.method;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.path;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.body;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.params;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.method;
        String str3 = this.path;
        String str4 = this.body;
        String str5 = this.params;
        StringBuilder sbF = F.f("MfbRequestParams(key=", str, ", method=", str2, ", path=");
        u.x(sbF, str3, ", body=", str4, ", params=");
        return G.r(sbF, str5, ")");
    }

    public MfbRequestParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.key = str;
        this.method = str2;
        this.path = str3;
        this.body = str4;
        this.params = str5;
    }

    public /* synthetic */ MfbRequestParams(String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5);
    }
}
