package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1076a1 extends AbstractC1145u1 implements EnumValueOrBuilder {
    private static final C1076a1 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<C1076a1> PARSER;
    private int number_;
    private String name_ = "";
    private Internal$ProtobufList<Y1> options_ = C1081b2.f16587d;

    static {
        C1076a1 c1076a1 = new C1076a1();
        DEFAULT_INSTANCE = c1076a1;
        AbstractC1145u1.l(C1076a1.class, c1076a1);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Y1.class});
            case 3:
                return new C1076a1();
            case 4:
                return new Z0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1076a1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1076a1.class) {
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

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final Y1 getOptions(int i7) {
        return this.options_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public final List getOptionsList() {
        return this.options_;
    }
}
