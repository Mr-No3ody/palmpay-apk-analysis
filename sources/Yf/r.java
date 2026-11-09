package Yf;

import kotlinx.coroutines.channels.ChannelIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ChannelIterator f11443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11445c;

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f11444b = obj;
        this.f11445c |= Integer.MIN_VALUE;
        return com.palmpay.lib.apm.launchcounter.util.d.J(null, this);
    }
}
