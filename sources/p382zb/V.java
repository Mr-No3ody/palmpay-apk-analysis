package p382zb;

import Ef.a;
import Ff.h;
import Jb.s;
import androidx.camera.core.impl.utils.executor.g;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p140j8.f;
import p204nb.q;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f44553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f44552b = ocHomeMobileInstalmentTabFragment;
        this.f44553c = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new V(this.f44552b, this.f44553c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        OcHomeFinanceViewModel ocHomeFinanceViewModelX;
        a aVar = a.f2423a;
        int i7 = this.f44551a;
        OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment = this.f44552b;
        try {
            if (i7 == 0) {
                g.M(obj);
                if (!ocHomeMobileInstalmentTabFragment.f30437H) {
                    ocHomeMobileInstalmentTabFragment.showLoadingDialog(true);
                    q qVar = q.f39914a;
                    this.f44551a = 1;
                    obj = qVar.b("MobileInstallment", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (!ocHomeMobileInstalmentTabFragment.isAdded()) {
                    return Unit.f38893a;
                }
                ocHomeFinanceViewModelX = ocHomeMobileInstalmentTabFragment.x();
                ocHomeFinanceViewModelX.getClass();
                if (BaseApplication.hasLogin()) {
                    f.s(ocHomeFinanceViewModelX, new s(1, null), ocHomeFinanceViewModelX.f30920w, 0L, this.f44553c, false);
                }
                return Unit.f38893a;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            ocHomeMobileInstalmentTabFragment.showLoadingDialog(false);
            if (!zBooleanValue) {
                SwipeRefreshLayout swipeRefreshLayoutW = ocHomeMobileInstalmentTabFragment.w();
                if (swipeRefreshLayoutW != null) {
                    swipeRefreshLayoutW.setRefreshing(false);
                }
                return Unit.f38893a;
            }
            ocHomeMobileInstalmentTabFragment.f30437H = true;
            if (!ocHomeMobileInstalmentTabFragment.isAdded()) {
                return Unit.f38893a;
            }
            ocHomeFinanceViewModelX = ocHomeMobileInstalmentTabFragment.x();
            ocHomeFinanceViewModelX.getClass();
            if (BaseApplication.hasLogin()) {
                f.s(ocHomeFinanceViewModelX, new s(1, null), ocHomeFinanceViewModelX.f30920w, 0L, this.f44553c, false);
            }
            return Unit.f38893a;
        } catch (Throwable th) {
            ocHomeMobileInstalmentTabFragment.showLoadingDialog(false);
            throw th;
        }
    }
}
