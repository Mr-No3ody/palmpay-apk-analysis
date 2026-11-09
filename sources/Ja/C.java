package Ja;

import Ab.ViewOnClickListenerC0053e;
import android.view.View;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAResultFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckSafetyAssessmentQAResultFragment f4619b;

    public /* synthetic */ C(CheckSafetyAssessmentQAResultFragment checkSafetyAssessmentQAResultFragment, int i7) {
        this.f4618a = i7;
        this.f4619b = checkSafetyAssessmentQAResultFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PayVerifyViewModel payVerifyViewModel;
        switch (this.f4618a) {
            case 0:
                CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment = this.f4619b.f28024p;
                if (checkSafetyAssessmentQAFragment != null && (payVerifyViewModel = (PayVerifyViewModel) checkSafetyAssessmentQAFragment.f27333i) != null) {
                    String token = checkSafetyAssessmentQAFragment.f28017p;
                    if (token == null) {
                        token = "";
                    }
                    Intrinsics.checkNotNullParameter(token, "token");
                    p140j8.f.s(payVerifyViewModel, new Ma.r(token, null), payVerifyViewModel.f28072g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    break;
                }
                break;
            case 1:
                CheckSafetyAssessmentQAResultFragment checkSafetyAssessmentQAResultFragment = this.f4619b;
                O6.c cVar = new O6.c(checkSafetyAssessmentQAResultFragment.getContext());
                cVar.e(p025ba.k.core_safety_assessment_cancel_title);
                cVar.f6598d = checkSafetyAssessmentQAResultFragment.getString(p025ba.k.core_safety_assessment_cancel_tips);
                String string = checkSafetyAssessmentQAResultFragment.getString(p025ba.k.core_cancel);
                C c6 = new C(checkSafetyAssessmentQAResultFragment, 3);
                cVar.f6601g = string;
                cVar.f6603i = c6;
                cVar.d(p025ba.k.core_continue, new ViewOnClickListenerC0053e(28));
                cVar.g();
                break;
            case 2:
                CheckSafetyAssessmentQAResultFragment checkSafetyAssessmentQAResultFragment2 = this.f4619b;
                O6.c cVar2 = new O6.c(checkSafetyAssessmentQAResultFragment2.getContext());
                cVar2.e(p025ba.k.core_safety_assessment_leave_title);
                cVar2.f6598d = checkSafetyAssessmentQAResultFragment2.getString(p025ba.k.core_safety_assessment_leave_tips);
                String string2 = checkSafetyAssessmentQAResultFragment2.getString(p025ba.k.core_cancel);
                C c10 = new C(checkSafetyAssessmentQAResultFragment2, 4);
                cVar2.f6601g = string2;
                cVar2.f6603i = c10;
                cVar2.d(p025ba.k.core_continue, new ViewOnClickListenerC0053e(28));
                cVar2.g();
                break;
            case 3:
                CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment2 = this.f4619b.f28024p;
                if (checkSafetyAssessmentQAFragment2 != null) {
                    checkSafetyAssessmentQAFragment2.z();
                }
                break;
            default:
                CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment3 = this.f4619b.f28024p;
                if (checkSafetyAssessmentQAFragment3 != null) {
                    checkSafetyAssessmentQAFragment3.z();
                }
                break;
        }
    }
}
