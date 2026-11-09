package com.google.firebase.sessions;

import C0.G;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "versionName", "appBuildVersion", "deviceManufacturer", "currentProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "appProcessDetails", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "getPackageName", "()Ljava/lang/String;", "getVersionName", "getAppBuildVersion", "getDeviceManufacturer", "getCurrentProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "getAppProcessDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AndroidApplicationInfo {

    @NotNull
    private final String appBuildVersion;

    @NotNull
    private final List<ProcessDetails> appProcessDetails;

    @NotNull
    private final ProcessDetails currentProcessDetails;

    @NotNull
    private final String deviceManufacturer;

    @NotNull
    private final String packageName;

    @NotNull
    private final String versionName;

    public AndroidApplicationInfo(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
        this.currentProcessDetails = currentProcessDetails;
        this.appProcessDetails = appProcessDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i7 & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        if ((i7 & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        if ((i7 & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        if ((i7 & 16) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        if ((i7 & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        ProcessDetails processDetails2 = processDetails;
        List list2 = list;
        return androidApplicationInfo.copy(str, str2, str3, str4, processDetails2, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) other;
        return Intrinsics.c(this.packageName, androidApplicationInfo.packageName) && Intrinsics.c(this.versionName, androidApplicationInfo.versionName) && Intrinsics.c(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && Intrinsics.c(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && Intrinsics.c(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && Intrinsics.c(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.appProcessDetails.hashCode() + ((this.currentProcessDetails.hashCode() + G.c(G.c(G.c(this.packageName.hashCode() * 31, 31, this.versionName), 31, this.appBuildVersion), 31, this.deviceManufacturer)) * 31);
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }
}
