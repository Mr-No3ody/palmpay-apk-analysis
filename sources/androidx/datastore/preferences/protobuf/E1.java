package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E1 extends AbstractC1134q1 implements ListValueOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final C2 getValues(int i7) {
        return ((F1) this.f16750b).getValues(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final int getValuesCount() {
        return ((F1) this.f16750b).getValuesCount();
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public final List getValuesList() {
        return Collections.unmodifiableList(((F1) this.f16750b).getValuesList());
    }
}
