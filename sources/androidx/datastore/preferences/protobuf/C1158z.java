package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1158z extends AbstractC1145u1 implements DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder {
    private static final C1158z DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<C1158z> PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    private int bitField0_;
    private int end_;
    private byte memoizedIsInitialized = 2;
    private U options_;
    private int start_;

    static {
        C1158z c1158z = new C1158z();
        DEFAULT_INSTANCE = c1158z;
        AbstractC1145u1.l(C1158z.class, c1158z);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
            case 3:
                return new C1158z();
            case 4:
                return new C1155y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1158z> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1158z.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
    public final int getEnd() {
        return this.end_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
    public final U getOptions() {
        U u6 = this.options_;
        return u6 == null ? U.o() : u6;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
    public final int getStart() {
        return this.start_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
    public final boolean hasEnd() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
    public final boolean hasStart() {
        return (this.bitField0_ & 1) != 0;
    }
}
