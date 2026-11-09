package Yf;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProducerScope f11381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f11382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11384d;

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f11383c = obj;
        this.f11384d |= Integer.MIN_VALUE;
        return C.a(null, null, this);
    }
}
