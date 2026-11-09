package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends AbstractC1145u1 implements DescriptorProtos$UninterpretedOptionOrBuilder {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final X0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static volatile Parser<X0> PARSER = null;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private double doubleValue_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private byte memoizedIsInitialized = 2;
    private Internal$ProtobufList<W0> name_ = C1081b2.f16587d;
    private String identifierValue_ = "";
    private AbstractC1123n stringValue_ = AbstractC1123n.f16699b;
    private String aggregateValue_ = "";

    static {
        X0 x3 = new X0();
        DEFAULT_INSTANCE = x3;
        AbstractC1145u1.l(X0.class, x3);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", W0.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
            case 3:
                return new X0();
            case 4:
                return new U0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<X0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (X0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final String getAggregateValue() {
        return this.aggregateValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final AbstractC1123n getAggregateValueBytes() {
        return AbstractC1123n.d(this.aggregateValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final double getDoubleValue() {
        return this.doubleValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final String getIdentifierValue() {
        return this.identifierValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final AbstractC1123n getIdentifierValueBytes() {
        return AbstractC1123n.d(this.identifierValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final W0 getName(int i7) {
        return this.name_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final int getNameCount() {
        return this.name_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final List getNameList() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final AbstractC1123n getStringValue() {
        return this.stringValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasAggregateValue() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasDoubleValue() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasIdentifierValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasNegativeIntValue() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasPositiveIntValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
    public final boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }
}
