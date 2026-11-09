package J3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f4512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f4513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f4514d;

    static {
        f fVar = new f("COMPLETED", 0);
        f4511a = fVar;
        f fVar2 = new f("CANCELED", 1);
        f4512b = fVar2;
        f fVar3 = new f("ERROR", 2);
        f4513c = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        f4514d = fVarArr;
        com.facebook.imagepipeline.nativecode.b.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f4514d.clone();
    }
}
