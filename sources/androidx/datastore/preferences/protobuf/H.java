package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC1145u1 implements DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder {
    private static final H DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    private static volatile Parser<H> PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    private int bitField0_;
    private int end_;
    private int start_;

    static {
        H h7 = new H();
        DEFAULT_INSTANCE = h7;
        AbstractC1145u1.l(H.class, h7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1145u1
    public final Object d(int i7, AbstractC1145u1 abstractC1145u1) {
        Parser c1136r1;
        switch (androidx.camera.camera2.internal.F.i(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
            case 3:
                return new H();
            case 4:
                return new G(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<H> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (H.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
    public final int getEnd() {
        return this.end_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
    public final int getStart() {
        return this.start_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
    public final boolean hasEnd() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
    public final boolean hasStart() {
        return (this.bitField0_ & 1) != 0;
    }
}
