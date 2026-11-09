package p041ce;

import Ef.a;
import Ff.h;
import Pa.i0;
import android.app.Activity;
import android.content.Context;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.teller.ui.dialog.BillerCouponListDialog;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f18956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponAndPointItem f18957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f18958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CommonResult commonResult, Continuation continuation, ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem, o oVar) {
        super(2, continuation);
        this.f18956a = commonResult;
        this.f18957b = modelAvailableCouponAndPointItem;
        this.f18958c = oVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f18956a, continuation, this.f18957b, this.f18958c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        List list;
        a aVar = a.f2423a;
        g.M(obj);
        CommonListResultV2 commonListResultV2 = (CommonListResultV2) this.f18956a;
        int i7 = ModelAvailableCouponAndPointItem.f34329i;
        ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem = this.f18957b;
        modelAvailableCouponAndPointItem.c(false);
        if (commonListResultV2 != null && (list = commonListResultV2.data) != null) {
            modelAvailableCouponAndPointItem.d(list.size(), list);
            Unit unit = Unit.f38893a;
            List list2 = list;
            if (!list2.isEmpty()) {
                Context context = modelAvailableCouponAndPointItem.getContext();
                if ((context instanceof Activity) && i0.W((Activity) context) && !list2.isEmpty()) {
                    BillerCouponListDialog billerCouponListDialog = modelAvailableCouponAndPointItem.f34331d;
                    if (billerCouponListDialog == null || !billerCouponListDialog.isShowing()) {
                        BillerCouponListDialog billerCouponListDialog2 = new BillerCouponListDialog(context, 0, 0, 6, null);
                        modelAvailableCouponAndPointItem.f34331d = billerCouponListDialog2;
                        billerCouponListDialog2.setCallBack(modelAvailableCouponAndPointItem);
                        BillerCouponListDialog billerCouponListDialog3 = modelAvailableCouponAndPointItem.f34331d;
                        if (billerCouponListDialog3 != 0) {
                            billerCouponListDialog3.setCoupons(list);
                        }
                        BillerCouponListDialog billerCouponListDialog4 = modelAvailableCouponAndPointItem.f34331d;
                        if (billerCouponListDialog4 != null) {
                            billerCouponListDialog4.show();
                        }
                    } else {
                        BillerCouponListDialog billerCouponListDialog5 = modelAvailableCouponAndPointItem.f34331d;
                        if (billerCouponListDialog5 != 0) {
                            billerCouponListDialog5.setCoupons(list);
                        }
                        BillerCouponListDialog billerCouponListDialog6 = modelAvailableCouponAndPointItem.f34331d;
                        if (billerCouponListDialog6 != null) {
                            billerCouponListDialog6.updateCoupons();
                        }
                    }
                }
            }
        }
        return Unit.f38893a;
    }
}
