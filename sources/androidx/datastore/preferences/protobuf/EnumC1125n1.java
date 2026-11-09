package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1125n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1125n1 f16702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1125n1 f16703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1125n1[] f16704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Type[] f16705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1125n1[] f16706f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16707a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1125n1 EF0;

    static {
        B1 b7 = B1.DOUBLE;
        EnumC1125n1 enumC1125n1 = new EnumC1125n1("DOUBLE", 0, 0, 1, b7);
        B1 b10 = B1.FLOAT;
        EnumC1125n1 enumC1125n2 = new EnumC1125n1("FLOAT", 1, 1, 1, b10);
        B1 b11 = B1.LONG;
        EnumC1125n1 enumC1125n3 = new EnumC1125n1("INT64", 2, 2, 1, b11);
        EnumC1125n1 enumC1125n4 = new EnumC1125n1("UINT64", 3, 3, 1, b11);
        B1 b12 = B1.INT;
        EnumC1125n1 enumC1125n5 = new EnumC1125n1("INT32", 4, 4, 1, b12);
        EnumC1125n1 enumC1125n6 = new EnumC1125n1("FIXED64", 5, 5, 1, b11);
        EnumC1125n1 enumC1125n7 = new EnumC1125n1("FIXED32", 6, 6, 1, b12);
        B1 b13 = B1.BOOLEAN;
        EnumC1125n1 enumC1125n8 = new EnumC1125n1("BOOL", 7, 7, 1, b13);
        B1 b14 = B1.STRING;
        EnumC1125n1 enumC1125n9 = new EnumC1125n1("STRING", 8, 8, 1, b14);
        B1 b15 = B1.MESSAGE;
        EnumC1125n1 enumC1125n10 = new EnumC1125n1("MESSAGE", 9, 9, 1, b15);
        B1 b16 = B1.BYTE_STRING;
        EnumC1125n1 enumC1125n11 = new EnumC1125n1("BYTES", 10, 10, 1, b16);
        EnumC1125n1 enumC1125n12 = new EnumC1125n1("UINT32", 11, 11, 1, b12);
        B1 b17 = B1.ENUM;
        EnumC1125n1 enumC1125n13 = new EnumC1125n1("ENUM", 12, 12, 1, b17);
        EnumC1125n1 enumC1125n14 = new EnumC1125n1("SFIXED32", 13, 13, 1, b12);
        EnumC1125n1 enumC1125n15 = new EnumC1125n1("SFIXED64", 14, 14, 1, b11);
        EnumC1125n1 enumC1125n16 = new EnumC1125n1("SINT32", 15, 15, 1, b12);
        EnumC1125n1 enumC1125n17 = new EnumC1125n1("SINT64", 16, 16, 1, b11);
        EnumC1125n1 enumC1125n18 = new EnumC1125n1("GROUP", 17, 17, 1, b15);
        EnumC1125n1 enumC1125n19 = new EnumC1125n1("DOUBLE_LIST", 18, 18, 2, b7);
        EnumC1125n1 enumC1125n20 = new EnumC1125n1("FLOAT_LIST", 19, 19, 2, b10);
        EnumC1125n1 enumC1125n21 = new EnumC1125n1("INT64_LIST", 20, 20, 2, b11);
        EnumC1125n1 enumC1125n22 = new EnumC1125n1("UINT64_LIST", 21, 21, 2, b11);
        EnumC1125n1 enumC1125n23 = new EnumC1125n1("INT32_LIST", 22, 22, 2, b12);
        EnumC1125n1 enumC1125n24 = new EnumC1125n1("FIXED64_LIST", 23, 23, 2, b11);
        EnumC1125n1 enumC1125n25 = new EnumC1125n1("FIXED32_LIST", 24, 24, 2, b12);
        EnumC1125n1 enumC1125n26 = new EnumC1125n1("BOOL_LIST", 25, 25, 2, b13);
        EnumC1125n1 enumC1125n27 = new EnumC1125n1("STRING_LIST", 26, 26, 2, b14);
        EnumC1125n1 enumC1125n28 = new EnumC1125n1("MESSAGE_LIST", 27, 27, 2, b15);
        EnumC1125n1 enumC1125n29 = new EnumC1125n1("BYTES_LIST", 28, 28, 2, b16);
        EnumC1125n1 enumC1125n30 = new EnumC1125n1("UINT32_LIST", 29, 29, 2, b12);
        EnumC1125n1 enumC1125n31 = new EnumC1125n1("ENUM_LIST", 30, 30, 2, b17);
        EnumC1125n1 enumC1125n32 = new EnumC1125n1("SFIXED32_LIST", 31, 31, 2, b12);
        EnumC1125n1 enumC1125n33 = new EnumC1125n1("SFIXED64_LIST", 32, 32, 2, b11);
        EnumC1125n1 enumC1125n34 = new EnumC1125n1("SINT32_LIST", 33, 33, 2, b12);
        EnumC1125n1 enumC1125n35 = new EnumC1125n1("SINT64_LIST", 34, 34, 2, b11);
        EnumC1125n1 enumC1125n36 = new EnumC1125n1("DOUBLE_LIST_PACKED", 35, 35, 3, b7);
        f16702b = enumC1125n36;
        EnumC1125n1 enumC1125n37 = new EnumC1125n1("FLOAT_LIST_PACKED", 36, 36, 3, b10);
        EnumC1125n1 enumC1125n38 = new EnumC1125n1("INT64_LIST_PACKED", 37, 37, 3, b11);
        EnumC1125n1 enumC1125n39 = new EnumC1125n1("UINT64_LIST_PACKED", 38, 38, 3, b11);
        EnumC1125n1 enumC1125n40 = new EnumC1125n1("INT32_LIST_PACKED", 39, 39, 3, b12);
        EnumC1125n1 enumC1125n41 = new EnumC1125n1("FIXED64_LIST_PACKED", 40, 40, 3, b11);
        EnumC1125n1 enumC1125n42 = new EnumC1125n1("FIXED32_LIST_PACKED", 41, 41, 3, b12);
        EnumC1125n1 enumC1125n43 = new EnumC1125n1("BOOL_LIST_PACKED", 42, 42, 3, b13);
        EnumC1125n1 enumC1125n44 = new EnumC1125n1("UINT32_LIST_PACKED", 43, 43, 3, b12);
        EnumC1125n1 enumC1125n45 = new EnumC1125n1("ENUM_LIST_PACKED", 44, 44, 3, b17);
        EnumC1125n1 enumC1125n46 = new EnumC1125n1("SFIXED32_LIST_PACKED", 45, 45, 3, b12);
        EnumC1125n1 enumC1125n47 = new EnumC1125n1("SFIXED64_LIST_PACKED", 46, 46, 3, b11);
        EnumC1125n1 enumC1125n48 = new EnumC1125n1("SINT32_LIST_PACKED", 47, 47, 3, b12);
        EnumC1125n1 enumC1125n49 = new EnumC1125n1("SINT64_LIST_PACKED", 48, 48, 3, b11);
        f16703c = enumC1125n49;
        f16706f = new EnumC1125n1[]{enumC1125n1, enumC1125n2, enumC1125n3, enumC1125n4, enumC1125n5, enumC1125n6, enumC1125n7, enumC1125n8, enumC1125n9, enumC1125n10, enumC1125n11, enumC1125n12, enumC1125n13, enumC1125n14, enumC1125n15, enumC1125n16, enumC1125n17, enumC1125n18, enumC1125n19, enumC1125n20, enumC1125n21, enumC1125n22, enumC1125n23, enumC1125n24, enumC1125n25, enumC1125n26, enumC1125n27, enumC1125n28, enumC1125n29, enumC1125n30, enumC1125n31, enumC1125n32, enumC1125n33, enumC1125n34, enumC1125n35, enumC1125n36, enumC1125n37, enumC1125n38, enumC1125n39, enumC1125n40, enumC1125n41, enumC1125n42, enumC1125n43, enumC1125n44, enumC1125n45, enumC1125n46, enumC1125n47, enumC1125n48, enumC1125n49, new EnumC1125n1("GROUP_LIST", 49, 49, 2, b15), new EnumC1125n1("MAP", 50, 50, 4, B1.VOID)};
        f16705e = new Type[0];
        EnumC1125n1[] enumC1125n1ArrValues = values();
        f16704d = new EnumC1125n1[enumC1125n1ArrValues.length];
        for (EnumC1125n1 enumC1125n50 : enumC1125n1ArrValues) {
            f16704d[enumC1125n50.f16707a] = enumC1125n50;
        }
    }

    public EnumC1125n1(String str, int i7, int i10, int i11, B1 b7) {
        super(str, i7);
        this.f16707a = i10;
        int i12 = androidx.camera.camera2.internal.F.i(i11);
        if (i12 == 1 || i12 == 3) {
            b7.getClass();
        }
        if (i11 == 1) {
            b7.ordinal();
        }
    }

    public static EnumC1125n1 valueOf(String name) {
        return (EnumC1125n1) Enum.valueOf(EnumC1125n1.class, name);
    }

    public static EnumC1125n1[] values() {
        return (EnumC1125n1[]) f16706f.clone();
    }
}
