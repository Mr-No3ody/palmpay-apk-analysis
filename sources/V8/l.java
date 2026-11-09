package V8;

import C0.AbstractC0130w;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep1Fragment f10143b;

    public /* synthetic */ l(IdentityVerificationStep1Fragment identityVerificationStep1Fragment, int i7) {
        this.f10142a = i7;
        this.f10143b = identityVerificationStep1Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PreCheckPhoneRsp preCheckPhoneRsp;
        AbstractC0130w abstractC0130w;
        IdentityVerificationStep1Fragment identityVerificationStep1Fragment = this.f10143b;
        switch (this.f10142a) {
            case 0:
                int i7 = IdentityVerificationStep1Fragment.f26173w;
                identityVerificationStep1Fragment.E(3);
                break;
            case 1:
                int i10 = IdentityVerificationStep1Fragment.f26173w;
                identityVerificationStep1Fragment.E(4);
                break;
            case 2:
                int i11 = IdentityVerificationStep1Fragment.f26173w;
                IdentityVerificationActivity identityVerificationActivityA = identityVerificationStep1Fragment.A();
                if (identityVerificationActivityA != null && (preCheckPhoneRsp = identityVerificationActivityA.f25869i) != null && preCheckPhoneRsp.needFace && (abstractC0130w = identityVerificationStep1Fragment.f26175p) != null) {
                    abstractC0130w.k(F8.d.fragment_identity_verification_step_face, false);
                    break;
                }
                break;
            case 3:
                int i12 = IdentityVerificationStep1Fragment.f26173w;
                IdentityVerificationActivity identityVerificationActivityA2 = identityVerificationStep1Fragment.A();
                if (identityVerificationActivityA2 == null || !identityVerificationActivityA2.r()) {
                    IdentityVerificationActivity identityVerificationActivityA3 = identityVerificationStep1Fragment.A();
                    if (Intrinsics.c(identityVerificationActivityA3 != null ? identityVerificationActivityA3.f25866e : null, "FROM_REGISITER_PAGE")) {
                        ActivityUtils.finishActivity((Class<?>) SignUpActivity.class);
                        Postcard postcardBuild = ARouter.getInstance().build("/account/signup");
                        IdentityVerificationActivity identityVerificationActivityA4 = identityVerificationStep1Fragment.A();
                        postcardBuild.withString("_number", identityVerificationActivityA4 != null ? identityVerificationActivityA4.f25864c : null).withBoolean("extra_flag", true).navigation();
                    }
                } else {
                    ActivityUtils.finishActivity((Class<?>) LogInActivity.class);
                    Postcard postcardBuild2 = ARouter.getInstance().build("/account/login");
                    IdentityVerificationActivity identityVerificationActivityA5 = identityVerificationStep1Fragment.A();
                    postcardBuild2.withString("_number", identityVerificationActivityA5 != null ? identityVerificationActivityA5.f25864c : null).withBoolean("extra_flag", true).navigation();
                }
                IdentityVerificationActivity identityVerificationActivityA6 = identityVerificationStep1Fragment.A();
                if (identityVerificationActivityA6 != null) {
                    identityVerificationActivityA6.finish();
                }
                break;
            case 4:
                int i13 = IdentityVerificationStep1Fragment.f26173w;
                I8.n nVar = (I8.n) identityVerificationStep1Fragment.f27335j;
                if (nVar == null || !nVar.f4159g.a()) {
                    Intrinsics.e(view);
                    Integer num = (Integer) view.getTag();
                    if (num != null) {
                        identityVerificationStep1Fragment.E(num.intValue());
                    }
                }
                break;
            case 5:
                int i14 = IdentityVerificationStep1Fragment.f26173w;
                I8.n nVar2 = (I8.n) identityVerificationStep1Fragment.f27335j;
                if (nVar2 == null || !nVar2.f4159g.a()) {
                    Intrinsics.e(view);
                    Integer num2 = (Integer) view.getTag();
                    if (num2 != null) {
                        identityVerificationStep1Fragment.E(num2.intValue());
                    }
                }
                break;
            case 6:
                androidx.fragment.app.E activity = identityVerificationStep1Fragment.getActivity();
                if (activity != null) {
                    p220oa.h.g(activity, "SignUpVerificationPopupWait");
                }
                break;
            default:
                androidx.fragment.app.E activity2 = identityVerificationStep1Fragment.getActivity();
                if (activity2 != null) {
                    p220oa.h.g(activity2, "SignUpVerificationPopupQuit");
                }
                identityVerificationStep1Fragment.f26174o = true;
                androidx.fragment.app.E activity3 = identityVerificationStep1Fragment.getActivity();
                if (activity3 != null) {
                    activity3.onBackPressed();
                }
                break;
        }
    }
}
