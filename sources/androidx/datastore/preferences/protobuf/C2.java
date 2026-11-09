package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class C2 extends AbstractC1145u1 implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final C2 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<C2> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        C2 c6 = new C2();
        DEFAULT_INSTANCE = c6;
        AbstractC1145u1.l(C2.class, c6);
    }

    public static C2 n() {
        return DEFAULT_INSTANCE;
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", n2.class, F1.class});
            case 3:
                return new C2();
            case 4:
                return new A2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C2.class) {
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

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final B2 getKindCase() {
        switch (this.kindCase_) {
            case 0:
                return B2.f16448g;
            case 1:
                return B2.f16442a;
            case 2:
                return B2.f16443b;
            case 3:
                return B2.f16444c;
            case 4:
                return B2.f16445d;
            case 5:
                return B2.f16446e;
            case 6:
                return B2.f16447f;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final F1 getListValue() {
        return this.kindCase_ == 6 ? (F1) this.kind_ : F1.n();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final W1 getNullValue() {
        int i7 = this.kindCase_;
        W1 w3 = W1.NULL_VALUE;
        if (i7 == 1) {
            if (((Integer) this.kind_).intValue() != 0) {
                w3 = null;
            }
            if (w3 == null) {
                return W1.UNRECOGNIZED;
            }
        }
        return w3;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final AbstractC1123n getStringValueBytes() {
        return AbstractC1123n.d(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final n2 getStructValue() {
        return this.kindCase_ == 5 ? (n2) this.kind_ : n2.n();
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public final boolean hasStructValue() {
        return this.kindCase_ == 5;
    }
}
