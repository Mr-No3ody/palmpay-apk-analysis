package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface Reader {
    int getFieldNumber() throws IOException;

    int getTag();

    <T> void mergeGroupField(T target, Schema<T> schema, C1092e1 extensionRegistry) throws IOException;

    <T> void mergeMessageField(T target, Schema<T> schema, C1092e1 extensionRegistry) throws IOException;

    boolean readBool() throws IOException;

    void readBoolList(List<Boolean> target) throws IOException;

    AbstractC1123n readBytes() throws IOException;

    void readBytesList(List<AbstractC1123n> target) throws IOException;

    double readDouble() throws IOException;

    void readDoubleList(List<Double> target) throws IOException;

    int readEnum() throws IOException;

    void readEnumList(List<Integer> target) throws IOException;

    int readFixed32() throws IOException;

    void readFixed32List(List<Integer> target) throws IOException;

    long readFixed64() throws IOException;

    void readFixed64List(List<Long> target) throws IOException;

    float readFloat() throws IOException;

    void readFloatList(List<Float> target) throws IOException;

    @Deprecated
    <T> T readGroup(Class<T> clazz, C1092e1 extensionRegistry) throws IOException;

    @Deprecated
    <T> T readGroupBySchemaWithCheck(Schema<T> schema, C1092e1 extensionRegistry) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> target, Schema<T> targetType, C1092e1 extensionRegistry) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> target, Class<T> targetType, C1092e1 extensionRegistry) throws IOException;

    int readInt32() throws IOException;

    void readInt32List(List<Integer> target) throws IOException;

    long readInt64() throws IOException;

    void readInt64List(List<Long> target) throws IOException;

    <K, V> void readMap(Map<K, V> target, I1 mapDefaultEntry, C1092e1 extensionRegistry) throws IOException;

    <T> T readMessage(Class<T> clazz, C1092e1 extensionRegistry) throws IOException;

    <T> T readMessageBySchemaWithCheck(Schema<T> schema, C1092e1 extensionRegistry) throws IOException;

    <T> void readMessageList(List<T> target, Schema<T> schema, C1092e1 extensionRegistry) throws IOException;

    <T> void readMessageList(List<T> target, Class<T> targetType, C1092e1 extensionRegistry) throws IOException;

    int readSFixed32() throws IOException;

    void readSFixed32List(List<Integer> target) throws IOException;

    long readSFixed64() throws IOException;

    void readSFixed64List(List<Long> target) throws IOException;

    int readSInt32() throws IOException;

    void readSInt32List(List<Integer> target) throws IOException;

    long readSInt64() throws IOException;

    void readSInt64List(List<Long> target) throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> target) throws IOException;

    void readStringListRequireUtf8(List<String> target) throws IOException;

    String readStringRequireUtf8() throws IOException;

    int readUInt32() throws IOException;

    void readUInt32List(List<Integer> target) throws IOException;

    long readUInt64() throws IOException;

    void readUInt64List(List<Long> target) throws IOException;

    boolean shouldDiscardUnknownFields();

    boolean skipField() throws IOException;
}
