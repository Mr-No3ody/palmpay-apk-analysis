package androidx.datastore.preferences.protobuf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1138s0 extends AbstractC1142t1 implements DescriptorProtos$FieldOptionsOrBuilder {
    public static final int CTYPE_FIELD_NUMBER = 1;
    public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
    private static final C1138s0 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
    public static final int FEATURES_FIELD_NUMBER = 21;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static volatile Parser<C1138s0> PARSER = null;
    public static final int RETENTION_FIELD_NUMBER = 17;
    public static final int TARGETS_FIELD_NUMBER = 19;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
    public static final int WEAK_FIELD_NUMBER = 10;
    private static final Internal$IntListAdapter$IntConverter<EnumC1135r0> targets_converter_ = new C1114k(2);
    private int bitField0_;
    private int ctype_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private Internal$ProtobufList<C1121m0> editionDefaults_;
    private C1127o0 featureSupport_;
    private C1083c0 features_;
    private int jstype_;
    private boolean lazy_;
    private boolean packed_;
    private int retention_;
    private Internal$ProtobufList<X0> uninterpretedOption_;
    private boolean unverifiedLazy_;
    private boolean weak_;
    private byte memoizedIsInitialized = 2;
    private Internal$IntList targets_ = C1148v1.f16787d;

    static {
        C1138s0 c1138s0 = new C1138s0();
        DEFAULT_INSTANCE = c1138s0;
        AbstractC1145u1.l(C1138s0.class, c1138s0);
    }

    public C1138s0() {
        C1081b2 c1081b2 = C1081b2.f16587d;
        this.editionDefaults_ = c1081b2;
        this.uninterpretedOption_ = c1081b2;
    }

    public static C1138s0 o() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001ϧ\u000e\u0000\u0003\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000fဇ\u0004\u0010ဇ\u0007\u0011᠌\b\u0013ࠞ\u0014\u001b\u0015ᐉ\t\u0016ဉ\nϧЛ", new Object[]{"bitField0_", "ctype_", D.f16460l, "packed_", "deprecated_", "lazy_", "jstype_", D.f16461m, "weak_", "unverifiedLazy_", "debugRedact_", "retention_", D.f16462n, "targets_", D.f16463o, "editionDefaults_", C1121m0.class, "features_", "featureSupport_", "uninterpretedOption_", X0.class});
            case 3:
                return new C1138s0();
            case 4:
                return new C1111j0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1138s0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1138s0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final EnumC1115k0 getCtype() {
        EnumC1115k0 enumC1115k0A = EnumC1115k0.a(this.ctype_);
        return enumC1115k0A == null ? EnumC1115k0.STRING : enumC1115k0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean getDebugRedact() {
        return this.debugRedact_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final C1121m0 getEditionDefaults(int i7) {
        return this.editionDefaults_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final int getEditionDefaultsCount() {
        return this.editionDefaults_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final List getEditionDefaultsList() {
        return this.editionDefaults_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final C1127o0 getFeatureSupport() {
        C1127o0 c1127o0 = this.featureSupport_;
        return c1127o0 == null ? C1127o0.n() : c1127o0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final C1083c0 getFeatures() {
        C1083c0 c1083c0 = this.features_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final EnumC1130p0 getJstype() {
        EnumC1130p0 enumC1130p0A = EnumC1130p0.a(this.jstype_);
        return enumC1130p0A == null ? EnumC1130p0.JS_NORMAL : enumC1130p0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean getLazy() {
        return this.lazy_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean getPacked() {
        return this.packed_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final EnumC1133q0 getRetention() {
        EnumC1133q0 enumC1133q0A = EnumC1133q0.a(this.retention_);
        return enumC1133q0A == null ? EnumC1133q0.RETENTION_UNKNOWN : enumC1133q0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final EnumC1135r0 getTargets(int i7) {
        EnumC1135r0 enumC1135r0A = EnumC1135r0.a(this.targets_.getInt(i7));
        return enumC1135r0A == null ? EnumC1135r0.TARGET_TYPE_UNKNOWN : enumC1135r0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final int getTargetsCount() {
        return this.targets_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final List getTargetsList() {
        return new C1151w1(this.targets_, targets_converter_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final X0 getUninterpretedOption(int i7) {
        return this.uninterpretedOption_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean getUnverifiedLazy() {
        return this.unverifiedLazy_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean getWeak() {
        return this.weak_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasDebugRedact() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasDeprecated() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasFeatureSupport() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasFeatures() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasRetention() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasUnverifiedLazy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptionsOrBuilder
    public final boolean hasWeak() {
        return (this.bitField0_ & 64) != 0;
    }
}
