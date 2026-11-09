package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class R1 extends AbstractC1145u1 implements MethodOrBuilder {
    private static final R1 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile Parser<R1> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private Internal$ProtobufList<Y1> options_ = C1081b2.f16587d;

    static {
        R1 r3 = new R1();
        DEFAULT_INSTANCE = r3;
        AbstractC1145u1.l(R1.class, r3);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Y1.class, "syntax_"});
            case 3:
                return new R1();
            case 4:
                return new Q1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<R1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (R1.class) {
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

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final Y1 getOptions(int i7) {
        return this.options_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final List getOptionsList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final AbstractC1123n getRequestTypeUrlBytes() {
        return AbstractC1123n.d(this.requestTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final AbstractC1123n getResponseTypeUrlBytes() {
        return AbstractC1123n.d(this.responseTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final o2 getSyntax() {
        o2 o2Var;
        int i7 = this.syntax_;
        if (i7 == 0) {
            o2Var = o2.SYNTAX_PROTO2;
        } else if (i7 != 1) {
            o2Var = i7 != 2 ? null : o2.SYNTAX_EDITIONS;
        } else {
            o2Var = o2.SYNTAX_PROTO3;
        }
        return o2Var == null ? o2.UNRECOGNIZED : o2Var;
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final int getSyntaxValue() {
        return this.syntax_;
    }
}
