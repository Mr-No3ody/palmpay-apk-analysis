package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ConstraintListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f18472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f18473b;

    public a(c cVar, ProducerScope producerScope) {
        this.f18472a = cVar;
        this.f18473b = producerScope;
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public final void onConstraintChanged(Object obj) {
        c cVar = this.f18472a;
        this.f18473b.getChannel().mo64trySendJP2dKIU(cVar.b(obj) ? new androidx.work.impl.constraints.b(cVar.a()) : androidx.work.impl.constraints.a.f18470a);
    }
}
