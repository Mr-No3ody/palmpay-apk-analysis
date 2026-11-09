package p140j8;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f38344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f38345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f38346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f38347d;

    static {
        g gVar = new g("OFF", 0);
        f38344a = gVar;
        g gVar2 = new g("ADDITIVE", 1);
        f38345b = gVar2;
        g gVar3 = new g("MAXIMUM", 2);
        f38346c = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        f38347d = gVarArr;
        b.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f38347d.clone();
    }
}
