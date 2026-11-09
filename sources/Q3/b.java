package Q3;

import android.view.View;
import com.flexibank.sdk.api.FlexiBankApiCashierService;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierCouponListDialog$CallBack;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p355xf.o;
import p355xf.p;
import p355xf.q;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f7587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlexiBankCashierCouponItem f7588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Continuation continuation, c cVar, FlexiBankCashierCouponItem flexiBankCashierCouponItem) {
        super(2, continuation);
        this.f7587c = cVar;
        this.f7588d = flexiBankCashierCouponItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(continuation, this.f7587c, this.f7588d);
        bVar.f7586b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7585a;
        c cVar = this.f7587c;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                o oVar = q.f43977a;
                FlexiBankApiCashierService flexiBankApiCashierService = J3.b.f4493a;
                O3.k kVar = cVar.f7591B;
                this.f7585a = 1;
                obj = flexiBankApiCashierService.checkCouponByVM(kVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            objF = (W3.f) obj;
            o oVar2 = q.f43977a;
        } catch (Throwable th) {
            o oVar3 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        boolean z3 = objF instanceof p;
        t tVar = cVar.f7592C;
        if (!z3) {
            p006a4.e eVar = (p006a4.e) ((W3.f) objF);
            int i10 = c.f7589H;
            View view = (View) tVar.getValue();
            if (view != null) {
                view.setVisibility(8);
            }
            if (eVar == null || !eVar.c()) {
                ToastUtils.showLong(eVar != null ? eVar.b() : null, new Object[0]);
            } else {
                FlexiBankCashierCouponListDialog$CallBack flexiBankCashierCouponListDialog$CallBack = cVar.f7599w;
                if (flexiBankCashierCouponListDialog$CallBack != null) {
                    flexiBankCashierCouponListDialog$CallBack.onCouponClick(this.f7588d);
                }
                cVar.dismiss();
            }
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            String strX = D3.a.x(thA);
            int i11 = c.f7589H;
            View view2 = (View) tVar.getValue();
            if (view2 != null) {
                view2.setVisibility(8);
            }
            ToastUtils.showLong(strX, new Object[0]);
        }
        return Unit.f38893a;
    }
}
