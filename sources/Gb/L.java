package Gb;

import Gd.C0297a;
import android.hardware.Camera;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckUbaBankAccountOTPFragment;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import com.transsnet.palmpay.account.bean.req.SignUpSuccessCouponReq;
import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountBaseFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUbaBankAccountOTPFragment;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.view.PhoneInstallmentDailyLoanView;
import com.transsnet.palmpay.credit.view.PhoneInstallmentLoanView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.activity.C1578y;
import com.transsnet.palmpay.managemoney.ui.activity.InsuranceTakePhotoActivity;
import com.transsnet.palmpay.send_money.bean.RecentlyCompensationBean;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p051d9.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3240b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i7, long j6, KeyEvent.Callback callback) {
        super(j6, 1000L);
        this.f3239a = i7;
        this.f3240b = callback;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        String remainingTimeDesc;
        TextView textView;
        TextView textView2;
        int i7 = 0;
        Object obj = this.f3240b;
        switch (this.f3239a) {
            case 0:
                PhoneInstallmentDailyLoanView.a aVar = PhoneInstallmentDailyLoanView.f30860i;
                PhoneInstallmentDailyLoanView phoneInstallmentDailyLoanView = (PhoneInstallmentDailyLoanView) obj;
                phoneInstallmentDailyLoanView.i();
                phoneInstallmentDailyLoanView.g(phoneInstallmentDailyLoanView.f30863c);
                if (!phoneInstallmentDailyLoanView.f30864d) {
                    phoneInstallmentDailyLoanView.f30864d = true;
                    Function0 function0 = phoneInstallmentDailyLoanView.onUnlockCountDownFinished;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    break;
                }
                break;
            case 1:
                PhoneInstallmentLoanView phoneInstallmentLoanView = (PhoneInstallmentLoanView) obj;
                phoneInstallmentLoanView.b();
                phoneInstallmentLoanView.e(phoneInstallmentLoanView.f30870b);
                if (!phoneInstallmentLoanView.f30872d) {
                    phoneInstallmentLoanView.f30872d = true;
                    Function0 function1 = phoneInstallmentLoanView.onUnlockCountDownFinished;
                    if (function1 != null) {
                        function1.invoke();
                    }
                    break;
                }
                break;
            case 2:
                C0297a c0297a = (C0297a) obj;
                TextView textView3 = c0297a.f3333g;
                if (textView3 != null) {
                    SpanUtils spanUtils = new SpanUtils();
                    RecentlyCompensationBean recentlyCompensationBean = c0297a.f3336j;
                    if (recentlyCompensationBean == null || (remainingTimeDesc = recentlyCompensationBean.getRemainingTimeDesc()) == null) {
                        remainingTimeDesc = "";
                    }
                    SpanUtils spanUtilsAppend = spanUtils.append(remainingTimeDesc).append(" 00:00");
                    int i10 = L6.b.ppColorPrimary;
                    TextView textView4 = c0297a.f3332f;
                    textView3.setText(spanUtilsAppend.setForegroundColor(CommonViewExtKt.colorInt(i10, textView4 != null ? textView4.getContext() : null)).create());
                }
                c0297a.f3327a.onAdvancedCountDownEnd();
                break;
            case 3:
                AddBankAccountBaseFragment addBankAccountBaseFragment = (AddBankAccountBaseFragment) obj;
                addBankAccountBaseFragment.x().f31582e.setTag(Boolean.FALSE);
                addBankAccountBaseFragment.x().f31582e.setEnabled(true);
                addBankAccountBaseFragment.x().f31582e.setText(p025ba.k.core_send_code);
                break;
            case 4:
                CheckUbaBankAccountOTPFragment.a aVar2 = CheckUbaBankAccountOTPFragment.f28025L;
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = (CheckUbaBankAccountOTPFragment) obj;
                TextView textViewZ = checkUbaBankAccountOTPFragment.z();
                if (textViewZ != null) {
                    textViewZ.setEnabled(true);
                }
                TextView textViewZ2 = checkUbaBankAccountOTPFragment.z();
                if (textViewZ2 != null) {
                    textViewZ2.setText(p025ba.k.core_resend);
                }
                break;
            case 5:
                int i11 = SignUpSuccessActivity.f26045o;
                d0 d0Var = (d0) ((SignUpSuccessActivity) obj).f27350a;
                if (d0Var != null) {
                    d0Var.queryRegisterCoupon(new SignUpSuccessCouponReq());
                }
                break;
            case 6:
                FlexiBankCheckUbaBankAccountOTPFragment.a aVar3 = FlexiBankCheckUbaBankAccountOTPFragment.f22030w;
                FlexiBankCheckUbaBankAccountOTPFragment flexiBankCheckUbaBankAccountOTPFragment = (FlexiBankCheckUbaBankAccountOTPFragment) obj;
                x4.g gVar = (x4.g) flexiBankCheckUbaBankAccountOTPFragment.f21944f;
                if (gVar != null && (textView2 = gVar.f43606g) != null) {
                    textView2.setEnabled(true);
                }
                x4.g gVar2 = (x4.g) flexiBankCheckUbaBankAccountOTPFragment.f21944f;
                if (gVar2 != null && (textView = gVar2.f43606g) != null) {
                    textView.setText(com.flexibank.sdk.r.fb_resend);
                    break;
                }
                break;
            case 7:
                ((RepayRemindDialog) obj).cancelCountDown();
                break;
            case 8:
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = (InsuranceTakePhotoActivity) obj;
                Object value = insuranceTakePhotoActivity.f32117i.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText("5s");
                ProgressBar progressBarO = insuranceTakePhotoActivity.o();
                if (progressBarO != null) {
                    progressBarO.setProgress(0);
                }
                if (!insuranceTakePhotoActivity.t) {
                    insuranceTakePhotoActivity.showLoadingDialog(true);
                    insuranceTakePhotoActivity.t = true;
                    Camera camera = insuranceTakePhotoActivity.f32120p;
                    if (camera != null) {
                        camera.takePicture(null, null, null, new C1578y(insuranceTakePhotoActivity, i7));
                    }
                }
                break;
            default:
                SelfieCaptureActivity selfieCaptureActivity = (SelfieCaptureActivity) obj;
                SelfieCaptureActivity.f(selfieCaptureActivity, D6.g.f1638d);
                L l5 = selfieCaptureActivity.f23870p;
                if (l5 != null) {
                    l5.cancel();
                }
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j6) {
        String remainingTimeDesc;
        TextView textView;
        String string;
        String string2;
        String string3;
        Object obj = this.f3240b;
        switch (this.f3239a) {
            case 0:
                PhoneInstallmentDailyLoanView phoneInstallmentDailyLoanView = (PhoneInstallmentDailyLoanView) obj;
                phoneInstallmentDailyLoanView.g(phoneInstallmentDailyLoanView.f30863c);
                break;
            case 1:
                PhoneInstallmentLoanView phoneInstallmentLoanView = (PhoneInstallmentLoanView) obj;
                phoneInstallmentLoanView.e(phoneInstallmentLoanView.f30870b);
                break;
            case 2:
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long minutes = timeUnit.toMinutes(j6);
                long seconds = timeUnit.toSeconds(j6) % ((long) 60);
                C0297a c0297a = (C0297a) obj;
                TextView textView2 = c0297a.f3333g;
                if (textView2 != null) {
                    SpanUtils spanUtils = new SpanUtils();
                    RecentlyCompensationBean recentlyCompensationBean = c0297a.f3336j;
                    if (recentlyCompensationBean == null || (remainingTimeDesc = recentlyCompensationBean.getRemainingTimeDesc()) == null) {
                        remainingTimeDesc = "";
                    }
                    SpanUtils spanUtilsAppend = spanUtils.append(remainingTimeDesc);
                    String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    SpanUtils spanUtilsAppend2 = spanUtilsAppend.append(" ".concat(str));
                    int i7 = L6.b.ppColorPrimary;
                    TextView textView3 = c0297a.f3332f;
                    textView2.setText(spanUtilsAppend2.setForegroundColor(CommonViewExtKt.colorInt(i7, textView3 != null ? textView3.getContext() : null)).create());
                }
                break;
            case 3:
                AddBankAccountBaseFragment addBankAccountBaseFragment = (AddBankAccountBaseFragment) obj;
                addBankAccountBaseFragment.x().f31582e.setEnabled(false);
                addBankAccountBaseFragment.x().f31582e.setText((j6 / ((long) 1000)) + " s");
                break;
            case 4:
                CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                TextView textViewZ = ((CheckUbaBankAccountOTPFragment) obj).z();
                if (textViewZ != null) {
                    textViewZ.setText((j6 / ((long) 1000)) + " S");
                }
                break;
            case 6:
                FlexiBankCheckUbaBankAccountOTPFragment.a aVar2 = FlexiBankCheckUbaBankAccountOTPFragment.f22030w;
                x4.g gVar = (x4.g) ((FlexiBankCheckUbaBankAccountOTPFragment) obj).f21944f;
                if (gVar != null && (textView = gVar.f43606g) != null) {
                    textView.setText((j6 / ((long) 1000)) + " S");
                    break;
                }
                break;
            case 7:
                long j10 = j6 / ((long) 1000);
                long j11 = 3600;
                long j12 = j10 - (((j10 / ((long) 86400)) * j11) * ((long) 24));
                long j13 = j12 / j11;
                long j14 = j12 - (j11 * j13);
                long j15 = 60;
                long j16 = j14 / j15;
                long j17 = j14 - (j15 * j16);
                if (j13 < 10) {
                    string = androidx.camera.video.u.i(j13, "0");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(j13);
                    string = sb2.toString();
                }
                if (j16 < 10) {
                    string2 = androidx.camera.video.u.i(j16, "0");
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(j16);
                    string2 = sb3.toString();
                }
                if (j17 < 10) {
                    string3 = androidx.camera.video.u.i(j17, "0");
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(j17);
                    string3 = sb4.toString();
                }
                ((RepayRemindDialog) obj).setCountTime(string, string2, string3);
                break;
            case 8:
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = (InsuranceTakePhotoActivity) obj;
                Object value = insuranceTakePhotoActivity.f32117i.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText((j6 / ((long) 1000)) + "s");
                ProgressBar progressBarO = insuranceTakePhotoActivity.o();
                if (progressBarO != null) {
                    progressBarO.setProgress((int) (((long) 6000) - j6));
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(Fragment fragment, int i7) {
        super(60000L, 1000L);
        this.f3239a = i7;
        this.f3240b = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C0297a c0297a, long j6) {
        super(j6, 1000L);
        this.f3239a = 2;
        this.f3240b = c0297a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(SignUpSuccessActivity signUpSuccessActivity) {
        super(1500L, 1000L);
        this.f3239a = 5;
        this.f3240b = signUpSuccessActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(SelfieCaptureActivity selfieCaptureActivity) {
        super(30000L, 1000L);
        this.f3239a = 9;
        this.f3240b = selfieCaptureActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(InsuranceTakePhotoActivity insuranceTakePhotoActivity) {
        super(6000L, 1000L);
        this.f3239a = 8;
        this.f3240b = insuranceTakePhotoActivity;
    }

    private final void a(long j6) {
    }

    private final void b(long j6) {
    }
}
