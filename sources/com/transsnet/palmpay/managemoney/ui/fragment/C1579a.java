package com.transsnet.palmpay.managemoney.ui.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1579a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxAutoSaveFragment f32587b;

    public /* synthetic */ C1579a(CashBoxAutoSaveFragment cashBoxAutoSaveFragment, int i7) {
        this.f32586a = i7;
        this.f32587b = cashBoxAutoSaveFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CashBoxAutoSaveFragment cashBoxAutoSaveFragment = this.f32587b;
        switch (this.f32586a) {
            case 0:
                CashBoxAutoSaveFragment.a aVar = CashBoxAutoSaveFragment.f32343Y;
                View view = cashBoxAutoSaveFragment.f27318b;
                if (view != null) {
                    return (LinearLayout) view.findViewById(Jc.c.layout_open);
                }
                return null;
            case 1:
                CashBoxAutoSaveFragment.a aVar2 = CashBoxAutoSaveFragment.f32343Y;
                View view2 = cashBoxAutoSaveFragment.f27318b;
                if (view2 != null) {
                    return (TextView) view2.findViewById(Jc.c.tv_agree);
                }
                return null;
            case 2:
                CashBoxAutoSaveFragment.a aVar3 = CashBoxAutoSaveFragment.f32343Y;
                View view3 = cashBoxAutoSaveFragment.f27318b;
                if (view3 != null) {
                    return (RoundedTextView) view3.findViewById(Jc.c.rtvToggleAutoSave);
                }
                return null;
            case 3:
                CashBoxAutoSaveFragment.a aVar4 = CashBoxAutoSaveFragment.f32343Y;
                View view4 = cashBoxAutoSaveFragment.f27318b;
                if (view4 != null) {
                    return (NestedScrollView) view4.findViewById(Jc.c.layout_close);
                }
                return null;
            case 4:
                CashBoxAutoSaveFragment.a aVar5 = CashBoxAutoSaveFragment.f32343Y;
                View view5 = cashBoxAutoSaveFragment.f27318b;
                if (view5 != null) {
                    return (ImageView) view5.findViewById(Jc.c.iv_banner);
                }
                return null;
            case 5:
                CashBoxAutoSaveFragment.a aVar6 = CashBoxAutoSaveFragment.f32343Y;
                View view6 = cashBoxAutoSaveFragment.f27318b;
                if (view6 != null) {
                    return (TextView) view6.findViewById(Jc.c.tvEarlyDialy);
                }
                return null;
            case 6:
                CashBoxAutoSaveFragment.a aVar7 = CashBoxAutoSaveFragment.f32343Y;
                CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxAutoSaveFragment.f27333i;
                if (cashBoxViewModel != null) {
                    cashBoxViewModel.f();
                }
                return Unit.f38893a;
            case 7:
                CashBoxAutoSaveFragment.a aVar8 = CashBoxAutoSaveFragment.f32343Y;
                View view7 = cashBoxAutoSaveFragment.f27318b;
                if (view7 != null) {
                    return (TextView) view7.findViewById(Jc.c.tvTurnOffAutoSave);
                }
                return null;
            case 8:
                CashBoxAutoSaveFragment.a aVar9 = CashBoxAutoSaveFragment.f32343Y;
                View view8 = cashBoxAutoSaveFragment.f27318b;
                if (view8 != null) {
                    return (PpTitleBar) view8.findViewById(Jc.c.mtb);
                }
                return null;
            case 9:
                CashBoxAutoSaveFragment.a aVar10 = CashBoxAutoSaveFragment.f32343Y;
                View view9 = cashBoxAutoSaveFragment.f27318b;
                if (view9 != null) {
                    return (TextView) view9.findViewById(Jc.c.tvContent);
                }
                return null;
            case 10:
                CashBoxAutoSaveFragment.a aVar11 = CashBoxAutoSaveFragment.f32343Y;
                View view10 = cashBoxAutoSaveFragment.f27318b;
                if (view10 != null) {
                    return (RoundedTextView) view10.findViewById(Jc.c.rtvBackToCash);
                }
                return null;
            case 11:
                CashBoxAutoSaveFragment.a aVar12 = CashBoxAutoSaveFragment.f32343Y;
                View view11 = cashBoxAutoSaveFragment.f27318b;
                if (view11 != null) {
                    return (TextView) view11.findViewById(Jc.c.tvInterestRate);
                }
                return null;
            default:
                CashBoxAutoSaveFragment.a aVar13 = CashBoxAutoSaveFragment.f32343Y;
                View view12 = cashBoxAutoSaveFragment.f27318b;
                if (view12 != null) {
                    return (TextView) view12.findViewById(Jc.c.tvAutoSave);
                }
                return null;
        }
    }
}
