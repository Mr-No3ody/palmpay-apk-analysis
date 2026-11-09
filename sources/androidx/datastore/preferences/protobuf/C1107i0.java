package androidx.datastore.preferences.protobuf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1107i0 extends AbstractC1145u1 implements DescriptorProtos$FieldDescriptorProtoOrBuilder {
    private static final C1107i0 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
    public static final int EXTENDEE_FIELD_NUMBER = 2;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int LABEL_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    private static volatile Parser<C1107i0> PARSER = null;
    public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_NAME_FIELD_NUMBER = 6;
    private int bitField0_;
    private int number_;
    private int oneofIndex_;
    private C1138s0 options_;
    private boolean proto3Optional_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private int label_ = 1;
    private int type_ = 1;
    private String typeName_ = "";
    private String extendee_ = "";
    private String defaultValue_ = "";
    private String jsonName_ = "";

    static {
        C1107i0 c1107i0 = new C1107i0();
        DEFAULT_INSTANCE = c1107i0;
        AbstractC1145u1.l(C1107i0.class, c1107i0);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", D.f16458j, "type_", D.f16459k, "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
            case 3:
                return new C1107i0();
            case 4:
                return new C1095f0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1107i0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1107i0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final AbstractC1123n getDefaultValueBytes() {
        return AbstractC1123n.d(this.defaultValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final String getExtendee() {
        return this.extendee_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final AbstractC1123n getExtendeeBytes() {
        return AbstractC1123n.d(this.extendee_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final String getJsonName() {
        return this.jsonName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final AbstractC1123n getJsonNameBytes() {
        return AbstractC1123n.d(this.jsonName_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final EnumC1099g0 getLabel() {
        EnumC1099g0 enumC1099g0A = EnumC1099g0.a(this.label_);
        return enumC1099g0A == null ? EnumC1099g0.LABEL_OPTIONAL : enumC1099g0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final C1138s0 getOptions() {
        C1138s0 c1138s0 = this.options_;
        return c1138s0 == null ? C1138s0.o() : c1138s0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean getProto3Optional() {
        return this.proto3Optional_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final EnumC1103h0 getType() {
        EnumC1103h0 enumC1103h0A = EnumC1103h0.a(this.type_);
        return enumC1103h0A == null ? EnumC1103h0.TYPE_DOUBLE : enumC1103h0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final String getTypeName() {
        return this.typeName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final AbstractC1123n getTypeNameBytes() {
        return AbstractC1123n.d(this.typeName_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasDefaultValue() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasExtendee() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasJsonName() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasOneofIndex() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasProto3Optional() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
    public final boolean hasTypeName() {
        return (this.bitField0_ & 16) != 0;
    }
}
