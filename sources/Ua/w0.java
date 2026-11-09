package Ua;

import Bc.C0105b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardItemBean;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardResp;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import com.transsnet.palmpay.custom_view.autoheightviewpager.AutoHeightViewPager;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardModel f9501b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(CommonResult commonResult, Continuation continuation, OrderResultRewardModel orderResultRewardModel) {
        super(2, continuation);
        this.f9500a = commonResult;
        this.f9501b = orderResultRewardModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new w0(this.f9500a, continuation, this.f9501b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        T t;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f9500a;
        boolean zIsSuccess = commonBeanResult.isSuccess();
        OrderResultRewardModel orderResultRewardModel = this.f9501b;
        if (!zIsSuccess || (t = commonBeanResult.data) == 0) {
            p220oa.h.c(orderResultRewardModel);
        } else {
            OrderResultRewardResp orderResultRewardResp = (OrderResultRewardResp) t;
            int i7 = OrderResultRewardModel.t;
            orderResultRewardModel.getClass();
            List<? extends List<OrderResultRewardItemBean>> list = orderResultRewardResp.rewardZoneList;
            if (list == null || list.isEmpty()) {
                p220oa.h.c(orderResultRewardModel);
            } else {
                orderResultRewardModel.f28523i = orderResultRewardResp;
                orderResultRewardModel.setVisibility(0);
                C0105b c0105b = orderResultRewardModel.f28518c;
                if (c0105b != null) {
                    ((TextView) c0105b.f663c).setText(orderResultRewardResp.rewardZoneTitle);
                }
                if (c0105b != null) {
                    p220oa.h.c((LinearLayout) c0105b.f667g);
                }
                orderResultRewardModel.f28519d = orderResultRewardResp.rewardZoneList;
                ArrayList views = new ArrayList();
                List list2 = orderResultRewardModel.f28519d;
                int size = list2 != null ? list2.size() : 0;
                if (size <= 0) {
                    p220oa.h.c(orderResultRewardModel);
                } else {
                    for (int i10 = 0; i10 < size; i10++) {
                        List list3 = orderResultRewardModel.f28519d;
                        List<OrderResultRewardItemBean> list4 = list3 != null ? (List) list3.get(i10) : null;
                        RecyclerView recyclerView = new RecyclerView(orderResultRewardModel.getContext());
                        recyclerView.setLayoutManager(new LinearLayoutManager(orderResultRewardModel.getContext()));
                        A0 a3 = new A0();
                        recyclerView.setAdapter(a3);
                        a3.setOnItemChildClickListener(new U8.a(2, a3, orderResultRewardModel));
                        a3.setList(list4);
                        views.add(recyclerView);
                        if (i10 == 0) {
                            recyclerView.setTag(p025ba.e.core_order_reward_report, Boolean.TRUE);
                            if (list4 != null) {
                                for (OrderResultRewardItemBean orderResultRewardItemBean : list4) {
                                    Pa.n0.g().w("ResultPage_Reward_View", kotlin.collections.G.g(new Pair("rewardType", orderResultRewardItemBean.rewardType), new Pair("rewardid", orderResultRewardItemBean.recordNo), new Pair("activityNodeNo", orderResultRewardItemBean.activityNodeNo), new Pair("transtype", orderResultRewardItemBean.transType), new Pair("memberid", C0.G.k()), new Pair("orderid", orderResultRewardModel.f28524j)));
                                }
                            }
                        } else {
                            recyclerView.setTag(p025ba.e.core_order_reward_report, Boolean.FALSE);
                        }
                    }
                    if (views.size() > 0) {
                        if (c0105b != null) {
                            AutoHeightViewPager autoHeightViewPager = (AutoHeightViewPager) c0105b.f665e;
                            Mb.a aVar2 = new Mb.a();
                            orderResultRewardModel.f28520e = aVar2;
                            autoHeightViewPager.setAdapter(aVar2);
                        }
                        if (c0105b != null) {
                            ((AutoHeightViewPager) c0105b.f665e).addOnPageChangeListener(new z0(views, orderResultRewardModel));
                        }
                        Mb.a aVar3 = orderResultRewardModel.f28520e;
                        if (aVar3 != null) {
                            Intrinsics.checkNotNullParameter(views, "views");
                            ArrayList arrayList = aVar3.f5928c;
                            arrayList.clear();
                            arrayList.addAll(views);
                            aVar3.i();
                        }
                        if (c0105b != null) {
                            p220oa.h.C((AutoHeightViewPager) c0105b.f665e);
                        }
                        int size2 = views.size();
                        if (size2 > 1) {
                            if (c0105b != null) {
                                ((LinearLayout) c0105b.f662b).setVisibility(0);
                            }
                            if (c0105b != null) {
                                ((LinearLayout) c0105b.f662b).removeAllViews();
                            }
                            int i11 = 0;
                            while (i11 < size2) {
                                View view = new View(orderResultRewardModel.getContext());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(CommonViewExtKt.getDp(10), CommonViewExtKt.getDp(3));
                                layoutParams.setMargins(CommonViewExtKt.getDp(1), 0, CommonViewExtKt.getDp(1), 0);
                                view.setLayoutParams(layoutParams);
                                view.setBackgroundResource(i11 == 0 ? com.transsnet.palmpay.custom_view.r.cv_button_bg_purple_corner_1 : com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_color_disable);
                                if (c0105b != null) {
                                    ((LinearLayout) c0105b.f662b).addView(view);
                                }
                                i11++;
                            }
                        } else if (c0105b != null) {
                            ((LinearLayout) c0105b.f662b).setVisibility(8);
                        }
                    }
                }
            }
        }
        return Unit.f38893a;
    }
}
