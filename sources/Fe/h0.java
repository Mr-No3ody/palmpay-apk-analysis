package Fe;

import M7.EnumC0454n;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankAccountOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckUbaBankAccountOTPFragment;
import com.google.api.Service;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.ScreenStackFragmentWrapper;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPswFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAFragment;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import com.transsnet.palmpay.teller.ui.activity.CommomHistoryFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2776a;

    public /* synthetic */ h0(int i7) {
        this.f2776a = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f2776a) {
            case 0:
                ToastUtils.showLong((String) it, new Object[0]);
                return Unit.f38893a;
            case 1:
                CheckSafetyAssessmentQAFragment.a aVar = CheckSafetyAssessmentQAFragment.f28014A;
                Intrinsics.checkNotNullParameter((String) it, "it");
                return Unit.f38893a;
            case 2:
                ToastUtils.showLong((String) it, new Object[0]);
                return Unit.f38893a;
            case 3:
                return Unit.f38893a;
            case 4:
                return Unit.f38893a;
            case 5:
                ToastUtils.showLong((String) it, new Object[0]);
                return Unit.f38893a;
            case 6:
                return Unit.f38893a;
            case 7:
                return Unit.f38893a;
            case 8:
                ToastUtils.showLong((String) it, new Object[0]);
                return Unit.f38893a;
            case 9:
                ToastUtils.showLong((String) it, new Object[0]);
                return Unit.f38893a;
            case 10:
                ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) it;
                ScreenStack.a aVar2 = ScreenStack.f25329L;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2.isTranslucent());
            case 11:
                ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) it;
                ScreenStack.a aVar3 = ScreenStack.f25329L;
                Intrinsics.checkNotNullParameter(it3, "it");
                return (ScreenStackFragmentWrapper) it3;
            case 12:
                ScreenFragmentWrapper it4 = (ScreenFragmentWrapper) it;
                ScreenStack.a aVar4 = ScreenStack.f25329L;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Boolean.valueOf(it4.getScreen().getActivityState() == EnumC0454n.f5825a);
            case 13:
                int i7 = SheetDelegate.f25393p;
                return Float.valueOf(0.0f);
            case 14:
                int i10 = IdentityVerificationActivity.f25861A;
                Intrinsics.checkNotNullParameter((String) it, "it");
                return Unit.f38893a;
            case 15:
                String it5 = (String) it;
                Intrinsics.checkNotNullParameter(it5, "it");
                ToastUtils.showLong(it5, new Object[0]);
                return Unit.f38893a;
            case 16:
                String error = (String) it;
                Intrinsics.checkNotNullParameter(error, "error");
                ToastUtils.showLong(error, new Object[0]);
                return Unit.f38893a;
            case 17:
                int i11 = FlexiBankPayVerificationActivity.f21971Y;
                return Unit.f38893a;
            case 18:
                int i12 = FlexiBankPayVerificationActivity.f21971Y;
                return Unit.f38893a;
            case 19:
                String message = (String) it;
                FlexiBankCheckBankAccountOtpFragment.a aVar5 = FlexiBankCheckBankAccountOtpFragment.f22002C;
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                return Unit.f38893a;
            case 20:
                String message2 = (String) it;
                FlexiBankCheckUbaBankAccountOTPFragment.a aVar6 = FlexiBankCheckUbaBankAccountOTPFragment.f22030w;
                Intrinsics.checkNotNullParameter(message2, "message");
                ToastUtils.showLong(message2, new Object[0]);
                return Unit.f38893a;
            case 21:
                AuthPswFragment.a aVar7 = AuthPswFragment.f26101w;
                N8.q0.v("/account/set_new_psw", "_token", (String) it);
                return Unit.f38893a;
            case 22:
                String message3 = (String) it;
                int i13 = VerifyFingerPrintFragment.f26112C;
                Intrinsics.checkNotNullParameter(message3, "message");
                ToastUtils.showLong(message3, new Object[0]);
                return Unit.f38893a;
            case 23:
                String message4 = (String) it;
                Intrinsics.checkNotNullParameter(message4, "message");
                ToastUtils.showLong(message4, new Object[0]);
                return Unit.f38893a;
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                Pf.d.f7329a.getClass();
                return Integer.valueOf(Pf.d.f7330b.c(2147418112) + 65536);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf(it == null);
            case 26:
                Pa.i0.H(null);
                return Unit.f38893a;
            case 27:
                int i14 = BeneficiariesActivity.f34148v;
                Intrinsics.checkNotNullParameter((String) it, "errorMsg");
                return Unit.f38893a;
            case 28:
                String it6 = (String) it;
                CommomHistoryFragment.a aVar8 = CommomHistoryFragment.f34200A;
                Intrinsics.checkNotNullParameter(it6, "it");
                ToastUtils.showLong(it6, new Object[0]);
                return Unit.f38893a;
            default:
                String errorMsg = (String) it;
                CommomHistoryFragment.a aVar9 = CommomHistoryFragment.f34200A;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                ToastUtils.showLong(errorMsg, new Object[0]);
                return Unit.f38893a;
        }
    }
}
