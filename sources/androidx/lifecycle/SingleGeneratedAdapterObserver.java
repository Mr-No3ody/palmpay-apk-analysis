package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeneratedAdapter f17404a;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        Intrinsics.checkNotNullParameter(generatedAdapter, "generatedAdapter");
        this.f17404a = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        GeneratedAdapter generatedAdapter = this.f17404a;
        generatedAdapter.callMethods(source, event, false, null);
        generatedAdapter.callMethods(source, event, true, null);
    }
}
