package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f5792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f5793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f5794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f5795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ I[] f5796e;

    static {
        I i7 = new I("NONE", 0);
        f5792a = i7;
        I i10 = new I("WORDS", 1);
        f5793b = i10;
        I i11 = new I("SENTENCES", 2);
        f5794c = i11;
        I i12 = new I("CHARACTERS", 3);
        f5795d = i12;
        I[] iArr = {i7, i10, i11, i12};
        f5796e = iArr;
        com.facebook.imagepipeline.nativecode.b.n(iArr);
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f5796e.clone();
    }
}
