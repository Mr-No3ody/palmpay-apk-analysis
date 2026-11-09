package Ua;

import Bc.C0105b;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardItemBean;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardModel f9518b;

    public z0(ArrayList arrayList, OrderResultRewardModel orderResultRewardModel) {
        this.f9517a = arrayList;
        this.f9518b = orderResultRewardModel;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        List<OrderResultRewardItemBean> list;
        View view = (View) this.f9517a.get(i7);
        boolean zC = Intrinsics.c(view.getTag(p025ba.e.core_order_reward_report), Boolean.FALSE);
        OrderResultRewardModel orderResultRewardModel = this.f9518b;
        if (zC) {
            List list2 = orderResultRewardModel.f28519d;
            if (list2 != null && (list = (List) list2.get(i7)) != null) {
                for (OrderResultRewardItemBean orderResultRewardItemBean : list) {
                    Pa.n0.g().w("ResultPage_Reward_View", kotlin.collections.G.g(new Pair("rewardType", orderResultRewardItemBean.rewardType), new Pair("rewardid", orderResultRewardItemBean.recordNo), new Pair("transtype", orderResultRewardItemBean.transType), new Pair("memberid", C0.G.k()), new Pair("orderid", orderResultRewardModel.f28524j)));
                }
            }
            view.setTag(p025ba.e.core_order_reward_report, Boolean.TRUE);
        }
        C0105b c0105b = orderResultRewardModel.f28518c;
        int i10 = 0;
        if ((c0105b != null ? ((LinearLayout) c0105b.f662b).getChildCount() : 0) == 0) {
            return;
        }
        int childCount = c0105b != null ? ((LinearLayout) c0105b.f662b).getChildCount() : 1;
        while (i10 < childCount) {
            View childAt = c0105b != null ? ((LinearLayout) c0105b.f662b).getChildAt(i10) : null;
            if (childAt != null) {
                childAt.setBackgroundResource(i10 == i7 ? com.transsnet.palmpay.custom_view.r.cv_button_bg_purple_corner_1 : com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_color_disable);
            }
            i10++;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
    }
}
