package com.transsnet.adsdk.widgets.snackbar;

import android.content.Context;
import com.transsnet.adsdk.utils.AdSdkUtils;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f25666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnackBarAdView f25667b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WeakReference weakReference, SnackBarAdView snackBarAdView, Continuation continuation) {
        super(2, continuation);
        this.f25666a = weakReference;
        this.f25667b = snackBarAdView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f25666a, this.f25667b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AdSdkUtils.onLoadAdFailed((Context) this.f25666a.get(), this.f25667b.mAdListener);
        return Unit.f38893a;
    }
}
