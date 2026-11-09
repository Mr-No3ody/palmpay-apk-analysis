package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: M7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0455o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0455o f5829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0455o f5830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0455o[] f5831c;

    static {
        EnumC0455o enumC0455o = new EnumC0455o("PUSH", 0);
        f5829a = enumC0455o;
        EnumC0455o enumC0455o2 = new EnumC0455o("POP", 1);
        f5830b = enumC0455o2;
        EnumC0455o[] enumC0455oArr = {enumC0455o, enumC0455o2};
        f5831c = enumC0455oArr;
        com.facebook.imagepipeline.nativecode.b.n(enumC0455oArr);
    }

    public static EnumC0455o valueOf(String str) {
        return (EnumC0455o) Enum.valueOf(EnumC0455o.class, str);
    }

    public static EnumC0455o[] values() {
        return (EnumC0455o[]) f5831c.clone();
    }
}
