package com.transsnet.adsdk.widgets.snackbar;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackBarAdView f25657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdEntity f25658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeakReference f25660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SnackBarAdView snackBarAdView, AdEntity adEntity, AdShowCallback adShowCallback, WeakReference weakReference, Continuation continuation) {
        super(2, continuation);
        this.f25657a = snackBarAdView;
        this.f25658b = adEntity;
        this.f25659c = adShowCallback;
        this.f25660d = weakReference;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f25657a, this.f25658b, this.f25659c, this.f25660d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AdEntity adEntity = this.f25658b;
        SnackBarAdView snackBarAdView = this.f25657a;
        snackBarAdView.mAdData = adEntity;
        snackBarAdView.showAd(this.f25659c, this.f25660d);
        return Unit.f38893a;
    }
}
