package com.transsnet.palmpay.core.bean.req;

import N8.q0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/GenerateAuthCodeReq;", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "<init>", "(Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GenerateAuthCodeReq {

    @Nullable
    private final String appId;

    public GenerateAuthCodeReq(@Nullable String str) {
        this.appId = str;
    }

    public static /* synthetic */ GenerateAuthCodeReq copy$default(GenerateAuthCodeReq generateAuthCodeReq, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = generateAuthCodeReq.appId;
        }
        return generateAuthCodeReq.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final GenerateAuthCodeReq copy(@Nullable String appId) {
        return new GenerateAuthCodeReq(appId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenerateAuthCodeReq) && Intrinsics.c(this.appId, ((GenerateAuthCodeReq) other).appId);
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    public int hashCode() {
        String str = this.appId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return q0.k("GenerateAuthCodeReq(appId=", this.appId, ")");
    }
}
