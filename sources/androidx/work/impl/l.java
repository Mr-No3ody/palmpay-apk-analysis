package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f18570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f18571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, Continuation continuation) {
        super(2, continuation);
        this.f18571b = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f18571b, continuation);
        lVar.f18570a = ((Boolean) obj).booleanValue();
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((l) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        androidx.work.impl.utils.i.a(this.f18571b, RescheduleReceiver.class, this.f18570a);
        return Unit.f38893a;
    }
}
