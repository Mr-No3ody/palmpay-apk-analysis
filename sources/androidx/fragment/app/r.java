package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.activity.result.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f17199a;

    public r(AtomicReference atomicReference) {
        this.f17199a = atomicReference;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) this.f17199a.get();
        if (aVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        aVar.a(obj);
    }

    @Override // androidx.activity.result.a
    public final void b() {
        androidx.activity.result.a aVar = (androidx.activity.result.a) this.f17199a.getAndSet(null);
        if (aVar != null) {
            aVar.b();
        }
    }
}
