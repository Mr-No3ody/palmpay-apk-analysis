package p064e7;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f36179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f36181e;

    static {
        a aVar = new a("LEFT_CENTER", 0);
        f36177a = aVar;
        a aVar2 = new a("RIGHT_CENTER", 1);
        f36178b = aVar2;
        a aVar3 = new a("LEFT_TOP", 2);
        f36179c = aVar3;
        a aVar4 = new a("RIGHT_TOP", 3);
        f36180d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f36181e = aVarArr;
        b.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f36181e.clone();
    }
}
