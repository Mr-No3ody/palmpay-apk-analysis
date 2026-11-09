package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1119l1 extends AbstractC1145u1 implements FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final C1119l1 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile Parser<C1119l1> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private Internal$ProtobufList<Y1> options_ = C1081b2.f16587d;
    private String jsonName_ = "";
    private String defaultValue_ = "";

    static {
        C1119l1 c1119l1 = new C1119l1();
        DEFAULT_INSTANCE = c1119l1;
        AbstractC1145u1.l(C1119l1.class, c1119l1);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Y1.class, "jsonName_", "defaultValue_"});
            case 3:
                return new C1119l1();
            case 4:
                return new C1108i1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1119l1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1119l1.class) {
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

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final EnumC1112j1 getCardinality() {
        EnumC1112j1 enumC1112j1;
        int i7 = this.cardinality_;
        if (i7 == 0) {
            enumC1112j1 = EnumC1112j1.CARDINALITY_UNKNOWN;
        } else if (i7 == 1) {
            enumC1112j1 = EnumC1112j1.CARDINALITY_OPTIONAL;
        } else if (i7 != 2) {
            enumC1112j1 = i7 != 3 ? null : EnumC1112j1.CARDINALITY_REPEATED;
        } else {
            enumC1112j1 = EnumC1112j1.CARDINALITY_REQUIRED;
        }
        return enumC1112j1 == null ? EnumC1112j1.UNRECOGNIZED : enumC1112j1;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final AbstractC1123n getDefaultValueBytes() {
        return AbstractC1123n.d(this.defaultValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final String getJsonName() {
        return this.jsonName_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final AbstractC1123n getJsonNameBytes() {
        return AbstractC1123n.d(this.jsonName_);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final EnumC1116k1 getKind() {
        EnumC1116k1 enumC1116k1;
        switch (this.kind_) {
            case 0:
                enumC1116k1 = EnumC1116k1.TYPE_UNKNOWN;
                break;
            case 1:
                enumC1116k1 = EnumC1116k1.TYPE_DOUBLE;
                break;
            case 2:
                enumC1116k1 = EnumC1116k1.TYPE_FLOAT;
                break;
            case 3:
                enumC1116k1 = EnumC1116k1.TYPE_INT64;
                break;
            case 4:
                enumC1116k1 = EnumC1116k1.TYPE_UINT64;
                break;
            case 5:
                enumC1116k1 = EnumC1116k1.TYPE_INT32;
                break;
            case 6:
                enumC1116k1 = EnumC1116k1.TYPE_FIXED64;
                break;
            case 7:
                enumC1116k1 = EnumC1116k1.TYPE_FIXED32;
                break;
            case 8:
                enumC1116k1 = EnumC1116k1.TYPE_BOOL;
                break;
            case 9:
                enumC1116k1 = EnumC1116k1.TYPE_STRING;
                break;
            case 10:
                enumC1116k1 = EnumC1116k1.TYPE_GROUP;
                break;
            case 11:
                enumC1116k1 = EnumC1116k1.TYPE_MESSAGE;
                break;
            case 12:
                enumC1116k1 = EnumC1116k1.TYPE_BYTES;
                break;
            case 13:
                enumC1116k1 = EnumC1116k1.TYPE_UINT32;
                break;
            case 14:
                enumC1116k1 = EnumC1116k1.TYPE_ENUM;
                break;
            case 15:
                enumC1116k1 = EnumC1116k1.TYPE_SFIXED32;
                break;
            case 16:
                enumC1116k1 = EnumC1116k1.TYPE_SFIXED64;
                break;
            case 17:
                enumC1116k1 = EnumC1116k1.TYPE_SINT32;
                break;
            case 18:
                enumC1116k1 = EnumC1116k1.TYPE_SINT64;
                break;
            default:
                enumC1116k1 = null;
                break;
        }
        return enumC1116k1 == null ? EnumC1116k1.UNRECOGNIZED : enumC1116k1;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getKindValue() {
        return this.kind_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final Y1 getOptions(int i7) {
        return this.options_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final List getOptionsList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final boolean getPacked() {
        return this.packed_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public final AbstractC1123n getTypeUrlBytes() {
        return AbstractC1123n.d(this.typeUrl_);
    }
}
