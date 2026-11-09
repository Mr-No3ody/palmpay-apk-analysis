package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends AbstractC1145u1 implements DescriptorProtos$SourceCodeInfoOrBuilder {
    private static final T0 DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile Parser<T0> PARSER;
    private Internal$ProtobufList<S0> location_ = C1081b2.f16587d;

    static {
        T0 t1 = new T0();
        DEFAULT_INSTANCE = t1;
        AbstractC1145u1.l(T0.class, t1);
    }

    public static T0 n() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", S0.class});
            case 3:
                return new T0();
            case 4:
                return new Q0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<T0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (T0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public final S0 getLocation(int i7) {
        return this.location_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public final int getLocationCount() {
        return this.location_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public final List getLocationList() {
        return this.location_;
    }
}
