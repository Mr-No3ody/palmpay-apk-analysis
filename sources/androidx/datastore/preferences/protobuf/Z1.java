package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z1 f16570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z1 f16571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z1 f16572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Z1[] f16573d;

    static {
        Z1 z3 = new Z1("PROTO2", 0);
        f16570a = z3;
        Z1 z8 = new Z1("PROTO3", 1);
        f16571b = z8;
        Z1 z10 = new Z1("EDITIONS", 2);
        f16572c = z10;
        f16573d = new Z1[]{z3, z8, z10};
    }

    public static Z1 valueOf(String name) {
        return (Z1) Enum.valueOf(Z1.class, name);
    }

    public static Z1[] values() {
        return (Z1[]) f16573d.clone();
    }
}
