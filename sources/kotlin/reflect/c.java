package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f38986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f38987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f38988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f38989d;

    static {
        c cVar = new c("INVARIANT", 0);
        f38986a = cVar;
        c cVar2 = new c("IN", 1);
        f38987b = cVar2;
        c cVar3 = new c("OUT", 2);
        f38988c = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f38989d = cVarArr;
        com.facebook.imagepipeline.nativecode.b.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f38989d.clone();
    }
}
