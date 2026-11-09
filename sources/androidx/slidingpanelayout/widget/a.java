package androidx.slidingpanelayout.widget;

import B6.W;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f17851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(W w3, Continuation continuation) {
        super(continuation);
        this.f17851c = w3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f17849a = obj;
        this.f17850b |= Integer.MIN_VALUE;
        return this.f17851c.emit(null, this);
    }
}
