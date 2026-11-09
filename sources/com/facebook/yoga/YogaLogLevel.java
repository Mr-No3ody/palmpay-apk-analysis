package com.facebook.yoga;

import C0.G;
import com.facebook.yoga.annotations.DoNotStrip;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public final class YogaLogLevel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final YogaLogLevel f21906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final YogaLogLevel f21907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final YogaLogLevel f21908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final YogaLogLevel f21909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final YogaLogLevel f21910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final YogaLogLevel f21911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ YogaLogLevel[] f21912g;

    static {
        YogaLogLevel yogaLogLevel = new YogaLogLevel("ERROR", 0);
        f21906a = yogaLogLevel;
        YogaLogLevel yogaLogLevel2 = new YogaLogLevel("WARN", 1);
        f21907b = yogaLogLevel2;
        YogaLogLevel yogaLogLevel3 = new YogaLogLevel("INFO", 2);
        f21908c = yogaLogLevel3;
        YogaLogLevel yogaLogLevel4 = new YogaLogLevel("DEBUG", 3);
        f21909d = yogaLogLevel4;
        YogaLogLevel yogaLogLevel5 = new YogaLogLevel("VERBOSE", 4);
        f21910e = yogaLogLevel5;
        YogaLogLevel yogaLogLevel6 = new YogaLogLevel("FATAL", 5);
        f21911f = yogaLogLevel6;
        f21912g = new YogaLogLevel[]{yogaLogLevel, yogaLogLevel2, yogaLogLevel3, yogaLogLevel4, yogaLogLevel5, yogaLogLevel6};
    }

    @DoNotStrip
    public static YogaLogLevel fromInt(int i7) {
        if (i7 == 0) {
            return f21906a;
        }
        if (i7 == 1) {
            return f21907b;
        }
        if (i7 == 2) {
            return f21908c;
        }
        if (i7 == 3) {
            return f21909d;
        }
        if (i7 == 4) {
            return f21910e;
        }
        if (i7 == 5) {
            return f21911f;
        }
        throw new IllegalArgumentException(G.m(i7, "Unknown enum value: "));
    }

    public static YogaLogLevel valueOf(String str) {
        return (YogaLogLevel) Enum.valueOf(YogaLogLevel.class, str);
    }

    public static YogaLogLevel[] values() {
        return (YogaLogLevel[]) f21912g.clone();
    }
}
