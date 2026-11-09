package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends AbstractC1145u1 implements SourceContextOrBuilder {
    private static final k2 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<k2> PARSER;
    private String fileName_ = "";

    static {
        k2 k2Var = new k2();
        DEFAULT_INSTANCE = k2Var;
        AbstractC1145u1.l(k2.class, k2Var);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 3:
                return new k2();
            case 4:
                return new C1113j2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<k2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (k2.class) {
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

    @Override // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
    public final String getFileName() {
        return this.fileName_;
    }

    @Override // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
    public final AbstractC1123n getFileNameBytes() {
        return AbstractC1123n.d(this.fileName_);
    }
}
