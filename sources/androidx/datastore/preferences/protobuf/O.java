package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC1142t1 implements DescriptorProtos$EnumValueOptionsOrBuilder {
    public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
    private static final O DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 1;
    public static final int FEATURES_FIELD_NUMBER = 2;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
    private static volatile Parser<O> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private C1127o0 featureSupport_;
    private C1083c0 features_;
    private byte memoizedIsInitialized = 2;
    private Internal$ProtobufList<X0> uninterpretedOption_ = C1081b2.f16587d;

    static {
        O o10 = new O();
        DEFAULT_INSTANCE = o10;
        AbstractC1145u1.l(O.class, o10);
    }

    public static O o() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "debugRedact_", "featureSupport_", "uninterpretedOption_", X0.class});
            case 3:
                return new O();
            case 4:
                return new N(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<O> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (O.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final C1127o0 getFeatureSupport() {
        C1127o0 c1127o0 = this.featureSupport_;
        return c1127o0 == null ? C1127o0.n() : c1127o0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final C1083c0 getFeatures() {
        C1083c0 c1083c0 = this.features_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final X0 getUninterpretedOption(int i7) {
        return this.uninterpretedOption_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final boolean hasDebugRedact() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final boolean hasFeatureSupport() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
    public final boolean hasFeatures() {
        return (this.bitField0_ & 2) != 0;
    }
}
