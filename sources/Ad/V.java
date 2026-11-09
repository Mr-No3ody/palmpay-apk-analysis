package Ad;

import Pa.n0;
import android.view.View;
import com.transsnet.palmpay.betting.ui.view.ModelBillerSelection;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.ui.dialog.TransferByLoanSheet;
import com.transsnet.palmpay.main.export.bean.rsp.SavingProduct;
import com.transsnet.palmpay.main.export.ui.view.ModelNewCustomerSavings;
import com.transsnet.palmpay.managemoney.ui.activity.CreatePlanActivity;
import com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingTabFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CreatePlanViewModel;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView;
import com.transsnet.palmpay.send_money.ui.dialog.SelectDayDialog;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f193c;

    public /* synthetic */ V(int i7, UserFixedSavingTabFragment userFixedSavingTabFragment) {
        this.f191a = 6;
        this.f192b = i7;
        this.f193c = userFixedSavingTabFragment;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v22, types: [com.transsnet.palmpay.ui.adapter.BankCardAndAccountAdapter$OnClickListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String string2;
        int i7 = this.f192b;
        Object obj = this.f193c;
        switch (this.f191a) {
            case 0:
                com.transsnet.palmpay.send_money.ui.dialog.a aVar = (com.transsnet.palmpay.send_money.ui.dialog.a) obj;
                SelectDayDialog selectDayDialog = aVar.f33647e;
                if (selectDayDialog.callback != null) {
                    selectDayDialog.selectDay = i7 + 1;
                    aVar.notifyDataSetChanged();
                    selectDayDialog.callback.onDaySelect(selectDayDialog.selectDay);
                }
                selectDayDialog.dismiss();
                return;
            case 1:
                n0.g().l("PalmPay_Wealth_ExclusiveSave_Click");
                com.transsnet.palmpay.main.export.ui.view.a aVar2 = (com.transsnet.palmpay.main.export.ui.view.a) obj;
                ModelNewCustomerSavings.OnInvestBtnClickListener onInvestBtnClickListener = aVar2.f31999b;
                if (onInvestBtnClickListener != null) {
                    List list = aVar2.f31998a;
                    onInvestBtnClickListener.onInvestBtnClick(list != null ? (SavingProduct) list.get(i7) : null);
                    return;
                }
                return;
            case 2:
                ((Ie.e) obj).b(i7);
                return;
            case 3:
                P2PInputAmountView p2PInputAmountView = ((Xc.f) obj).f11124a.f11125a;
                long jLongValue = ((Long) p2PInputAmountView.f33011g.get(i7)).longValue() / 100;
                p2PInputAmountView.f33007c.setText(jLongValue + "");
                return;
            case 4:
                int i10 = TransferByLoanSheet.f30032q0;
                TransferByLoanSheet transferByLoanSheet = (TransferByLoanSheet) obj;
                Object objD = transferByLoanSheet.z().f30933g.d();
                Jb.G g7 = objD instanceof Jb.G ? (Jb.G) objD : null;
                if (g7 == null || i7 == g7.f4703d) {
                    return;
                }
                androidx.lifecycle.F f10 = transferByLoanSheet.z().f30932f;
                Object objD2 = f10.d();
                Jb.G g10 = objD2 instanceof Jb.G ? (Jb.G) objD2 : null;
                if (g10 != null && i7 >= 0 && i7 < ((Collection) g10.f4702c).size() && i7 != g10.f4703d) {
                    f10.k(Jb.G.a(g10, i7, false, 23));
                }
                Object objD3 = transferByLoanSheet.z().f30932f.d();
                Jb.G g11 = objD3 instanceof Jb.G ? (Jb.G) objD3 : null;
                CLRepaymentPlanData plan = g11 == null ? null : (CLRepaymentPlanData) CollectionsKt.G(g11.f4703d, g11.f4702c);
                if (plan != null) {
                    TransferByLoanOpenParams transferByLoanOpenParams = transferByLoanSheet.f30044j;
                    if (transferByLoanOpenParams == null) {
                        Intrinsics.n("params");
                        throw null;
                    }
                    long loanAmount = transferByLoanOpenParams.getLoanAmount();
                    Intrinsics.checkNotNullParameter(plan, "plan");
                    n0 n0VarG = n0.g();
                    Integer id2 = plan.getId();
                    if (id2 == null || (string = id2.toString()) == null) {
                        Integer productSubId = plan.getProductSubId();
                        if (productSubId != null) {
                            string = productSubId.toString();
                        } else {
                            Integer loanDays = plan.getLoanDays();
                            int iIntValue = loanDays != null ? loanDays.intValue() : 0;
                            Integer loanTerm = plan.getLoanTerm();
                            string = iIntValue + "_" + (loanTerm != null ? loanTerm.intValue() : 0);
                        }
                    }
                    Pair pair = new Pair("selected_tenure_id", string);
                    Integer loanDays2 = plan.getLoanDays();
                    Pair pair2 = new Pair("tenure_days", String.valueOf(loanDays2 != null ? loanDays2.intValue() : 0));
                    Double interestRatio = plan.getInterestRatio();
                    if (interestRatio == null || (string2 = interestRatio.toString()) == null) {
                        string2 = "0";
                    }
                    n0VarG.n("loan_transfer_tenure_select", J3.a.g(pair, pair2, new Pair("interest_rate", string2), new Pair("transfer_amount", String.valueOf(loanAmount))));
                    return;
                }
                return;
            case 5:
                int i11 = CreatePlanActivity.f32067M;
                CreatePlanViewModel createPlanViewModel = (CreatePlanViewModel) ((CreatePlanActivity) obj).l();
                if (createPlanViewModel != null) {
                    p140j8.f.s(createPlanViewModel, new Qc.T(i7 != 0 ? 0 : 1, null), createPlanViewModel.f32765i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    return;
                }
                return;
            case 6:
                UserFixedSavingTabFragment.a aVar3 = UserFixedSavingTabFragment.f32214w;
                n0.g().l(i7 == 0 ? "FixedPlansPage_MyPlansTab_Click" : "MyPlansPage_FixedPlansTab_Click");
                ((UserFixedSavingTabFragment) obj).x(i7);
                return;
            case 7:
                ((p052da.D) obj).f35676b.closeShareImg(i7);
                return;
            case 8:
                p328ve.c cVar = (p328ve.c) obj;
                ?? r10 = cVar.f43182d;
                if (r10 != 0) {
                    r10.onUnbindClick(cVar.f43180b.get(i7));
                    return;
                }
                return;
            default:
                int i12 = ModelBillerSelection.f26752g;
                ((ModelBillerSelection) obj).d(i7, true);
                return;
        }
    }

    public /* synthetic */ V(Object obj, int i7, int i10) {
        this.f191a = i10;
        this.f193c = obj;
        this.f192b = i7;
    }
}
