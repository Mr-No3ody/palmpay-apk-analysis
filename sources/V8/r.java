package V8;

import Pa.i0;
import android.content.Context;
import android.view.View;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.req.NameCheckReq;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep2Fragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p097g9.C1717o;
import p097g9.C1718p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep2Fragment f10157b;

    public /* synthetic */ r(IdentityVerificationStep2Fragment identityVerificationStep2Fragment, int i7) {
        this.f10156a = i7;
        this.f10157b = identityVerificationStep2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Date time;
        boolean zV;
        IdentityVerificationStep2Fragment identityVerificationStep2Fragment = this.f10157b;
        switch (this.f10156a) {
            case 0:
                identityVerificationStep2Fragment.f26177o = true;
                androidx.fragment.app.E activity = identityVerificationStep2Fragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 1:
                Context contextRequireContext = identityVerificationStep2Fragment.requireContext();
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
                Calendar calendarW = identityVerificationStep2Fragment.w();
                mVar.f11030e = Long.valueOf((calendarW == null || (time = calendarW.getTime()) == null) ? System.currentTimeMillis() : time.getTime());
                mVar.f11032g = new Ba.a(identityVerificationStep2Fragment, 16);
                mVar.a().show();
                break;
            default:
                if (identityVerificationStep2Fragment.F()) {
                    I8.o oVar = (I8.o) identityVerificationStep2Fragment.f27335j;
                    if (oVar != null && oVar.f4167b.getGender() == -1) {
                        I8.o oVar2 = (I8.o) identityVerificationStep2Fragment.f27335j;
                        if (oVar2 != null) {
                            p220oa.h.s(oVar2.f4173i, true);
                        }
                        break;
                    } else {
                        List list = identityVerificationStep2Fragment.f26178p;
                        if (list == null || list.isEmpty()) {
                            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationStep2Fragment.f27333i;
                            if (identityVerificationViewModel != null) {
                                C1718p c1718p = new C1718p(1, null);
                                Boolean bool = Boolean.TRUE;
                                com.transsnet.palmpay.core.base.l lVar = identityVerificationViewModel.f26421e;
                                lVar.f27356m = bool;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(identityVerificationViewModel, c1718p, lVar, 0L);
                            }
                            zV = false;
                        } else {
                            zV = identityVerificationStep2Fragment.v();
                        }
                        if (zV) {
                            int iP = i0.p(identityVerificationStep2Fragment.w());
                            if (iP >= 18 && iP <= 100) {
                                NameCheckReq req = new NameCheckReq();
                                req.firstname = identityVerificationStep2Fragment.x();
                                req.middleName = identityVerificationStep2Fragment.z();
                                req.lastname = identityVerificationStep2Fragment.y();
                                IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) identityVerificationStep2Fragment.f27333i;
                                if (identityVerificationViewModel2 != null) {
                                    Intrinsics.checkNotNullParameter(req, "req");
                                    p140j8.f.v(identityVerificationViewModel2, new C1717o(req, null), identityVerificationViewModel2.f26422f, 0L);
                                }
                            } else {
                                I8.o oVar3 = (I8.o) identityVerificationStep2Fragment.f27335j;
                                if (oVar3 != null) {
                                    PpFormVertical ppFormVertical = oVar3.f4168c;
                                    String string = identityVerificationStep2Fragment.getString(F8.h.ac_msg_invalid_age);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    ppFormVertical.setBottomText(p220oa.h.B(string, identityVerificationStep2Fragment.getActivity(), null, Integer.valueOf(L6.b.ppColorError), null, null, null, 1018));
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
