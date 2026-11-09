package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Jb.C0347f;
import Jb.C0352k;
import Pa.F;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.video.u;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC开始授信页", path = "/credit_score/oc_start_apply_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcStartApplyActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcStartApplyActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f29877Z = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f29878Y;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        requestLayoutFullScreen();
        return 0;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == 1001 && i7 == 1000) {
            finish();
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        if (!this.f29878Y || this.f29257j) {
            super.onResume();
        } else {
            super.onResume();
            finish();
        }
        this.f29878Y = true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ArrayList arrayList = this.f29258o;
        if (arrayList == null || arrayList.isEmpty()) {
            finish();
            return;
        }
        int i7 = this.f29259p;
        if (i7 < 0 || i7 >= arrayList.size()) {
            ToastUtils.showLong(u.h(this.t, "start apply error index = ", arrayList.size(), " size = "), new Object[0]);
            finish();
            return;
        }
        OcRouterDetail ocRouterDetail = (OcRouterDetail) arrayList.get(this.f29259p);
        String routePath = ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null;
        if (routePath == null) {
            p220oa.h.x(this, "Unknown error");
            finish();
            return;
        }
        Uri uri = Uri.parse(routePath);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        F6.d.h(this.TAG, 3, G.o("checkRouter >>> ", uri.getPath()));
        String path = uri.getPath();
        if (path != null) {
            switch (path.hashCode()) {
                case -2045561952:
                    if (path.equals("/credit_score/oc_all_verify_activity")) {
                        q(new c(this, routePath));
                        return;
                    }
                    break;
                case -2003038992:
                    if (path.equals("oc_loan_expectation_router")) {
                        this.f29260v = true;
                        Bundle bundle2 = new Bundle();
                        OcApplyData ocApplyData = this.f29248B;
                        bundle2.putString("applyId", ocApplyData != null ? ocApplyData.getApplyId() : null);
                        bundle2.putString("loanProduct", this.f29261w);
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanExpectation");
                        return;
                    }
                    break;
                case -1988550313:
                    if (path.equals("oc_bank_verify_router")) {
                        this.f29260v = true;
                        Bundle bundle3 = new Bundle();
                        OcApplyData ocApplyData2 = this.f29248B;
                        bundle3.putString("applyId", ocApplyData2 != null ? ocApplyData2.getApplyId() : null);
                        bundle3.putString("loanProduct", this.f29261w);
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle3, "BankVerify");
                        return;
                    }
                    break;
                case -1727487957:
                    if (path.equals("/account/upgrade")) {
                        q(new d(this, routePath));
                        return;
                    }
                    break;
                case -1294751000:
                    if (path.equals("/coreImpl/use_new_card")) {
                        q(new e(this, routePath));
                        return;
                    }
                    break;
                case -1200244348:
                    if (path.equals("/credit_score/all_operate_one_loop_activity")) {
                        b bVar = new b(this, routePath);
                        showLoadingDialog(true);
                        this.f29256i = bVar;
                        OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) l();
                        ocApplyBaseViewModel.getClass();
                        p140j8.f.s(ocApplyBaseViewModel, new C0352k(1, null), ocApplyBaseViewModel.f30893A, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        return;
                    }
                    break;
                case -973217313:
                    if (path.equals("oc_ali_face_router")) {
                        t();
                        return;
                    }
                    break;
                case -680431013:
                    if (path.equals("oc_person_info_router")) {
                        this.f29260v = true;
                        Bundle bundle4 = new Bundle();
                        OcApplyData ocApplyData3 = this.f29248B;
                        bundle4.putString("applyId", ocApplyData3 != null ? ocApplyData3.getApplyId() : null);
                        bundle4.putString("loanProduct", this.f29261w);
                        bundle4.putString("type", uri.getQueryParameter("type"));
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle4, "PersonalInfoV2");
                        return;
                    }
                    break;
                case -62149816:
                    if (path.equals("oc_bank_auth_router")) {
                        this.f29260v = true;
                        Bundle bundle5 = new Bundle();
                        OcApplyData ocApplyData4 = this.f29248B;
                        bundle5.putString("applyId", ocApplyData4 != null ? ocApplyData4.getApplyId() : null);
                        bundle5.putString("loanProduct", this.f29261w);
                        bundle5.putString("scene", "LOAN_CREDIT");
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle5, "BankAuth");
                        return;
                    }
                    break;
                case -51401600:
                    if (path.equals("oc_one_loop_router")) {
                        h callback = new h(this);
                        Intrinsics.checkNotNullParameter(callback, "callback");
                        ToastUtils.showLong(getString(Ya.g.cs_in_order_to_provider), new Object[0]);
                        showLoadingDialog(true);
                        this.f29255g = callback;
                        OcApplyBaseViewModel ocApplyBaseViewModel2 = (OcApplyBaseViewModel) l();
                        OcApplyData ocApplyData5 = this.f29248B;
                        String applyId = ocApplyData5 != null ? ocApplyData5.getApplyId() : null;
                        ocApplyBaseViewModel2.getClass();
                        p140j8.f.s(ocApplyBaseViewModel2, new C0347f(applyId, null), ocApplyBaseViewModel2.f30900j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        return;
                    }
                    break;
                case 1279279978:
                    if (path.equals("/coreImpl/bind_new_bank_account")) {
                        q(new f(this, routePath));
                        return;
                    }
                    break;
                case 1799542030:
                    if (path.equals("/coreImpl/add_new_card")) {
                        q(new g(this, routePath));
                        return;
                    }
                    break;
            }
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (y.m(string, "/settings/upgrape-kyc", false)) {
            s("/credit_score/oc_kyc_router_activity", routePath);
        } else {
            y(routePath);
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(p.transparent)));
    }

    public final void y(String str) {
        try {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            Postcard postcardBuild = ARouter.getInstance().build(uri.getPath());
            Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
            Postcard postcardH = F.h(postcardBuild, uri.getQuery());
            Intrinsics.checkNotNullExpressionValue(postcardH, "parseQueryString(...)");
            Postcard postcardWithString = postcardH.withString("oc_business_type", this.f29261w).withString("businessType", this.f29261w).withInt("oc_current_router_index", this.f29259p).withString("oc_apply_data", this.f29247A).withString("ext_business_data", this.f29247A).withString("jump_source", this.f29261w).withString("oc_router_operate_type", getIntent().getStringExtra("oc_router_operate_type"));
            Integer num = this.f29250H;
            postcardWithString.withInt("key_need_sign_type", num != null ? num.intValue() : -1).navigation(this, 1000);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (ActivityUtils.isActivityExistsInStack((Class<?>) OcGetInstallmentCreditActivity.class)) {
            ActivityUtils.finishActivity((Class<?>) OcGetInstallmentCreditActivity.class);
        }
    }
}
