package Lf;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f5661a;

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    static {
        a[] aVarArr = {new a("CONTINUE", 0), new a("SKIP_SUBTREE", 1), new a("TERMINATE", 2)};
        f5661a = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5661a.clone();
    }
}
