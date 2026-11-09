package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC1145u1 implements DescriptorProtos$EnumValueDescriptorProtoOrBuilder {
    private static final M DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<M> PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private int number_;
    private O options_;

    static {
        M m7 = new M();
        DEFAULT_INSTANCE = m7;
        AbstractC1145u1.l(M.class, m7);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
            case 3:
                return new M();
            case 4:
                return new L(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<M> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (M.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public final int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public final O getOptions() {
        O o10 = this.options_;
        return o10 == null ? O.o() : o10;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public final boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }
}
