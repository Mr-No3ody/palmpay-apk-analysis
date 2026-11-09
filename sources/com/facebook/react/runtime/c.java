package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f21765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21766c;

    public /* synthetic */ c(ReactHostImpl reactHostImpl, String str, int i7) {
        this.f21764a = i7;
        this.f21765b = reactHostImpl;
        this.f21766c = str;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21764a) {
            case 0:
                return ReactHostImpl.reload$lambda$7$lambda$5$lambda$4(this.f21765b, this.f21766c, task);
            case 1:
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$41$lambda$38(this.f21765b, this.f21766c, task);
            case 2:
                return ReactHostImpl.getOrCreateReloadTask$lambda$54(this.f21765b, "getOrCreateReloadTask()", this.f21766c, task);
            default:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$62(this.f21765b, "getOrCreateDestroyTask()", this.f21766c, task);
        }
    }
}
