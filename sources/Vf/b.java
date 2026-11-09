package Vf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f10344c;

    /* JADX INFO: Fake field, exist only in values array */
    b EF0;

    static {
        b bVar = new b("SPARSE_ARRAY", 0);
        b bVar2 = new b("HASH_MAP", 1);
        f10343b = bVar2;
        b[] bVarArr = {bVar, bVar2, new b("NO_CACHE", 2)};
        f10344c = bVarArr;
        com.facebook.imagepipeline.nativecode.b.n(bVarArr);
        new a(null);
        f10342a = bVar2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10344c.clone();
    }
}
