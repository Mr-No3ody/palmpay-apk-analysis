package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d[] f38990a;

    /* JADX INFO: Fake field, exist only in values array */
    d EF5;

    static {
        d[] dVarArr = {new d("PUBLIC", 0), new d("PROTECTED", 1), new d("INTERNAL", 2), new d("PRIVATE", 3)};
        f38990a = dVarArr;
        com.facebook.imagepipeline.nativecode.b.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f38990a.clone();
    }
}
