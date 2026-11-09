package p086fe;

import Ef.a;
import Ff.h;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.teller.bean.QueryRecommendReq;
import com.transsnet.palmpay.teller.viewmodel.BeneficiariesListViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import p042cg.e;
import p042cg.f;

/* JADX INFO: renamed from: fe.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1666g extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeneficiariesListViewModel f36649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryRecommendReq f36650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666g(BeneficiariesListViewModel beneficiariesListViewModel, QueryRecommendReq queryRecommendReq, Continuation continuation) {
        super(2, continuation);
        this.f36649b = beneficiariesListViewModel;
        this.f36650c = queryRecommendReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1666g(this.f36649b, this.f36650c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1666g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36648a;
        if (i7 == 0) {
            g.M(obj);
            if (!NetworkUtils.isConnected()) {
                return Unit.f38893a;
            }
            BeneficiariesListViewModel beneficiariesListViewModel = this.f36649b;
            beneficiariesListViewModel.f34386g.k(o.f27359a);
            QueryRecommendReq queryRecommendReq = this.f36650c;
            T t = new T(new C1660d(queryRecommendReq, null));
            f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, e.f19009c), new C1662e(beneficiariesListViewModel, queryRecommendReq, null));
            C1664f c1664f = new C1664f(beneficiariesListViewModel, queryRecommendReq, null);
            this.f36648a = 1;
            if (X.g(c1888u, c1664f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
