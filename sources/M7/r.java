package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f5847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f5848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f5849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f5850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r[] f5851e;

    static {
        r rVar = new r("ORIENTATION", 0);
        f5847a = rVar;
        r rVar2 = new r("STYLE", 1);
        f5848b = rVar2;
        r rVar3 = new r("HIDDEN", 2);
        f5849c = rVar3;
        r rVar4 = new r("ANIMATED", 3);
        r rVar5 = new r("NAVIGATION_BAR_HIDDEN", 4);
        f5850d = rVar5;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5};
        f5851e = rVarArr;
        com.facebook.imagepipeline.nativecode.b.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f5851e.clone();
    }
}
