package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f21779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f21780c;

    public /* synthetic */ h(Function2 function2, ReactHostImpl reactHostImpl, int i7) {
        this.f21778a = i7;
        this.f21779b = function2;
        this.f21780c = reactHostImpl;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21778a) {
            case 0:
                return ReactHostImpl.getOrCreateReloadTask$lambda$49(this.f21779b, this.f21780c, "getOrCreateReloadTask()", task);
            case 1:
                return ReactHostImpl.getOrCreateReloadTask$lambda$51(this.f21779b, this.f21780c, "getOrCreateReloadTask()", task);
            case 2:
                return ReactHostImpl.getOrCreateReloadTask$lambda$52(this.f21779b, this.f21780c, "getOrCreateReloadTask()", task);
            case 3:
                return ReactHostImpl.getOrCreateReloadTask$lambda$53(this.f21779b, this.f21780c, "getOrCreateReloadTask()", task);
            case 4:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$59(this.f21779b, this.f21780c, "getOrCreateDestroyTask()", task);
            default:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$61(this.f21779b, this.f21780c, "getOrCreateDestroyTask()", task);
        }
    }
}
