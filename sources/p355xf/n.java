package p355xf;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f43973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f43974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f43975c;

    static {
        n nVar = new n("WARNING", 0);
        f43973a = nVar;
        n nVar2 = new n("ERROR", 1);
        f43974b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f43975c = nVarArr;
        b.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f43975c.clone();
    }
}
