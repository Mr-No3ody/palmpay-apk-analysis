package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1144u0 extends AbstractC1145u1 implements DescriptorProtos$FileDescriptorProtoOrBuilder {
    private static final C1144u0 DEFAULT_INSTANCE;
    public static final int DEPENDENCY_FIELD_NUMBER = 3;
    public static final int EDITION_FIELD_NUMBER = 14;
    public static final int ENUM_TYPE_FIELD_NUMBER = 5;
    public static final int EXTENSION_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    public static final int PACKAGE_FIELD_NUMBER = 2;
    private static volatile Parser<C1144u0> PARSER = null;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private int bitField0_;
    private Internal$ProtobufList<String> dependency_;
    private int edition_;
    private Internal$ProtobufList<I> enumType_;
    private Internal$ProtobufList<C1107i0> extension_;
    private Internal$ProtobufList<C> messageType_;
    private C1153x0 options_;
    private Internal$IntList publicDependency_;
    private Internal$ProtobufList<N0> service_;
    private T0 sourceCodeInfo_;
    private String syntax_;
    private Internal$IntList weakDependency_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private String package_ = "";

    static {
        C1144u0 c1144u0 = new C1144u0();
        DEFAULT_INSTANCE = c1144u0;
        AbstractC1145u1.l(C1144u0.class, c1144u0);
    }

    public C1144u0() {
        C1081b2 c1081b2 = C1081b2.f16587d;
        this.dependency_ = c1081b2;
        C1148v1 c1148v1 = C1148v1.f16787d;
        this.publicDependency_ = c1148v1;
        this.weakDependency_ = c1148v1;
        this.messageType_ = c1081b2;
        this.enumType_ = c1081b2;
        this.service_ = c1081b2;
        this.extension_ = c1081b2;
        this.syntax_ = "";
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004\u000e᠌\u0005", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", C.class, "enumType_", I.class, "service_", N0.class, "extension_", C1107i0.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_", "edition_", D.f16450b});
            case 3:
                return new C1144u0();
            case 4:
                return new C1141t0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1144u0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1144u0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final String getDependency(int i7) {
        return this.dependency_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final AbstractC1123n getDependencyBytes(int i7) {
        return AbstractC1123n.d(this.dependency_.get(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getDependencyCount() {
        return this.dependency_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final List getDependencyList() {
        return this.dependency_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final E getEdition() {
        E eA = E.a(this.edition_);
        return eA == null ? E.EDITION_UNKNOWN : eA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final I getEnumType(int i7) {
        return this.enumType_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final List getEnumTypeList() {
        return this.enumType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final C1107i0 getExtension(int i7) {
        return this.extension_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final List getExtensionList() {
        return this.extension_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final C getMessageType(int i7) {
        return this.messageType_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getMessageTypeCount() {
        return this.messageType_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final List getMessageTypeList() {
        return this.messageType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final AbstractC1123n getNameBytes() {
        return AbstractC1123n.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final C1153x0 getOptions() {
        C1153x0 c1153x0 = this.options_;
        return c1153x0 == null ? C1153x0.o() : c1153x0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final String getPackage() {
        return this.package_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final AbstractC1123n getPackageBytes() {
        return AbstractC1123n.d(this.package_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getPublicDependency(int i7) {
        return this.publicDependency_.getInt(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getPublicDependencyCount() {
        return this.publicDependency_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final List getPublicDependencyList() {
        return this.publicDependency_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final N0 getService(int i7) {
        return this.service_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getServiceCount() {
        return this.service_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final List getServiceList() {
        return this.service_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final T0 getSourceCodeInfo() {
        T0 t1 = this.sourceCodeInfo_;
        return t1 == null ? T0.n() : t1;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final String getSyntax() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final AbstractC1123n getSyntaxBytes() {
        return AbstractC1123n.d(this.syntax_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getWeakDependency(int i7) {
        return this.weakDependency_.getInt(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final int getWeakDependencyCount() {
        return this.weakDependency_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final List getWeakDependencyList() {
        return this.weakDependency_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final boolean hasEdition() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final boolean hasPackage() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final boolean hasSourceCodeInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public final boolean hasSyntax() {
        return (this.bitField0_ & 16) != 0;
    }
}
