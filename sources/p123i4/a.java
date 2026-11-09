package p123i4;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f37424d;

    static {
        a aVar = new a("IDLE", 0);
        f37421a = aVar;
        a aVar2 = new a("RUNNING", 1);
        f37422b = aVar2;
        a aVar3 = new a("COMPLETED", 2);
        f37423c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f37424d = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f37424d.clone();
    }
}
