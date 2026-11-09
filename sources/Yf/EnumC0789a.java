package Yf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0789a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0789a f11390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0789a f11391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0789a f11392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0789a[] f11393d;

    static {
        EnumC0789a enumC0789a = new EnumC0789a("SUSPEND", 0);
        f11390a = enumC0789a;
        EnumC0789a enumC0789a2 = new EnumC0789a("DROP_OLDEST", 1);
        f11391b = enumC0789a2;
        EnumC0789a enumC0789a3 = new EnumC0789a("DROP_LATEST", 2);
        f11392c = enumC0789a3;
        EnumC0789a[] enumC0789aArr = {enumC0789a, enumC0789a2, enumC0789a3};
        f11393d = enumC0789aArr;
        com.facebook.imagepipeline.nativecode.b.n(enumC0789aArr);
    }

    public static EnumC0789a valueOf(String str) {
        return (EnumC0789a) Enum.valueOf(EnumC0789a.class, str);
    }

    public static EnumC0789a[] values() {
        return (EnumC0789a[]) f11393d.clone();
    }
}
