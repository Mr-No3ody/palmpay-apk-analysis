package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends AbstractC1142t1 implements DescriptorProtos$MessageOptionsOrBuilder {
    private static final C0 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
    public static final int FEATURES_FIELD_NUMBER = 12;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static volatile Parser<C0> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private C1083c0 features_;
    private boolean mapEntry_;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    private byte memoizedIsInitialized = 2;
    private Internal$ProtobufList<X0> uninterpretedOption_ = C1081b2.f16587d;

    static {
        C0 c0 = new C0();
        DEFAULT_INSTANCE = c0;
        AbstractC1145u1.l(C0.class, c0);
    }

    public static C0 o() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\u000bဇ\u0004\fᐉ\u0005ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", X0.class});
            case 3:
                return new C0();
            case 4:
                return new B0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final C1083c0 getFeatures() {
        C1083c0 c1083c0 = this.features_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean getMapEntry() {
        return this.mapEntry_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final X0 getUninterpretedOption(int i7) {
        return this.uninterpretedOption_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean hasDeprecated() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean hasFeatures() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean hasMapEntry() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean hasMessageSetWireFormat() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptionsOrBuilder
    public final boolean hasNoStandardDescriptorAccessor() {
        return (this.bitField0_ & 2) != 0;
    }
}
