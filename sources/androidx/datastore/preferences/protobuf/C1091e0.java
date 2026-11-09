package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1091e0 extends AbstractC1145u1 implements DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder {
    private static final C1091e0 DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 3;
    public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
    public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
    private static volatile Parser<C1091e0> PARSER;
    private int bitField0_;
    private int edition_;
    private C1083c0 fixedFeatures_;
    private byte memoizedIsInitialized = 2;
    private C1083c0 overridableFeatures_;

    static {
        C1091e0 c1091e0 = new C1091e0();
        DEFAULT_INSTANCE = c1091e0;
        AbstractC1145u1.l(C1091e0.class, c1091e0);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0002\u0003᠌\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"bitField0_", "edition_", D.f16450b, "overridableFeatures_", "fixedFeatures_"});
            case 3:
                return new C1091e0();
            case 4:
                return new C1087d0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1091e0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1091e0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final E getEdition() {
        E eA = E.a(this.edition_);
        return eA == null ? E.EDITION_UNKNOWN : eA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final C1083c0 getFixedFeatures() {
        C1083c0 c1083c0 = this.fixedFeatures_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final C1083c0 getOverridableFeatures() {
        C1083c0 c1083c0 = this.overridableFeatures_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final boolean hasEdition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final boolean hasFixedFeatures() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder
    public final boolean hasOverridableFeatures() {
        return (this.bitField0_ & 2) != 0;
    }
}
