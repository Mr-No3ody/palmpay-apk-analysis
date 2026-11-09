package com.transsnet.adsdk.widgets.banner;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerAdView f25634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BannerAdView bannerAdView, Continuation continuation) {
        super(2, continuation);
        this.f25634b = bannerAdView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f25634b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r6.fetchDataWithCoroutine(r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (Wf.AbstractC0780y.s(r1, r3, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        return r0;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r5.f25633a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L53
        L19:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            com.transsnet.adsdk.widgets.banner.BannerAdView r6 = r5.f25634b
            boolean r1 = com.transsnet.adsdk.widgets.banner.BannerAdView.access$getMRefresh$p(r6)
            if (r1 == 0) goto L26
            r1 = r3
            goto L2e
        L26:
            java.lang.String r1 = com.transsnet.adsdk.widgets.banner.BannerAdView.access$getMSlotId$p(r6)
            boolean r1 = com.transsnet.adsdk.utils.AdSdkUtils.checkAdExpired(r1)
        L2e:
            com.transsnet.adsdk.widgets.banner.BannerAdView.access$setMExpired$p(r6, r1)
            boolean r1 = com.transsnet.adsdk.widgets.banner.BannerAdView.access$getUseCoroutine$p(r6)
            if (r1 == 0) goto L40
            r5.f25633a = r3
            java.lang.Object r6 = com.transsnet.adsdk.widgets.banner.BannerAdView.access$fetchDataWithCoroutine(r6, r5)
            if (r6 != r0) goto L53
            goto L52
        L40:
            cg.f r1 = Wf.I.f10809a
            Wf.p0 r1 = p015ag.o.f11960a
            com.transsnet.adsdk.widgets.banner.f r3 = new com.transsnet.adsdk.widgets.banner.f
            r4 = 0
            r3.<init>(r6, r4)
            r5.f25633a = r2
            java.lang.Object r6 = Wf.AbstractC0780y.s(r1, r3, r5)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            kotlin.Unit r6 = kotlin.Unit.f38893a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.adsdk.widgets.banner.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
