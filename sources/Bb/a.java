package Bb;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f581d;

    static {
        a aVar = new a("UPCOMING", 0);
        f578a = aVar;
        a aVar2 = new a("OVERDUE", 1);
        f579b = aVar2;
        a aVar3 = new a("NEAR_DUE_WITHIN_7_DAYS", 2);
        f580c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f581d = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f581d.clone();
    }
}
