package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultLifecycleObserver f17343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleEventObserver f17344b;

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f17343a = defaultLifecycleObserver;
        this.f17344b = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i7 = AbstractC1198h.f17457a[event.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.f17343a;
        switch (i7) {
            case 1:
                defaultLifecycleObserver.onCreate(source);
                break;
            case 2:
                defaultLifecycleObserver.onStart(source);
                break;
            case 3:
                defaultLifecycleObserver.onResume(source);
                break;
            case 4:
                defaultLifecycleObserver.onPause(source);
                break;
            case 5:
                defaultLifecycleObserver.onStop(source);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.f17344b;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(source, event);
        }
    }
}
