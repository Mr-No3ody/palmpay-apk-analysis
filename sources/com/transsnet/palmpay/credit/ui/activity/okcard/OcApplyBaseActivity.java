package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Ed.U;
import Jb.C0349h;
import Jb.C0350i;
import N8.C0475t;
import Pa.F;
import Pa.g0;
import Pa.n0;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.AllAuthInfoRsp;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.req.CLOpenAccountReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcLocationInfoReq;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.req.OcUploadRouterReq;
import com.transsnet.palmpay.credit.bean.resp.OcALiFaceInitData;
import com.transsnet.palmpay.credit.bean.resp.OcOneLoopData;
import com.transsnet.palmpay.credit.bean.resp.OcSkipOneLoopResp;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoGuideActivity;
import com.transsnet.palmpay.credit.ui.dialog.OpenFlexiRetainDialog;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.util.CameraUtils;
import com.transsnet.palmpay.util.OcCameraInfoBean;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143jb.o;
import p183m6.j;
import p284sb.C2023v;
import p310ub.C2078h;
import p310ub.C2080i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/viewmodel/OcApplyBaseViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "VerifyInfoCallback", "VerifyOneLoopCallback", "VerifyAllOperateOneLoopCallback", "ALiFaceInitCallback", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcApplyBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcApplyBaseActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,975:1\n260#2,10:976\n296#2:986\n260#2,10:987\n296#2:997\n171#2,12:998\n215#2:1010\n171#2,12:1011\n215#2:1023\n260#2,10:1024\n296#2:1034\n260#2,10:1035\n296#2:1045\n115#2,8:1046\n145#2:1054\n260#2,10:1055\n296#2:1065\n260#2,10:1066\n296#2:1076\n260#2,10:1077\n296#2:1087\n295#3,2:1088\n*S KotlinDebug\n*F\n+ 1 OcApplyBaseActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity\n*L\n190#1:976,10\n190#1:986\n232#1:987,10\n232#1:997\n254#1:998,12\n254#1:1010\n282#1:1011,12\n282#1:1023\n315#1:1024,10\n315#1:1034\n327#1:1035,10\n327#1:1045\n339#1:1046,8\n339#1:1054\n344#1:1055,10\n344#1:1065\n372#1:1066,10\n372#1:1076\n384#1:1077,10\n384#1:1087\n892#1:1088,2\n*E\n"})
public abstract class OcApplyBaseActivity extends CreditBaseMvvmActivity<OcApplyBaseViewModel> {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f29246X = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f29247A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public OcApplyData f29248B;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Integer f29250H;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VerifyInfoCallback f29254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f29255g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f29256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29257j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29259p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f29260v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f29258o = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f29261w = "OK_CARD";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f29249C = "oc_use_type_router";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p038ca.d f29251L = new p038ca.d(this);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final String f29252M = "com.transsnet.palmpay.credit.ui.activity.okcard.OcStartApplyActivity";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f29253Q = "com.transsnet.palmpay.credit.ui.activity.okcard.OcALiFaceGuideActivity";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity$ALiFaceInitCallback;", "", "onSuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/OcALiFaceInitData;", "onFailed", "errorMsg", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ALiFaceInitCallback {
        void onFailed(@Nullable String errorMsg);

        void onSuccess(@Nullable OcALiFaceInitData data);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity$VerifyAllOperateOneLoopCallback;", "", "onSuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/OcSkipOneLoopResp;", "onFailed", "errorMsg", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface VerifyAllOperateOneLoopCallback {
        void onFailed(@Nullable String errorMsg);

        void onSuccess(@Nullable OcSkipOneLoopResp data);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity$VerifyInfoCallback;", "", "verifySuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/rsp/AllAuthInfoRsp$DataBean;", "verifyFailed", "errorMsg", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface VerifyInfoCallback {
        void verifyFailed(@Nullable String errorMsg);

        void verifySuccess(@Nullable AllAuthInfoRsp.DataBean data);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity$VerifyOneLoopCallback;", "", "onSuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/OcOneLoopData;", "onFailed", "errorMsg", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface VerifyOneLoopCallback {
        void onFailed(@Nullable String errorMsg);

