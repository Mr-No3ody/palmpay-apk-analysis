package p371yf;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f44344d;

    static {
        a aVar = new a("SOURCE", 0);
        f44341a = aVar;
        a aVar2 = new a("BINARY", 1);
        f44342b = aVar2;
        a aVar3 = new a("RUNTIME", 2);
        f44343c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f44344d = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f44344d.clone();
    }
}
