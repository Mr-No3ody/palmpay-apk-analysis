package com.transsnet.adsdk.widgets.Interstitial;

import Ff.h;
import android.content.Context;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterstitialAdView f25589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f25591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterstitialAdView interstitialAdView, AdShowCallback adShowCallback, Context context, Continuation continuation) {
        super(2, continuation);
        this.f25589b = interstitialAdView;
        this.f25590c = adShowCallback;
        this.f25591d = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f25589b, this.f25590c, this.f25591d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r8.fetchDataWithCoroutine(r4, r7) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (Wf.AbstractC0780y.s(r1, r3, r7) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        return r0;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r7.f25588a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L57
        L19:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView r8 = r7.f25589b
            boolean r1 = com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView.access$getMUseCache$p(r8)
            if (r1 == 0) goto L2d
            java.lang.String r1 = com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView.access$getMSlotId$p(r8)
            boolean r1 = com.transsnet.adsdk.utils.AdSdkUtils.checkAdExpired(r1)
            goto L2e
        L2d:
            r1 = r3
        L2e:
            com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView.access$setMExpired$p(r8, r1)
            boolean r1 = com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView.access$getUseCoroutine$p(r8)
            com.transsnet.adsdk.widgets.interfaces.AdShowCallback r4 = r7.f25590c
            if (r1 == 0) goto L42
            r7.f25588a = r3
            java.lang.Object r8 = com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView.access$fetchDataWithCoroutine(r8, r4, r7)
            if (r8 != r0) goto L57
            goto L56
        L42:
            cg.f r1 = Wf.I.f10809a
            Wf.p0 r1 = p015ag.o.f11960a
            com.transsnet.adsdk.widgets.Interstitial.e r3 = new com.transsnet.adsdk.widgets.Interstitial.e
            android.content.Context r5 = r7.f25591d
            r6 = 0
            r3.<init>(r8, r4, r5, r6)
            r7.f25588a = r2
            java.lang.Object r8 = Wf.AbstractC0780y.s(r1, r3, r7)
            if (r8 != r0) goto L57
        L56:
            return r0
        L57:
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.adsdk.widgets.Interstitial.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
