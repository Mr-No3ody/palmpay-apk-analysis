package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC1145u1 implements DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder {
    public static final int BEGIN_FIELD_NUMBER = 3;
    private static final A0 DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 4;
    private static volatile Parser<A0> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int SEMANTIC_FIELD_NUMBER = 5;
    public static final int SOURCE_FILE_FIELD_NUMBER = 2;
    private int begin_;
    private int bitField0_;
    private int end_;
    private int semantic_;
    private int pathMemoizedSerializedSize = -1;
    private Internal$IntList path_ = C1148v1.f16787d;
    private String sourceFile_ = "";

    static {
        A0 a3 = new A0();
        DEFAULT_INSTANCE = a3;
        AbstractC1145u1.l(A0.class, a3);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002\u0005᠌\u0003", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_", "semantic_", D.f16465q});
            case 3:
                return new A0();
            case 4:
                return new C1156y0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<A0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (A0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final int getBegin() {
        return this.begin_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final int getEnd() {
        return this.end_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final int getPath(int i7) {
        return this.path_.getInt(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final int getPathCount() {
        return this.path_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final List getPathList() {
        return this.path_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final EnumC1159z0 getSemantic() {
        EnumC1159z0 enumC1159z0A = EnumC1159z0.a(this.semantic_);
        return enumC1159z0A == null ? EnumC1159z0.NONE : enumC1159z0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final String getSourceFile() {
        return this.sourceFile_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final AbstractC1123n getSourceFileBytes() {
        return AbstractC1123n.d(this.sourceFile_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final boolean hasBegin() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final boolean hasEnd() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final boolean hasSemantic() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final boolean hasSourceFile() {
        return (this.bitField0_ & 1) != 0;
    }
}
