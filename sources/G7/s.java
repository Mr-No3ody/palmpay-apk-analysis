package G7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f3138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f3139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f3140c;

    static {
        s sVar = new s("START", 0);
        f3138a = sVar;
        s sVar2 = new s("END", 1);
        f3139b = sVar2;
        f3140c = new s[]{sVar, sVar2, new s("TOP", 2), new s("BOTTOM", 3)};
        new r(null);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f3140c.clone();
    }
}
