package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Property extends GeneratedMessageLite<Property, Builder> implements PropertyOrBuilder {
    private static final Property DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Property> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    private String name_ = "";
    private String description_ = "";

    /* JADX INFO: renamed from: com.google.api.Property$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Property, Builder> implements PropertyOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((Property) this.instance).clearDescription();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Property) this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Property) this.instance).clearType();
            return this;
        }

        @Override // com.google.api.PropertyOrBuilder
        public String getDescription() {
            return ((Property) this.instance).getDescription();
        }

        @Override // com.google.api.PropertyOrBuilder
        public ByteString getDescriptionBytes() {
            return ((Property) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.PropertyOrBuilder
        public String getName() {
            return ((Property) this.instance).getName();
        }

        @Override // com.google.api.PropertyOrBuilder
        public ByteString getNameBytes() {
            return ((Property) this.instance).getNameBytes();
        }

        @Override // com.google.api.PropertyOrBuilder
        public PropertyType getType() {
            return ((Property) this.instance).getType();
        }

        @Override // com.google.api.PropertyOrBuilder
        public int getTypeValue() {
            return ((Property) this.instance).getTypeValue();
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((Property) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((Property) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Property) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Property) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setType(PropertyType propertyType) {
            copyOnWrite();
            ((Property) this.instance).setType(propertyType);
            return this;
        }

        public Builder setTypeValue(int i7) {
            copyOnWrite();
            ((Property) this.instance).setTypeValue(i7);
            return this;
        }

        private Builder() {
            super(Property.DEFAULT_INSTANCE);
        }
    }

    public enum PropertyType implements Internal.EnumLite {
        UNSPECIFIED(0),
        INT64(1),
        BOOL(2),
        STRING(3),
        DOUBLE(4),
        UNRECOGNIZED(-1);

        public static final int BOOL_VALUE = 2;
        public static final int DOUBLE_VALUE = 4;
        public static final int INT64_VALUE = 1;
        public static final int STRING_VALUE = 3;
        public static final int UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<PropertyType> internalValueMap = new Internal.EnumLiteMap<PropertyType>() { // from class: com.google.api.Property.PropertyType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PropertyType findValueByNumber(int i7) {
                return PropertyType.forNumber(i7);
            }
        };
        private final int value;

        public static final class PropertyTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new PropertyTypeVerifier();

            private PropertyTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i7) {
                return PropertyType.forNumber(i7) != null;
            }
        }

        PropertyType(int i7) {
            this.value = i7;
        }

        public static PropertyType forNumber(int i7) {
            if (i7 == 0) {
                return UNSPECIFIED;
            }
            if (i7 == 1) {
                return INT64;
            }
            if (i7 == 2) {
                return BOOL;
            }
            if (i7 == 3) {
                return STRING;
            }
            if (i7 != 4) {
                return null;
            }
            return DOUBLE;
        }

        public static Internal.EnumLiteMap<PropertyType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return PropertyTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static PropertyType valueOf(int i7) {
            return forNumber(i7);
        }
    }

    static {
        Property property = new Property();
        DEFAULT_INSTANCE = property;
        GeneratedMessageLite.registerDefaultInstance(Property.class, property);
    }

    private Property() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static Property getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Property parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Property) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Property> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(PropertyType propertyType) {
        this.type_ = propertyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i7) {
        this.type_ = i7;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Property();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"name_", "type_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Property> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Property.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.api.PropertyOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.PropertyOrBuilder
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    @Override // com.google.api.PropertyOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.PropertyOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.api.PropertyOrBuilder
    public PropertyType getType() {
        PropertyType propertyTypeForNumber = PropertyType.forNumber(this.type_);
        return propertyTypeForNumber == null ? PropertyType.UNRECOGNIZED : propertyTypeForNumber;
    }

    @Override // com.google.api.PropertyOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(Property property) {
        return DEFAULT_INSTANCE.createBuilder(property);
    }

    public static Property parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Property) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Property parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Property parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Property parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Property parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Property parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Property parseFrom(InputStream inputStream) throws IOException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Property parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Property parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
