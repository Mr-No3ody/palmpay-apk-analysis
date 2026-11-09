package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1083c0 extends AbstractC1142t1 implements DescriptorProtos$FeatureSetOrBuilder {
    private static final C1083c0 DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 2;
    public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
    public static final int JSON_FORMAT_FIELD_NUMBER = 6;
    public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
    private static volatile Parser<C1083c0> PARSER = null;
    public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
    private int bitField0_;
    private int enumType_;
    private int fieldPresence_;
    private int jsonFormat_;
    private byte memoizedIsInitialized = 2;
    private int messageEncoding_;
    private int repeatedFieldEncoding_;
    private int utf8Validation_;

    static {
        C1083c0 c1083c0 = new C1083c0();
        DEFAULT_INSTANCE = c1083c0;
        AbstractC1145u1.l(C1083c0.class, c1083c0);
    }

    public static C1083c0 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1145u1
    public final Object d(int i7, AbstractC1145u1 abstractC1145u1) {
        Parser c1136r1;
        switch (androidx.camera.camera2.internal.F.i(i7)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (abstractC1145u1 == null ? 0 : 1);
                return null;
            case 2:
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"bitField0_", "fieldPresence_", D.f16453e, "enumType_", D.f16452d, "repeatedFieldEncoding_", D.f16456h, "utf8Validation_", D.f16457i, "messageEncoding_", D.f16455g, "jsonFormat_", D.f16454f});
            case 3:
                return new C1083c0();
            case 4:
                return new V(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1083c0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1083c0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final W getEnumType() {
        W wA = W.a(this.enumType_);
        return wA == null ? W.ENUM_TYPE_UNKNOWN : wA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final X getFieldPresence() {
        X xA = X.a(this.fieldPresence_);
        return xA == null ? X.FIELD_PRESENCE_UNKNOWN : xA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final Y getJsonFormat() {
        Y yA = Y.a(this.jsonFormat_);
        return yA == null ? Y.JSON_FORMAT_UNKNOWN : yA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final Z getMessageEncoding() {
        Z zA = Z.a(this.messageEncoding_);
        return zA == null ? Z.MESSAGE_ENCODING_UNKNOWN : zA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final EnumC1075a0 getRepeatedFieldEncoding() {
        EnumC1075a0 enumC1075a0A = EnumC1075a0.a(this.repeatedFieldEncoding_);
        return enumC1075a0A == null ? EnumC1075a0.REPEATED_FIELD_ENCODING_UNKNOWN : enumC1075a0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final EnumC1079b0 getUtf8Validation() {
        EnumC1079b0 enumC1079b0A = EnumC1079b0.a(this.utf8Validation_);
        return enumC1079b0A == null ? EnumC1079b0.UTF8_VALIDATION_UNKNOWN : enumC1079b0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final boolean hasEnumType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final boolean hasFieldPresence() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final boolean hasJsonFormat() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final boolean hasMessageEncoding() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final boolean hasRepeatedFieldEncoding() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetOrBuilder
    public final boolean hasUtf8Validation() {
        return (this.bitField0_ & 8) != 0;
    }
}
