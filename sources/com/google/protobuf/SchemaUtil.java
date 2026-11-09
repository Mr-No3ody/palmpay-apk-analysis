package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!packed) {
            return CodedOutputStream.computeBoolSize(fieldNumber, true) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int fieldNumber, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i7 = 0; i7 < list.size(); i7++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i7));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (!packed) {
            return (CodedOutputStream.computeTagSize(fieldNumber) * size) + iComputeSizeEnumListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeEnumSizeNoTag = 0;
            while (i7 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i7).intValue());
                i7++;
            }
            return iComputeEnumSizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i7 < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i7));
            i7++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int computeSizeFixed32List(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!packed) {
            return CodedOutputStream.computeFixed32Size(fieldNumber, 0) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!packed) {
            return CodedOutputStream.computeFixed64Size(fieldNumber, 0L) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int fieldNumber, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(fieldNumber, list.get(i7));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (!packed) {
            return (CodedOutputStream.computeTagSize(fieldNumber) * size) + iComputeSizeInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeInt32SizeNoTag = 0;
            while (i7 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i7).intValue());
                i7++;
            }
            return iComputeInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i7 < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i7));
            i7++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int computeSizeInt64List(int fieldNumber, List<Long> list, boolean packed) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (packed) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) + CodedOutputStream.computeTagSize(fieldNumber);
        }
        return (CodedOutputStream.computeTagSize(fieldNumber) * list.size()) + iComputeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeInt64SizeNoTag = 0;
            while (i7 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i7).longValue());
                i7++;
            }
            return iComputeInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i7 < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i7));
            i7++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int computeSizeMessage(int fieldNumber, Object value, Schema schema) {
        return value instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(fieldNumber, (LazyFieldLite) value) : CodedOutputStream.computeMessageSize(fieldNumber, (MessageLite) value, schema);
    }

    public static int computeSizeMessageList(int fieldNumber, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            iComputeTagSize = (obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj)) + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static int computeSizeSInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (!packed) {
            return (CodedOutputStream.computeTagSize(fieldNumber) * size) + iComputeSizeSInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i7 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i7).intValue());
                i7++;
            }
            return iComputeSInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i7 < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i7));
            i7++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int computeSizeSInt64List(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (!packed) {
            return (CodedOutputStream.computeTagSize(fieldNumber) * size) + iComputeSizeSInt64ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i7 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i7).longValue());
                i7++;
            }
            return iComputeSInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i7 < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i7));
            i7++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int computeSizeStringList(int fieldNumber, List<?> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        if (!(list instanceof LazyStringList)) {
            while (i7 < size) {
                Object obj = list.get(i7);
                iComputeTagSize = (obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                i7++;
            }
            return iComputeTagSize;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i7 < size) {
            Object raw = lazyStringList.getRaw(i7);
            iComputeTagSize = (raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw)) + iComputeTagSize;
            i7++;
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (!packed) {
            return (CodedOutputStream.computeTagSize(fieldNumber) * size) + iComputeSizeUInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i7 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i7).intValue());
                i7++;
            }
            return iComputeUInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i7 < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i7));
            i7++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int computeSizeUInt64List(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (!packed) {
            return (CodedOutputStream.computeTagSize(fieldNumber) * size) + iComputeSizeUInt64ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) + CodedOutputStream.computeTagSize(fieldNumber);
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i7 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i7).longValue());
                i7++;
            }
            return iComputeUInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i7 < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i7));
            i7++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i7, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) == null) {
                    ub2 = (UB) storeUnknownEnum(obj, i7, iIntValue, ub2, unknownFieldSchema);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = list.get(i11);
            int iIntValue2 = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue2) != null) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                ub2 = (UB) storeUnknownEnum(obj, i7, iIntValue2, ub2, unknownFieldSchema);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return ub2;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> clazz, String name) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(clazz.getName() + "$" + toCamelCase(name, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + name + " in " + clazz.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> schema, T message, T other) {
        FieldSet<T> extensions = schema.getExtensions(other);
        if (extensions.isEmpty()) {
            return;
        }
        schema.getMutableExtensions(message).mergeFrom(extensions);
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T message, T o10, long offset) {
        UnsafeUtil.putObject(message, offset, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(message, offset), UnsafeUtil.getObject(o10, offset)));
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> schema, T message, T other) {
        schema.setToMessage(message, schema.merge(schema.getFromMessage(message), schema.getFromMessage(other)));
    }

    public static void requireGeneratedMessage(Class<?> messageType) {
        Class<?> cls;
        if (!GeneratedMessageLite.class.isAssignableFrom(messageType) && (cls = GENERATED_MESSAGE_CLASS) != null && !cls.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object a3, Object b7) {
        if (a3 != b7) {
            return a3 != null && a3.equals(b7);
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int lo, int hi, int numFields) {
        if (hi < 40) {
            return true;
        }
        long j6 = ((long) hi) - ((long) lo);
        long j10 = numFields;
        return j6 + 10 <= ((j10 + 3) * 3) + ((2 * j10) + 3);
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB storeUnknownEnum(Object obj, int i7, int i10, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub2 == null) {
            ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub2, i7, i10);
        return ub2;
    }

    public static String toCamelCase(String name, boolean capNext) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < name.length(); i7++) {
            char cCharAt = name.charAt(i7);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    capNext = true;
                } else if (i7 != 0 || capNext) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (capNext) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            capNext = false;
        }
        return sb2.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int fieldNumber, boolean value, Writer writer) throws IOException {
        if (value) {
            writer.writeBool(fieldNumber, true);
        }
    }

    public static void writeBoolList(int fieldNumber, List<Boolean> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBoolList(fieldNumber, value, packed);
    }

    public static void writeBytes(int fieldNumber, ByteString value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytes(fieldNumber, value);
    }

    public static void writeBytesList(int fieldNumber, List<ByteString> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytesList(fieldNumber, value);
    }

    public static void writeDouble(int fieldNumber, double value, Writer writer) throws IOException {
        if (Double.doubleToRawLongBits(value) != 0) {
            writer.writeDouble(fieldNumber, value);
        }
    }

    public static void writeDoubleList(int fieldNumber, List<Double> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeDoubleList(fieldNumber, value, packed);
    }

    public static void writeEnum(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeEnum(fieldNumber, value);
        }
    }

    public static void writeEnumList(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeEnumList(fieldNumber, value, packed);
    }

    public static void writeFixed32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeFixed32(fieldNumber, value);
        }
    }

    public static void writeFixed32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed32List(fieldNumber, value, packed);
    }

    public static void writeFixed64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeFixed64(fieldNumber, value);
        }
    }

    public static void writeFixed64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed64List(fieldNumber, value, packed);
    }

    public static void writeFloat(int fieldNumber, float value, Writer writer) throws IOException {
        if (Float.floatToRawIntBits(value) != 0) {
            writer.writeFloat(fieldNumber, value);
        }
    }

    public static void writeFloatList(int fieldNumber, List<Float> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFloatList(fieldNumber, value, packed);
    }

    public static void writeGroupList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value);
    }

    public static void writeInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeInt32(fieldNumber, value);
        }
    }

    public static void writeInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt32List(fieldNumber, value, packed);
    }

    public static void writeInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeInt64(fieldNumber, value);
        }
    }

    public static void writeInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt64List(fieldNumber, value, packed);
    }

    public static void writeLazyFieldList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        Iterator<?> it = value.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, fieldNumber);
        }
    }

    public static void writeMessage(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value != null) {
            writer.writeMessage(fieldNumber, value);
        }
    }

    public static void writeMessageList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value);
    }

    public static void writeSFixed32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed32(fieldNumber, value);
        }
    }

    public static void writeSFixed32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(fieldNumber, value, packed);
    }

    public static void writeSFixed64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed64(fieldNumber, value);
        }
    }

    public static void writeSFixed64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(fieldNumber, value, packed);
    }

    public static void writeSInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSInt32(fieldNumber, value);
        }
    }

    public static void writeSInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt32List(fieldNumber, value, packed);
    }

    public static void writeSInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSInt64(fieldNumber, value);
        }
    }

    public static void writeSInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt64List(fieldNumber, value, packed);
    }

    public static void writeString(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value instanceof String) {
            writeStringInternal(fieldNumber, (String) value, writer);
        } else {
            writeBytes(fieldNumber, (ByteString) value, writer);
        }
    }

    private static void writeStringInternal(int fieldNumber, String value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeString(fieldNumber, value);
    }

    public static void writeStringList(int fieldNumber, List<String> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeStringList(fieldNumber, value);
    }

    public static void writeUInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeUInt32(fieldNumber, value);
        }
    }

    public static void writeUInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt32List(fieldNumber, value, packed);
    }

    public static void writeUInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeUInt64(fieldNumber, value);
        }
    }

    public static void writeUInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt64List(fieldNumber, value, packed);
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fields) {
        if (fields.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fields[0].getFieldNumber(), fields[fields.length - 1].getFieldNumber(), fields.length);
    }

    public static int computeSizeGroupList(int fieldNumber, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(fieldNumber, list.get(i7), schema);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int fieldNumber, List<?> value, Writer writer, Schema schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value, schema);
    }

    public static void writeMessageList(int fieldNumber, List<?> value, Writer writer, Schema schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value, schema);
    }

    public static int computeSizeMessageList(int fieldNumber, List<?> list, Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            iComputeTagSize = iComputeMessageSizeNoTag + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i7, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i7, iIntValue, ub2, unknownFieldSchema);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
            return ub2;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!enumVerifier.isInRange(iIntValue2)) {
                ub2 = (UB) storeUnknownEnum(obj, i7, iIntValue2, ub2, unknownFieldSchema);
                it.remove();
            }
        }
        return ub2;
    }
}
