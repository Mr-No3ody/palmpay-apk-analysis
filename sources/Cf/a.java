package Cf;

import com.facebook.imagepipeline.nativecode.b;
import p381za.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f1551a;

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    static {
        a[] aVarArr = {new a("AT_MOST_ONCE", 0), new a("AT_LEAST_ONCE", 1), new a("EXACTLY_ONCE", 2), new a(c.UNKNOWN_PROCESS_NAME, 3)};
        f1551a = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1551a.clone();
    }
}
