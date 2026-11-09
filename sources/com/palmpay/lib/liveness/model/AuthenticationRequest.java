package com.palmpay.lib.liveness.model;

import C0.G;
import androidx.annotation.Keep;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/palmpay/lib/liveness/model/AuthenticationRequest;", "", "scene", "", "memberId", "", "bizId", "phone", "extendInfo", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScene", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMemberId", "()Ljava/lang/String;", "getBizId", "getPhone", "getExtendInfo", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/palmpay/lib/liveness/model/AuthenticationRequest;", "equals", "", "other", "hashCode", "toString", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthenticationRequest {

    @Nullable
    private final String bizId;

    @Nullable
    private final String extendInfo;

    @Nullable
    private final String memberId;

    @Nullable
    private final String phone;

    @Nullable
    private final Integer scene;

    public AuthenticationRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AuthenticationRequest copy$default(AuthenticationRequest authenticationRequest, Integer num, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = authenticationRequest.scene;
        }
        if ((i7 & 2) != 0) {
            str = authenticationRequest.memberId;
        }
        if ((i7 & 4) != 0) {
            str2 = authenticationRequest.bizId;
        }
        if ((i7 & 8) != 0) {
            str3 = authenticationRequest.phone;
        }
        if ((i7 & 16) != 0) {
            str4 = authenticationRequest.extendInfo;
        }
        String str5 = str4;
        String str6 = str2;
        return authenticationRequest.copy(num, str, str6, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getScene() {
        return this.scene;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtendInfo() {
        return this.extendInfo;
    }

    @NotNull
    public final AuthenticationRequest copy(@Nullable Integer scene, @Nullable String memberId, @Nullable String bizId, @Nullable String phone, @Nullable String extendInfo) {
        return new AuthenticationRequest(scene, memberId, bizId, phone, extendInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationRequest)) {
            return false;
        }
        AuthenticationRequest authenticationRequest = (AuthenticationRequest) other;
        return Intrinsics.c(this.scene, authenticationRequest.scene) && Intrinsics.c(this.memberId, authenticationRequest.memberId) && Intrinsics.c(this.bizId, authenticationRequest.bizId) && Intrinsics.c(this.phone, authenticationRequest.phone) && Intrinsics.c(this.extendInfo, authenticationRequest.extendInfo);
    }

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    public final String getExtendInfo() {
        return this.extendInfo;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Integer getScene() {
        return this.scene;
    }

    public int hashCode() {
        Integer num = this.scene;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.memberId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bizId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extendInfo;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.scene;
        String str = this.memberId;
        String str2 = this.bizId;
        String str3 = this.phone;
        String str4 = this.extendInfo;
        StringBuilder sb2 = new StringBuilder("AuthenticationRequest(scene=");
        sb2.append(num);
        sb2.append(", memberId=");
        sb2.append(str);
        sb2.append(", bizId=");
        u.x(sb2, str2, ", phone=", str3, ", extendInfo=");
        return G.r(sb2, str4, ")");
    }

    public AuthenticationRequest(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.scene = num;
        this.memberId = str;
        this.bizId = str2;
        this.phone = str3;
        this.extendInfo = str4;
    }

    public /* synthetic */ AuthenticationRequest(Integer num, String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4);
    }
}
