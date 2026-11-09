package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f21768b;

    public /* synthetic */ d(ReactHostImpl reactHostImpl, int i7) {
        this.f21767a = i7;
        this.f21768b = reactHostImpl;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21767a) {
            case 0:
                return ReactHostImpl.reload$lambda$7$lambda$6(this.f21768b, task);
            case 1:
                return ReactHostImpl.getOrCreateStartTask$lambda$26(this.f21768b, task);
            case 2:
                return ReactHostImpl.callAfterGetOrCreateReactInstance$lambda$30(this.f21768b, task);
            default:
                return ReactHostImpl._get_jsBundleLoader_$lambda$42(this.f21768b, task);
        }
    }
}
