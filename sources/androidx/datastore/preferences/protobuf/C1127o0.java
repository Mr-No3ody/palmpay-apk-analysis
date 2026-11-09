package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1127o0 extends AbstractC1145u1 implements DescriptorProtos$FieldOptions$FeatureSupportOrBuilder {
    private static final C1127o0 DEFAULT_INSTANCE;
    public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
    public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
    public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
    public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
    private static volatile Parser<C1127o0> PARSER;
    private int bitField0_;
    private String deprecationWarning_ = "";
    private int editionDeprecated_;
    private int editionIntroduced_;
    private int editionRemoved_;

    static {
        C1127o0 c1127o0 = new C1127o0();
        DEFAULT_INSTANCE = c1127o0;
        AbstractC1145u1.l(C1127o0.class, c1127o0);
    }

    public static C1127o0 n() {
        return DEFAULT_INSTANCE;
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
                D d2 = D.f16450b;
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "editionIntroduced_", d2, "editionDeprecated_", d2, "deprecationWarning_", "editionRemoved_", d2});
            case 3:
                return new C1127o0();
            case 4:
                return new C1124n0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1127o0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1127o0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final String getDeprecationWarning() {
        return this.deprecationWarning_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final AbstractC1123n getDeprecationWarningBytes() {
        return AbstractC1123n.d(this.deprecationWarning_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final E getEditionDeprecated() {
        E eA = E.a(this.editionDeprecated_);
        return eA == null ? E.EDITION_UNKNOWN : eA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final E getEditionIntroduced() {
        E eA = E.a(this.editionIntroduced_);
        return eA == null ? E.EDITION_UNKNOWN : eA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final E getEditionRemoved() {
        E eA = E.a(this.editionRemoved_);
        return eA == null ? E.EDITION_UNKNOWN : eA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final boolean hasDeprecationWarning() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final boolean hasEditionDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final boolean hasEditionIntroduced() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$FeatureSupportOrBuilder
    public final boolean hasEditionRemoved() {
        return (this.bitField0_ & 8) != 0;
    }
}
