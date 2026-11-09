package Ua;

import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.FlashSaleDataBundleBeanV2;
import com.transsnet.palmpay.core.bean.FlashSaleItemBean;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelDataPlanFlashSaleItem f9365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(CommonResult commonResult, Continuation continuation, ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem) {
        super(2, continuation);
        this.f9364a = commonResult;
        this.f9365b = modelDataPlanFlashSaleItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new S(this.f9364a, continuation, this.f9365b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        List<RecommendedItem> list;
        Wf.t0 t0Var;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f9364a;
        if (commonBeanResult.isSuccess()) {
            FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV2 = (FlashSaleDataBundleBeanV2) commonBeanResult.data;
            boolean zIsEmpty = TextUtils.isEmpty(flashSaleDataBundleBeanV2 != null ? flashSaleDataBundleBeanV2.title : null);
            ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem = this.f9365b;
            if (!zIsEmpty) {
                TextView tv_sale_time_title = modelDataPlanFlashSaleItem.getTv_sale_time_title();
                FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV3 = (FlashSaleDataBundleBeanV2) commonBeanResult.data;
                tv_sale_time_title.setText(flashSaleDataBundleBeanV3 != null ? flashSaleDataBundleBeanV3.title : null);
            }
            FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV4 = (FlashSaleDataBundleBeanV2) commonBeanResult.data;
            if (TextUtils.isEmpty(flashSaleDataBundleBeanV4 != null ? flashSaleDataBundleBeanV4.ruleContent : null)) {
                IconicsImageView ivInfo = modelDataPlanFlashSaleItem.getIvInfo();
                if (ivInfo != null) {
                    p220oa.h.s(ivInfo, false);
                }
            } else {
                IconicsImageView ivInfo2 = modelDataPlanFlashSaleItem.getIvInfo();
                if (ivInfo2 != null) {
                    p220oa.h.s(ivInfo2, true);
                }
                IconicsImageView ivInfo3 = modelDataPlanFlashSaleItem.getIvInfo();
                if (ivInfo3 != null) {
                    ivInfo3.setOnClickListener(new C9.V(3, modelDataPlanFlashSaleItem, commonBeanResult));
                }
            }
            FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV5 = (FlashSaleDataBundleBeanV2) commonBeanResult.data;
            if (flashSaleDataBundleBeanV5 != null && (list = flashSaleDataBundleBeanV5.items) != null) {
                List<RecommendedItem> list2 = list;
                modelDataPlanFlashSaleItem.setVisibility(list2.isEmpty() ? 8 : 0);
                if (list.size() > 0) {
                    for (FlashSaleItemBean flashSaleItemBean : list) {
                        Long l5 = flashSaleItemBean.saleCountdown;
                        long jLongValue = 0;
                        long jElapsedRealtime = SystemClock.elapsedRealtime() + (l5 != null ? l5.longValue() : 0L);
                        flashSaleItemBean.endDownTime = Long.valueOf(jElapsedRealtime);
                        Long l6 = flashSaleItemBean.countdownShowTime;
                        if (l6 != null) {
                            jLongValue = l6.longValue();
                        }
                        flashSaleItemBean.startDownTime = Long.valueOf(jElapsedRealtime - jLongValue);
                    }
                }
                modelDataPlanFlashSaleItem.getAdapter().setList(list2);
                FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV6 = (FlashSaleDataBundleBeanV2) commonBeanResult.data;
                Wf.t0 t0Var2 = modelDataPlanFlashSaleItem.f28321g;
                if (t0Var2 != null && t0Var2.isActive() && (t0Var = modelDataPlanFlashSaleItem.f28321g) != null) {
                    t0Var.cancel((CancellationException) null);
                }
                modelDataPlanFlashSaleItem.g(flashSaleDataBundleBeanV6);
            }
        }
        return Unit.f38893a;
    }
}
