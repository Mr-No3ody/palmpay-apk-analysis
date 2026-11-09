package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class H2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D2 f16489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E2 f16490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F2 f16491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ H2[] f16492f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I2 f16493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16494b;

    /* JADX INFO: Fake field, exist only in values array */
    H2 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    H2 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    H2 EF12;

    static {
        H2 h7 = new H2("DOUBLE", 0, I2.DOUBLE, 1);
        H2 h10 = new H2("FLOAT", 1, I2.FLOAT, 5);
        I2 i7 = I2.LONG;
        H2 h11 = new H2("INT64", 2, i7, 0);
        H2 h12 = new H2("UINT64", 3, i7, 0);
        I2 i10 = I2.INT;
        H2 h13 = new H2("INT32", 4, i10, 0);
        H2 h14 = new H2("FIXED64", 5, i7, 1);
        H2 h15 = new H2("FIXED32", 6, i10, 5);
        H2 h16 = new H2("BOOL", 7, I2.BOOLEAN, 0);
        D2 d2 = new D2("STRING", 8, I2.STRING, 2);
        f16489c = d2;
        I2 i11 = I2.MESSAGE;
        E2 e10 = new E2("GROUP", 9, i11, 3);
        f16490d = e10;
        F2 f10 = new F2("MESSAGE", 10, i11, 2);
        f16491e = f10;
        f16492f = new H2[]{h7, h10, h11, h12, h13, h14, h15, h16, d2, e10, f10, new G2("BYTES", 11, I2.BYTE_STRING, 2), new H2("UINT32", 12, i10, 0), new H2("ENUM", 13, I2.ENUM, 0), new H2("SFIXED32", 14, i10, 5), new H2("SFIXED64", 15, i7, 1), new H2("SINT32", 16, i10, 0), new H2("SINT64", 17, i7, 0)};
    }

    public H2(String str, int i7, I2 i10, int i11) {
        super(str, i7);
        this.f16493a = i10;
        this.f16494b = i11;
    }

    public static H2 valueOf(String name) {
        return (H2) Enum.valueOf(H2.class, name);
    }

    public static H2[] values() {
        return (H2[]) f16492f.clone();
    }
}
