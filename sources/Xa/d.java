package Xa;

import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p072eg.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f11084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f11085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f11086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f11087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f11088g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f11089i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, j jVar, Context context, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, Continuation continuation) {
        super(2, continuation);
        this.f11084c = list;
        this.f11085d = jVar;
        this.f11086e = context;
        this.f11087f = atomicInteger;
        this.f11088g = atomicInteger2;
        this.f11089i = atomicInteger3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        AtomicInteger atomicInteger = this.f11088g;
        AtomicInteger atomicInteger2 = this.f11089i;
        d dVar = new d(this.f11084c, this.f11085d, this.f11086e, this.f11087f, atomicInteger, atomicInteger2, continuation);
        dVar.f11083b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11082a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f11083b;
        List<String> list = this.f11084c;
        ArrayList arrayList = new ArrayList(r.l(list, 10));
        for (String str : list) {
            p042cg.f fVar = I.f10809a;
            arrayList.add(AbstractC0780y.d(coroutineScope, p042cg.e.f19009c, new c(this.f11085d, this.f11086e, str, this.f11087f, this.f11088g, this.f11089i, null), 2));
        }
        this.f11082a = 1;
        Object objE = AbstractC0780y.e(arrayList, this);
        return objE == aVar ? aVar : objE;
    }
}
