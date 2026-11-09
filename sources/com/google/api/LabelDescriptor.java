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
public final class LabelDescriptor extends GeneratedMessageLite<LabelDescriptor, Builder> implements LabelDescriptorOrBuilder {
    private static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<LabelDescriptor> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private int valueType_;
    private String key_ = "";
    private String description_ = "";

    /* JADX INFO: renamed from: com.google.api.LabelDescriptor$1, reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.Builder<LabelDescriptor, Builder> implements LabelDescriptorOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((LabelDescriptor) this.instance).clearDescription();
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((LabelDescriptor) this.instance).clearKey();
            return this;
        }

        public Builder clearValueType() {
            copyOnWrite();
            ((LabelDescriptor) this.instance).clearValueType();
            return this;
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public String getDescription() {
            return ((LabelDescriptor) this.instance).getDescription();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public ByteString getDescriptionBytes() {
            return ((LabelDescriptor) this.instance).getDescriptionBytes();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public String getKey() {
            return ((LabelDescriptor) this.instance).getKey();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public ByteString getKeyBytes() {
            return ((LabelDescriptor) this.instance).getKeyBytes();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public ValueType getValueType() {
            return ((LabelDescriptor) this.instance).getValueType();
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public int getValueTypeValue() {
            return ((LabelDescriptor) this.instance).getValueTypeValue();
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setKeyBytes(byteString);
            return this;
        }

        public Builder setValueType(ValueType valueType) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setValueType(valueType);
            return this;
        }

        public Builder setValueTypeValue(int i7) {
            copyOnWrite();
            ((LabelDescriptor) this.instance).setValueTypeValue(i7);
            return this;
        }

        private Builder() {
            super(LabelDescriptor.DEFAULT_INSTANCE);
        }
    }

    public enum ValueType implements Internal.EnumLite {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);

        public static final int BOOL_VALUE = 1;
        public static final int INT64_VALUE = 2;
        public static final int STRING_VALUE = 0;
        private static final Internal.EnumLiteMap<ValueType> internalValueMap = new Internal.EnumLiteMap<ValueType>() { // from class: com.google.api.LabelDescriptor.ValueType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ValueType findValueByNumber(int i7) {
                return ValueType.forNumber(i7);
            }
        };
        private final int value;

        public static final class ValueTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ValueTypeVerifier();

            private ValueTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i7) {
                return ValueType.forNumber(i7) != null;
            }
        }

        ValueType(int i7) {
            this.value = i7;
        }

        public static ValueType forNumber(int i7) {
            if (i7 == 0) {
                return STRING;
            }
            if (i7 == 1) {
                return BOOL;
            }
            if (i7 != 2) {
                return null;
            }
            return INT64;
        }

        public static Internal.EnumLiteMap<ValueType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ValueTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ValueType valueOf(int i7) {
            return forNumber(i7);
        }
    }

    static {
        LabelDescriptor labelDescriptor = new LabelDescriptor();
        DEFAULT_INSTANCE = labelDescriptor;
        GeneratedMessageLite.registerDefaultInstance(LabelDescriptor.class, labelDescriptor);
    }

    private LabelDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    public static LabelDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LabelDescriptor> parser() {
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
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(ValueType valueType) {
        this.valueType_ = valueType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueTypeValue(int i7) {
        this.valueType_ = i7;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new LabelDescriptor();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LabelDescriptor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LabelDescriptor.class) {
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

    @Override // com.google.api.LabelDescriptorOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public ValueType getValueType() {
        ValueType valueTypeForNumber = ValueType.forNumber(this.valueType_);
        return valueTypeForNumber == null ? ValueType.UNRECOGNIZED : valueTypeForNumber;
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public int getValueTypeValue() {
        return this.valueType_;
    }

    public static Builder newBuilder(LabelDescriptor labelDescriptor) {
        return DEFAULT_INSTANCE.createBuilder(labelDescriptor);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LabelDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LabelDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
