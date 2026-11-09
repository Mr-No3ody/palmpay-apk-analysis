package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC1142t1 implements DescriptorProtos$EnumOptionsOrBuilder {
    public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
    private static final K DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
    public static final int FEATURES_FIELD_NUMBER = 7;
    private static volatile Parser<K> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private boolean allowAlias_;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private C1083c0 features_;
    private byte memoizedIsInitialized = 2;
    private Internal$ProtobufList<X0> uninterpretedOption_ = C1081b2.f16587d;

    static {
        K k2 = new K();
        DEFAULT_INSTANCE = k2;
        AbstractC1145u1.l(K.class, k2);
    }

    public static K o() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002ϧ\u0005\u0000\u0001\u0002\u0002ဇ\u0000\u0003ဇ\u0001\u0006ဇ\u0002\u0007ᐉ\u0003ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", X0.class});
            case 3:
                return new K();
            case 4:
                return new J(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<K> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (K.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final boolean getAllowAlias() {
        return this.allowAlias_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final C1083c0 getFeatures() {
        C1083c0 c1083c0 = this.features_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final X0 getUninterpretedOption(int i7) {
        return this.uninterpretedOption_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final boolean hasAllowAlias() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final boolean hasDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptionsOrBuilder
    public final boolean hasFeatures() {
        return (this.bitField0_ & 8) != 0;
    }
}
