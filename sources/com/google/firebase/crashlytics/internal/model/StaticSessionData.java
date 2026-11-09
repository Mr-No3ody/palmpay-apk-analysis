package com.google.firebase.crashlytics.internal.model;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class StaticSessionData {

    @AutoValue
    public static abstract class AppData {
        public static AppData create(String str, String str2, String str3, String str4, int i7, DevelopmentPlatformProvider developmentPlatformProvider) {
            return new AutoValue_StaticSessionData_AppData(str, str2, str3, str4, i7, developmentPlatformProvider);
        }

        public abstract String appIdentifier();

        public abstract int deliveryMechanism();

        public abstract DevelopmentPlatformProvider developmentPlatformProvider();

        public abstract String installUuid();

        public abstract String versionCode();

        public abstract String versionName();
    }

    @AutoValue
    public static abstract class DeviceData {
        public static DeviceData create(int i7, String str, int i10, long j6, long j10, boolean z3, int i11, String str2, String str3) {
            return new AutoValue_StaticSessionData_DeviceData(i7, str, i10, j6, j10, z3, i11, str2, str3);
        }

        public abstract int arch();

        public abstract int availableProcessors();

        public abstract long diskSpace();

        public abstract boolean isEmulator();

        public abstract String manufacturer();

        public abstract String model();

        public abstract String modelClass();

        public abstract int state();

        public abstract long totalRam();
    }

    @AutoValue
    public static abstract class OsData {
        public static OsData create(String str, String str2, boolean z3) {
            return new AutoValue_StaticSessionData_OsData(str, str2, z3);
        }

        public abstract boolean isRooted();

        public abstract String osCodeName();

        public abstract String osRelease();
    }

    public static StaticSessionData create(AppData appData, OsData osData, DeviceData deviceData) {
        return new AutoValue_StaticSessionData(appData, osData, deviceData);
    }

    public abstract AppData appData();

    public abstract DeviceData deviceData();

    public abstract OsData osData();
}
