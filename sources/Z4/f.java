package Z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f11518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f11519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f11520d;

    static {
        f fVar = new f("IGNORE_SELF", 0);
        f11517a = fVar;
        f fVar2 = new f("IGNORE_CHILD", 1);
        f11518b = fVar2;
        f fVar3 = new f("IGNORE_ALL", 2);
        f11519c = fVar3;
        f11520d = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String name) {
        return (f) Enum.valueOf(f.class, name);
    }

    public static f[] values() {
        return (f[]) f11520d.clone();
    }
}
