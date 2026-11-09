package T8;

import C0.G;
import Pa.n0;
import Pa.r0;
import android.view.View;
import androidx.activity.I;
import androidx.fragment.app.E;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.req.BindGuardianReq;
import com.transsnet.palmpay.account.bean.rsp.GuardianRelationListBean;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianRelationShipFragment;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.util.KeyboardUtils;
import p097g9.C1704b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddGuardianRelationShipFragment f9052b;

    public /* synthetic */ k(AddGuardianRelationShipFragment addGuardianRelationShipFragment, int i7) {
        this.f9051a = i7;
        this.f9052b = addGuardianRelationShipFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        PpFormVertical ppFormVertical4;
        PpFormVertical ppFormVertical5;
        PpFormVertical ppFormVertical6;
        I onBackPressedDispatcher;
        PpFormVertical ppFormVertical7;
        PpFormVertical ppFormVertical8;
        switch (this.f9051a) {
            case 0:
                AddGuardianRelationShipFragment addGuardianRelationShipFragment = this.f9052b;
                Bc.f fVar = addGuardianRelationShipFragment.t;
                if (fVar != null && (ppFormVertical2 = (PpFormVertical) fVar.f699e) != null) {
                    ppFormVertical2.setEditContent("");
                }
                Bc.f fVar2 = addGuardianRelationShipFragment.t;
                if (fVar2 != null && (ppFormVertical = (PpFormVertical) fVar2.f700f) != null) {
                    ppFormVertical.setEditContent("");
                    break;
                }
                break;
            case 1:
                AddGuardianRelationShipFragment addGuardianRelationShipFragment2 = this.f9052b;
                Bc.f fVar3 = addGuardianRelationShipFragment2.t;
                if (fVar3 != null && (ppFormVertical4 = (PpFormVertical) fVar3.f699e) != null) {
                    ppFormVertical4.setEditContent("");
                }
                Bc.f fVar4 = addGuardianRelationShipFragment2.t;
                if (fVar4 != null && (ppFormVertical3 = (PpFormVertical) fVar4.f700f) != null) {
                    ppFormVertical3.setEditContent("");
                    break;
                }
                break;
            case 2:
                AddGuardianRelationShipFragment addGuardianRelationShipFragment3 = this.f9052b;
                Bc.f fVar5 = addGuardianRelationShipFragment3.t;
                if (fVar5 != null && (ppFormVertical6 = (PpFormVertical) fVar5.f699e) != null) {
                    ppFormVertical6.setEditContent("");
                }
                Bc.f fVar6 = addGuardianRelationShipFragment3.t;
                if (fVar6 != null && (ppFormVertical5 = (PpFormVertical) fVar6.f700f) != null) {
                    ppFormVertical5.setEditContent("");
                    break;
                }
                break;
            case 3:
                AddGuardianRelationShipFragment addGuardianRelationShipFragment4 = this.f9052b;
                addGuardianRelationShipFragment4.f26141j = true;
                E activity = addGuardianRelationShipFragment4.getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            case 4:
                AddGuardianRelationShipFragment addGuardianRelationShipFragment5 = this.f9052b;
                KeyboardUtils.hideSoftInput(addGuardianRelationShipFragment5.getActivity());
                if (!addGuardianRelationShipFragment5.A().isEmpty()) {
                    addGuardianRelationShipFragment5.B();
                } else {
                    AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) addGuardianRelationShipFragment5.f27333i;
                    if (addGuardianViewModel != null) {
                        addGuardianViewModel.d(true);
                    }
                }
                break;
            case 5:
                AddGuardianRelationShipFragment addGuardianRelationShipFragment6 = this.f9052b;
                if (!addGuardianRelationShipFragment6.A().isEmpty()) {
                    addGuardianRelationShipFragment6.C(null);
                } else {
                    AddGuardianViewModel addGuardianViewModel2 = (AddGuardianViewModel) addGuardianRelationShipFragment6.f27333i;
                    if (addGuardianViewModel2 != null) {
                        addGuardianViewModel2.d(false);
                    }
                }
                break;
            case 6:
                n0.g().k((ClickEvent) G.f("Popup_Guardian_PP_Account_Click", FirebaseAnalytics.Param.CONTENT, "Change Guardian"));
                AddGuardianRelationShipFragment addGuardianRelationShipFragment7 = this.f9052b;
                Bc.f fVar7 = addGuardianRelationShipFragment7.t;
                if (fVar7 != null && (ppFormVertical8 = (PpFormVertical) fVar7.f699e) != null) {
                    ppFormVertical8.setEditContent("");
                }
                Bc.f fVar8 = addGuardianRelationShipFragment7.t;
                if (fVar8 != null && (ppFormVertical7 = (PpFormVertical) fVar8.f700f) != null) {
                    ppFormVertical7.setEditContent("");
                    break;
                }
                break;
            default:
                n0.g().k((ClickEvent) G.f("Popup_Guardian_PP_Account_Click", FirebaseAnalytics.Param.CONTENT, "Register Now"));
                BindGuardianReq bindGuardianReq = new BindGuardianReq();
                AddGuardianRelationShipFragment addGuardianRelationShipFragment8 = this.f9052b;
                Bc.f fVar9 = addGuardianRelationShipFragment8.t;
                bindGuardianReq.guardianPhone = r0.a0(AddGuardianRelationShipFragment.z(fVar9 != null ? (PpFormVertical) fVar9.f699e : null));
                bindGuardianReq.relationType = ((GuardianRelationListBean) addGuardianRelationShipFragment8.A().get(addGuardianRelationShipFragment8.f26136p)).relationType;
                AddGuardianActivity addGuardianActivityV = addGuardianRelationShipFragment8.v();
                bindGuardianReq.authToken = addGuardianActivityV != null ? addGuardianActivityV.f25813b : null;
                AddGuardianViewModel addGuardianViewModel3 = (AddGuardianViewModel) addGuardianRelationShipFragment8.f27333i;
                if (addGuardianViewModel3 != null) {
                    p140j8.f.s(addGuardianViewModel3, new C1704b(bindGuardianReq, null), addGuardianViewModel3.f26412o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
        }
    }
}
