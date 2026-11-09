package com.transsnet.adsdk.widgets;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SingleAdView f25641b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SingleAdView singleAdView, Continuation continuation) {
        super(2, continuation);
        this.f25641b = singleAdView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f25641b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        if (r2.handleAdData((com.transsnet.adsdk.data.bean.resp.AdCommonResult) r14, r13) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        if (Wf.AbstractC0780y.s(r14, r1, r13) == r0) goto L60;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.adsdk.widgets.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
