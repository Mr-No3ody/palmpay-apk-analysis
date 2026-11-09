package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import Pa.i0;
import Pa.n0;
import android.R;
import android.os.Handler;
import android.os.Looper;
import com.google.api.Service;
import com.transsnet.palmpay.credit.ui.dialog.CLFillYourInformationDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CreditApplicationDialogFragment;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxOrderDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CreatePlanActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PlanDetailActivity;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxDepositFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxMainFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxWithdrawFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderPreFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27710a;

    public /* synthetic */ T(int i7) {
        this.f27710a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27710a) {
            case 0:
                int i7 = FlexiPayOneClickOpenActivity.f27632e;
                return androidx.work.impl.model.b.e();
            case 1:
                int i10 = FlexiPayOneClickOpenActivity.f27632e;
                return androidx.work.impl.model.b.e();
            case 2:
                int i11 = MapsActivity.f27668e;
                return new Handler(Looper.getMainLooper());
            case 3:
                CLFillYourInformationDialogFragment.a aVar = CLFillYourInformationDialogFragment.f29940M;
                return Unit.f38893a;
            case 4:
                return Unit.f38893a;
            case 5:
                return Unit.f38893a;
            case 6:
                CreditApplicationDialogFragment.a aVar2 = CreditApplicationDialogFragment.f29952L;
                return Unit.f38893a;
            case 7:
                return Unit.f38893a;
            case 8:
                return Unit.f38893a;
            case 9:
                return Unit.f38893a;
            case 10:
                return Unit.f38893a;
            case 11:
                return Integer.valueOf(R.color.transparent);
            case 12:
                return Integer.valueOf(CustomAutoCompleteTextView.dropDownHorizontalOffsetProvider$lambda$2());
            case 13:
                int i12 = CashBoxOrderDetailActivity.f32043w;
                q0.u("/manage_money/cash_box_main_activity");
                return Unit.f38893a;
            case 14:
                int i13 = CashBoxOrderDetailActivity.f32043w;
                q0.u("/manage_money/cash_box_main_activity");
                return Unit.f38893a;
            case 15:
                int i14 = CreatePlanActivity.f32067M;
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/palmpayLevel");
                return Unit.f38893a;
            case 16:
                int i15 = PlanDetailActivity.f32158s0;
                i0.b0("/cashbox/interest-setting");
                return Unit.f38893a;
            case 17:
                int i16 = PlanDetailActivity.f32158s0;
                i0.b0("/cashbox/interest-setting");
                return Unit.f38893a;
            case 18:
                int i17 = PlanDetailActivity.f32158s0;
                return Unit.f38893a;
            case 19:
                CashBoxDepositFragment.a aVar3 = CashBoxDepositFragment.f32357p0;
                q0.u("/account/palmpayLevel");
                return Unit.f38893a;
            case 20:
                CashBoxDepositFragment.a aVar4 = CashBoxDepositFragment.f32357p0;
                q0.u("/account/palmpayLevel");
                return Unit.f38893a;
            case 21:
                CashBoxDepositFragment.a aVar5 = CashBoxDepositFragment.f32357p0;
                i0.b0("/customer-service/freezeList?type=account");
                return Unit.f38893a;
            case 22:
                CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                q0.u("/account/palmpayLevel");
                return Unit.f38893a;
            case 23:
                CashBoxWithdrawFragment.a aVar7 = CashBoxWithdrawFragment.f32442H;
                n0.g().l("CashBox_WithdrawPop_Cancel_Click");
                return Unit.f38893a;
            case 24:
                CashBoxWithdrawFragment.a aVar8 = CashBoxWithdrawFragment.f32442H;
                q0.u("/account/palmpayLevel");
                return Unit.f38893a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                CashBoxWithdrawFragment.a aVar9 = CashBoxWithdrawFragment.f32442H;
                q0.u("/account/palmpayLevel");
                return Unit.f38893a;
            case 26:
                CashBoxWithdrawFragment.a aVar10 = CashBoxWithdrawFragment.f32442H;
                i0.b0("/customer-service/freezeList?type=account");
                return Unit.f38893a;
            case 27:
                OrderPreFragment.a aVar11 = OrderPreFragment.f32526Q;
                i0.b0("/cashbox/interest-setting");
                return Unit.f38893a;
            case 28:
                OrderPreFragment.a aVar12 = OrderPreFragment.f32526Q;
                i0.b0("/cashbox/interest-setting");
                return Unit.f38893a;
            default:
                return Unit.f38893a;
        }
    }
}
