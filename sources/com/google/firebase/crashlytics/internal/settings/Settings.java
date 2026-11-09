package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes2.dex */
public class Settings {
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final FeatureFlagData featureFlagData;
    public final double onDemandBackoffBase;
    public final int onDemandBackoffStepDurationSeconds;
    public final double onDemandUploadRatePerMinute;
    public final SessionData sessionData;
    public final int settingsVersion;

    public static class FeatureFlagData {
        public final boolean collectAnrs;
        public final boolean collectBuildIds;
        public final boolean collectReports;

        public FeatureFlagData(boolean z3, boolean z8, boolean z10) {
            this.collectReports = z3;
            this.collectAnrs = z8;
            this.collectBuildIds = z10;
        }
    }

    public static class SessionData {
        public final int maxCompleteSessionsCount;
        public final int maxCustomExceptionEvents;

        public SessionData(int i7, int i10) {
            this.maxCustomExceptionEvents = i7;
            this.maxCompleteSessionsCount = i10;
        }
    }

    public Settings(long j6, SessionData sessionData, FeatureFlagData featureFlagData, int i7, int i10, double d2, double d10, int i11) {
        this.expiresAtMillis = j6;
        this.sessionData = sessionData;
        this.featureFlagData = featureFlagData;
        this.settingsVersion = i7;
        this.cacheDuration = i10;
        this.onDemandUploadRatePerMinute = d2;
        this.onDemandBackoffBase = d10;
        this.onDemandBackoffStepDurationSeconds = i11;
    }

    public boolean isExpired(long j6) {
        return this.expiresAtMillis < j6;
    }
}
