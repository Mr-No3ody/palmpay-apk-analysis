package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f5856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f5857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f5858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f5859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f5860e;

    static {
        v vVar = new v("DID_APPEAR", 0);
        f5856a = vVar;
        v vVar2 = new v("WILL_APPEAR", 1);
        f5857b = vVar2;
        v vVar3 = new v("DID_DISAPPEAR", 2);
        f5858c = vVar3;
        v vVar4 = new v("WILL_DISAPPEAR", 3);
        f5859d = vVar4;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
        f5860e = vVarArr;
        com.facebook.imagepipeline.nativecode.b.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f5860e.clone();
    }
}
