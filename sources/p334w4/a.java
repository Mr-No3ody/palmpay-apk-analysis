package p334w4;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f43258d;

    static {
        a aVar = new a("Common", 0);
        f43255a = aVar;
        a aVar2 = new a("Holo", 1);
        f43256b = aVar2;
        a aVar3 = new a("None", 2);
        f43257c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f43258d = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f43258d.clone();
    }
}
