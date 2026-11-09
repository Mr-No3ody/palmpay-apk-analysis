package P5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f6990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f6991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m[] f6992c;

    /* JADX INFO: Fake field, exist only in values array */
    m EF0;

    static {
        m mVar = new m("UNSIGNED", 0);
        m mVar2 = new m("SIGNED", 1);
        f6990a = mVar2;
        m mVar3 = new m("VERIFIED", 2);
        f6991b = mVar3;
        f6992c = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f6992c.clone();
    }
}
