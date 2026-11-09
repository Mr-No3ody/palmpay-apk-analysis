package androidx.datastore.preferences.protobuf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1153x0 extends AbstractC1142t1 implements DescriptorProtos$FileOptionsOrBuilder {
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final C1153x0 DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int FEATURES_FIELD_NUMBER = 50;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static volatile Parser<C1153x0> PARSER = null;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean ccGenericServices_;
    private boolean deprecated_;
    private C1083c0 features_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private boolean javaStringCheckUtf8_;
    private boolean pyGenericServices_;
    private byte memoizedIsInitialized = 2;
    private String javaPackage_ = "";
    private String javaOuterClassname_ = "";
    private int optimizeFor_ = 1;
    private String goPackage_ = "";
    private boolean ccEnableArenas_ = true;
    private String objcClassPrefix_ = "";
    private String csharpNamespace_ = "";
    private String swiftPrefix_ = "";
    private String phpClassPrefix_ = "";
    private String phpNamespace_ = "";
    private String phpMetadataNamespace_ = "";
    private String rubyPackage_ = "";
    private Internal$ProtobufList<X0> uninterpretedOption_ = C1081b2.f16587d;

    static {
        C1153x0 c1153x0 = new C1153x0();
        DEFAULT_INSTANCE = c1153x0;
        AbstractC1145u1.l(C1153x0.class, c1153x0);
    }

    public static C1153x0 o() {
        return DEFAULT_INSTANCE;
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0002\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\n\u001bဇ\u0004\u001fဇ\u000b$ဈ\f%ဈ\r'ဈ\u000e(ဈ\u000f)ဈ\u0010,ဈ\u0011-ဈ\u00122ᐉ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", D.f16464p, "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpMetadataNamespace_", "rubyPackage_", "features_", "uninterpretedOption_", X0.class});
            case 3:
                return new C1153x0();
            case 4:
                return new C1147v0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<C1153x0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1153x0.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getCsharpNamespace() {
        return this.csharpNamespace_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getCsharpNamespaceBytes() {
        return AbstractC1123n.d(this.csharpNamespace_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final C1083c0 getFeatures() {
        C1083c0 c1083c0 = this.features_;
        return c1083c0 == null ? C1083c0.o() : c1083c0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getGoPackage() {
        return this.goPackage_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getGoPackageBytes() {
        return AbstractC1123n.d(this.goPackage_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getJavaOuterClassname() {
        return this.javaOuterClassname_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getJavaOuterClassnameBytes() {
        return AbstractC1123n.d(this.javaOuterClassname_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getJavaPackage() {
        return this.javaPackage_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getJavaPackageBytes() {
        return AbstractC1123n.d(this.javaPackage_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getObjcClassPrefix() {
        return this.objcClassPrefix_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getObjcClassPrefixBytes() {
        return AbstractC1123n.d(this.objcClassPrefix_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final EnumC1150w0 getOptimizeFor() {
        EnumC1150w0 enumC1150w0A = EnumC1150w0.a(this.optimizeFor_);
        return enumC1150w0A == null ? EnumC1150w0.SPEED : enumC1150w0A;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getPhpClassPrefix() {
        return this.phpClassPrefix_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getPhpClassPrefixBytes() {
        return AbstractC1123n.d(this.phpClassPrefix_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getPhpMetadataNamespace() {
        return this.phpMetadataNamespace_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getPhpMetadataNamespaceBytes() {
        return AbstractC1123n.d(this.phpMetadataNamespace_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getPhpNamespace() {
        return this.phpNamespace_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getPhpNamespaceBytes() {
        return AbstractC1123n.d(this.phpNamespace_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getRubyPackage() {
        return this.rubyPackage_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getRubyPackageBytes() {
        return AbstractC1123n.d(this.rubyPackage_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final String getSwiftPrefix() {
        return this.swiftPrefix_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final AbstractC1123n getSwiftPrefixBytes() {
        return AbstractC1123n.d(this.swiftPrefix_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final X0 getUninterpretedOption(int i7) {
        return this.uninterpretedOption_.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasCcEnableArenas() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasCcGenericServices() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasCsharpNamespace() {
        return (this.bitField0_ & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasDeprecated() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasFeatures() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasGoPackage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasJavaGenerateEqualsAndHash() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasJavaGenericServices() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasJavaMultipleFiles() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasJavaOuterClassname() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasJavaPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasJavaStringCheckUtf8() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasObjcClassPrefix() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasOptimizeFor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasPhpClassPrefix() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasPhpMetadataNamespace() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasPhpNamespace() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasPyGenericServices() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasRubyPackage() {
        return (this.bitField0_ & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public final boolean hasSwiftPrefix() {
        return (this.bitField0_ & 16384) != 0;
    }
}
