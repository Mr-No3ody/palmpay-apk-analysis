package p193n0;

import androidx.datastore.core.DataStore;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f39812a;

    public d(DataStore delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f39812a = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public final Flow getData() {
        return this.f39812a.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public final Object updateData(Function2 function2, Continuation continuation) {
        return this.f39812a.updateData(new c(function2, null), continuation);
    }
}
