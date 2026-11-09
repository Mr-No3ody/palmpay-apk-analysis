package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC1145u1 implements DescriptorProtos$DescriptorProtoOrBuilder {
    private static final C DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static volatile Parser<C> PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 10;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
    private int bitField0_;
    private Internal$ProtobufList<I> enumType_;
    private Internal$ProtobufList<C1158z> extensionRange_;
    private Internal$ProtobufList<C1107i0> extension_;
    private Internal$ProtobufList<C1107i0> field_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private Internal$ProtobufList<C> nestedType_;
    private Internal$ProtobufList<J0> oneofDecl_;
    private C0 options_;
    private Internal$ProtobufList<String> reservedName_;
    private Internal$ProtobufList<B> reservedRange_;

    static {
        C c6 = new C();
        DEFAULT_INSTANCE = c6;
        AbstractC1145u1.l(C.class, c6);
    }

    public C() {
        C1081b2 c1081b2 = C1081b2.f16587d;
        this.field_ = c1081b2;
        this.extension_ = c1081b2;
        this.nestedType_ = c1081b2;
        this.enumType_ = c1081b2;
        this.extensionRange_ = c1081b2;
        this.oneofDecl_ = c1081b2;
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", C1107i0.class, "nestedType_", C.class, "enumType_", I.class, "extensionRange_", C1158z.class, "extension_", C1107i0.class, "options_", "oneofDecl_", J0.class, "reservedRange_", B.class, "reservedName_"});
            case 3:
                return new C();
            case 4:
                return new C1152x(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final I getEnumType(int i7) {
        return this.enumType_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final List getEnumTypeList() {
        return this.enumType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final C1107i0 getExtension(int i7) {
        return this.extension_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final List getExtensionList() {
        return this.extension_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final C1158z getExtensionRange(int i7) {
        return this.extensionRange_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final List getExtensionRangeList() {
        return this.extensionRange_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final C1107i0 getField(int i7) {
        return this.field_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final int getFieldCount() {
        return this.field_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final List getFieldList() {
        return this.field_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final C getNestedType(int i7) {
        return this.nestedType_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final List getNestedTypeList() {
        return this.nestedType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final J0 getOneofDecl(int i7) {
        return this.oneofDecl_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final List getOneofDeclList() {
        return this.oneofDecl_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final C0 getOptions() {
        C0 c0 = this.options_;
        return c0 == null ? C0.o() : c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final String getReservedName(int i7) {
        return this.reservedName_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final AbstractC1123n getReservedNameBytes(int i7) {
        return AbstractC1123n.d(this.reservedName_.get(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final int getReservedNameCount() {
        return this.reservedName_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final List getReservedNameList() {
        return this.reservedName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final B getReservedRange(int i7) {
        return this.reservedRange_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final List getReservedRangeList() {
        return this.reservedRange_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }
}
