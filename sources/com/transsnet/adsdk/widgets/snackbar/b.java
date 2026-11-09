package com.transsnet.adsdk.widgets.snackbar;

import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackBarAdView f25654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f25656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdShowCallback adShowCallback, SnackBarAdView snackBarAdView, WeakReference weakReference, Continuation continuation) {
        super(2, continuation);
        this.f25654a = snackBarAdView;
        this.f25655b = adShowCallback;
        this.f25656c = weakReference;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f25655b, this.f25654a, this.f25656c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f25654a.showAd(this.f25655b, this.f25656c);
        return Unit.f38893a;
    }
}
