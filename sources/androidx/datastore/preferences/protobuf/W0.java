package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends AbstractC1145u1 implements DescriptorProtos$UninterpretedOption$NamePartOrBuilder {
    private static final W0 DEFAULT_INSTANCE;
    public static final int IS_EXTENSION_FIELD_NUMBER = 2;
    public static final int NAME_PART_FIELD_NUMBER = 1;
    private static volatile Parser<W0> PARSER;
    private int bitField0_;
    private boolean isExtension_;
    private byte memoizedIsInitialized = 2;
    private String namePart_ = "";

    static {
        W0 w3 = new W0();
        DEFAULT_INSTANCE = w3;
        AbstractC1145u1.l(W0.class, w3);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
            case 3:
                return new W0();
            case 4:
                return new V0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<W0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (W0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
    public final boolean getIsExtension() {
        return this.isExtension_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
    public final String getNamePart() {
        return this.namePart_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
    public final AbstractC1123n getNamePartBytes() {
        return AbstractC1123n.d(this.namePart_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
    public final boolean hasIsExtension() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
    public final boolean hasNamePart() {
        return (this.bitField0_ & 1) != 0;
    }
}
