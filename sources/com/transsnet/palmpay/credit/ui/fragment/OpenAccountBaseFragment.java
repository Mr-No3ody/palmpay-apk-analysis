package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import G9.i;
import Pa.C0525w;
import Pa.E;
import android.text.TextUtils;
import androidx.activity.result.a;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.credit.bean.req.DoubleSignReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p071ef.b;
import p141j9.C1798f;
import p177m.j;
import p221ob.c;
import p298tf.f;
import p382zb.b0;
import p382zb.m0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OpenAccountBaseFragment;", "Lcom/transsnet/palmpay/credit/ui/fragment/OcBaseFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class OpenAccountBaseFragment extends OcBaseFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CLInitData f30492A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f30493B;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f30496L;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f30499X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final a f30500Y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f30501v = "OTHER";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f30502w = "CASH_LOAN";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f30494C = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Integer f30495H = -1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ArrayList f30497M = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f30498Q = new ArrayList();

    public OpenAccountBaseFragment() {
        a aVarRegisterForActivityResult = registerForActivityResult(new j(), new i(this, 17));
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f30500Y = aVarRegisterForActivityResult;
    }

    public static final void w(OpenAccountBaseFragment openAccountBaseFragment, CLOpenAccountData cLOpenAccountData) {
        CLInitData cLInitData;
        Integer sceneType;
        Integer sceneType2;
        CLInitData cLInitData2 = openAccountBaseFragment.f30492A;
        if ((cLInitData2 == null || (sceneType2 = cLInitData2.getSceneType()) == null || sceneType2.intValue() != 1) && ((cLInitData = openAccountBaseFragment.f30492A) == null || (sceneType = cLInitData.getSceneType()) == null || sceneType.intValue() != 0)) {
            ARouter.getInstance().build(Intrinsics.c(openAccountBaseFragment.f30502w, "INSTALLMENT_LOAN") ? "/credit_score/ol_upgrade_installment_result_activity" : "/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(cLOpenAccountData)).withString("cl_loan_product_type", openAccountBaseFragment.f30502w).navigation();
        } else {
            d.x(null, "CreditBindSuccess");
        }
    }

    public static int x() {
        String string = SPUtils.get().getString("credit_bind_times");
        Intrinsics.e(string);
        if (StringsKt.A(string, "_", false)) {
            return E.b(TextUtils.split(string, "_")[1]);
        }
        return 0;
    }

    public static final void z(OpenAccountBaseFragment openAccountBaseFragment) {
        F6.d.h(openAccountBaseFragment.f27317a, 3, "handleRouteInner >>>");
        OcRouterDetail ocRouterDetail = (OcRouterDetail) openAccountBaseFragment.f30497M.get(0);
        if (!Intrinsics.c(ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null, "oc_permission_router")) {
            openAccountBaseFragment.f30499X = 0;
            openAccountBaseFragment.A();
            return;
        }
        openAccountBaseFragment.f30499X = 1;
        if (!com.transsnet.palmpay.core.config.d.v()) {
            openAccountBaseFragment.A();
            return;
        }
        a aVar = openAccountBaseFragment.f30500Y;
        if (aVar != null) {
            aVar.a(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_COARSE_LOCATION"});
        }
    }

    public final void A() {
        ArrayList arrayList = this.f30497M;
        if (arrayList.isEmpty() || this.f30499X >= arrayList.size()) {
            C();
        } else {
            showLoadingDialog(false);
            B("/credit_score/oc_start_apply_activity");
        }
    }

    public final void B(String str) {
        Postcard postcardWithString = ARouter.getInstance().build(str).withInt("oc_current_router_index", this.f30499X).withString("oc_business_type", this.f30502w);
        C0525w c0525wF = C0525w.f();
        String str2 = this.f30493B;
        CLInitData cLInitData = this.f30492A;
        postcardWithString.withString("oc_apply_data", ((Gson) c0525wF.f7166b).toJson(new OcApplyData(this.f30501v, 2, str2, this.f30494C, cLInitData != null ? cLInitData.getSceneType() : null, false, false, this.f30496L, this.f30502w, this.f30497M, this.f30498Q))).navigation();
    }

    public final void C() {
        F6.d.h(this.f27317a, 3, "openOrUpgrade >>>");
        if (!Intrinsics.c(this.f30502w, "CASH_LOAN") && !Intrinsics.c(this.f30502w, "CASH_INSTANT_LOAN")) {
            G.h(c.f40268a).installmentRaiseAmountV2(this.f30493B, null, this.f30502w).k(f.f42629b).i(b.a()).subscribe(new m0(this, 2));
        } else {
            G.h(c.f40268a).querySignStatus(new DoubleSignReq(this.f30502w)).k(f.f42629b).i(b.a()).f(new b0(new C1798f(this, 29))).i(b.a()).subscribe(new m0(this, 1));
        }
    }

    public final String y() {
        String str = this.f30502w;
        int iHashCode = str.hashCode();
        if (iHashCode != -722072964) {
            if (iHashCode == -664671341) {
                str.equals("OK_CARD");
            } else if (iHashCode == 172275258) {
                str.equals("CASH_INSTANT_LOAN");
                return "flexi";
            }
        } else if (str.equals("CASH_LOAN")) {
            return "flexi cash";
        }
        return "flexi";
    }
}
