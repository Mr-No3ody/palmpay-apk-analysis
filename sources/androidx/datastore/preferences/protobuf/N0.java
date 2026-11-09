package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends AbstractC1145u1 implements DescriptorProtos$ServiceDescriptorProtoOrBuilder {
    private static final N0 DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<N0> PARSER;
    private int bitField0_;
    private P0 options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private Internal$ProtobufList<E0> method_ = C1081b2.f16587d;

    static {
        N0 n10 = new N0();
        DEFAULT_INSTANCE = n10;
        AbstractC1145u1.l(N0.class, n10);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", E0.class, "options_"});
            case 3:
                return new N0();
            case 4:
                return new M0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<N0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (N0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final E0 getMethod(int i7) {
        return this.method_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final int getMethodCount() {
        return this.method_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final List getMethodList() {
        return this.method_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final P0 getOptions() {
        P0 p3 = this.options_;
        return p3 == null ? P0.o() : p3;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }
}
