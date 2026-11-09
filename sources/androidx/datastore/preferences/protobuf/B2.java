package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B2 f16442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B2 f16443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B2 f16444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B2 f16445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B2 f16446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B2 f16447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final B2 f16448g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ B2[] f16449i;

    static {
        B2 b7 = new B2("NULL_VALUE", 0);
        f16442a = b7;
        B2 b10 = new B2("NUMBER_VALUE", 1);
        f16443b = b10;
        B2 b11 = new B2("STRING_VALUE", 2);
        f16444c = b11;
        B2 b12 = new B2("BOOL_VALUE", 3);
        f16445d = b12;
        B2 b13 = new B2("STRUCT_VALUE", 4);
        f16446e = b13;
        B2 b14 = new B2("LIST_VALUE", 5);
        f16447f = b14;
        B2 b15 = new B2("KIND_NOT_SET", 6);
        f16448g = b15;
        f16449i = new B2[]{b7, b10, b11, b12, b13, b14, b15};
    }

    public static B2 valueOf(String name) {
        return (B2) Enum.valueOf(B2.class, name);
    }

    public static B2[] values() {
        return (B2[]) f16449i.clone();
    }
}
