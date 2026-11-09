package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877i extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FlowCollector f39174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReceiveChannel f39175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ChannelIterator f39176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39179f;

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39178e = obj;
        this.f39179f |= Integer.MIN_VALUE;
        return X.j(null, null, false, this);
    }
}
