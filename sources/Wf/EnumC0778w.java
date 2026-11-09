package Wf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Wf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0778w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0778w f10900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0778w f10901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0778w f10902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0778w f10903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0778w[] f10904e;

    static {
        EnumC0778w enumC0778w = new EnumC0778w("DEFAULT", 0);
        f10900a = enumC0778w;
        EnumC0778w enumC0778w2 = new EnumC0778w("LAZY", 1);
        f10901b = enumC0778w2;
        EnumC0778w enumC0778w3 = new EnumC0778w("ATOMIC", 2);
        f10902c = enumC0778w3;
        EnumC0778w enumC0778w4 = new EnumC0778w("UNDISPATCHED", 3);
        f10903d = enumC0778w4;
        EnumC0778w[] enumC0778wArr = {enumC0778w, enumC0778w2, enumC0778w3, enumC0778w4};
        f10904e = enumC0778wArr;
        com.facebook.imagepipeline.nativecode.b.n(enumC0778wArr);
    }

    public static EnumC0778w valueOf(String str) {
        return (EnumC0778w) Enum.valueOf(EnumC0778w.class, str);
    }

    public static EnumC0778w[] values() {
        return (EnumC0778w[]) f10904e.clone();
    }
}
