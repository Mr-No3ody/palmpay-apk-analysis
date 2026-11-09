package p086fe;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.teller.bean.QueryRecommendReq;
import com.transsnet.palmpay.teller.bean.QueryRecommendRsp;
import com.transsnet.palmpay.teller.viewmodel.BeneficiariesListViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: renamed from: fe.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1664f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f36641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeneficiariesListViewModel f36642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryRecommendReq f36643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1664f(BeneficiariesListViewModel beneficiariesListViewModel, QueryRecommendReq queryRecommendReq, Continuation continuation) {
        super(2, continuation);
        this.f36642b = beneficiariesListViewModel;
        this.f36643c = queryRecommendReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1664f c1664f = new C1664f(this.f36642b, this.f36643c, continuation);
        c1664f.f36641a = obj;
        return c1664f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1664f) create((QueryRecommendRsp) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        QueryRecommendRsp queryRecommendRsp = (QueryRecommendRsp) this.f36641a;
        l lVar = this.f36642b.f34386g;
        lVar.f27356m = this.f36643c;
        b.C(lVar, queryRecommendRsp);
        return Unit.f38893a;
    }
}
