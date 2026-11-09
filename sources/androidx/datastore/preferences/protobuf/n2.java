package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends AbstractC1145u1 implements StructOrBuilder {
    private static final n2 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<n2> PARSER;
    private K1 fields_ = K1.f16513b;

    static {
        n2 n2Var = new n2();
        DEFAULT_INSTANCE = n2Var;
        AbstractC1145u1.l(n2.class, n2Var);
    }

    public static n2 n() {
        return DEFAULT_INSTANCE;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final boolean containsFields(String str) {
        str.getClass();
        return this.fields_.containsKey(str);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", m2.f16698a});
            case 3:
                return new n2();
            case 4:
                return new l2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<n2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (n2.class) {
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

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final Map getFields() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final Map getFieldsMap() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final C2 getFieldsOrDefault(String str, C2 c6) {
        str.getClass();
        K1 k2 = this.fields_;
        return k2.containsKey(str) ? (C2) k2.get(str) : c6;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final C2 getFieldsOrThrow(String str) {
        str.getClass();
        K1 k2 = this.fields_;
        if (k2.containsKey(str)) {
            return (C2) k2.get(str);
        }
        throw new IllegalArgumentException();
    }
}
