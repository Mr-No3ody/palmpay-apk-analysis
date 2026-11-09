package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends AbstractC1145u1 implements ListValueOrBuilder {
    private static final F1 DEFAULT_INSTANCE;
    private static volatile Parser<F1> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal$ProtobufList<C2> values_ = C1081b2.f16587d;

    static {
        F1 f1 = new F1();
        DEFAULT_INSTANCE = f1;
        AbstractC1145u1.l(F1.class, f1);
    }

    public static F1 n() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C2.class});
            case 3:
                return new F1();
            case 4:
                return new E1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<F1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (F1.class) {
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

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final C2 getValues(int i7) {
        return this.values_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final int getValuesCount() {
        return this.values_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final List getValuesList() {
        return this.values_;
    }
}
