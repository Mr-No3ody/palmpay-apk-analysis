package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class T1 extends AbstractC1145u1 implements MixinOrBuilder {
    private static final T1 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<T1> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    static {
        T1 t1 = new T1();
        DEFAULT_INSTANCE = t1;
        AbstractC1145u1.l(T1.class, t1);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 3:
                return new T1();
            case 4:
                return new S1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<T1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (T1.class) {
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

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public final String getRoot() {
        return this.root_;
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public final AbstractC1123n getRootBytes() {
        return AbstractC1123n.d(this.root_);
    }
}
