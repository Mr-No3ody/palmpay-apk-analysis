package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface FieldOrBuilder extends MessageLiteOrBuilder {
    EnumC1112j1 getCardinality();

    int getCardinalityValue();

    String getDefaultValue();

    AbstractC1123n getDefaultValueBytes();

    String getJsonName();

    AbstractC1123n getJsonNameBytes();

    EnumC1116k1 getKind();

    int getKindValue();

    String getName();

    AbstractC1123n getNameBytes();

    int getNumber();

    int getOneofIndex();

    Y1 getOptions(int index);

    int getOptionsCount();

    List<Y1> getOptionsList();

    boolean getPacked();

    String getTypeUrl();

    AbstractC1123n getTypeUrlBytes();
}
