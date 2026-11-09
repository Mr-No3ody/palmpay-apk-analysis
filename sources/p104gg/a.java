package p104gg;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f37246b;

    static {
        a aVar = new a("ALWAYS", 0);
        f37245a = aVar;
        a[] aVarArr = {aVar, new a("NEVER", 1)};
        f37246b = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f37246b.clone();
    }
}
