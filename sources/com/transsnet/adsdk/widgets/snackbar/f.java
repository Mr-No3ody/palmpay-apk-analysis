package com.transsnet.adsdk.widgets.snackbar;

import android.content.Context;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackBarAdView f25668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SnackBarAdView snackBarAdView, AdShowCallback adShowCallback, Context context, Continuation continuation) {
        super(2, continuation);
        this.f25668a = snackBarAdView;
        this.f25669b = adShowCallback;
        this.f25670c = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f25668a, this.f25669b, this.f25670c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f25668a.fetchData(this.f25669b, new WeakReference(this.f25670c));
        return Unit.f38893a;
    }
}
