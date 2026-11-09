package com.transsnet.adsdk.widgets.Interstitial;

import Ff.h;
import android.content.Context;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterstitialAdView f25585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterstitialAdView interstitialAdView, AdShowCallback adShowCallback, Context context, Continuation continuation) {
        super(2, continuation);
        this.f25585a = interstitialAdView;
        this.f25586b = adShowCallback;
        this.f25587c = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f25585a, this.f25586b, this.f25587c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        this.f25585a.fetchData(this.f25586b, this.f25587c);
        return Unit.f38893a;
    }
}
