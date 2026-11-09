package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: M7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0454n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0454n f5825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0454n f5826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0454n f5827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0454n[] f5828d;

    static {
        EnumC0454n enumC0454n = new EnumC0454n("INACTIVE", 0);
        f5825a = enumC0454n;
        EnumC0454n enumC0454n2 = new EnumC0454n("TRANSITIONING_OR_BELOW_TOP", 1);
        f5826b = enumC0454n2;
        EnumC0454n enumC0454n3 = new EnumC0454n("ON_TOP", 2);
        f5827c = enumC0454n3;
        EnumC0454n[] enumC0454nArr = {enumC0454n, enumC0454n2, enumC0454n3};
        f5828d = enumC0454nArr;
        com.facebook.imagepipeline.nativecode.b.n(enumC0454nArr);
    }

    public static EnumC0454n valueOf(String str) {
        return (EnumC0454n) Enum.valueOf(EnumC0454n.class, str);
    }

    public static EnumC0454n[] values() {
        return (EnumC0454n[]) f5828d.clone();
    }
}
