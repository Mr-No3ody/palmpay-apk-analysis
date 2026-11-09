package Gb;

import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f3307b;

    public /* synthetic */ v(y yVar, int i7) {
        this.f3306a = i7;
        this.f3307b = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3306a) {
            case 0:
                p339wb.e eVar = new p339wb.e();
                eVar.a(0, Ya.f.cs_cl_loan_home_phone_installment_repayment_item);
                eVar.a(3, Ya.f.cs_cl_loan_home_phone_installment_repayment_wait_pay_item);
                eVar.a(1, Ya.f.cs_cl_loan_home_agent_info_item);
                eVar.a(-1, Ya.f.cs_cl_loan_home_empty_item);
                eVar.a(5, Ya.f.cs_cl_loan_home_phone_installment_screen_warranty_item);
                eVar.a(6, Ya.f.cs_cl_loan_home_about_repayment_ifno_item);
                eVar.a(8, Ya.f.cs_cl_loan_home_va_transfer_repayment_item);
                eVar.a(7, Ya.f.cs_cl_loan_home_default_info_item);
                eVar.addChildClickViewIds(Ya.e.tvDeviceActiveTime, Ya.e.ivRefreshLockTime, Ya.e.btnRepay, Ya.e.btnDailyRepay, Ya.e.llDailyRepaymentHistory, Ya.e.btnUnlock, Ya.e.llTotalOutstanding, Ya.e.btnConfirmPay, Ya.e.clRepaymentManagement, Ya.e.productInfoChangeView, Ya.e.aboutRepaymentView, Ya.e.defaultView);
                eVar.setAnimationEnable(false);
                eVar.f43367b = p367ya.a.d().i();
                eVar.f43368c = new v(this.f3307b, 1);
                return eVar;
            default:
                OcHomeFinanceViewModel ocHomeFinanceViewModel = this.f3307b.f3314e;
                if (ocHomeFinanceViewModel != null) {
                    ocHomeFinanceViewModel.d();
                }
                return Unit.f38893a;
        }
    }
}
