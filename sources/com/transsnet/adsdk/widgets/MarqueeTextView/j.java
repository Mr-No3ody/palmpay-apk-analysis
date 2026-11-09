package com.transsnet.adsdk.widgets.MarqueeTextView;

import com.transsnet.adsdk.utils.AdSdkUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarqueeViewV2 f25610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MarqueeViewV2 marqueeViewV2, Continuation continuation) {
        super(2, continuation);
        this.f25610b = marqueeViewV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f25610b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f25609a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            MarqueeViewV2 marqueeViewV2 = this.f25610b;
            marqueeViewV2.mExpired = AdSdkUtils.checkAdExpired(marqueeViewV2.mSlotId);
            if (marqueeViewV2.useCoroutine) {
                this.f25609a = 1;
                if (marqueeViewV2.fetchDataWithCoroutine(this) == aVar) {
                    return aVar;
                }
            } else {
                marqueeViewV2.fetchData();
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
