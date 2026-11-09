package p294tb;

import L6.b;
import Pa.r0;
import Z4.e;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanMainPageResp;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainConfig;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLUpGradeInstallmentAccountActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLUpGradeInstallmentAccountActivity f42528g;

    public /* synthetic */ x0(CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity, int i7) {
        this.f42527f = i7;
        this.f42528g = cLUpGradeInstallmentAccountActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42527f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42528g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42528g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42527f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42528g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                Object value = this.f42528g.f29178Z.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                h.s((RelativeLayout) value, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
    @Override // Z4.e
    public final void y(Object obj) {
        CLMainConfig config;
        TextView textViewV;
        Long remainingDate;
        Integer remainingDays;
        switch (this.f42527f) {
            case 0:
                CLMainResp cLMainResp = (CLMainResp) obj;
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity = this.f42528g;
                cLUpGradeInstallmentAccountActivity.showLoadingDialog(false);
                if (cLMainResp != null && cLMainResp.isSuccess() && cLMainResp.getData() != null) {
                    CLMainData data = cLMainResp.getData();
                    cLUpGradeInstallmentAccountActivity.f29185u0 = data;
                    if (data != null && (config = data.getConfig()) != null) {
                        DecimalFormat decimalFormat = new DecimalFormat("0.0%");
                        Object value = cLUpGradeInstallmentAccountActivity.f29183s0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ((TextView) value).setText(h.B("Repay In", null, Integer.valueOf(Color.parseColor("#906948")), null, null, "sans-serif-medium", null, 1005).append((CharSequence) h.B(" " + config.getTerm() + " Terms", null, Integer.valueOf(Color.parseColor("#FF9900")), null, null, "sans-serif-medium", null, 1005)).append((CharSequence) h.B(" Within", null, Integer.valueOf(Color.parseColor("#906948")), null, null, "sans-serif-medium", null, 1005)).append((CharSequence) h.B(" " + config.getTermSpan() + (Intrinsics.c(config.getTermSpanUnit(), "D") ? " Days" : " Month"), null, Integer.valueOf(Color.parseColor("#906948")), null, null, "sans-serif-medium", null, 1005)));
                        Object value2 = cLUpGradeInstallmentAccountActivity.f29182r0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        TextView textView = (TextView) value2;
                        Double loanMinRatio = config.getLoanMinRatio();
                        textView.setText(h.B(String.valueOf(decimalFormat.format(loanMinRatio != null ? loanMinRatio.doubleValue() : 0.001d)), null, Integer.valueOf(Color.parseColor("#FF9900")), null, null, null, null, 925).append((CharSequence) h.B(" Daily Interest", null, Integer.valueOf(Color.parseColor("#906948")), null, null, "sans-serif-medium", null, 1005)));
                        Object value3 = cLUpGradeInstallmentAccountActivity.f29181q0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        String strF = r0.F(50000000L);
                        Intrinsics.checkNotNullExpressionValue(strF, "getAmountThousandNoPointWithCurrency(...)");
                        ((TextView) value3).setText(h.B(strF, null, null, null, null, null, null, 927));
                        Object value4 = cLUpGradeInstallmentAccountActivity.f29180p0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ((TextView) value4).setText(h.B(String.valueOf(config.getMaxLoanDays()), null, null, Integer.valueOf(b.ppColorTextPrimary), 32, null, null, 915).append((CharSequence) h.B(" Days", null, null, Integer.valueOf(b.ppColorTextPrimary), 12, "sans-serif-medium", null, 995)));
                        Object value5 = cLUpGradeInstallmentAccountActivity.f29179k0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        ((TextView) value5).setText(config.getTerm() + " Terms, " + config.getTermSpan() + (Intrinsics.c(config.getTermSpanUnit(), "D") ? " days/term" : " month/term"));
                        break;
                    }
                } else {
                    ToastUtils.showShort(cLMainResp != null ? cLMainResp.getRespMsg() : null, new Object[0]);
                    break;
                }
                break;
            default:
                CLInstallmentLoanMainPageResp installmentMainPageData = (CLInstallmentLoanMainPageResp) obj;
                Intrinsics.checkNotNullParameter(installmentMainPageData, "installmentMainPageData");
                boolean zIsSuccess = installmentMainPageData.isSuccess();
                CLUpGradeInstallmentAccountActivity cLUpGradeInstallmentAccountActivity2 = this.f42528g;
                t tVar = cLUpGradeInstallmentAccountActivity2.f29175Q;
                t tVar2 = cLUpGradeInstallmentAccountActivity2.f29177Y;
                if (zIsSuccess) {
                    InstallmentLoanMainPageData data2 = installmentMainPageData.getData();
                    if (((data2 == null || (remainingDays = data2.getRemainingDays()) == null) ? 0 : remainingDays.intValue()) > 0) {
                        Object value6 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        TextView textView2 = (TextView) value6;
                        h.s(textView2, true);
                        SpannableStringBuilder spannableStringBuilderB = h.B("Please reapply for installment limit after ", null, Integer.valueOf(cLUpGradeInstallmentAccountActivity2.getColor(b.ppColorTextPrimary)), null, null, null, null, 1021);
                        InstallmentLoanMainPageData data3 = installmentMainPageData.getData();
                        textView2.setText(spannableStringBuilderB.append((CharSequence) h.B(String.valueOf(TimeUtils.millis2String((data3 == null || (remainingDate = data3.getRemainingDate()) == null) ? 0L : remainingDate.longValue(), new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH))), null, Integer.valueOf(Color.parseColor("#FF9900")), null, null, null, null, 1021)));
                        TextView textViewV2 = cLUpGradeInstallmentAccountActivity2.v();
                        if (textViewV2 != null) {
                            textViewV2.setEnabled(false);
                            h.j(textViewV2, Integer.valueOf(CommonViewExtKt.getDp(36)), 0, 0, 0);
                        }
                        Object value7 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        h.s((ImageView) value7, false);
                    } else {
                        Object value8 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        h.s((TextView) value8, false);
                        textViewV = cLUpGradeInstallmentAccountActivity2.v();
                        if (textViewV != null) {
                            textViewV.setEnabled(true);
                            h.j(textViewV, 0, 0, 0, 0);
                        }
                        Object value9 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        h.s((ImageView) value9, true);
                    }
                } else {
                    Object value10 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                    h.s((TextView) value10, false);
                    textViewV = cLUpGradeInstallmentAccountActivity2.v();
                    if (textViewV != null) {
                        textViewV.setEnabled(true);
                        h.j(textViewV, 0, 0, 0, 0);
                    }
                    Object value11 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                    h.s((ImageView) value11, true);
                }
                Object value12 = cLUpGradeInstallmentAccountActivity2.f29178Z.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                h.s((RelativeLayout) value12, true);
                break;
        }
    }
}
