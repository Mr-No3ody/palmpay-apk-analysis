package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends AbstractC1145u1 implements DescriptorProtos$OneofDescriptorProtoOrBuilder {
    private static final J0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile Parser<J0> PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private L0 options_;

    static {
        J0 j1 = new J0();
        DEFAULT_INSTANCE = j1;
        AbstractC1145u1.l(J0.class, j1);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
            case 3:
                return new J0();
            case 4:
                return new I0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<J0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (J0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public final L0 getOptions() {
        L0 l5 = this.options_;
        return l5 == null ? L0.o() : l5;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }
}
