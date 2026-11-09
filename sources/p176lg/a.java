package p176lg;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f39368b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("NONE", 0);
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        f39367a = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f39368b = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f39368b.clone();
    }
}
