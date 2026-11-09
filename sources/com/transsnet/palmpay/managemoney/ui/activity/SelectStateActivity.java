package com.transsnet.palmpay.managemoney.ui.activity;

import Qc.C0571l;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_select_state_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/SelectStateActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectStateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectStateActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/SelectStateActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,121:1\n171#2,12:122\n215#2:134\n171#2,12:135\n215#2:147\n*S KotlinDebug\n*F\n+ 1 SelectStateActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/SelectStateActivity\n*L\n92#1:122,12\n92#1:134\n98#1:135,12\n98#1:147\n*E\n"})
public final class SelectStateActivity extends BaseMvvmActivity<CashBoxViewModel> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f32186i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GetBeforeOrderResp.StateInfo f32190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f32191g;

    public SelectStateActivity() {
        final int i7 = 0;
        this.f32187c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectStateActivity f32136b;

            {
                this.f32136b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectStateActivity selectStateActivity = this.f32136b;
                switch (i7) {
                    case 0:
                        int i10 = SelectStateActivity.f32186i;
                        return (RoundedTextView) selectStateActivity.findViewById(Jc.c.rtvConfirm);
                    case 1:
                        int i11 = SelectStateActivity.f32186i;
                        return (IconicsTextView) selectStateActivity.findViewById(Jc.c.tvState);
                    default:
                        int i12 = SelectStateActivity.f32186i;
                        return (TextView) selectStateActivity.findViewById(Jc.c.tvTaxInformationContent);
                }
            }
        });
        final int i10 = 1;
        this.f32188d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectStateActivity f32136b;

            {
                this.f32136b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectStateActivity selectStateActivity = this.f32136b;
                switch (i10) {
                    case 0:
                        int i11 = SelectStateActivity.f32186i;
                        return (RoundedTextView) selectStateActivity.findViewById(Jc.c.rtvConfirm);
                    case 1:
                        int i12 = SelectStateActivity.f32186i;
                        return (IconicsTextView) selectStateActivity.findViewById(Jc.c.tvState);
                    default:
                        int i13 = SelectStateActivity.f32186i;
                        return (TextView) selectStateActivity.findViewById(Jc.c.tvTaxInformationContent);
                }
            }
        });
        final int i11 = 2;
        this.f32189e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectStateActivity f32136b;

            {
                this.f32136b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectStateActivity selectStateActivity = this.f32136b;
                switch (i11) {
                    case 0:
                        int i12 = SelectStateActivity.f32186i;
                        return (RoundedTextView) selectStateActivity.findViewById(Jc.c.rtvConfirm);
                    case 1:
                        int i13 = SelectStateActivity.f32186i;
                        return (IconicsTextView) selectStateActivity.findViewById(Jc.c.tvState);
                    default:
                        int i14 = SelectStateActivity.f32186i;
                        return (TextView) selectStateActivity.findViewById(Jc.c.tvTaxInformationContent);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_select_state_activity;
    }

    public final RoundedTextView m() {
        Object value = this.f32187c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RoundedTextView) value;
    }

    public final IconicsTextView n() {
        Object value = this.f32188d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsTextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) l();
        cashBoxViewModel.getClass();
        p140j8.f.s(cashBoxViewModel, new Qc.C(1, null), cashBoxViewModel.f32744f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(Jc.a.mm_color_f6f6fa), true);
        this.f32190f = (GetBeforeOrderResp.StateInfo) getIntent().getParcelableExtra("state_info");
        Object value = this.f32189e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        int i7 = Jc.f.mm_interest_rate_by_tax_tips;
        GetInterestRateConfigResp getInterestRateConfigResp = Kc.f.f4999b.getInstance().f5000a;
        textView.setText(getString(i7, getInterestRateConfigResp != null ? getInterestRateConfigResp.getIncomeTaxRate() : null));
        final int i10 = 0;
        n().addTextChangedListener(new P(this, i10));
        n().setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectStateActivity f32134b;

            {
                this.f32134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectStateActivity selectStateActivity = this.f32134b;
                switch (i10) {
                    case 0:
                        int i11 = SelectStateActivity.f32186i;
                        PickStateDialogFragment pickStateDialogFragmentNewInstance = PickStateDialogFragment.f31255Q.newInstance(new Q(selectStateActivity), selectStateActivity.f32191g, null, selectStateActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_select_state));
                        Z supportFragmentManager = selectStateActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        pickStateDialogFragmentNewInstance.show(supportFragmentManager, "showStateListDialog");
                        break;
                    default:
                        int i12 = SelectStateActivity.f32186i;
                        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) selectStateActivity.l();
                        GetBeforeOrderResp.StateInfo stateInfo = selectStateActivity.f32190f;
                        cashBoxViewModel.getClass();
                        p140j8.f.s(cashBoxViewModel, new C0571l(stateInfo, null), cashBoxViewModel.f32745g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                }
            }
        });
        final int i11 = 1;
        m().setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectStateActivity f32134b;

            {
                this.f32134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectStateActivity selectStateActivity = this.f32134b;
                switch (i11) {
                    case 0:
                        int i12 = SelectStateActivity.f32186i;
                        PickStateDialogFragment pickStateDialogFragmentNewInstance = PickStateDialogFragment.f31255Q.newInstance(new Q(selectStateActivity), selectStateActivity.f32191g, null, selectStateActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_select_state));
                        Z supportFragmentManager = selectStateActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        pickStateDialogFragmentNewInstance.show(supportFragmentManager, "showStateListDialog");
                        break;
                    default:
                        int i13 = SelectStateActivity.f32186i;
                        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) selectStateActivity.l();
                        GetBeforeOrderResp.StateInfo stateInfo = selectStateActivity.f32190f;
                        cashBoxViewModel.getClass();
                        p140j8.f.s(cashBoxViewModel, new C0571l(stateInfo, null), cashBoxViewModel.f32745g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                }
            }
        });
        IconicsTextView iconicsTextViewN = n();
        GetBeforeOrderResp.StateInfo stateInfo = this.f32190f;
        iconicsTextViewN.setText(stateInfo != null ? stateInfo.getStateName() : null);
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) l()).f32744f;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new O(this, this, 0), 14));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CashBoxViewModel) l()).f32745g;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new O(this, this, 1), 14));
        }
    }
}
