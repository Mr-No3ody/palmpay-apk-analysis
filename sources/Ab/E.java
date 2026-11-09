package Ab;

import N8.q0;
import Pa.r0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.F;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.transsnet.palmpay.credit.bean.resp.CLCashInfoBean;
import com.transsnet.palmpay.credit.bean.resp.CLCashInfoResp;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLInstallmentUpGradeSuccFragment f108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f109g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CLMainData f110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InstallmentLoanMainPageData f111j;

    public E(CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment, String str, CLMainData cLMainData, InstallmentLoanMainPageData installmentLoanMainPageData) {
        this.f108f = cLInstallmentUpGradeSuccFragment;
        this.f109g = str;
        this.f110i = cLMainData;
        this.f111j = installmentLoanMainPageData;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f108f.f(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f108f;
        cLInstallmentUpGradeSuccFragment.showLoadingDialog(false);
        TextView textView = (TextView) cLInstallmentUpGradeSuccFragment.f30608Q.getValue();
        if (textView != null) {
            p220oa.h.s(textView, false);
        }
        ToastUtils.showShort(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        String cashMinInterestRate;
        String cashMinInterestRate2;
        QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto adjustQuotaBusinessResDto;
        Object objF;
        Long cashExampleAmount;
        Long cashExampleAmount2;
        Integer applyStatus;
        Integer applyStatus2;
        Integer applyStatus3;
        Integer applyStatus4;
        Integer applyStatus5;
        Integer applyStatus6;
        String cashMinInterestRate3;
        CLCashInfoResp resp = (CLCashInfoResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f108f;
        cLInstallmentUpGradeSuccFragment.showLoadingDialog(false);
        boolean zIsSuccess = resp.isSuccess();
        p355xf.t tVar = cLInstallmentUpGradeSuccFragment.f30608Q;
        if (!zIsSuccess) {
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                p220oa.h.s(textView, false);
            }
            androidx.camera.core.impl.utils.n.u(resp.getRespMsg());
            return;
        }
        CLCashInfoBean data = resp.getData();
        String str = IdManager.DEFAULT_VERSION_NAME;
        if (data == null || (cashMinInterestRate = data.getCashMinInterestRate()) == null) {
            cashMinInterestRate = IdManager.DEFAULT_VERSION_NAME;
        }
        StringBuilder sb2 = new StringBuilder("onSuccess: cashRadio:");
        String str2 = this.f109g;
        Object[] objArr = {F.d(sb2, str2, "  cashMinInterestRate:", cashMinInterestRate)};
        String str3 = cLInstallmentUpGradeSuccFragment.f27317a;
        F6.d.h(str3, 3, objArr);
        CLCashInfoBean data2 = resp.getData();
        if (data2 == null || (cashMinInterestRate2 = data2.getCashMinInterestRate()) == null) {
            cashMinInterestRate2 = IdManager.DEFAULT_VERSION_NAME;
        }
        int iCompareTo = r0.U1(str2, cashMinInterestRate2).compareTo(BigDecimal.ZERO);
        boolean z3 = true;
        if (iCompareTo < 0) {
            TextView textView2 = (TextView) tVar.getValue();
            if (textView2 != null) {
                p220oa.h.s(textView2, true);
            }
            TextView textView3 = (TextView) tVar.getValue();
            if (textView3 != null) {
                SpannableStringBuilder spannableStringBuilderB = p220oa.h.B("(", null, null, null, null, null, null, 1023);
                CLCashInfoBean data3 = resp.getData();
                if (data3 != null && (cashMinInterestRate3 = data3.getCashMinInterestRate()) != null) {
                    str = cashMinInterestRate3;
                }
                textView3.setText(spannableStringBuilderB.append((CharSequence) p220oa.h.B(q0.j(Pa.E.a(r0.w1(str, "100").toPlainString()), "%"), null, null, null, null, null, null, 511)).append((CharSequence) ")"));
            }
        }
        CLMainData cLMainData = this.f110i;
        boolean z8 = (cLMainData != null ? cLMainData.getApplyStatus() : null) == null || ((applyStatus4 = cLMainData.getApplyStatus()) != null && applyStatus4.intValue() == -1) || (((applyStatus5 = cLMainData.getApplyStatus()) != null && applyStatus5.intValue() == 0) || ((applyStatus6 = cLMainData.getApplyStatus()) != null && applyStatus6.intValue() == 2));
        InstallmentLoanMainPageData installmentLoanMainPageData = this.f111j;
        if ((installmentLoanMainPageData != null ? installmentLoanMainPageData.getApplyStatus() : null) != null && (((applyStatus = installmentLoanMainPageData.getApplyStatus()) == null || applyStatus.intValue() != -1) && (((applyStatus2 = installmentLoanMainPageData.getApplyStatus()) == null || applyStatus2.intValue() != 0) && ((applyStatus3 = installmentLoanMainPageData.getApplyStatus()) == null || applyStatus3.intValue() != 2)))) {
            z3 = false;
        }
        F6.d.h(str3, 3, "cashLoanAccountInactive=" + z8 + ", installmentAccountInactive=" + z3);
        TextView textView4 = (TextView) cLInstallmentUpGradeSuccFragment.f30610Y.getValue();
        if (textView4 != null) {
            textView4.setText((z3 || !z8) ? "Congratulations on the loan \nservice" : "Congratulations on enjoying \ninstallment loans!");
        }
        p355xf.t tVar2 = cLInstallmentUpGradeSuccFragment.f30615p;
        if (z3 || z8 || (adjustQuotaBusinessResDto = cLInstallmentUpGradeSuccFragment.f30613k0) == null) {
            RelativeLayout relativeLayout = (RelativeLayout) tVar2.getValue();
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
                return;
            }
            return;
        }
        try {
            p355xf.o oVar = p355xf.q.f43977a;
            F6.d.h(str3, 3, "installmentLoanInfo >>> " + adjustQuotaBusinessResDto);
            QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto adjustQuotaBusinessResDto2 = cLInstallmentUpGradeSuccFragment.f30613k0;
            long jLongValue = 1000;
            BigDecimal bigDecimal = new BigDecimal((adjustQuotaBusinessResDto2 == null || (cashExampleAmount2 = adjustQuotaBusinessResDto2.getCashExampleAmount()) == null) ? 1000L : cashExampleAmount2.longValue());
            QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto adjustQuotaBusinessResDto3 = cLInstallmentUpGradeSuccFragment.f30613k0;
            Double cashMinInterestRate4 = adjustQuotaBusinessResDto3 != null ? adjustQuotaBusinessResDto3.getCashMinInterestRate() : null;
            Intrinsics.e(cashMinInterestRate4);
            String strF = r0.F(bigDecimal.multiply(new BigDecimal(cashMinInterestRate4.doubleValue())).longValue());
            RelativeLayout relativeLayout2 = (RelativeLayout) tVar2.getValue();
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            TextView textView5 = (TextView) cLInstallmentUpGradeSuccFragment.f30614o.getValue();
            if (textView5 != null) {
                SpanUtils spanUtils = new SpanUtils();
                QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto adjustQuotaBusinessResDto4 = cLInstallmentUpGradeSuccFragment.f30613k0;
                if (adjustQuotaBusinessResDto4 != null && (cashExampleAmount = adjustQuotaBusinessResDto4.getCashExampleAmount()) != null) {
                    jLongValue = cashExampleAmount.longValue();
                }
                SpanUtils spanUtilsAppend = spanUtils.append("Borrow " + r0.F(jLongValue) + " Daily interest only ");
                Context context = cLInstallmentUpGradeSuccFragment.getContext();
                Intrinsics.e(context);
                SpanUtils spanUtilsAppend2 = spanUtilsAppend.setForegroundColor(context.getColor(Ya.b.cs_cl_indicator_selected)).append(strF);
                Context context2 = cLInstallmentUpGradeSuccFragment.getContext();
                Intrinsics.e(context2);
                textView5.setText(spanUtilsAppend2.setForegroundColor(context2.getColor(L6.b.ppColorWarning)).create());
            }
            objF = Unit.f38893a;
        } catch (Throwable th) {
            p355xf.o oVar2 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        Throwable thA = p355xf.q.a(objF);
        if (thA != null) {
            F6.d.c(str3, thA);
        }
        TextView textView6 = (TextView) cLInstallmentUpGradeSuccFragment.f30612j.getValue();
        if (textView6 != null) {
            p220oa.h.l(new A(cLInstallmentUpGradeSuccFragment, 2), textView6);
        }
    }
}
