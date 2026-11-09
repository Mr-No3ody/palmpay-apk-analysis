package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1094f extends AbstractC1145u1 implements AnyOrBuilder {
    private static final C1094f DEFAULT_INSTANCE;
    private static volatile Parser<C1094f> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private AbstractC1123n value_ = AbstractC1123n.f16699b;

    static {
        C1094f c1094f = new C1094f();
        DEFAULT_INSTANCE = c1094f;
        AbstractC1145u1.l(C1094f.class, c1094f);
    }

    public static C1094f n() {
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 3:
                return new C1094f();
            case 4:
                return new C1090e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1094f> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1094f.class) {
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

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public final String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public final AbstractC1123n getTypeUrlBytes() {
        return AbstractC1123n.d(this.typeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public final AbstractC1123n getValue() {
        return this.value_;
    }
}
