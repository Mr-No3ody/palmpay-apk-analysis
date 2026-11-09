package com.gyf.immersionbar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f23252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f23253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f23254c;

    static {
        l lVar = new l("CLASSIC", 0);
        f23252a = lVar;
        l lVar2 = new l("GESTURES", 1);
        f23253b = lVar2;
        f23254c = new l[]{lVar, lVar2, new l("GESTURES_THREE_STAGE", 2), new l("DOUBLE", 3), new l(p381za.c.UNKNOWN_PROCESS_NAME, 4)};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f23254c.clone();
    }
}
