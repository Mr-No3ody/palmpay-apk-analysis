package V8;

import C0.AbstractC0130w;
import C0.U;
import Pa.i0;
import Pa.n0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.rsp.BvnIdentityInfoRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationConfirmBvnFragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationConfirmBvnFragment f10134b;

    public /* synthetic */ h(IdentityVerificationConfirmBvnFragment identityVerificationConfirmBvnFragment, int i7) {
        this.f10133a = i7;
        this.f10134b = identityVerificationConfirmBvnFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Date time;
        int iP;
        switch (this.f10133a) {
            case 0:
                IdentityVerificationConfirmBvnFragment identityVerificationConfirmBvnFragment = this.f10134b;
                I8.q qVar = (I8.q) identityVerificationConfirmBvnFragment.f27335j;
                if (qVar != null) {
                    qVar.f4188b.setBottomText("");
                }
                Context contextRequireContext = identityVerificationConfirmBvnFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                X6.m mVar = new X6.m(contextRequireContext);
                mVar.f11027b = "Select Date";
                mVar.f11028c = 1;
                int i7 = Calendar.getInstance().get(1);
                Calendar calendar = Calendar.getInstance();
                calendar.set(1, i7 - 100);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(1, i7 - 18);
                calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 86400000);
                mVar.f11029d = Long.valueOf(calendar.getTime().getTime());
                mVar.f11031f = Long.valueOf(calendar2.getTime().getTime());
                Calendar calendarU = identityVerificationConfirmBvnFragment.u();
                mVar.f11030e = Long.valueOf((calendarU == null || (time = calendarU.getTime()) == null) ? System.currentTimeMillis() : time.getTime());
                mVar.f11032g = new Ba.a(identityVerificationConfirmBvnFragment, 15);
                mVar.a().show();
                break;
            case 1:
                n0.g().l("QuickVerificationNotMe");
                IdentityVerificationConfirmBvnFragment identityVerificationConfirmBvnFragment2 = this.f10134b;
                U u6 = new U(false, false, F8.d.fragment_identity_verification_confirm_bvn, true, false, -1, -1, -1, -1);
                AbstractC0130w abstractC0130w = identityVerificationConfirmBvnFragment2.f26168p;
                if (abstractC0130w != null) {
                    abstractC0130w.h(F8.d.fragment_identity_verification_step_id, null, u6);
                }
                break;
            default:
                IdentityVerificationConfirmBvnFragment identityVerificationConfirmBvnFragment3 = this.f10134b;
                if (identityVerificationConfirmBvnFragment3.y()) {
                    n0.g().l("QuickVerificationNext");
                    BvnIdentityInfoRsp bvnIdentityInfoRsp = identityVerificationConfirmBvnFragment3.f26167o;
                    if (TextUtils.isEmpty(bvnIdentityInfoRsp != null ? bvnIdentityInfoRsp.birthday : null) && ((iP = i0.p(identityVerificationConfirmBvnFragment3.u())) < 18 || iP > 100)) {
                        I8.q qVar2 = (I8.q) identityVerificationConfirmBvnFragment3.f27335j;
                        if (qVar2 != null) {
                            PpFormVertical ppFormVertical = qVar2.f4188b;
                            String string = identityVerificationConfirmBvnFragment3.getString(F8.h.ac_msg_invalid_age);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            ppFormVertical.setBottomText(p220oa.h.B(string, identityVerificationConfirmBvnFragment3.getActivity(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                        }
                    } else {
                        try {
                            identityVerificationConfirmBvnFragment3.w();
                            I8.q qVar3 = (I8.q) identityVerificationConfirmBvnFragment3.f27335j;
                            if (qVar3 != null) {
                                qVar3.f4190d.b(true);
                            }
                            IdentityVerificationActivity identityVerificationActivityV = identityVerificationConfirmBvnFragment3.v();
                            if (identityVerificationActivityV != null && identityVerificationActivityV.q()) {
                                IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationConfirmBvnFragment3.f27333i;
                                if (identityVerificationViewModel != null) {
                                    IdentityVerificationActivity identityVerificationActivityV2 = identityVerificationConfirmBvnFragment3.v();
                                    identityVerificationViewModel.d(identityVerificationActivityV2 != null ? identityVerificationActivityV2.l() : null);
                                }
                            } else {
                                IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) identityVerificationConfirmBvnFragment3.f27333i;
                                if (identityVerificationViewModel2 != null) {
                                    IdentityVerificationActivity identityVerificationActivityV3 = identityVerificationConfirmBvnFragment3.v();
                                    identityVerificationViewModel2.f(identityVerificationActivityV3 != null ? identityVerificationActivityV3.n() : null);
                                }
                            }
                        } catch (Exception e10) {
                            F6.d.c(identityVerificationConfirmBvnFragment3.f27317a, "goNext: ", e10);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
