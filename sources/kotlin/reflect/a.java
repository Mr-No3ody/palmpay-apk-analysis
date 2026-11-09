package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f38984a;

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    static {
        a[] aVarArr = {new a("INSTANCE", 0), new a("EXTENSION_RECEIVER", 1), new a("VALUE", 2)};
        f38984a = aVarArr;
        com.facebook.imagepipeline.nativecode.b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f38984a.clone();
    }
}
