package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import java.util.Map;
import p178m0.k;

/* JADX INFO: loaded from: classes.dex */
public interface PreferencesProto$PreferenceMapOrBuilder extends MessageLiteOrBuilder {
    boolean containsPreferences(String str);

    @Deprecated
    Map<String, k> getPreferences();

    int getPreferencesCount();

    Map<String, k> getPreferencesMap();

    k getPreferencesOrDefault(String str, k kVar);

    k getPreferencesOrThrow(String str);
}
