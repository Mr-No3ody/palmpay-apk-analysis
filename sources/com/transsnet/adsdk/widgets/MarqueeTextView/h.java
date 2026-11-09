package com.transsnet.adsdk.widgets.MarqueeTextView;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarqueeViewV2 f25606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MarqueeViewV2 marqueeViewV2, Continuation continuation) {
        super(continuation);
        this.f25606b = marqueeViewV2;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f25605a = obj;
        this.f25607c |= Integer.MIN_VALUE;
        return this.f25606b.handleData(null, this);
    }
}
