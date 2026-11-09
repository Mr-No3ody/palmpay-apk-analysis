package com.transsnet.adsdk.widgets.MarqueeTextView;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarqueeViewV2 f25602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MarqueeViewV2 marqueeViewV2, Continuation continuation) {
        super(continuation);
        this.f25602b = marqueeViewV2;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f25601a = obj;
        this.f25603c |= Integer.MIN_VALUE;
        return this.f25602b.fetchDataWithCoroutine(this);
    }
}
