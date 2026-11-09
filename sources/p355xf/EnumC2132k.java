package p355xf;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2132k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2132k f43969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2132k f43970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2132k f43971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2132k[] f43972d;

    static {
        EnumC2132k enumC2132k = new EnumC2132k("SYNCHRONIZED", 0);
        f43969a = enumC2132k;
        EnumC2132k enumC2132k2 = new EnumC2132k("PUBLICATION", 1);
        f43970b = enumC2132k2;
        EnumC2132k enumC2132k3 = new EnumC2132k("NONE", 2);
        f43971c = enumC2132k3;
        EnumC2132k[] enumC2132kArr = {enumC2132k, enumC2132k2, enumC2132k3};
        f43972d = enumC2132kArr;
        b.n(enumC2132kArr);
    }

    public static EnumC2132k valueOf(String str) {
        return (EnumC2132k) Enum.valueOf(EnumC2132k.class, str);
    }

    public static EnumC2132k[] values() {
        return (EnumC2132k[]) f43972d.clone();
    }
}
