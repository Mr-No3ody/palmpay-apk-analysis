package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21773b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f21772a = i7;
        this.f21773b = obj;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21772a) {
            case 0:
                return ReactHostImpl.getOrCreateStartTask$lambda$26$lambda$25((Exception) this.f21773b, task);
            default:
                return ReactHostImpl.destroy$lambda$8((Function1) this.f21773b, task);
        }
    }
}
