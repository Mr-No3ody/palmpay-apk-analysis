package La;

import android.os.Handler;
import android.os.Looper;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.api.Service;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaManageActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyPatternFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifySafePinFragment;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaManageFragment;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.core.ui.widget.ModelPaymentManualGetLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxTermsConditionsWithEventDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CongratulationsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawSureDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5582a;

    public /* synthetic */ i(int i7) {
        this.f5582a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5582a) {
            case 0:
                return ((PayApiService) p324va.c.f43141a.f14621b).getFundActivityConfig();
            case 1:
                return ((PayApiService) p324va.c.f43141a.f14621b).getBindBankCardTips();
            case 2:
                return ((PayApiService) p324va.c.f43141a.f14621b).getOkCardPreCreditInfo();
            case 3:
                return ((AccountApiService) p324va.c.f43141a.f14623d).queryPaymentMethod();
            case 4:
                return ShadowExecutors.newOptimizedSingleThreadExecutor(new Lb.c(0), "\u200bcom.transsnet.palmpay.custom_view.async.PpAsyncInflateQueue");
            case 5:
                int i7 = M3.g.f5761g;
                return 0L;
            case 6:
                return Integer.valueOf(CommonViewExtKt.getDp(16));
            case 7:
                return new ArrayList();
            case 8:
                return new Handler(Looper.getMainLooper());
            case 9:
                return new ArrayList();
            case 10:
                int i10 = LogInActivity.f25877p0;
                return new Handler(Looper.getMainLooper());
            case 11:
                PalmPayLevelV2Activity.a aVar = PalmPayLevelV2Activity.f25925p;
                return new Handler(Looper.getMainLooper());
            case 12:
                int i11 = PinSafeWithPatternActivity.f25946g;
                return new VerifySafePinFragment();
            case 13:
                int i12 = PinSafeWithPatternActivity.f25946g;
                return new VerifyPatternFragment();
            case 14:
                int i13 = PinSafeWithPatternActivity.f25946g;
                return new VerifyFingerPrintFragment();
            case 15:
                int i14 = PinSafeWithPatternActivity.f25946g;
                return new Handler(Looper.getMainLooper());
            case 16:
                SignUpActivity.a aVar2 = SignUpActivity.f26029C;
                return new Handler(Looper.getMainLooper());
            case 17:
                int i15 = Tier3QuotaManageActivity.f26091f;
                return new Tier3QuotaManageFragment();
            case 18:
                int i16 = ModelPaymentManualGetLayout.f28139g;
                return Unit.f38893a;
            case 19:
                int i17 = ModelPaymentManualGetLayout.f28139g;
                return new Oa.k(p025ba.g.core_layout_payment_manual_get_reward_item, null);
            case 20:
                return Unit.f38893a;
            case 21:
                CashBoxTermsConditionsWithEventDialogFragment.a aVar3 = CashBoxTermsConditionsWithEventDialogFragment.f32287H;
                return Unit.f38893a;
            case 22:
                CongratulationsDialogFragment.a aVar4 = CongratulationsDialogFragment.f32292L;
                return Unit.f38893a;
            case 23:
                CongratulationsDialogFragment.a aVar5 = CongratulationsDialogFragment.f32292L;
                return Unit.f38893a;
            case 24:
                TurnOnAutoSaveDialogFragment.a aVar6 = TurnOnAutoSaveDialogFragment.f32323L;
                return Unit.f38893a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                TurnOnAutoSaveDialogFragment.a aVar7 = TurnOnAutoSaveDialogFragment.f32323L;
                return Unit.f38893a;
            case 26:
                WhyTurnOffSaveDialogFragment.a aVar8 = WhyTurnOffSaveDialogFragment.f32329Z;
                return Unit.f38893a;
            case 27:
                WithdrawSureDialogFragment.a aVar9 = WithdrawSureDialogFragment.f32336X;
                return Unit.f38893a;
            case 28:
                WithdrawSureDialogFragment.a aVar10 = WithdrawSureDialogFragment.f32336X;
                return Unit.f38893a;
            default:
                return new HashMap();
        }
    }
}
