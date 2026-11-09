package X0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.O;
import kotlinx.coroutines.flow.i0;
import p135j0.C1768a0;
import p135j0.C1769b;
import p135j0.C1785s;
import p135j0.n0;
import p135j0.w0;
import p135j0.x0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f10959b;

    public /* synthetic */ i(FlowCollector flowCollector, int i7) {
        this.f10958a = i7;
        this.f10959b = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(Flow flow, Continuation continuation) throws Throwable {
        D d2;
        if (continuation instanceof D) {
            d2 = (D) continuation;
            int i7 = d2.f39057c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                d2.f39057c = i7 - Integer.MIN_VALUE;
            } else {
                d2 = new D(this, continuation);
            }
        } else {
            d2 = new D(this, continuation);
        }
        Object obj = d2.f39055a;
        Object obj2 = Ef.a.f2423a;
        int i10 = d2.f39057c;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            d2.f39057c = 1;
            FlowCollector flowCollector = this.f10959b;
            if (flowCollector instanceof i0) {
                throw ((i0) flowCollector).f39180a;
            }
            Object objCollect = flow.collect(flowCollector, d2);
            if (objCollect != obj2) {
                objCollect = Unit.f38893a;
            }
            if (objCollect == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        h hVar;
        C1785s c1785s;
        O o10;
        switch (this.f10958a) {
            case 0:
                if (continuation instanceof h) {
                    hVar = (h) continuation;
                    int i7 = hVar.f10956b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        hVar.f10956b = i7 - Integer.MIN_VALUE;
                    } else {
                        hVar = new h(this, continuation);
                    }
                } else {
                    hVar = new h(this, continuation);
                }
                Object obj2 = hVar.f10955a;
                Ef.a aVar = Ef.a.f2423a;
                int i10 = hVar.f10956b;
                if (i10 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj2);
                    if (obj instanceof androidx.work.impl.constraints.b) {
                        hVar.f10956b = 1;
                        if (this.f10959b.emit(obj, hVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj2);
                }
                return Unit.f38893a;
            case 1:
                if (continuation instanceof C1785s) {
                    c1785s = (C1785s) continuation;
                    int i11 = c1785s.f38131b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1785s.f38131b = i11 - Integer.MIN_VALUE;
                    } else {
                        c1785s = new C1785s(this, continuation);
                    }
                } else {
                    c1785s = new C1785s(this, continuation);
                }
                Object obj3 = c1785s.f38130a;
                Ef.a aVar2 = Ef.a.f2423a;
                int i12 = c1785s.f38131b;
                if (i12 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj3);
                    w0 w0Var = (w0) obj;
                    if (w0Var instanceof n0) {
                        throw ((n0) w0Var).f38107b;
                    }
                    if (!(w0Var instanceof C1769b)) {
                        if (w0Var instanceof C1768a0 ? true : w0Var instanceof x0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new p355xf.l();
                    }
                    Object obj4 = ((C1769b) w0Var).f38013b;
                    c1785s.f38131b = 1;
                    if (this.f10959b.emit(obj4, c1785s) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj3);
                }
                return Unit.f38893a;
            case 2:
                return a((Flow) obj, continuation);
            default:
                if (continuation instanceof O) {
                    o10 = (O) continuation;
                    int i13 = o10.f39094b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        o10.f39094b = i13 - Integer.MIN_VALUE;
                    } else {
                        o10 = new O(this, continuation);
                    }
                } else {
                    o10 = new O(this, continuation);
                }
                Object obj5 = o10.f39093a;
                Ef.a aVar3 = Ef.a.f2423a;
                int i14 = o10.f39094b;
                if (i14 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj5);
                    if (obj != null) {
                        o10.f39094b = 1;
                        if (this.f10959b.emit(obj, o10) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj5);
                }
                return Unit.f38893a;
        }
    }
}
