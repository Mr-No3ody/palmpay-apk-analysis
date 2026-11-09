package Yf;

import Wf.AbstractC0752a;
import Wf.AbstractC0776u;
import Wf.C0755b0;
import Wf.n0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends AbstractC0752a implements ProducerScope, Channel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f11385d;

    public D(CoroutineContext coroutineContext, n nVar) {
        super(coroutineContext, true);
        this.f11385d = nVar;
    }

    @Override // Wf.AbstractC0752a
    public final void J(Throwable th, boolean z3) {
        if (this.f11385d.f(th, false) || z3) {
            return;
        }
        AbstractC0776u.a(this.f10835c, th);
    }

    @Override // Wf.AbstractC0752a
    public final void K(Object obj) {
        this.f11385d.close(null);
    }

    @Override // Wf.n0, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0755b0(g(), null, this);
        }
        e(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean close(Throwable th) {
        return this.f11385d.f(th, false);
    }

    @Override // Wf.n0
    public final void e(CancellationException cancellationException) {
        CancellationException cancellationExceptionG = n0.G(this, cancellationException);
        this.f11385d.f(cancellationExceptionG, true);
        d(cancellationExceptionG);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 getOnReceive() {
        return this.f11385d.getOnReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 getOnReceiveCatching() {
        return this.f11385d.getOnReceiveCatching();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 getOnReceiveOrNull() {
        return this.f11385d.getOnReceiveOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final SelectClause2 getOnSend() {
        return this.f11385d.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void invokeOnClose(Function1 function1) {
        this.f11385d.invokeOnClose(function1);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean isClosedForReceive() {
        return this.f11385d.isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        return this.f11385d.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean isEmpty() {
        return this.f11385d.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator iterator() {
        n nVar = this.f11385d;
        nVar.getClass();
        return new C0791c(nVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean offer(Object obj) {
        return this.f11385d.offer(obj);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object poll() {
        return this.f11385d.poll();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object receive(Continuation continuation) {
        return this.f11385d.receive(continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public final Object mo65receiveCatchingJP2dKIU(Continuation continuation) {
        n nVar = this.f11385d;
        nVar.getClass();
        Object objV = n.v(nVar, continuation);
        Ef.a aVar = Ef.a.f2423a;
        return objV;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object receiveOrNull(Continuation continuation) {
        n nVar = this.f11385d;
        nVar.getClass();
        return p140j8.f.z(nVar, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final Object send(Object obj, Continuation continuation) {
        return this.f11385d.send(obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public final Object mo66tryReceivePtdJZtk() {
        return this.f11385d.mo66tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public final Object mo64trySendJP2dKIU(Object obj) {
        return this.f11385d.mo64trySendJP2dKIU(obj);
    }

    @Override // Wf.n0, kotlinx.coroutines.Job
    public final /* synthetic */ void cancel() {
        e(new C0755b0(g(), null, this));
    }

    @Override // Wf.n0, kotlinx.coroutines.Job
    public final /* synthetic */ boolean cancel(Throwable th) {
        e(new C0755b0(g(), null, this));
        return true;
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public final SendChannel getChannel() {
        return this;
    }
}
