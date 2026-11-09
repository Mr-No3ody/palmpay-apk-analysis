package Zf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.X;

/* JADX INFO: renamed from: Zf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0809e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f11742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f11743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0809e(FlowCollector flowCollector, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f11742c = flowCollector;
        this.f11743d = gVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0809e c0809e = new C0809e(this.f11742c, this.f11743d, continuation);
        c0809e.f11741b = obj;
        return c0809e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0809e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = Ef.a.f2423a;
        int i7 = this.f11740a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ReceiveChannel receiveChannelE = this.f11743d.e((CoroutineScope) this.f11741b);
            this.f11740a = 1;
            Object objJ = X.j(this.f11742c, receiveChannelE, true, this);
            if (objJ != obj2) {
                objJ = Unit.f38893a;
            }
            if (objJ == obj2) {
                return obj2;
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
