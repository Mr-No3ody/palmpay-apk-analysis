package com.flexibank.sdk;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/flexibank/sdk/c;", "", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "Ljava/lang/String;", "getAppVersion", "()Ljava/lang/String;", "brand", "getBrand", "deviceId", "b", "deviceType", "getDeviceType", "deviceVersion", "getDeviceVersion", "imei", "c", "deviceModel", "getDeviceModel", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    @NotNull
    private final String appVersion;

    @NotNull
    private final String brand;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final String deviceType;

    @NotNull
    private final String deviceVersion;

    @NotNull
    private final String imei;

    public c(String appVersion, String brand, String deviceId, String deviceType, String deviceVersion, String imei, String deviceModel) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceVersion, "deviceVersion");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.appVersion = appVersion;
        this.brand = brand;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.deviceVersion = deviceVersion;
        this.imei = imei;
        this.deviceModel = deviceModel;
    }

    public static c a(c cVar, String str, String str2, int i7) {
        String appVersion = cVar.appVersion;
        String brand = cVar.brand;
        if ((i7 & 4) != 0) {
            str = cVar.deviceId;
        }
        String deviceId = str;
        String deviceType = cVar.deviceType;
        String deviceVersion = cVar.deviceVersion;
        if ((i7 & 32) != 0) {
            str2 = cVar.imei;
        }
        String imei = str2;
        String deviceModel = cVar.deviceModel;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceVersion, "deviceVersion");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return new c(appVersion, brand, deviceId, deviceType, deviceVersion, imei, deviceModel);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.appVersion, cVar.appVersion) && Intrinsics.c(this.brand, cVar.brand) && Intrinsics.c(this.deviceId, cVar.deviceId) && Intrinsics.c(this.deviceType, cVar.deviceType) && Intrinsics.c(this.deviceVersion, cVar.deviceVersion) && Intrinsics.c(this.imei, cVar.imei) && Intrinsics.c(this.deviceModel, cVar.deviceModel);
    }

    public final int hashCode() {
        return this.deviceModel.hashCode() + G.c(G.c(G.c(G.c(G.c(this.appVersion.hashCode() * 31, 31, this.brand), 31, this.deviceId), 31, this.deviceType), 31, this.deviceVersion), 31, this.imei);
    }

    public final String toString() {
        String str = this.appVersion;
        String str2 = this.brand;
        String str3 = this.deviceId;
        String str4 = this.deviceType;
        String str5 = this.deviceVersion;
        String str6 = this.imei;
        String str7 = this.deviceModel;
        StringBuilder sbF = F.f("FlexiBankInitDeviceInfo(appVersion=", str, ", brand=", str2, ", deviceId=");
        u.x(sbF, str3, ", deviceType=", str4, ", deviceVersion=");
        u.x(sbF, str5, ", imei=", str6, ", deviceModel=");
        return G.r(sbF, str7, ")");
    }
}
