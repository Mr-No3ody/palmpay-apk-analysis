package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DescriptorProtos$EnumDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
    String getName();

    AbstractC1123n getNameBytes();

    K getOptions();

    String getReservedName(int index);

    AbstractC1123n getReservedNameBytes(int index);

    int getReservedNameCount();

    List<String> getReservedNameList();

    H getReservedRange(int index);

    int getReservedRangeCount();

    List<H> getReservedRangeList();

    M getValue(int index);

    int getValueCount();

    List<M> getValueList();

    boolean hasName();

    boolean hasOptions();
}
