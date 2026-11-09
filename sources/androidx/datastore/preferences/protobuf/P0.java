package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends AbstractC1142t1 implements DescriptorProtos$ServiceOptionsOrBuilder {
    private static final P0 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int FEATURES_FIELD_NUMBER = 34;
    private static volatile Parser<P0> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private C1083c0 features_;
    private byte memoizedIsInitialized = 2;
    private Internal$ProtobufList<X0> uninterpretedOption_ = C1081b2.f16587d;

    static {
        P0 p3 = new P0();
        DEFAULT_INSTANCE = p3;
        AbstractC1145u1.l(P0.class, p3);
    }

    public static P0 o() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0002!ဇ\u0001\"ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "uninterpretedOption_", X0.class});
            case 3:
                return new P0();
            case 4:
                return new O0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<P0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (P0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final C1083c0 getFeatures() {
        C1083c0 c1083c0 = this.features_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final X0 getUninterpretedOption(int i7) {
        return this.uninterpretedOption_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final boolean hasDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }
}
