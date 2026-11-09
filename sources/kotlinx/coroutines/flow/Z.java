package kotlinx.coroutines.flow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z f39128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z f39129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z f39130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Z[] f39131d;

    static {
        Z z3 = new Z("START", 0);
        f39128a = z3;
        Z z8 = new Z("STOP", 1);
        f39129b = z8;
        Z z10 = new Z("STOP_AND_RESET_REPLAY_CACHE", 2);
        f39130c = z10;
        Z[] zArr = {z3, z8, z10};
        f39131d = zArr;
        com.facebook.imagepipeline.nativecode.b.n(zArr);
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) f39131d.clone();
    }
}
