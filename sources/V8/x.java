package V8;

import Pa.r0;
import android.view.View;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;
import com.transsnet.palmpay.util.KeyboardUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationUserProfileFragment f10169b;

    public /* synthetic */ x(IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment, int i7) {
        this.f10168a = i7;
        this.f10169b = identityVerificationUserProfileFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        IconicsCheckBox iconicsCheckBox;
        IconicsCheckBox iconicsCheckBox2;
        TextView textView;
        AddUserExtraInfoReq addUserExtraInfoReqL2;
        CheckIdentifyReq checkIdentifyReqN2;
        boolean z3 = false;
        IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10169b;
        switch (this.f10168a) {
            case 0:
                int i7 = IdentityVerificationUserProfileFragment.f26181L;
                if (!r0.U0()) {
                    I8.t tVar = (I8.t) identityVerificationUserProfileFragment.f27335j;
                    if (tVar != null && (textView = tVar.f4210C) != null) {
                        textView.setEnabled(false);
                    }
                    I8.t tVar2 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                    boolean z8 = (tVar2 == null || (iconicsCheckBox2 = tVar2.f4214c) == null || !iconicsCheckBox2.isChecked()) ? false : true;
                    I8.t tVar3 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                    if (tVar3 != null && (iconicsCheckBox = tVar3.f4216e) != null && iconicsCheckBox.isChecked()) {
                        z3 = true;
                    }
                    IdentityVerificationActivity identityVerificationActivityA = identityVerificationUserProfileFragment.A();
                    if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
                        identityVerificationUserProfileFragment.D(checkIdentifyReqN, z8, z3);
                    }
                    IdentityVerificationActivity identityVerificationActivityA2 = identityVerificationUserProfileFragment.A();
                    if (identityVerificationActivityA2 != null) {
                        identityVerificationUserProfileFragment.D(identityVerificationActivityA2.m(), z8, z3);
                    }
                    IdentityVerificationActivity identityVerificationActivityA3 = identityVerificationUserProfileFragment.A();
                    if (identityVerificationActivityA3 != null && (addUserExtraInfoReqL = identityVerificationActivityA3.l()) != null) {
                        identityVerificationUserProfileFragment.D(addUserExtraInfoReqL, z8, z3);
                    }
                    identityVerificationUserProfileFragment.C();
                    identityVerificationUserProfileFragment.B();
                    break;
                }
                break;
            case 1:
                int i10 = IdentityVerificationUserProfileFragment.f26181L;
                KeyboardUtils.hideSoftInput(identityVerificationUserProfileFragment.getActivity());
                identityVerificationUserProfileFragment.J();
                break;
            case 2:
                int i11 = IdentityVerificationUserProfileFragment.f26181L;
                KeyboardUtils.hideSoftInput(identityVerificationUserProfileFragment.getActivity());
                identityVerificationUserProfileFragment.L();
                break;
            case 3:
                int i12 = IdentityVerificationUserProfileFragment.f26181L;
                KeyboardUtils.hideSoftInput(identityVerificationUserProfileFragment.getActivity());
                identityVerificationUserProfileFragment.H();
                break;
            case 4:
                int i13 = IdentityVerificationUserProfileFragment.f26181L;
                KeyboardUtils.hideSoftInput(identityVerificationUserProfileFragment.getActivity());
                identityVerificationUserProfileFragment.I();
                break;
            case 5:
                int i14 = IdentityVerificationUserProfileFragment.f26181L;
                KeyboardUtils.hideSoftInput(identityVerificationUserProfileFragment.getActivity());
                identityVerificationUserProfileFragment.K();
                break;
            case 6:
                int i15 = IdentityVerificationUserProfileFragment.f26181L;
                if (!r0.U0()) {
                    I8.t tVar4 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                    if (tVar4 != null) {
                        tVar4.f4210C.setEnabled(false);
                    }
                    IdentityVerificationActivity identityVerificationActivityA4 = identityVerificationUserProfileFragment.A();
                    if (identityVerificationActivityA4 != null && (checkIdentifyReqN2 = identityVerificationActivityA4.n()) != null) {
                        checkIdentifyReqN2.industry = null;
                        checkIdentifyReqN2.sourceOfFunds = null;
                        checkIdentifyReqN2.annualIncome = null;
                        checkIdentifyReqN2.profession = null;
                        checkIdentifyReqN2.nationality = null;
                    }
                    IdentityVerificationActivity identityVerificationActivityA5 = identityVerificationUserProfileFragment.A();
                    if (identityVerificationActivityA5 != null) {
                        ApplyBalanceV2Req applyBalanceV2ReqM = identityVerificationActivityA5.m();
                        applyBalanceV2ReqM.industry = null;
                        applyBalanceV2ReqM.sourceOfFunds = null;
                        applyBalanceV2ReqM.annualIncome = null;
                        applyBalanceV2ReqM.profession = null;
                        applyBalanceV2ReqM.nationality = null;
                    }
                    IdentityVerificationActivity identityVerificationActivityA6 = identityVerificationUserProfileFragment.A();
                    if (identityVerificationActivityA6 != null && (addUserExtraInfoReqL2 = identityVerificationActivityA6.l()) != null) {
                        addUserExtraInfoReqL2.industry = null;
                        addUserExtraInfoReqL2.sourceOfFunds = null;
                        addUserExtraInfoReqL2.annualIncome = null;
                        addUserExtraInfoReqL2.profession = null;
                        addUserExtraInfoReqL2.nationality = null;
                        addUserExtraInfoReqL2.verifyType = null;
                        addUserExtraInfoReqL2.verifyNum = null;
                    }
                    identityVerificationUserProfileFragment.B();
                    break;
                }
                break;
            default:
                identityVerificationUserProfileFragment.f26186o = true;
                androidx.fragment.app.E activity = identityVerificationUserProfileFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
        }
    }
}
