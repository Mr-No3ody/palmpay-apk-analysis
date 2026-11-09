package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    AbstractC1123n getEditionBytes();

    C1119l1 getFields(int index);

    int getFieldsCount();

    List<C1119l1> getFieldsList();

    String getName();

    AbstractC1123n getNameBytes();

    String getOneofs(int index);

    AbstractC1123n getOneofsBytes(int index);

    int getOneofsCount();

    List<String> getOneofsList();

    Y1 getOptions(int index);

    int getOptionsCount();

    List<Y1> getOptionsList();

    k2 getSourceContext();

    o2 getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
