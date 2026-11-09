package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC1123n;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import p178m0.h;
import p178m0.j;

/* JADX INFO: loaded from: classes.dex */
public interface PreferencesProto$ValueOrBuilder extends MessageLiteOrBuilder {
    boolean getBoolean();

    AbstractC1123n getBytes();

    double getDouble();

    float getFloat();

    int getInteger();

    long getLong();

    String getString();

    AbstractC1123n getStringBytes();

    h getStringSet();

    j getValueCase();

    boolean hasBoolean();

    boolean hasBytes();

    boolean hasDouble();

    boolean hasFloat();

    boolean hasInteger();

    boolean hasLong();

    boolean hasString();

    boolean hasStringSet();
}
