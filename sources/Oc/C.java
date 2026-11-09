package Oc;

import Pa.r0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p382zb.C2177u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f6744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f6746f;

    public /* synthetic */ C(Object obj, Object obj2, View view, Object obj3, View view2, int i7) {
        this.f6741a = i7;
        this.f6742b = obj;
        this.f6743c = obj2;
        this.f6744d = view;
        this.f6745e = obj3;
        this.f6746f = view2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6741a) {
            case 0:
                WhyTurnOffSaveDialogFragment.k((EditText) this.f6744d, (TextView) this.f6745e, (PpButton) this.f6746f);
                WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment = (WhyTurnOffSaveDialogFragment) this.f6742b;
                whyTurnOffSaveDialogFragment.l((IconicsImageView) this.f6743c, false);
                whyTurnOffSaveDialogFragment.f32332Q = 1;
                whyTurnOffSaveDialogFragment.f32333X = "I don’t want all my money moved to CashBox";
                break;
            case 1:
                WhyTurnOffSaveDialogFragment.k((EditText) this.f6744d, (TextView) this.f6745e, (PpButton) this.f6746f);
                WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment2 = (WhyTurnOffSaveDialogFragment) this.f6742b;
                whyTurnOffSaveDialogFragment2.l((IconicsImageView) this.f6743c, false);
                whyTurnOffSaveDialogFragment2.f32332Q = 2;
                whyTurnOffSaveDialogFragment2.f32333X = "Auto Save didn’t move all of my balance into CashBox";
                break;
            case 2:
                WhyTurnOffSaveDialogFragment.k((EditText) this.f6744d, (TextView) this.f6745e, (PpButton) this.f6746f);
                WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment3 = (WhyTurnOffSaveDialogFragment) this.f6742b;
                whyTurnOffSaveDialogFragment3.l((IconicsImageView) this.f6743c, false);
                whyTurnOffSaveDialogFragment3.f32332Q = 3;
                whyTurnOffSaveDialogFragment3.f32333X = "Auto Save affected my transaction limits";
                break;
            default:
                kotlin.jvm.internal.D d2 = (kotlin.jvm.internal.D) this.f6742b;
                int i7 = d2.f38949a + 1;
                d2.f38949a = i7;
                ArrayList arrayList = (ArrayList) this.f6743c;
                if (i7 < arrayList.size()) {
                    r0.r1((String) arrayList.get(d2.f38949a), (AppCompatImageView) this.f6746f);
                } else {
                    Intrinsics.checkNotNullParameter("cs_loan_home_onboarding_overlay", "tag");
                    ViewGroup viewGroup = (ViewGroup) this.f6744d;
                    View viewFindViewWithTag = viewGroup.findViewWithTag("cs_loan_home_onboarding_overlay");
                    if (viewFindViewWithTag != null) {
                        viewGroup.removeView(viewFindViewWithTag);
                    }
                    ((C2177u) this.f6745e).invoke();
                }
                break;
        }
    }
}
