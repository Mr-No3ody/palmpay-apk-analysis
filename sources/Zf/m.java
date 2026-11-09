package Zf;

import Wf.AbstractC0780y;
import Wf.EnumC0778w;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f11764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f11765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f11766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f11767d;

    public m(F f10, CoroutineScope coroutineScope, o oVar, FlowCollector flowCollector) {
        this.f11764a = f10;
        this.f11765b = coroutineScope;
        this.f11766c = oVar;
        this.f11767d = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        l lVar;
        m mVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i7 = lVar.f11763f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.f11763f = i7 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, continuation);
            }
        } else {
            lVar = new l(this, continuation);
        }
        Object obj2 = lVar.f11761d;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = lVar.f11763f;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj2);
            Job job = (Job) this.f11764a.f38951a;
            if (job != null) {
                job.cancel((CancellationException) new p("Child of the scoped flow was cancelled"));
                lVar.f11758a = this;
                lVar.f11759b = obj;
                lVar.f11760c = job;
                lVar.f11763f = 1;
                if (job.join(lVar) == aVar) {
                    return aVar;
                }
            }
            mVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = lVar.f11759b;
            mVar = lVar.f11758a;
            androidx.camera.core.impl.utils.executor.g.M(obj2);
        }
        mVar.f11764a.f38951a = AbstractC0780y.m(mVar.f11765b, null, EnumC0778w.f10903d, new k(mVar.f11766c, mVar.f11767d, obj, null), 1);
        return Unit.f38893a;
    }
}
