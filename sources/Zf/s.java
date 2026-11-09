package Zf;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow[] f11779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f11781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Yf.n f11782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Flow[] flowArr, int i7, AtomicInteger atomicInteger, Yf.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f11779b = flowArr;
        this.f11780c = i7;
        this.f11781d = atomicInteger;
        this.f11782e = nVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f11779b, this.f11780c, this.f11781d, this.f11782e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11778a;
        AtomicInteger atomicInteger = this.f11781d;
        Yf.n nVar = this.f11782e;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                Flow[] flowArr = this.f11779b;
                int i10 = this.f11780c;
                Flow flow = flowArr[i10];
                r rVar = new r(nVar, i10);
                this.f11778a = 1;
                if (flow.collect(rVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                nVar.close(null);
            }
            return Unit.f38893a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                nVar.close(null);
            }
            throw th;
        }
    }
}
