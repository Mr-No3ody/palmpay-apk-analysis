package Y7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f11313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f11314d;

    static {
        c cVar = new c("ALL", 0);
        f11311a = cVar;
        c cVar2 = new c("SYSTEM", 1);
        f11312b = cVar2;
        c cVar3 = new c("INTERFACE", 2);
        f11313c = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f11314d = cVarArr;
        com.facebook.imagepipeline.nativecode.b.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f11314d.clone();
    }
}
