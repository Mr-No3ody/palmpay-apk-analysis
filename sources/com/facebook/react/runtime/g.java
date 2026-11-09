package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f21775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f21776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21777d;

    public /* synthetic */ g(ReactHostImpl reactHostImpl, Function2 function2, String str, int i7) {
        this.f21774a = i7;
        this.f21775b = reactHostImpl;
        this.f21776c = function2;
        this.f21777d = str;
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final Object then(Task task) {
        switch (this.f21774a) {
            case 0:
                return ReactHostImpl.getOrCreateReloadTask$lambda$48(this.f21775b, "getOrCreateReloadTask()", this.f21776c, this.f21777d, task);
            case 1:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$57(this.f21775b, "getOrCreateDestroyTask()", this.f21776c, this.f21777d, task);
            default:
                return ReactHostImpl.getOrCreateDestroyTask$lambda$60(this.f21776c, this.f21775b, "getOrCreateDestroyTask()", this.f21777d, task);
        }
    }

    public /* synthetic */ g(Function2 function2, ReactHostImpl reactHostImpl, String str) {
        this.f21774a = 2;
        this.f21776c = function2;
        this.f21775b = reactHostImpl;
        this.f21777d = str;
    }
}
