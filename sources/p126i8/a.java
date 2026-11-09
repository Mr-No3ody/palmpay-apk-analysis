package p126i8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f37431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f37432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f37433f;

    static {
        a aVar = new a("LevelDebug", 0);
        f37428a = aVar;
        a aVar2 = new a("LevelInfo", 1);
        f37429b = aVar2;
        a aVar3 = new a("LevelWarning", 2);
        f37430c = aVar3;
        a aVar4 = new a("LevelError", 3);
        f37431d = aVar4;
        a aVar5 = new a("LevelNone", 4);
        f37432e = aVar5;
        f37433f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String name) {
        return (a) Enum.valueOf(a.class, name);
    }

    public static a[] values() {
        return (a[]) f37433f.clone();
    }
}
