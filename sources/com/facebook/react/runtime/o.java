package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21811a;

    public /* synthetic */ o(int i7) {
        this.f21811a = i7;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21811a) {
            case 0:
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$41$lambda$40(task);
            default:
                return Task.makeVoid$lambda$7(task);
        }
    }
}
