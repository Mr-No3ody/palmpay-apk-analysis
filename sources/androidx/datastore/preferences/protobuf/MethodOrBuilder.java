package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface MethodOrBuilder extends MessageLiteOrBuilder {
    String getName();

    AbstractC1123n getNameBytes();

    Y1 getOptions(int index);

    int getOptionsCount();

    List<Y1> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    AbstractC1123n getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    AbstractC1123n getResponseTypeUrlBytes();

    o2 getSyntax();

    int getSyntaxValue();
}
