package com.bumptech.glide.manager;

import com.bumptech.glide.request.target.Target;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o implements LifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f21063a = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
        Iterator it = J1.o.e(this.f21063a).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        Iterator it = J1.o.e(this.f21063a).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        Iterator it = J1.o.e(this.f21063a).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onStop();
        }
    }
}
