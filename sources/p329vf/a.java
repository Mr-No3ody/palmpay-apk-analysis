package p329vf;

import p381za.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f43210d;

    static {
        a aVar = new a("ALWAYS", 0);
        f43207a = aVar;
        a aVar2 = new a(c.UNKNOWN_PROCESS_NAME, 1);
        f43208b = aVar2;
        a aVar3 = new a("MAYBE", 2);
        f43209c = aVar3;
        f43210d = new a[]{aVar, aVar2, aVar3, new a("NEVER", 3)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f43210d.clone();
    }
}
