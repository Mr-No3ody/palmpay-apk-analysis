package com.transsnet.adsdk.widgets;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdEntity f25642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SingleAdView f25644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SingleAdView singleAdView, Continuation continuation) {
        super(continuation);
        this.f25644c = singleAdView;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f25643b = obj;
        this.f25645d |= Integer.MIN_VALUE;
        return this.f25644c.handleAdData(null, this);
    }
}
