package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeneratedAdapter[] f17341a;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f17341a = generatedAdapters;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        E e10 = new E();
        GeneratedAdapter[] generatedAdapterArr = this.f17341a;
        for (GeneratedAdapter generatedAdapter : generatedAdapterArr) {
            generatedAdapter.callMethods(source, event, false, e10);
        }
        for (GeneratedAdapter generatedAdapter2 : generatedAdapterArr) {
            generatedAdapter2.callMethods(source, event, true, e10);
        }
    }
}
