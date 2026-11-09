package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC1145u1 implements DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder {
    private static final S DEFAULT_INSTANCE;
    public static final int FULL_NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile Parser<S> PARSER = null;
    public static final int REPEATED_FIELD_NUMBER = 6;
    public static final int RESERVED_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int number_;
    private boolean repeated_;
    private boolean reserved_;
    private String fullName_ = "";
    private String type_ = "";

    static {
        S s3 = new S();
        DEFAULT_INSTANCE = s3;
        AbstractC1145u1.l(S.class, s3);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "number_", "fullName_", "type_", "reserved_", "repeated_"});
            case 3:
                return new S();
            case 4:
                return new Q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<S> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (S.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final String getFullName() {
        return this.fullName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final AbstractC1123n getFullNameBytes() {
        return AbstractC1123n.d(this.fullName_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final boolean getRepeated() {
        return this.repeated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final boolean getReserved() {
        return this.reserved_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final String getType() {
        return this.type_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final AbstractC1123n getTypeBytes() {
        return AbstractC1123n.d(this.type_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final boolean hasFullName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final boolean hasNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final boolean hasRepeated() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final boolean hasReserved() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$DeclarationOrBuilder
    public final boolean hasType() {
        return (this.bitField0_ & 4) != 0;
    }
}
