package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC1145u1 implements DescriptorProtos$EnumDescriptorProtoOrBuilder {
    private static final I DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<I> PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private K options_;
    private Internal$ProtobufList<String> reservedName_;
    private Internal$ProtobufList<H> reservedRange_;
    private Internal$ProtobufList<M> value_;

    static {
        I i7 = new I();
        DEFAULT_INSTANCE = i7;
        AbstractC1145u1.l(I.class, i7);
    }

    public I() {
        C1081b2 c1081b2 = C1081b2.f16587d;
        this.value_ = c1081b2;
        this.reservedRange_ = c1081b2;
        this.reservedName_ = c1081b2;
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", M.class, "options_", "reservedRange_", H.class, "reservedName_"});
            case 3:
                return new I();
            case 4:
                return new F(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<I> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (I.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final K getOptions() {
        K k2 = this.options_;
        return k2 == null ? K.o() : k2;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final String getReservedName(int i7) {
        return this.reservedName_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final AbstractC1123n getReservedNameBytes(int i7) {
        return AbstractC1123n.d(this.reservedName_.get(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final int getReservedNameCount() {
        return this.reservedName_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final List getReservedNameList() {
        return this.reservedName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final H getReservedRange(int i7) {
        return this.reservedRange_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final List getReservedRangeList() {
        return this.reservedRange_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final M getValue(int i7) {
        return this.value_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final int getValueCount() {
        return this.value_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final List getValueList() {
        return this.value_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }
}
