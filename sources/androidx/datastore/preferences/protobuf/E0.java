package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractC1145u1 implements DescriptorProtos$MethodDescriptorProtoOrBuilder {
    public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
    private static final E0 DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
    private static volatile Parser<E0> PARSER = null;
    public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean clientStreaming_;
    private H0 options_;
    private boolean serverStreaming_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private String inputType_ = "";
    private String outputType_ = "";

    static {
        E0 e10 = new E0();
        DEFAULT_INSTANCE = e10;
        AbstractC1145u1.l(E0.class, e10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1145u1
    public final Object d(int i7, AbstractC1145u1 abstractC1145u1) {
        Parser c1136r1;
        switch (androidx.camera.camera2.internal.F.i(i7)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (abstractC1145u1 == null ? 0 : 1);
                return null;
            case 2:
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
            case 3:
                return new E0();
            case 4:
                return new D0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<E0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (E0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final String getInputType() {
        return this.inputType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final AbstractC1123n getInputTypeBytes() {
        return AbstractC1123n.d(this.inputType_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final H0 getOptions() {
        H0 h7 = this.options_;
        return h7 == null ? H0.o() : h7;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final String getOutputType() {
        return this.outputType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final AbstractC1123n getOutputTypeBytes() {
        return AbstractC1123n.d(this.outputType_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final boolean hasClientStreaming() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final boolean hasInputType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final boolean hasOutputType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
    public final boolean hasServerStreaming() {
        return (this.bitField0_ & 32) != 0;
    }
}
