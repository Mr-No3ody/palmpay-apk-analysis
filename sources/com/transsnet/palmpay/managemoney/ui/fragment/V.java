package com.transsnet.palmpay.managemoney.ui.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OldUserFixedSavingFragment f32579b;

    public /* synthetic */ V(OldUserFixedSavingFragment oldUserFixedSavingFragment, int i7) {
        this.f32578a = i7;
        this.f32579b = oldUserFixedSavingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OldUserFixedSavingFragment oldUserFixedSavingFragment = this.f32579b;
        switch (this.f32578a) {
            case 0:
                OldUserFixedSavingFragment.a aVar = OldUserFixedSavingFragment.f32498Z;
                ViewPager viewPager = (ViewPager) oldUserFixedSavingFragment.f32508v.getValue();
                if (viewPager != null) {
                    viewPager.setCurrentItem(1);
                }
                return Unit.f38893a;
            case 1:
                OldUserFixedSavingFragment.a aVar2 = OldUserFixedSavingFragment.f32498Z;
                View view = oldUserFixedSavingFragment.f27318b;
                if (view != null) {
                    return (PpTitleBar) view.findViewById(Jc.c.ctb);
                }
                return null;
            case 2:
                OldUserFixedSavingFragment.a aVar3 = OldUserFixedSavingFragment.f32498Z;
                View view2 = oldUserFixedSavingFragment.f27318b;
                if (view2 != null) {
                    return (RoundedTextView) view2.findViewById(Jc.c.rtvCreatePlan);
                }
                return null;
            case 3:
                OldUserFixedSavingFragment.a aVar4 = OldUserFixedSavingFragment.f32498Z;
                View view3 = oldUserFixedSavingFragment.f27318b;
                if (view3 != null) {
                    return (ViewPager) view3.findViewById(Jc.c.viewPager);
                }
                return null;
            case 4:
                OldUserFixedSavingFragment.a aVar5 = OldUserFixedSavingFragment.f32498Z;
                View view4 = oldUserFixedSavingFragment.f27318b;
                if (view4 != null) {
                    return (TabLayout) view4.findViewById(Jc.c.tabLayout);
                }
                return null;
            case 5:
                OldUserFixedSavingFragment.a aVar6 = OldUserFixedSavingFragment.f32498Z;
                View view5 = oldUserFixedSavingFragment.f27318b;
                if (view5 != null) {
                    return (TextView) view5.findViewById(Jc.c.tvTotalInterestAmount);
                }
                return null;
            case 6:
                OldUserFixedSavingFragment.a aVar7 = OldUserFixedSavingFragment.f32498Z;
                View view6 = oldUserFixedSavingFragment.f27318b;
                if (view6 != null) {
                    return (IconicsTextView) view6.findViewById(Jc.c.tvBalanceAmount);
                }
                return null;
            case 7:
                OldUserFixedSavingFragment.a aVar8 = OldUserFixedSavingFragment.f32498Z;
                View view7 = oldUserFixedSavingFragment.f27318b;
                if (view7 != null) {
                    return (AppCompatImageView) view7.findViewById(Jc.c.ivToggleShowBalance);
                }
                return null;
            case 8:
                OldUserFixedSavingFragment.a aVar9 = OldUserFixedSavingFragment.f32498Z;
                View view8 = oldUserFixedSavingFragment.f27318b;
                if (view8 != null) {
                    return (ImageView) view8.findViewById(Jc.c.iv);
                }
                return null;
            default:
                OldUserFixedSavingFragment.a aVar10 = OldUserFixedSavingFragment.f32498Z;
                View view9 = oldUserFixedSavingFragment.f27318b;
                if (view9 != null) {
                    return (MarqueeView) view9.findViewById(Jc.c.viewMarquee);
                }
                return null;
        }
    }
}
