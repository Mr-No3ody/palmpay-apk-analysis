package p086fe;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.teller.bean.QueryRecommendReq;
import com.transsnet.palmpay.teller.viewmodel.BeneficiariesListViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: renamed from: fe.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1662e extends h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Throwable f36634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeneficiariesListViewModel f36635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryRecommendReq f36636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662e(BeneficiariesListViewModel beneficiariesListViewModel, QueryRecommendReq queryRecommendReq, Continuation continuation) {
        super(3, continuation);
        this.f36635b = beneficiariesListViewModel;
        this.f36636c = queryRecommendReq;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1662e c1662e = new C1662e(this.f36635b, this.f36636c, (Continuation) obj3);
        c1662e.f36634a = (Throwable) obj2;
        return c1662e.invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        Throwable th = this.f36634a;
        l lVar = this.f36635b.f34386g;
        lVar.f27356m = this.f36636c;
        b.E(lVar, th);
        return Unit.f38893a;
    }
}
