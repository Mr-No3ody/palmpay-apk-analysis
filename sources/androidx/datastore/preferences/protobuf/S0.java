package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends AbstractC1145u1 implements DescriptorProtos$SourceCodeInfo$LocationOrBuilder {
    private static final S0 DEFAULT_INSTANCE;
    public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
    public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
    private static volatile Parser<S0> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int SPAN_FIELD_NUMBER = 2;
    public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
    private int bitField0_;
    private String leadingComments_;
    private Internal$ProtobufList<String> leadingDetachedComments_;
    private Internal$IntList path_;
    private Internal$IntList span_;
    private String trailingComments_;
    private int pathMemoizedSerializedSize = -1;
    private int spanMemoizedSerializedSize = -1;

    static {
        S0 s3 = new S0();
        DEFAULT_INSTANCE = s3;
        AbstractC1145u1.l(S0.class, s3);
    }

    public S0() {
        C1148v1 c1148v1 = C1148v1.f16787d;
        this.path_ = c1148v1;
        this.span_ = c1148v1;
        this.leadingComments_ = "";
        this.trailingComments_ = "";
        this.leadingDetachedComments_ = C1081b2.f16587d;
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
            case 3:
                return new S0();
            case 4:
                return new R0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<S0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (S0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final String getLeadingComments() {
        return this.leadingComments_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final AbstractC1123n getLeadingCommentsBytes() {
        return AbstractC1123n.d(this.leadingComments_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final String getLeadingDetachedComments(int i7) {
        return this.leadingDetachedComments_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final AbstractC1123n getLeadingDetachedCommentsBytes(int i7) {
        return AbstractC1123n.d(this.leadingDetachedComments_.get(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getLeadingDetachedCommentsCount() {
        return this.leadingDetachedComments_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final List getLeadingDetachedCommentsList() {
        return this.leadingDetachedComments_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getPath(int i7) {
        return this.path_.getInt(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getPathCount() {
        return this.path_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final List getPathList() {
        return this.path_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getSpan(int i7) {
        return this.span_.getInt(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getSpanCount() {
        return this.span_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final List getSpanList() {
        return this.span_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final String getTrailingComments() {
        return this.trailingComments_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final AbstractC1123n getTrailingCommentsBytes() {
        return AbstractC1123n.d(this.trailingComments_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final boolean hasLeadingComments() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final boolean hasTrailingComments() {
        return (this.bitField0_ & 2) != 0;
    }
}
