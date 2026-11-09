package p178m0;

import androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder;
import androidx.datastore.preferences.protobuf.AbstractC1134q1;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1134q1 implements PreferencesProto$PreferenceMapOrBuilder {
    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final boolean containsPreferences(String str) {
        str.getClass();
        return ((f) this.f16750b).getPreferencesMap().containsKey(str);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final Map getPreferences() {
        return getPreferencesMap();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final int getPreferencesCount() {
        return ((f) this.f16750b).getPreferencesMap().size();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final Map getPreferencesMap() {
        return Collections.unmodifiableMap(((f) this.f16750b).getPreferencesMap());
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final k getPreferencesOrDefault(String str, k kVar) {
        str.getClass();
        Map preferencesMap = ((f) this.f16750b).getPreferencesMap();
        return preferencesMap.containsKey(str) ? (k) preferencesMap.get(str) : kVar;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final k getPreferencesOrThrow(String str) {
        str.getClass();
        Map preferencesMap = ((f) this.f16750b).getPreferencesMap();
        if (preferencesMap.containsKey(str)) {
            return (k) preferencesMap.get(str);
        }
        throw new IllegalArgumentException();
    }
}
