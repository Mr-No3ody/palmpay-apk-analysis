package com.google.protobuf;

import N8.q0;
import androidx.camera.video.u;
import com.google.android.material.navigation.NavigationBarView;
import com.google.api.Service;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] buffer, Object[] objects, int minFieldNumber, int maxFieldNumber, MessageLite defaultInstance, ProtoSyntax syntax, boolean useCachedSizeField, int[] intArray, int checkInitialized, int mapFieldPositions, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = buffer;
        this.objects = objects;
        this.minFieldNumber = minFieldNumber;
        this.maxFieldNumber = maxFieldNumber;
        this.lite = defaultInstance instanceof GeneratedMessageLite;
        this.syntax = syntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(defaultInstance);
        this.useCachedSizeField = useCachedSizeField;
        this.intArray = intArray;
        this.checkInitializedCount = checkInitialized;
        this.repeatedFieldOffsetStart = mapFieldPositions;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = defaultInstance;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T message, T other, int pos) {
        return isFieldPresent(message, pos) == isFieldPresent(other, pos);
    }

    private static <T> boolean booleanAt(T message, long offset) {
        return UnsafeUtil.getBoolean(message, offset);
    }

    private static void checkMutable(Object message) {
        if (isMutable(message)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] data, int position, int limit, MapEntryLite.Metadata<K, V> metadata, Map<K, V> target, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
        int i7 = registers.int1;
        if (i7 < 0 || i7 > limit - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i10 = iDecodeVarint32 + i7;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i10) {
            int iDecodeVarint33 = iDecodeVarint32 + 1;
            int i11 = data[iDecodeVarint32];
            if (i11 < 0) {
                iDecodeVarint33 = ArrayDecoders.decodeVarint32(i11, data, iDecodeVarint33, registers);
                i11 = registers.int1;
            }
            int i12 = iDecodeVarint33;
            int i13 = i11 >>> 3;
            int i14 = i11 & 7;
            if (i13 != 1) {
                if (i13 == 2 && i14 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(data, i12, limit, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i11, data, i12, limit, registers);
                }
            } else if (i14 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(data, i12, limit, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i11, data, i12, limit, registers);
            }
        }
        if (iDecodeVarint32 != i10) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        target.put(obj, obj2);
        return i10;
    }

    private int decodeMapEntryValue(byte[] data, int position, int limit, WireFormat.FieldType fieldType, Class<?> messageType, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(data, position, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(data, position));
                return position + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(data, position));
                return position + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(data, position));
                return position + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(data, position));
                return position + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint65;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) messageType), data, position, limit, registers);
            case 15:
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint66;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(data, position, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T message, long offset) {
        return UnsafeUtil.getDouble(message, offset);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i7, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i7);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i7)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i7)) == null) ? ub2 : (UB) filterUnknownEnumMap(i7, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i7, int i10, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i7));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i10, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T message, long offset) {
        return UnsafeUtil.getFloat(message, offset);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int pos) {
        return (Internal.EnumVerifier) this.objects[u.y(pos, 3, 2, 1)];
    }

    private Object getMapFieldDefaultEntry(int pos) {
        return this.objects[(pos / 3) * 2];
    }

    private Schema getMessageFieldSchema(int pos) {
        int i7 = (pos / 3) * 2;
        Schema schema = (Schema) this.objects[i7];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i7 + 1]);
        this.objects[i7] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object message) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) message;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> schema, T message) {
        return schema.getSerializedSize(schema.getFromMessage(message));
    }

    private static <T> int intAt(T message, long offset) {
        return UnsafeUtil.getInt(message, offset);
    }

    private static boolean isEnforceUtf8(int value) {
        return (value & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        if (presenceFieldOffset == 1048575) {
            return isFieldPresent(message, pos);
        }
        return (presenceField & presenceMask) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int value) {
        return (value & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object message, int typeAndOffset, int pos) {
        List list = (List) UnsafeUtil.getObject(message, offset(typeAndOffset));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!messageFieldSchema.isInitialized(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t, int i7, int i10) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t, offset(i7)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) message).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T message, T other, int pos) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos) & 1048575;
        return UnsafeUtil.getInt(message, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(other, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T message, int fieldNumber, int pos) {
        return UnsafeUtil.getInt(message, (long) (presenceMaskAndOffsetAt(pos) & 1048575)) == fieldNumber;
    }

    private static boolean isRequired(int value) {
        return (value & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T message, long offset) {
        return UnsafeUtil.getLong(message, offset);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object message, int pos, Object mapDefaultEntry, ExtensionRegistryLite extensionRegistry, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(pos));
        Object object = UnsafeUtil.getObject(message, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(mapDefaultEntry);
            UnsafeUtil.putObject(message, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(message, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(mapDefaultEntry), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T targetParent, T sourceParent, int pos) {
        if (isFieldPresent(sourceParent, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isFieldPresent(targetParent, pos)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(targetParent, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(targetParent, jOffset, object);
                }
                setFieldPresent(targetParent, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(targetParent, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T targetParent, T sourceParent, int pos) {
        int iNumberAt = numberAt(pos);
        if (isOneofPresent(sourceParent, iNumberAt, pos)) {
            long jOffset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(sourceParent, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isOneofPresent(targetParent, iNumberAt, pos)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(targetParent, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(targetParent, jOffset, object);
                }
                setOneofPresent(targetParent, iNumberAt, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(targetParent, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(pos);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putDouble(message, jOffset, UnsafeUtil.getDouble(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 1:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putFloat(message, jOffset, UnsafeUtil.getFloat(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 2:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 3:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 4:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 5:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 6:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 7:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putBoolean(message, jOffset, UnsafeUtil.getBoolean(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 8:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 9:
                mergeMessage(message, other, pos);
                break;
            case 10:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 11:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 12:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 13:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 14:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 15:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, jOffset, UnsafeUtil.getInt(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 16:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, jOffset, UnsafeUtil.getLong(other, jOffset));
                    setFieldPresent(message, pos);
                }
                break;
            case 17:
                mergeMessage(message, other, pos);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
            case 39:
            case 40:
            case 41:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
            case 48:
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                this.listFieldSchema.mergeListsAt(message, other, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, message, other, jOffset);
                break;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(other, iNumberAt, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setOneofPresent(message, iNumberAt, pos);
                }
                break;
            case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                mergeOneofMessage(message, other, pos);
                break;
            case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
            case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
            case 64:
            case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
            case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
            case 67:
                if (isOneofPresent(other, iNumberAt, pos)) {
                    UnsafeUtil.putObject(message, jOffset, UnsafeUtil.getObject(other, jOffset));
                    setOneofPresent(message, iNumberAt, pos);
                }
                break;
            case 68:
                mergeOneofMessage(message, other, pos);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T message, int pos) {
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        long jOffset = offset(typeAndOffsetAt(pos));
        if (!isFieldPresent(message, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(message, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T message, int fieldNumber, int pos) {
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        if (!isOneofPresent(message, fieldNumber, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(message, offset(typeAndOffsetAt(pos)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> messageClass, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        FieldInfo[] fields = messageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i7 = 0;
        int i10 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i7++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i10++;
            }
        }
        int[] iArr2 = i7 > 0 ? new int[i7] : null;
        int[] iArr3 = i10 > 0 ? new int[i10] : null;
        int[] checkInitialized = messageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i11 < fields.length) {
            FieldInfo fieldInfo2 = fields[i11];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i12, objArr);
            if (i13 < checkInitialized.length && checkInitialized[i13] == fieldNumber3) {
                checkInitialized[i13] = i12;
                i13++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i14] = i12;
                i14++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i15] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i15++;
                }
                i11++;
                i12 += 3;
            }
            i11++;
            i12 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0354  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ad  */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i7;
        int iCharAt;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        char c6;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        int i31;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i32;
        java.lang.reflect.Field fieldReflectField2;
        java.lang.reflect.Field fieldReflectField3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        String stringInfo = messageInfo.getStringInfo();
        int length = stringInfo.length();
        char c10 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (stringInfo.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int iCharAt2 = stringInfo.charAt(i7);
        if (iCharAt2 >= 55296) {
            int i39 = iCharAt2 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = stringInfo.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt2 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            iCharAt = 0;
            i11 = 0;
            i15 = 0;
            i10 = 0;
            i14 = 0;
            iArr = EMPTY_INT_ARRAY;
            i13 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt3 = stringInfo.charAt(i38);
            if (iCharAt3 >= 55296) {
                int i42 = iCharAt3 & 8191;
                int i43 = 13;
                while (true) {
                    i23 = i41 + 1;
                    cCharAt8 = stringInfo.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i23;
                }
                iCharAt3 = i42 | (cCharAt8 << i43);
                i41 = i23;
            }
            int i44 = i41 + 1;
            int iCharAt4 = stringInfo.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    cCharAt7 = stringInfo.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                iCharAt4 = i45 | (cCharAt7 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int iCharAt5 = stringInfo.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    cCharAt6 = stringInfo.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                iCharAt5 = i48 | (cCharAt6 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            int iCharAt6 = stringInfo.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    cCharAt5 = stringInfo.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                iCharAt6 = i51 | (cCharAt5 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            iCharAt = stringInfo.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    cCharAt4 = stringInfo.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            int iCharAt7 = stringInfo.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    cCharAt3 = stringInfo.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                iCharAt7 = i57 | (cCharAt3 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            int iCharAt8 = stringInfo.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    cCharAt2 = stringInfo.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int iCharAt9 = stringInfo.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    cCharAt = stringInfo.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                iCharAt9 = i63 | (cCharAt << i64);
                i62 = i16;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i10 = (iCharAt3 * 2) + iCharAt4;
            int i65 = iCharAt7;
            i11 = iCharAt5;
            i12 = i65;
            i13 = iCharAt3;
            iArr = iArr2;
            i14 = iCharAt9;
            i38 = i62;
            i15 = iCharAt6;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = messageInfo.getObjects();
        Class<?> cls = messageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i66 = i14 + i12;
        int i67 = i66;
        int i68 = i14;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = stringInfo.charAt(i38);
            if (iCharAt10 >= c10) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    cCharAt12 = stringInfo.charAt(i73);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i24 = i35;
            } else {
                i24 = i71;
            }
            int i75 = i24 + 1;
            int iCharAt11 = stringInfo.charAt(i24);
            if (iCharAt11 >= c10) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = stringInfo.charAt(i77);
                    i25 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                    length = i25;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i26 = i34;
            } else {
                i25 = length;
                i26 = i75;
            }
            int i79 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            int i80 = iCharAt10;
            if (i79 >= ONEOF_TYPE_OFFSET) {
                int i81 = i26 + 1;
                int iCharAt12 = stringInfo.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = 13;
                    while (true) {
                        i33 = i81 + 1;
                        cCharAt10 = stringInfo.charAt(i81);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i81 = i33;
                        c11 = 55296;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i83);
                    i81 = i33;
                }
                int i84 = i79 - 51;
                int i85 = iCharAt12;
                if (i84 == 9 || i84 == 17) {
                    objArr[u.y(i69, 3, 2, 1)] = objects[i10];
                    i10++;
                } else if (i84 == 12 && (messageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr[u.y(i69, 3, 2, 1)] = objects[i10];
                    i10++;
                }
                int i86 = i85 * 2;
                Object obj = objects[i86];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i86] = fieldReflectField2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                int i87 = i86 + 1;
                Object obj2 = objects[i87];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i87] = fieldReflectField3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i66 = i66;
                i38 = i81;
                i31 = iObjectFieldOffset3;
                c6 = 2;
                i13 = i13;
                iCharAt11 = iCharAt11;
                i30 = i10;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i29 = 0;
            } else {
                int i88 = i10 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i10]);
                if (i79 == 9 || i79 == 17) {
                    i13 = i13;
                    objArr[u.y(i69, 3, 2, 1)] = fieldReflectField4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i13 = i13;
                        i32 = i10 + 2;
                        objArr[u.y(i69, 3, 2, 1)] = objects[i88];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i13 = i13;
                        if (messageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i32 = i10 + 2;
                            objArr[u.y(i69, 3, 2, 1)] = objects[i88];
                        }
                    } else {
                        if (i79 == 50) {
                            int i89 = i68 + 1;
                            iArr[i68] = i69;
                            int i90 = (i69 / 3) * 2;
                            int i91 = i10 + 2;
                            objArr[i90] = objects[i88];
                            i68 = i89;
                            if ((iCharAt11 & 2048) != 0) {
                                i27 = i10 + 3;
                                objArr[i90 + 1] = objects[i91];
                            } else {
                                i27 = i91;
                            }
                        } else {
                            i13 = i13;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0 || i79 > 17) {
                            c6 = 2;
                            iObjectFieldOffset2 = 1048575;
                            i28 = i26;
                            i29 = 0;
                        } else {
                            int i92 = i26 + 1;
                            int iCharAt13 = stringInfo.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i93 = iCharAt13 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i28 = i92 + 1;
                                    cCharAt9 = stringInfo.charAt(i92);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i93 |= (cCharAt9 & 8191) << i94;
                                    i94 += 13;
                                    i92 = i28;
                                }
                                iCharAt13 = i93 | (cCharAt9 << i94);
                            } else {
                                i28 = i92;
                            }
                            c6 = 2;
                            int i95 = (iCharAt13 / 32) + (i13 * 2);
                            Object obj3 = objects[i95];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldReflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i95] = fieldReflectField;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i29 = iCharAt13 % 32;
                        }
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i67] = iObjectFieldOffset;
                            i67++;
                        }
                        i30 = i27;
                        i31 = iObjectFieldOffset;
                        i38 = i28;
                    }
                    i27 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((iCharAt11 & 4096) != 0) {
                        c6 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i28 = i26;
                        i29 = 0;
                    } else {
                        c6 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i28 = i26;
                        i29 = 0;
                    }
                    if (i79 >= 18) {
                        iArr[i67] = iObjectFieldOffset;
                        i67++;
                    }
                    i30 = i27;
                    i31 = iObjectFieldOffset;
                    i38 = i28;
                }
                i27 = i88;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) != 0) {
                    c6 = 2;
                    iObjectFieldOffset2 = 1048575;
                    i28 = i26;
                    i29 = 0;
                } else {
                    c6 = 2;
                    iObjectFieldOffset2 = 1048575;
                    i28 = i26;
                    i29 = 0;
                }
                if (i79 >= 18) {
                    iArr[i67] = iObjectFieldOffset;
                    i67++;
                }
                i30 = i27;
                i31 = iObjectFieldOffset;
                i38 = i28;
            }
            int i96 = i69 + 1;
            iArr4[i69] = i80;
            int i97 = i69 + 2;
            String str = stringInfo;
            iArr4[i96] = ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & 512) != 0 ? ENFORCE_UTF8_MASK : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | i31;
            i69 += 3;
            iArr4[i97] = (i29 << 20) | iObjectFieldOffset2;
            i10 = i30;
            i66 = i66;
            iArr3 = iArr4;
            i13 = i13;
            length = i25;
            stringInfo = str;
            c10 = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i11, i15, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), false, iArr, i14, i66, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int pos) {
        return this.buffer[pos];
    }

    private static long offset(int value) {
        return value & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T message, long offset) {
        return ((Boolean) UnsafeUtil.getObject(message, offset)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T message, long offset) {
        return ((Double) UnsafeUtil.getObject(message, offset)).doubleValue();
    }

    private static <T> float oneofFloatAt(T message, long offset) {
        return ((Float) UnsafeUtil.getObject(message, offset)).floatValue();
    }

    private static <T> int oneofIntAt(T message, long offset) {
        return ((Integer) UnsafeUtil.getObject(message, offset)).intValue();
    }

    private static <T> long oneofLongAt(T message, long offset) {
        return ((Long) UnsafeUtil.getObject(message, offset)).longValue();
    }

    private <K, V> int parseMapField(T message, byte[] data, int position, int limit, int bufferPosition, long fieldOffset, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(bufferPosition);
        Object object = unsafe.getObject(message, fieldOffset);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(message, fieldOffset, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(data, position, limit, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int typeAndOffset, int fieldType, long fieldOffset, int bufferPosition, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j6 = this.buffer[bufferPosition + 2] & 1048575;
        switch (fieldType) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Double.valueOf(ArrayDecoders.decodeDouble(data, position)));
                int i7 = position + 8;
                unsafe.putInt(message, j6, number);
                return i7;
            case 52:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Float.valueOf(ArrayDecoders.decodeFloat(data, position)));
                int i10 = position + 4;
                unsafe.putInt(message, j6, number);
                return i10;
            case 53:
            case 54:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(registers.long1));
                unsafe.putInt(message, j6, number);
                return iDecodeVarint64;
            case 55:
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(registers.int1));
                unsafe.putInt(message, j6, number);
                return iDecodeVarint32;
            case 56:
            case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Long.valueOf(ArrayDecoders.decodeFixed64(data, position)));
                int i11 = position + 8;
                unsafe.putInt(message, j6, number);
                return i11;
            case 57:
            case 64:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(ArrayDecoders.decodeFixed32(data, position)));
                int i12 = position + 4;
                unsafe.putInt(message, j6, number);
                return i12;
            case 58:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(message, j6, number);
                return iDecodeVarint65;
            case 59:
                if (wireType != 2) {
                    return position;
                }
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(data, position, registers);
                int i13 = registers.int1;
                if (i13 == 0) {
                    unsafe.putObject(message, fieldOffset, "");
                } else {
                    if ((typeAndOffset & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(data, iDecodeVarint33, iDecodeVarint33 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(message, fieldOffset, new String(data, iDecodeVarint33, i13, Internal.UTF_8));
                    iDecodeVarint33 += i13;
                }
                unsafe.putInt(message, j6, number);
                return iDecodeVarint33;
            case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                if (wireType != 2) {
                    return position;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(bufferPosition), data, position, limit, registers);
                storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                if (wireType != 2) {
                    return position;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(data, position, registers);
                unsafe.putObject(message, fieldOffset, registers.object1);
                unsafe.putInt(message, j6, number);
                return iDecodeBytes;
            case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint34 = ArrayDecoders.decodeVarint32(data, position, registers);
                int i14 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(bufferPosition);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i14)) {
                    getMutableUnknownFields(message).storeField(tag, Long.valueOf(i14));
                    return iDecodeVarint34;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(i14));
                unsafe.putInt(message, j6, number);
                return iDecodeVarint34;
            case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint35 = ArrayDecoders.decodeVarint32(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(message, j6, number);
                return iDecodeVarint35;
            case 67:
                if (wireType != 0) {
                    return position;
                }
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(message, j6, number);
                return iDecodeVarint66;
            case 68:
                if (wireType == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(bufferPosition), data, position, limit, (tag & (-8)) | 4, registers);
                    storeOneofMessageField(message, number, bufferPosition, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return position;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int bufferPosition, long typeAndOffset, int fieldType, long fieldOffset, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(message, fieldOffset);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(message, fieldOffset, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (fieldType) {
            case 18:
            case 35:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedDoubleList(data, position, protobufList, registers);
                }
                if (wireType == 1) {
                    return ArrayDecoders.decodeDoubleList(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 19:
            case 36:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFloatList(data, position, protobufList, registers);
                }
                if (wireType == 5) {
                    return ArrayDecoders.decodeFloatList(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 20:
            case 21:
            case 37:
            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedVarint64List(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeVarint64List(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 22:
            case 29:
            case 39:
            case 43:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedVarint32List(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 23:
            case 32:
            case 40:
            case 46:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFixed64List(data, position, protobufList, registers);
                }
                if (wireType == 1) {
                    return ArrayDecoders.decodeFixed64List(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 24:
            case 31:
            case 41:
            case 45:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFixed32List(data, position, protobufList, registers);
                }
                if (wireType == 5) {
                    return ArrayDecoders.decodeFixed32List(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedBoolList(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeBoolList(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 26:
                if (wireType == 2) {
                    return (typeAndOffset & 536870912) == 0 ? ArrayDecoders.decodeStringList(tag, data, position, limit, protobufList, registers) : ArrayDecoders.decodeStringListRequireUtf8(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 27:
                if (wireType == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 28:
                if (wireType == 2) {
                    return ArrayDecoders.decodeBytesList(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
            case 44:
                if (wireType != 2) {
                    if (wireType == 0) {
                        iDecodeVarint32List = ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufList, registers);
                    }
                    return position;
                }
                iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(data, position, protobufList, registers);
                SchemaUtil.filterUnknownEnumList((Object) message, number, (List<Integer>) protobufList, getEnumFieldVerifier(bufferPosition), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedSInt32List(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeSInt32List(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case 34:
            case 48:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedSInt64List(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeSInt64List(tag, data, position, limit, protobufList, registers);
                }
                return position;
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                if (wireType == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufList, registers);
                }
                return position;
            default:
                return position;
        }
    }

    private int positionForFieldNumber(final int number) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, 0);
    }

    private int presenceMaskAndOffsetAt(int pos) {
        return this.buffer[pos + 2];
    }

    private <E> void readGroupList(Object message, long offset, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistry) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(message, offset), schema, extensionRegistry);
    }

    private <E> void readMessageList(Object message, int typeAndOffset, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistry) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)), schema, extensionRegistry);
    }

    private void readString(Object message, int typeAndOffset, Reader reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readString());
        } else {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readBytes());
        }
    }

    private void readStringList(Object message, int typeAndOffset, Reader reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> messageClass, String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = messageClass.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbQ = q0.q("Field ", fieldName, " for ");
            sbQ.append(messageClass.getName());
            sbQ.append(" not found. Known fields are ");
            sbQ.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbQ.toString());
        }
    }

    private void setFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j6 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j6 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(message, j6, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(message, j6));
    }

    private void setOneofPresent(T message, int fieldNumber, int pos) {
        UnsafeUtil.putInt(message, presenceMaskAndOffsetAt(pos) & 1048575, fieldNumber);
    }

    private int slowPositionForFieldNumber(final int number, int min) {
        int length = (this.buffer.length / 3) - 1;
        while (min <= length) {
            int i7 = (length + min) >>> 1;
            int i10 = i7 * 3;
            int iNumberAt = numberAt(i10);
            if (number == iNumberAt) {
                return i10;
            }
            if (number < iNumberAt) {
                length = i7 - 1;
            } else {
                min = i7 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fi, int[] buffer, int bufferIndex, Object[] objects) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i7;
        Class<?> messageFieldClass;
        int i10;
        OneofInfo oneof = fi.getOneof();
        if (oneof == null) {
            FieldType type = fi.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fi.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fi.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fi.getPresenceMask());
            } else if (fi.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fi.getCachedSizeField());
            }
            buffer[bufferIndex] = fi.getFieldNumber();
            int i11 = bufferIndex + 1;
            if (fi.isEnforceUtf8()) {
                i7 = ENFORCE_UTF8_MASK;
            } else {
                i7 = 0;
            }
            buffer[i11] = (fi.isRequired() ? REQUIRED_MASK : 0) | i7 | (iId << 20) | iObjectFieldOffset;
            buffer[bufferIndex + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = fi.getMessageFieldClass();
            if (fi.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objects[u.y(bufferIndex, 3, 2, 1)] = messageFieldClass;
                    return;
                } else {
                    if (fi.getEnumVerifier() != null) {
                        objects[u.y(bufferIndex, 3, 2, 1)] = fi.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i10 = (bufferIndex / 3) * 2;
            objects[i10] = fi.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objects[i10 + 1] = messageFieldClass;
            } else if (fi.getEnumVerifier() != null) {
                objects[i10 + 1] = fi.getEnumVerifier();
            }
        }
        iId = fi.getType().id() + ONEOF_TYPE_OFFSET;
        iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        buffer[bufferIndex] = fi.getFieldNumber();
        int i12 = bufferIndex + 1;
        if (fi.isEnforceUtf8()) {
            i7 = ENFORCE_UTF8_MASK;
        } else {
            i7 = 0;
        }
        buffer[i12] = (fi.isRequired() ? REQUIRED_MASK : 0) | i7 | (iId << 20) | iObjectFieldOffset;
        buffer[bufferIndex + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = fi.getMessageFieldClass();
        if (fi.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objects[u.y(bufferIndex, 3, 2, 1)] = messageFieldClass;
                return;
            } else {
                if (fi.getEnumVerifier() != null) {
                    objects[u.y(bufferIndex, 3, 2, 1)] = fi.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i10 = (bufferIndex / 3) * 2;
        objects[i10] = fi.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objects[i10 + 1] = messageFieldClass;
        } else if (fi.getEnumVerifier() != null) {
            objects[i10 + 1] = fi.getEnumVerifier();
        }
    }

    private void storeMessageField(T message, int pos, Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setFieldPresent(message, pos);
    }

    private void storeOneofMessageField(T message, int fieldNumber, int pos, Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setOneofPresent(message, fieldNumber, pos);
    }

    private static int type(int value) {
        return (value & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int pos) {
        return this.buffer[pos + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(T message, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z3;
        int i7;
        int i10;
        int i11;
        boolean z8;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            FieldSet<T> extensions = messageSchema.extensionSchema.getExtensions(message);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = messageSchema.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i13);
            int iNumberAt = messageSchema.numberAt(i13);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i15 = messageSchema.buffer[i13 + 2];
                z3 = true;
                int i16 = i15 & 1048575;
                if (i16 != i12) {
                    i14 = i16 == 1048575 ? 0 : unsafe.getInt(message, i16);
                    i12 = i16;
                }
                i7 = i12;
                i10 = i14;
                i11 = 1 << (i15 >>> 20);
            } else {
                z3 = true;
                i7 = i12;
                i10 = i14;
                i11 = 0;
            }
            while (entry != null && messageSchema.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                messageSchema.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeDouble(iNumberAt, doubleAt(message, jOffset));
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeFloat(iNumberAt, floatAt(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeBool(iNumberAt, booleanAt(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(message, jOffset), writer);
                    }
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(message, jOffset), messageSchema.getMessageFieldSchema(i13));
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(message, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(message, i13, i7, i10, i11)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(message, jOffset), messageSchema.getMessageFieldSchema(i13));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, messageSchema.getMessageFieldSchema(i13));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer);
                    break;
                case 29:
                    z8 = false;
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    z8 = false;
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 31:
                    z8 = false;
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 32:
                    z8 = false;
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 33:
                    z8 = false;
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 34:
                    z8 = false;
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, z3);
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    SchemaUtil.writeGroupList(messageSchema.numberAt(i13), (List) unsafe.getObject(message, jOffset), writer, messageSchema.getMessageFieldSchema(i13));
                    break;
                case 50:
                    messageSchema.writeMapHelper(writer, iNumberAt, unsafe.getObject(message, jOffset), i13);
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(message, jOffset));
                    }
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(message, jOffset));
                    }
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    break;
                case 54:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(message, jOffset));
                    }
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(message, jOffset), writer);
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(message, jOffset), messageSchema.getMessageFieldSchema(i13));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(message, jOffset));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(message, jOffset));
                    }
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(message, jOffset));
                    }
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(message, iNumberAt, i13)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(message, jOffset), messageSchema.getMessageFieldSchema(i13));
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
            i14 = i10;
            i12 = i7;
            entry = entry;
        }
        while (entry != null) {
            messageSchema.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, message, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T message, Writer writer) throws IOException {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, message, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(message);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(message, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(message, length)) {
                        writer.writeFloat(iNumberAt, floatAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(message, length)) {
                        writer.writeInt64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(message, length)) {
                        writer.writeUInt64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(message, length)) {
                        writer.writeInt32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(message, length)) {
                        writer.writeFixed64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(message, length)) {
                        writer.writeFixed32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(message, length)) {
                        writer.writeBool(iNumberAt, booleanAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(message, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(message, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(message, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(message, length)) {
                        writer.writeUInt32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(message, length)) {
                        writer.writeEnum(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(message, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(message, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(message, length)) {
                        writer.writeSInt32(iNumberAt, intAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(message, length)) {
                        writer.writeSInt64(iNumberAt, longAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(message, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), length);
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(message, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(message, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int number, Object mapField, int pos) throws IOException {
        if (mapField != null) {
            writer.writeMap(number, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(pos)), this.mapFieldSchema.forMapData(mapField));
        }
    }

    private void writeString(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value instanceof String) {
            writer.writeString(fieldNumber, (String) value);
        } else {
            writer.writeBytes(fieldNumber, (ByteString) value);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> schema, T message, Writer writer) throws IOException {
        schema.writeTo(schema.getFromMessage(message), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T message, T other) {
        int length = this.buffer.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            if (!equals(message, other, i7)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(message).equals(this.unknownFieldSchema.getFromMessage(other))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(message).equals(this.extensionSchema.getExtensions(other));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:251:0x0559 A[PHI: r0 r1
      0x0559: PHI (r0v2 com.google.protobuf.MessageSchema<T>) = 
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v26 com.google.protobuf.MessageSchema<T>)
      (r0v32 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0559: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T message) {
        int i7;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeMessage;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t = message;
        Unsafe unsafe = UNSAFE;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int iComputeBytesSize = 0;
        int i13 = 1048575;
        while (i11 < messageSchema.buffer.length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i11);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = messageSchema.numberAt(i11);
            int i14 = messageSchema.buffer[i11 + 2];
            int i15 = i14 & i10;
            if (iType <= 17) {
                if (i15 != i13) {
                    i12 = i15 == i10 ? 0 : unsafe.getInt(t, i15);
                    i13 = i15;
                }
                i7 = 1 << (i14 >>> 20);
            } else {
                i7 = 0;
            }
            int i16 = iComputeBytesSize;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i15 = 0;
            }
            switch (iType) {
                case 0:
                    if (!messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeBytesSize = iComputeFloatSize + i16;
                        messageSchema = this;
                        t = message;
                    }
                    messageSchema = this;
                    t = message;
                    iComputeBytesSize = i16;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i16;
                        messageSchema = this;
                        t = message;
                    }
                    messageSchema = this;
                    t = message;
                    iComputeBytesSize = i16;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i16;
                        messageSchema = this;
                        t = message;
                    }
                    messageSchema = this;
                    t = message;
                    iComputeBytesSize = i16;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeFloatSize + i16;
                        messageSchema = this;
                        t = message;
                    }
                    messageSchema = this;
                    t = message;
                    iComputeBytesSize = i16;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        Object object = unsafe.getObject(t, jOffset);
                        iComputeBytesSize = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object)) + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 9:
                    if (!messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i11));
                        iComputeBytesSize = i16 + iComputeSizeMessage;
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i16;
                        messageSchema = this;
                        t = message;
                    }
                    messageSchema = this;
                    t = message;
                    iComputeBytesSize = i16;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i16;
                        messageSchema = this;
                        t = message;
                    }
                    messageSchema = this;
                    t = message;
                    iComputeBytesSize = i16;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i16;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i16;
                    break;
                case 17:
                    if (!messageSchema.isFieldPresent(t, i11, i13, i12, i7)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i11));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 18:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 19:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 20:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 21:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 22:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 23:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 24:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 26:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t, jOffset));
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 27:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i11));
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 28:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t, jOffset));
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 29:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 31:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 32:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 33:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 34:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i16;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i16;
                    }
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i11));
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = messageSchema.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t, jOffset), messageSchema.getMapFieldDefaultEntry(i11));
                    iComputeBytesSize = i16 + iComputeSizeMessage;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 52:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 53:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 54:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 55:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 56:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 57:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 58:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 59:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        Object object2 = unsafe.getObject(t, jOffset);
                        iComputeBytesSize = (object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2)) + i16;
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i11));
                        iComputeBytesSize = i16 + iComputeSizeMessage;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 64:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 67:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                case 68:
                    if (!messageSchema.isOneofPresent(t, iNumberAt, i11)) {
                        iComputeBytesSize = i16;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i11));
                        iComputeBytesSize = iComputeDoubleSize + i16;
                    }
                    break;
                default:
                    iComputeBytesSize = i16;
                    break;
            }
            i11 += 3;
            i10 = 1048575;
        }
        int unknownFieldsSerializedSize = iComputeBytesSize + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T message) {
        int i7;
        int iHashLong;
        int i10;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i12);
            int iNumberAt = numberAt(i12);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i7 = i11 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(message, jOffset)));
                    i11 = iHashLong + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(message, jOffset));
                    i11 = iHashLong + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i11 = iHashLong + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i11 = iHashLong + i7;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(message, jOffset);
                    i11 = i10 + iOneofIntAt;
                    break;
                case 5:
                    i7 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i11 = iHashLong + i7;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(message, jOffset);
                    i11 = i10 + iOneofIntAt;
                    break;
                case 7:
                    i7 = i11 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(message, jOffset));
                    i11 = iHashLong + i7;
                    break;
                case 8:
                    i7 = i11 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(message, jOffset)).hashCode();
                    i11 = iHashLong + i7;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(message, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i11 * 53;
                    iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i11 = iHashLong + i7;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(message, jOffset);
                    i11 = i10 + iOneofIntAt;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(message, jOffset);
                    i11 = i10 + iOneofIntAt;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(message, jOffset);
                    i11 = i10 + iOneofIntAt;
                    break;
                case 14:
                    i7 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i11 = iHashLong + i7;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(message, jOffset);
                    i11 = i10 + iOneofIntAt;
                    break;
                case 16:
                    i7 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(message, jOffset));
                    i11 = iHashLong + i7;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(message, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                case 39:
                case 40:
                case 41:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                case 48:
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    i7 = i11 * 53;
                    iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i11 = iHashLong + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                    i11 = iHashLong + i7;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(message, jOffset)));
                        i11 = iHashLong + i7;
                    }
                    break;
                case 52:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(message, jOffset));
                        i11 = iHashLong + i7;
                    }
                    break;
                case 53:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i11 = iHashLong + i7;
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i11 = iHashLong + i7;
                    }
                    break;
                case 55:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(message, jOffset);
                        i11 = i10 + iOneofIntAt;
                    }
                    break;
                case 56:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i11 = iHashLong + i7;
                    }
                    break;
                case 57:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(message, jOffset);
                        i11 = i10 + iOneofIntAt;
                    }
                    break;
                case 58:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(message, jOffset));
                        i11 = iHashLong + i7;
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(message, jOffset)).hashCode();
                        i11 = iHashLong + i7;
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i11 = iHashLong + i7;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i11 = iHashLong + i7;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(message, jOffset);
                        i11 = i10 + iOneofIntAt;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(message, jOffset);
                        i11 = i10 + iOneofIntAt;
                    }
                    break;
                case 64:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(message, jOffset);
                        i11 = i10 + iOneofIntAt;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i11 = iHashLong + i7;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(message, jOffset);
                        i11 = i10 + iOneofIntAt;
                    }
                    break;
                case 67:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(message, jOffset));
                        i11 = iHashLong + i7;
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, iNumberAt, i12)) {
                        i7 = i11 * 53;
                        iHashLong = UnsafeUtil.getObject(message, jOffset).hashCode();
                        i11 = iHashLong + i7;
                    }
                    break;
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(message).hashCode() + (i11 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(message).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T message) {
        int i7;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.checkInitializedCount) {
            int i14 = this.intArray[i12];
            int iNumberAt = numberAt(i14);
            int iTypeAndOffsetAt = typeAndOffsetAt(i14);
            int i15 = this.buffer[i14 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i11) {
                if (i16 != 1048575) {
                    i13 = UNSAFE.getInt(message, i16);
                }
                i10 = i13;
                i7 = i16;
            } else {
                i7 = i11;
                i10 = i13;
            }
            T t = message;
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t, i14, i7, i10, i17)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t, i14, i7, i10, i17) && !isInitialized(t, iTypeAndOffsetAt, getMessageFieldSchema(i14))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t, iTypeAndOffsetAt, i14)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t, iNumberAt, i14) && !isInitialized(t, iTypeAndOffsetAt, getMessageFieldSchema(i14))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t, iTypeAndOffsetAt, i14)) {
                    return false;
                }
            } else if (!isListInitialized(t, iTypeAndOffsetAt, i14)) {
                return false;
            }
            i12++;
            message = t;
            i11 = i7;
            i13 = i10;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(message).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T message) {
        if (isMutable(message)) {
            if (message instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) message;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i7);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(message, i7)) {
                                    getMessageFieldSchema(i7).makeImmutable(UNSAFE.getObject(message, jOffset));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                            case 48:
                            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                                this.listFieldSchema.makeImmutableListAt(message, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(message, jOffset);
                                if (object != null) {
                                    unsafe.putObject(message, jOffset, this.mapFieldSchema.toImmutable(object));
                                }
                                break;
                        }
                    } else if (isOneofPresent(message, numberAt(i7), i7)) {
                        getMessageFieldSchema(i7).makeImmutable(UNSAFE.getObject(message, jOffset));
                    }
                } else if (isFieldPresent(message, i7)) {
                    getMessageFieldSchema(i7).makeImmutable(UNSAFE.getObject(message, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(message);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(message);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, T other) {
        checkMutable(message);
        other.getClass();
        for (int i7 = 0; i7 < this.buffer.length; i7 += 3) {
            mergeSingleField(message, other, i7);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, message, other);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, message, other);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @com.google.protobuf.CanIgnoreReturnValue
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T message, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(message, writer);
        } else {
            writeFieldsInAscendingOrder(message, writer);
        }
    }

    private boolean isFieldPresent(T message, int pos) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j6 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j6 != 1048575) {
            return (UnsafeUtil.getInt(message, j6) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(message, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(message, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(message, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(message, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(message, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(message, jOffset));
            case 11:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(message, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(message, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(message, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(final int number, final int min) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, min);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, Reader reader, ExtensionRegistryLite extensionRegistry) throws IOException {
        extensionRegistry.getClass();
        checkMutable(message);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, message, reader, extensionRegistry);
    }

    private boolean equals(T message, T other, int pos) {
        int iTypeAndOffsetAt = typeAndOffsetAt(pos);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(message, other, pos) && Double.doubleToLongBits(UnsafeUtil.getDouble(message, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(other, jOffset));
            case 1:
                return arePresentForEquals(message, other, pos) && Float.floatToIntBits(UnsafeUtil.getFloat(message, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(other, jOffset));
            case 2:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset);
            case 3:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset);
            case 4:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset);
            case 5:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset);
            case 6:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset);
            case 7:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getBoolean(message, jOffset) == UnsafeUtil.getBoolean(other, jOffset);
            case 8:
                return arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset));
            case 9:
                return arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset));
            case 10:
                return arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset));
            case 11:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset);
            case 12:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset);
            case 13:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset);
            case 14:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset);
            case 15:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getInt(message, jOffset) == UnsafeUtil.getInt(other, jOffset);
            case 16:
                return arePresentForEquals(message, other, pos) && UnsafeUtil.getLong(message, jOffset) == UnsafeUtil.getLong(other, jOffset);
            case 17:
                return arePresentForEquals(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
            case 39:
            case 40:
            case 41:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case 44:
            case 45:
            case 46:
            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
            case 48:
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset));
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case PictureConfig.MAX_PAGE_SIZE /* 60 */:
            case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
            case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
            case 64:
            case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
            case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
            case 67:
            case 68:
                return isOneofCaseEqual(message, other, pos) && SchemaUtil.safeEquals(UnsafeUtil.getObject(message, jOffset), UnsafeUtil.getObject(other, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, byte[] data, int position, int limit, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(message, data, position, limit, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object message, int typeAndOffset, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(message, offset(typeAndOffset)));
    }
}
