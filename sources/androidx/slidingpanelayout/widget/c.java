package androidx.slidingpanelayout.widget;

import B6.T;
import Ff.h;
import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f17857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.f17856b = dVar;
        this.f17857c = activity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f17856b, this.f17857c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f17855a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            d dVar = this.f17856b;
            Flow flowI = X.i(new b(dVar.f17858a.windowLayoutInfo(this.f17857c), dVar, 0));
            T t = new T(dVar, 1);
            this.f17855a = 1;
            if (flowI.collect(t, this) == aVar) {
                return aVar;
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
