package O7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0493k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0493k f6665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0493k f6666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0493k f6667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0493k[] f6668d;

    static {
        EnumC0493k enumC0493k = new EnumC0493k("INITIALIZED", 0);
        f6665a = enumC0493k;
        EnumC0493k enumC0493k2 = new EnumC0493k("START_DISPATCHED", 1);
        f6666b = enumC0493k2;
        EnumC0493k enumC0493k3 = new EnumC0493k("END_DISPATCHED", 2);
        f6667c = enumC0493k3;
        EnumC0493k[] enumC0493kArr = {enumC0493k, enumC0493k2, enumC0493k3};
        f6668d = enumC0493kArr;
        com.facebook.imagepipeline.nativecode.b.n(enumC0493kArr);
    }

    public static EnumC0493k valueOf(String str) {
        return (EnumC0493k) Enum.valueOf(EnumC0493k.class, str);
    }

    public static EnumC0493k[] values() {
        return (EnumC0493k[]) f6668d.clone();
    }
}
