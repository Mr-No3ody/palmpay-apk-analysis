package p202n9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleBean;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleItemBean;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f39860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39861b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommonResult commonResult, Continuation continuation, ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem) {
        super(2, continuation);
        this.f39860a = commonResult;
        this.f39861b = modelAirtimeDataPlanQuickBuyItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f39860a, continuation, this.f39861b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        boolean zC;
        String string;
        String str;
        a aVar = a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f39860a;
        ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem = this.f39861b;
        Object obj2 = null;
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            int i7 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
            modelAirtimeDataPlanQuickBuyItem.d(null);
        } else {
            HighlyRecommendDataBundleBean highlyRecommendDataBundleBean = (HighlyRecommendDataBundleBean) commonBeanResult.data;
            List<HighlyRecommendDataBundleItemBean> list = highlyRecommendDataBundleBean != null ? highlyRecommendDataBundleBean.items : null;
            if (list == null) {
                list = z.f38935a;
            }
            for (Object obj3 : list) {
                HighlyRecommendDataBundleItemBean highlyRecommendDataBundleItemBean = (HighlyRecommendDataBundleItemBean) obj3;
                String str2 = modelAirtimeDataPlanQuickBuyItem.f26600v;
                if (str2 == null || StringsKt.F(str2) || (str = highlyRecommendDataBundleItemBean.billerId) == null || StringsKt.F(str)) {
                    String str3 = highlyRecommendDataBundleItemBean.billerName;
                    if (str3 == null || (string = StringsKt.V(str3).toString()) == null) {
                        zC = false;
                    } else {
                        String str4 = modelAirtimeDataPlanQuickBuyItem.f26601w;
                        if (string.equalsIgnoreCase(str4 != null ? StringsKt.V(str4).toString() : null)) {
                            zC = true;
                        } else {
                            zC = false;
                        }
                    }
                } else {
                    zC = Intrinsics.c(highlyRecommendDataBundleItemBean.billerId, modelAirtimeDataPlanQuickBuyItem.f26600v);
                }
                if (zC && highlyRecommendDataBundleItemBean.item != null) {
                    obj2 = obj3;
                    break;
                }
            }
            int i10 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
            modelAirtimeDataPlanQuickBuyItem.d((HighlyRecommendDataBundleItemBean) obj2);
        }
        return Unit.f38893a;
    }
}
