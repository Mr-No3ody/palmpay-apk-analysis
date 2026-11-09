package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public class ReferrerDetails {
    public Boolean googlePlayInstant;
    public long installBeginTimestampSeconds;
    public long installBeginTimestampServerSeconds;
    public String installReferrer;
    public String installVersion;
    public Boolean isClick;
    public long referrerClickTimestampSeconds;
    public long referrerClickTimestampServerSeconds;

    public ReferrerDetails(String str, long j6, long j10, long j11, long j12, String str2, Boolean bool, Boolean bool2) {
        this.installReferrer = str;
        this.referrerClickTimestampSeconds = j6;
        this.installBeginTimestampSeconds = j10;
        this.referrerClickTimestampServerSeconds = j11;
        this.installBeginTimestampServerSeconds = j12;
        this.installVersion = str2;
        this.googlePlayInstant = bool;
        this.isClick = bool2;
    }

    public String toString() {
        return Util.formatString(" installReferrer : %s referrerClickTimestampSeconds : %d installBeginTimestampSeconds : %d referrerClickTimestampServerSeconds : %d installBeginTimestampServerSeconds : %d installVersion : %s googlePlayInstant : %s isClick: %s", this.installReferrer, Long.valueOf(this.referrerClickTimestampSeconds), Long.valueOf(this.installBeginTimestampSeconds), Long.valueOf(this.referrerClickTimestampServerSeconds), Long.valueOf(this.installBeginTimestampServerSeconds), this.installVersion, this.googlePlayInstant, this.isClick);
    }

    public ReferrerDetails(String str, long j6, long j10) {
        this(str, j6, j10, -1L, -1L, null, null, null);
    }

    public ReferrerDetails(String str, long j6, Boolean bool) {
        this(str, j6, -1L, -1L, -1L, null, null, bool);
    }
}
