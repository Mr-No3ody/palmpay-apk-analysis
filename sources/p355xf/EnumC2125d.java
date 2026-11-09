package p355xf;

import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2125d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2125d f43962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2125d f43963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2125d f43964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2125d[] f43965d;

    static {
        EnumC2125d enumC2125d = new EnumC2125d("WARNING", 0);
        f43962a = enumC2125d;
        EnumC2125d enumC2125d2 = new EnumC2125d("ERROR", 1);
        f43963b = enumC2125d2;
        EnumC2125d enumC2125d3 = new EnumC2125d("HIDDEN", 2);
        f43964c = enumC2125d3;
        EnumC2125d[] enumC2125dArr = {enumC2125d, enumC2125d2, enumC2125d3};
        f43965d = enumC2125dArr;
        b.n(enumC2125dArr);
    }

    public static EnumC2125d valueOf(String str) {
        return (EnumC2125d) Enum.valueOf(EnumC2125d.class, str);
    }

    public static EnumC2125d[] values() {
        return (EnumC2125d[]) f43965d.clone();
    }
}
