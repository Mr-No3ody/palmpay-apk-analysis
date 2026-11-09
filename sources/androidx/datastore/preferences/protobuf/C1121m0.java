package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1121m0 extends AbstractC1145u1 implements DescriptorProtos$FieldOptions$EditionDefaultOrBuilder {
    private static final C1121m0 DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 3;
    private static volatile Parser<C1121m0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int edition_;
    private String value_ = "";

    static {
        C1121m0 c1121m0 = new C1121m0();
        DEFAULT_INSTANCE = c1121m0;
        AbstractC1145u1.l(C1121m0.class, c1121m0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1145u1
    public final Object d(int i7, AbstractC1145u1 abstractC1145u1) {
        Parser c1136r1;
        switch (androidx.camera.camera2.internal.F.i(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003᠌\u0000", new Object[]{"bitField0_", "value_", "edition_", D.f16450b});
            case 3:
                return new C1121m0();
            case 4:
                return new C1118l0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1121m0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1121m0.class) {
                    try {
                        c1136r1 = PARSER;
                        if (c1136r1 == null) {
                            c1136r1 = new C1136r1(DEFAULT_INSTANCE);
                            PARSER = c1136r1;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1136r1;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final E getEdition() {
        E eA = E.a(this.edition_);
        return eA == null ? E.EDITION_UNKNOWN : eA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final String getValue() {
        return this.value_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final AbstractC1123n getValueBytes() {
        return AbstractC1123n.d(this.value_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final boolean hasEdition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$EditionDefaultOrBuilder
    public final boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }
}