        void onSuccess(@Nullable OcOneLoopData data);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static void n() {
        org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_OC_EXIT_APPLY));
        ARouter.getInstance().build("/main/home").navigation();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public void initData() {
        l lVar = ((OcApplyBaseViewModel) l()).f30898g;
        if (lVar != null) {
            lVar.e(this, new C2023v(new C2078h(this, this, 2), 4));
        }
        l lVar2 = ((OcApplyBaseViewModel) l()).f30904w;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new C2078h(this, this, 3), 4));
        }
        l lVar3 = ((OcApplyBaseViewModel) l()).f30896e;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new C2078h(this, this, 0), 4));
        }
        l lVar4 = ((OcApplyBaseViewModel) l()).f30897f;
        if (lVar4 != null) {
            lVar4.e(this, new C2023v(new C2078h(this, this, 1), 4));
        }
        l lVar5 = ((OcApplyBaseViewModel) l()).f30899i;
        if (lVar5 != null) {
            lVar5.e(this, new C2023v(new C2078h(this, this, 4), 4));
        }
        l lVar6 = ((OcApplyBaseViewModel) l()).f30900j;
        if (lVar6 != null) {
            lVar6.e(this, new C2023v(new C2078h(this, this, 5), 4));
        }
        l lVar7 = ((OcApplyBaseViewModel) l()).f30901o;
        if (lVar7 != null) {
            lVar7.e(this, new C2023v(new U(6), 4));
        }
        l lVar8 = ((OcApplyBaseViewModel) l()).f30902p;
        if (lVar8 != null) {
            lVar8.e(this, new C2023v(new C2078h(this, this, 6), 4));
        }
        l lVar9 = ((OcApplyBaseViewModel) l()).f30893A;
        if (lVar9 != null) {
            lVar9.e(this, new C2023v(new C2078h(this, this, 7), 4));
        }
        l lVar10 = ((OcApplyBaseViewModel) l()).f30894B;
        if (lVar10 != null) {
            lVar10.e(this, new C2023v(new C2078h(this, this, 8), 4));
        }
    }

    public final String o() {
        String str = this.f29261w;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -704342631) {
                if (iHashCode != -664671341) {
                    if (iHashCode == 1494893990 && str.equals("PALMPAY_BUSINESS_LOAN")) {
                        String string = getString(Ya.g.cs_apply_loan_amount);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        return string;
                    }
                } else if (str.equals("OK_CARD")) {
                    String string2 = getString(Ya.g.cs_flexi_credit_limit);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                }
            } else if (str.equals("PALMPAY_CARD")) {
                String string3 = getString(Ya.g.cs_cl_apply_credit_card);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
        }
        String string4 = getString(Ya.g.cs_apply_loan_amount);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void onBackPressed() {
        o.f38542z.getInstance().t(this.f29259p);
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    @CallSuper
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        switch (event.getEventType()) {
            case 4:
            case 9:
            case MessageEvent.EVENT_ADD_NEW_BANK_CARD /* 275 */:
            case MessageEvent.EVENT_KYC_COMPLETED /* 547 */:
                if (this.f29260v) {
                    this.f29257j = true;
                }
                break;
            case MessageEvent.EVENT_LOCATION_CHANGE /* 338 */:
                LocationRecord locationRecordF = p367ya.a.d().f();
                if (locationRecordF != null) {
                    OcApplyData ocApplyData = this.f29248B;
                    OcLocationInfoReq ocLocationInfoReq = new OcLocationInfoReq(Double.valueOf(locationRecordF.getLatitude()), Double.valueOf(locationRecordF.getLongitude()), ocApplyData != null ? ocApplyData.getApplyId() : null, null, "flexi", "credit", 8, null);
                    p221ob.c.f40268a.getInstance().getClass();
                    p221ob.c.a().uploadLocationInfo(ocLocationInfoReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2080i(this, 1));
                } else {
                    F6.d.h(this.TAG, 3, "uploadLocationInfo >>> location is null");
                }
                break;
            case MessageEvent.EVENT_OC_ACTIVE_FINISH /* 344 */:
            case MessageEvent.EVENT_CL_OPEN_SUCCESS /* 361 */:
            case MessageEvent.EVENT_CL_OPEN_PENDING /* 368 */:
            case MessageEvent.EVENT_CL_OPEN_FAILED /* 369 */:
            case MessageEvent.EVENT_OC_RAISE_COMPLETED /* 385 */:
            case MessageEvent.EVENT_OC_EXIT_APPLY /* 401 */:
                finish();
                break;
            case MessageEvent.EVENT_OC_PERSON_COMPLETED /* 391 */:
                if (this.f29260v) {
                    this.f29257j = true;
                }
                break;
            case MessageEvent.EVENT_OC_BANK_VERIFY_COMPLETED /* 561 */:
                if (this.f29260v) {
                    this.f29257j = true;
                }
                break;
            case MessageEvent.EVENT_OC_LOAN_EXPECTATION_COMPLETED /* 562 */:
                if (this.f29260v) {
                    this.f29257j = true;
                }
                break;
            case MessageEvent.EVENT_OC_BANK_AUTH_COMPLETED /* 564 */:
                if (this.f29260v) {
                    this.f29257j = true;
                }
                break;
        }
    }

    public final int p() {
        int intExtra = getIntent().getIntExtra("oc_route_id", -1);
        F6.d.h(this.TAG, 3, G.m(intExtra, "getProgressIndex >>> curRouteId="));
        return o.f38542z.getInstance().j(Integer.valueOf(intExtra), true);
    }

    public final void q(VerifyInfoCallback verifyInfoCallback) {
        showLoadingDialog(true);
        this.f29254f = verifyInfoCallback;
        OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) l();
        ocApplyBaseViewModel.getClass();
        p140j8.f.s(ocApplyBaseViewModel, new C0350i(1, null), ocApplyBaseViewModel.f30899i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void r() {
        x(BaseActivity.NEXT_EVENT);
        o.f38542z.getInstance().v(this.f29259p);
    }

    public final void s(String str, String str2) {
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        Postcard postcardBuild = ARouter.getInstance().build(uri.getPath());
        Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
        Postcard postcardH = F.h(postcardBuild, uri.getQuery());
        Intrinsics.checkNotNullExpressionValue(postcardH, "parseQueryString(...)");
        Postcard postcardWithString = postcardH.withString("oc_business_type", this.f29261w).withString("businessType", this.f29261w).withInt("oc_current_router_index", this.t).withString("oc_apply_data", this.f29247A).withString("ext_business_data", this.f29247A).withString("jump_source", this.f29261w).withString("oc_use_type", this.f29249C);
        Integer num = this.f29250H;
        postcardWithString.withInt("key_need_sign_type", num != null ? num.intValue() : -1).withInt("oc_route_id", getIntent().getIntExtra("oc_route_id", -1));
        if (!TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                str2 = "";
            }
            postcardH.withString("jump_url", str2);
        }
        postcardH.navigation(this, 1000);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public void setupView() {
        String routerTag;
        String product;
        OcApplyData ocApplyData;
        List<OcRouterDetail> routeInfoList;
        super.setupView();
        org.greenrobot.eventbus.c.b().j(this);
        String stringExtra = getIntent().getStringExtra("oc_use_type");
        if (stringExtra == null) {
            stringExtra = "oc_use_type_router";
        }
        this.f29249C = stringExtra;
        int intExtra = getIntent().getIntExtra("oc_current_router_index", 0);
        this.f29259p = intExtra;
        this.t = intExtra;
        this.f29261w = getIntent().getStringExtra("oc_business_type");
        this.f29247A = getIntent().getStringExtra("oc_apply_data");
        getIntent().getIntExtra("cl_product_type", 1);
        this.f29250H = Integer.valueOf(getIntent().getIntExtra("key_need_sign_type", -1));
        if (!TextUtils.isEmpty(this.f29247A)) {
            this.f29248B = (OcApplyData) new Gson().fromJson(this.f29247A, OcApplyData.class);
        }
        OcApplyData ocApplyData2 = this.f29248B;
        List<OcRouterDetail> routeInfoList2 = ocApplyData2 != null ? ocApplyData2.getRouteInfoList() : null;
        if (routeInfoList2 != null && !routeInfoList2.isEmpty() && (ocApplyData = this.f29248B) != null && (routeInfoList = ocApplyData.getRouteInfoList()) != null) {
            this.f29258o.addAll(routeInfoList);
        }
        if (!(this instanceof OcStartApplyActivity) && !(this instanceof CLTakePhotoGuideActivity)) {
            x(BaseActivity.ENTER_EVENT);
        }
        if (Intrinsics.c(this.f29249C, "oc_use_type_router")) {
            OcApplyData ocApplyData3 = this.f29248B;
            if (ocApplyData3 == null || (routerTag = ocApplyData3.getRouterTag()) == null) {
                routerTag = "apply data is null";
            }
        } else {
            routerTag = "alone";
        }
        HashMap map = new HashMap();
        map.put("screen_name", getClass().getSimpleName());
        map.put("router_tag", routerTag);
        OcApplyData ocApplyData4 = this.f29248B;
        if (ocApplyData4 == null || (product = ocApplyData4.getProduct()) == null) {
            product = "";
        }
        map.put(FirebaseAnalytics.Param.PRODUCT_NAME, product);
        n0.g().w("oc_router_screen", map);
    }

    public final void t() {
        g0.e(g0.f7080h.getInstance(), this, 0, new j(this, 23), this.f29251L, G.A(), null, 448);
    }

    public final void u() {
        int size;
        try {
            PackageManager packageManager = getPackageManager();
            List<PackageInfo> installedPackages = packageManager != null ? packageManager.getInstalledPackages(0) : null;
            List<PackageInfo> list = installedPackages;
            size = (list == null || list.isEmpty()) ? 0 : installedPackages.size();
        } catch (Exception unused) {
        }
        OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) l();
        OcApplyData ocApplyData = this.f29248B;
        String applyEnterPoint = ocApplyData != null ? ocApplyData.getApplyEnterPoint() : null;
        OcApplyData ocApplyData2 = this.f29248B;
        String applyId = ocApplyData2 != null ? ocApplyData2.getApplyId() : null;
        OcApplyData ocApplyData3 = this.f29248B;
        String deviceTag = ocApplyData3 != null ? ocApplyData3.getDeviceTag() : null;
        Integer numValueOf = Integer.valueOf(size);
        OcApplyData ocApplyData4 = this.f29248B;
        boolean plIsActive = ocApplyData4 != null ? ocApplyData4.getPlIsActive() : true;
        OcApplyData ocApplyData5 = this.f29248B;
        boolean plIsInstall = ocApplyData5 != null ? ocApplyData5.getPlIsInstall() : true;
        OcApplyData ocApplyData6 = this.f29248B;
        CLOpenAccountReq req = new CLOpenAccountReq(applyEnterPoint, applyId, deviceTag, numValueOf, plIsActive, plIsInstall, ocApplyData6 != null ? ocApplyData6.getRouterTag() : null, null, null, null, null, null, null, null, null, this.f29261w, 32640, null);
        ocApplyBaseViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(ocApplyBaseViewModel, new C0349h(req, null), ocApplyBaseViewModel.f30897f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void v() {
        if (Intrinsics.c(this.f29249C, "oc_use_type_alone")) {
            finish();
            return;
        }
        if (Intrinsics.c(this.f29261w, "INSTALLMENT_LOAN")) {
            if (!TimeUtils.isToday(SPUtils.getInstance().getLong(BaseApplication.getInstance().getUser().getPhoneNumber() + "_APPLY_INSTALLMENT_BACK_DIALOG", 0L))) {
                OcApplyData ocApplyData = this.f29248B;
                if (!TextUtils.equals(ocApplyData != null ? ocApplyData.getRouterTag() : null, "APPLY_CHECK_TAG")) {
                    SPUtils.getInstance().put(BaseApplication.getInstance().getUser().getPhoneNumber() + "_APPLY_INSTALLMENT_BACK_DIALOG", System.currentTimeMillis());
                    s("/credit_score/ol_upgrade_installment_trans_parent_dialog_activity", null);
                    return;
                }
            }
        }
        p143jb.b install = p143jb.b.f38502a.getInstall();
        OcApplyData ocApplyData2 = this.f29248B;
        install.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        new OpenFlexiRetainDialog(this, ocApplyData2).show();
    }

    public final void w() {
        IApiCreditService iApiCreditServiceH = G.h(p221ob.c.f40268a);
        OcCameraInfoBean ocCameraInfo = CameraUtils.getOcCameraInfo(BaseApplication.get());
        Intrinsics.checkNotNullExpressionValue(ocCameraInfo, "getOcCameraInfo(...)");
        iApiCreditServiceH.uploadCameraInfo(ocCameraInfo).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2080i(this, 0));
    }

    public final void x(String str) {
        OcApplyData ocApplyData;
        List<OcRouterDetail> routeInfoList;
        Integer routeId;
        F6.d.h(this.TAG, 3, "uploadRouterData >>> ".concat(str));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("oc_apply_data");
        int intExtra = intent.getIntExtra("oc_route_id", -1);
        if (TextUtils.isEmpty(stringExtra) || intExtra == -1 || (routeInfoList = (ocApplyData = (OcApplyData) d0.l(OcApplyData.class, stringExtra)).getRouteInfoList()) == null || !(!routeInfoList.isEmpty())) {
            return;
        }
        List<OcRouterDetail> routeInfoList2 = ocApplyData.getRouteInfoList();
        OcRouterDetail ocRouterDetail = null;
        Object obj = null;
        if (routeInfoList2 != null) {
            for (Object obj2 : routeInfoList2) {
                OcRouterDetail ocRouterDetail2 = (OcRouterDetail) obj2;
                if (ocRouterDetail2 != null && (routeId = ocRouterDetail2.getRouteId()) != null && routeId.intValue() == intExtra) {
                    obj = obj2;
                    break;
                }
            }
            ocRouterDetail = (OcRouterDetail) obj;
        }
        if (ocRouterDetail == null) {
            return;
        }
        G.h(p221ob.c.f40268a).uploadRouterData(new OcUploadRouterReq(ocApplyData.getApplyId(), ocApplyData.getRouterTag(), ocRouterDetail.getRoutePath(), str, ocRouterDetail.getRouteId())).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0475t(5));
    }
}
