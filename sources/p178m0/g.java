package p178m0;

import androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder;
import androidx.datastore.preferences.protobuf.AbstractC1123n;
import androidx.datastore.preferences.protobuf.AbstractC1134q1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1134q1 implements PreferencesProto$StringSetOrBuilder {
    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final String getStrings(int i7) {
        return ((h) this.f16750b).getStrings(i7);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final AbstractC1123n getStringsBytes(int i7) {
        return ((h) this.f16750b).getStringsBytes(i7);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final int getStringsCount() {
        return ((h) this.f16750b).getStringsCount();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final List getStringsList() {
        return Collections.unmodifiableList(((h) this.f16750b).getStringsList());
    }
}
