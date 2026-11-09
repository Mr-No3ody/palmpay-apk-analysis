package p297te;

import Ff.h;
import Wd.C0751z;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.main.export.bean.req.CreateMerchantPaymentOrderRsp;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.MerchantPaymentActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f42601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MerchantPaymentActivity f42602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CommonResult commonResult, Continuation continuation, MerchantPaymentActivity merchantPaymentActivity) {
        super(2, continuation);
        this.f42601a = commonResult;
        this.f42602b = merchantPaymentActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f42601a, continuation, this.f42602b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f42601a;
        MerchantPaymentActivity merchantPaymentActivity = this.f42602b;
        merchantPaymentActivity.showLoadingDialog(false);
        if (commonBeanResult.isSuccess()) {
            CreateMerchantPaymentOrderRsp createMerchantPaymentOrderRsp = (CreateMerchantPaymentOrderRsp) commonBeanResult.data;
            MerchantPaymentActivity.a aVar2 = MerchantPaymentActivity.f34976c;
            if (createMerchantPaymentOrderRsp != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(createMerchantPaymentOrderRsp.merchantName)) {
                    String string = merchantPaymentActivity.getString(Ac.h.main_merchant_name);
                    String str = createMerchantPaymentOrderRsp.merchantName;
                    Intrinsics.e(str);
                    arrayList.add(new CoreCashierPaymentExtra(string, str));
                }
                if (!TextUtils.isEmpty(createMerchantPaymentOrderRsp.goodsName)) {
                    String string2 = merchantPaymentActivity.getString(Ac.h.main_goods_name);
                    String str2 = createMerchantPaymentOrderRsp.goodsName;
                    Intrinsics.e(str2);
                    arrayList.add(new CoreCashierPaymentExtra(string2, str2));
                }
                C0751z c0751z = new C0751z(merchantPaymentActivity, 14);
                c0751z.f4971b = createMerchantPaymentOrderRsp.orderNo;
                c0751z.f4974e = "74";
                c0751z.c(Long.valueOf(createMerchantPaymentOrderRsp.amount));
                c0751z.f4972c = createMerchantPaymentOrderRsp.transType;
                c0751z.f4973d = createMerchantPaymentOrderRsp.subTransType;
                c0751z.f4978i = createMerchantPaymentOrderRsp.calculationExtInfo;
                c0751z.b(arrayList);
                c0751z.d();
            }
            merchantPaymentActivity.finish();
        } else {
            ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
            ActivityUtils.finishAllActivities();
        }
        return Unit.f38893a;
    }
}
