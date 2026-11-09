package com.transsnet.adsdk.widgets.snackbar;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import android.content.Context;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p015ag.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnackBarAdView f25672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f25674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SnackBarAdView snackBarAdView, AdShowCallback adShowCallback, Context context, Continuation continuation) {
        super(2, continuation);
        this.f25672b = snackBarAdView;
        this.f25673c = adShowCallback;
        this.f25674d = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f25672b, this.f25673c, this.f25674d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f25671a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            SnackBarAdView snackBarAdView = this.f25672b;
            snackBarAdView.mExpired = snackBarAdView.mUseCache ? AdSdkUtils.checkAdExpired(snackBarAdView.mSlotId) : true;
            boolean z3 = snackBarAdView.useCoroutine;
            Context context = this.f25674d;
            AdShowCallback adShowCallback = this.f25673c;
            if (z3) {
                snackBarAdView.fetchDataWithCoroutine(adShowCallback, new WeakReference(context));
            } else {
                p042cg.f fVar = I.f10809a;
                p0 p0Var = o.f11960a;
                f fVar2 = new f(snackBarAdView, adShowCallback, context, null);
                this.f25671a = 1;
                if (AbstractC0780y.s(p0Var, fVar2, this) == aVar) {
                    return aVar;
                }
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
