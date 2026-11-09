package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f21807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21809d;

    public /* synthetic */ m(ReactHostImpl reactHostImpl, String str, Object obj, int i7) {
        this.f21806a = i7;
        this.f21807b = reactHostImpl;
        this.f21808c = str;
        this.f21809d = obj;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21806a) {
            case 0:
                return ReactHostImpl.callWithExistingReactInstance$lambda$28(this.f21807b, this.f21808c, (Function1) this.f21809d, task);
            case 1:
                return ReactHostImpl.callAfterGetOrCreateReactInstance$lambda$29(this.f21807b, this.f21808c, (Function1) this.f21809d, task);
            default:
                return ReactHostImpl.destroy$lambda$10$lambda$9(this.f21807b, this.f21808c, (Exception) this.f21809d, task);
        }
    }
}
