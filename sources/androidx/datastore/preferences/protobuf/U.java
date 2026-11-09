package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC1142t1 implements DescriptorProtos$ExtensionRangeOptionsOrBuilder {
    public static final int DECLARATION_FIELD_NUMBER = 2;
    private static final U DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 50;
    private static volatile Parser<U> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int VERIFICATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private Internal$ProtobufList<S> declaration_;
    private C1083c0 features_;
    private byte memoizedIsInitialized = 2;
    private Internal$ProtobufList<X0> uninterpretedOption_;
    private int verification_;

    static {
        U u6 = new U();
        DEFAULT_INSTANCE = u6;
        AbstractC1145u1.l(U.class, u6);
    }

    public U() {
        C1081b2 c1081b2 = C1081b2.f16587d;
        this.uninterpretedOption_ = c1081b2;
        this.declaration_ = c1081b2;
        this.verification_ = 1;
    }

    public static U o() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0002ϧ\u0004\u0000\u0002\u0002\u0002\u001b\u0003᠌\u00012ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "declaration_", S.class, "verification_", D.f16451c, "features_", "uninterpretedOption_", X0.class});
            case 3:
                return new U();
            case 4:
                return new P(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<U> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (U.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final S getDeclaration(int i7) {
        return this.declaration_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final int getDeclarationCount() {
        return this.declaration_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final List getDeclarationList() {
        return this.declaration_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final C1083c0 getFeatures() {
        C1083c0 c1083c0 = this.features_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final X0 getUninterpretedOption(int i7) {
        return this.uninterpretedOption_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final T getVerification() {
        T t;
        int i7 = this.verification_;
        T t3 = T.UNVERIFIED;
        if (i7 != 0) {
            t = i7 != 1 ? null : t3;
        } else {
            t = T.DECLARATION;
        }
        return t == null ? t3 : t;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
    public final boolean hasVerification() {
        return (this.bitField0_ & 2) != 0;
    }
}
