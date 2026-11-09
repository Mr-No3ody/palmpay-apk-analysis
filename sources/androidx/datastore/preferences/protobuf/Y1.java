package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 extends AbstractC1145u1 implements OptionOrBuilder {
    private static final Y1 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Y1> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private C1094f value_;

    static {
        Y1 y8 = new Y1();
        DEFAULT_INSTANCE = y8;
        AbstractC1145u1.l(Y1.class, y8);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 3:
                return new Y1();
            case 4:
                return new X1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Y1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Y1.class) {
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

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public final C1094f getValue() {
        C1094f c1094f = this.value_;
        return c1094f == null ? C1094f.n() : c1094f;
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }
}
