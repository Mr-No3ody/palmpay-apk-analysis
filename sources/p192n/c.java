package p192n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f39800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f39801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f39802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f39803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f39804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f39805f;

    static {
        c cVar = new c("LIBRARY", 0);
        f39800a = cVar;
        c cVar2 = new c("LIBRARY_GROUP", 1);
        f39801b = cVar2;
        c cVar3 = new c("LIBRARY_GROUP_PREFIX", 2);
        f39802c = cVar3;
        c cVar4 = new c("GROUP_ID", 3);
        c cVar5 = new c("TESTS", 4);
        f39803d = cVar5;
        c cVar6 = new c("SUBCLASSES", 5);
        f39804e = cVar6;
        f39805f = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f39805f.clone();
    }
}
