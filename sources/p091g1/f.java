package p091g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f36835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f36836b;

    /* JADX INFO: Fake field, exist only in values array */
    f EF0;

    static {
        f fVar = new f("VERY_HIGH", 0);
        f fVar2 = new f("HIGH", 1);
        f fVar3 = new f("MEDIUM", 2);
        f fVar4 = new f("LOW", 3);
        f36835a = fVar4;
        f36836b = new f[]{fVar, fVar2, fVar3, fVar4, new f("VERY_LOW", 4)};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f36836b.clone();
    }
}
