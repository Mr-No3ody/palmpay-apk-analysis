package com.transsnet.palmpay.account.ui.activity;

import Ae.o;
import Bc.l;
import C0.G;
import F8.d;
import F8.e;
import Ja.C0328a;
import N8.C0463g;
import N8.C0474s;
import N8.C0475t;
import Pa.C0505b;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.viewmodel.ActivityWebView;
import com.transsnet.palmpay.core.web.WebJsCallback;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.req.OcUploadRouterReq;
import java.net.URLDecoder;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/upgrade")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PalmPayLevelUp3Activity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmPayLevelUp3Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmPayLevelUp3Activity.kt\ncom/transsnet/palmpay/account/ui/activity/PalmPayLevelUp3Activity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,312:1\n295#2,2:313\n*S KotlinDebug\n*F\n+ 1 PalmPayLevelUp3Activity.kt\ncom/transsnet/palmpay/account/ui/activity/PalmPayLevelUp3Activity\n*L\n287#1:313,2\n*E\n"})
public final class PalmPayLevelUp3Activity extends BaseActivity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f25901v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25908g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25910j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f25912p;
    public l t;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        requestLayoutFullScreen();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_palmpay_level_up3, (ViewGroup) null, false);
        int i7 = d.webView;
        ActivityWebView activityWebView = (ActivityWebView) p059e1.a.m(i7, viewInflate);
        if (activityWebView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        l lVar = new l((ConstraintLayout) viewInflate, activityWebView, 1);
        this.t = lVar;
        return lVar;
    }

    public final void l(String str) {
        List<OcRouterDetail> routeInfoList;
        Integer routeId;
        F6.d.h(this.TAG, 3, "uploadRouterData >>> ".concat(str));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("oc_apply_data");
        int intExtra = intent.getIntExtra("oc_route_id", -1);
        if (TextUtils.isEmpty(stringExtra) || intExtra == -1) {
            return;
        }
        OcApplyData ocApplyData = (OcApplyData) d0.l(OcApplyData.class, stringExtra);
        OcRouterDetail ocRouterDetail = null;
        Object obj = null;
        ocRouterDetail = null;
        if (ocApplyData != null && (routeInfoList = ocApplyData.getRouteInfoList()) != null) {
            for (Object obj2 : routeInfoList) {
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
        G.h(c.f40268a).uploadRouterData(new OcUploadRouterReq(ocApplyData.getApplyId(), ocApplyData.getRouterTag(), ocRouterDetail.getRoutePath(), str, ocRouterDetail.getRouteId())).k(f.f42629b).i(b.a()).subscribe(new C0475t(0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        l lVar = this.t;
        if ((lVar != null ? (ActivityWebView) lVar.f755c : null) == null || lVar == null) {
            return;
        }
        try {
            ActivityWebView activityWebView = (ActivityWebView) lVar.f755c;
            if (activityWebView != null) {
                activityWebView.setWebCallBack(null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 9 || eventType == 275) {
            finish();
            return;
        }
        if (eventType == 560) {
            if (Intrinsics.c(event.getEventContent(), "ROUTER_BVN_NEXT")) {
                l(BaseActivity.NEXT_EVENT);
            }
        } else if (eventType == 568 && Intrinsics.c(event.getEventContent(), "ROUTER_BVN_EXIT")) {
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        l lVar;
        super.onResume();
        if (!NQEManager.INSTANCE.isNetworkOffline() || (lVar = this.t) == null) {
            return;
        }
        ((ActivityWebView) lVar.f755c).loadUrl("file:///android_asset/network_error.html");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        l lVar;
        ConstraintLayout constraintLayout;
        int i7 = 2;
        ARouter.getInstance().inject(this);
        org.greenrobot.eventbus.c.b().j(this);
        C0505b.b(this);
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 3));
        if (Build.VERSION.SDK_INT >= 35 && (lVar = this.t) != null && (constraintLayout = (ConstraintLayout) lVar.f754b) != null) {
            C0474s c0474s = new C0474s(0);
            WeakHashMap weakHashMap = N.f16168a;
            E.n(constraintLayout, c0474s);
        }
        F6.d.h(this.TAG, 3, G.o("receive url: ", this.f25910j));
        if (TextUtils.isEmpty(this.f25910j)) {
            String strG = com.transsnet.palmpay.core.config.d.g("/settings/upgrape-kyc/home");
            String str = this.f25906e;
            String str2 = this.f25908g;
            String str3 = this.f25909i;
            String str4 = this.f25911o;
            String str5 = this.f25912p;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strG);
            sb2.append("?businessType=");
            sb2.append(str);
            sb2.append("&extCheckXds=");
            sb2.append(str2);
            androidx.camera.video.u.x(sb2, "&scene=", str3, "&type=", str4);
            this.f25910j = G.r(sb2, "&both=", str5);
        } else {
            StringBuilder sb3 = new StringBuilder(com.transsnet.palmpay.core.config.d.g(URLDecoder.decode(this.f25910j, "utf-8")));
            if (!StringsKt.A(sb3, "businessType", false)) {
                sb3.append("&businessType=" + this.f25906e);
            }
            if (!StringsKt.A(sb3, "scene", false)) {
                sb3.append("&scene=" + this.f25909i);
            }
            if (!StringsKt.A(sb3, "extCheckXds", false)) {
                sb3.append("&extCheckXds=" + this.f25908g);
            }
            this.f25910j = sb3.toString();
        }
        F6.d.h(this.TAG, 3, G.o("LevelUp Url: ", this.f25910j));
        l lVar2 = this.t;
        if (lVar2 != null) {
            ((ActivityWebView) lVar2.f755c).setLayerType(2, null);
        }
        l lVar3 = this.t;
        WebJsCallback webJsCallback = new WebJsCallback(this, lVar3 != null ? (ActivityWebView) lVar3.f755c : null, null);
        webJsCallback.f28619o = true;
        l lVar4 = this.t;
        if (lVar4 != null) {
            ((ActivityWebView) lVar4.f755c).setJsCallback(webJsCallback);
        }
        showLoadingDialog(true);
        l lVar5 = this.t;
        if (lVar5 != null) {
            ((ActivityWebView) lVar5.f755c).setWebChromeClient(new o(this, i7));
        }
        l lVar6 = this.t;
        if (lVar6 != null) {
            ((ActivityWebView) lVar6.f755c).setWebViewClient(new C0328a(this.f25910j));
        }
        l lVar7 = this.t;
        if (lVar7 != null) {
            ((ActivityWebView) lVar7.f755c).setBusinessData(this.f25907f);
        }
        l lVar8 = this.t;
        if (lVar8 != null) {
            ActivityWebView activityWebView = (ActivityWebView) lVar8.f755c;
            String strG2 = this.f25910j;
            if (strG2 == null) {
                strG2 = com.transsnet.palmpay.core.config.d.g("/settings/upgrape-kyc/home");
            }
            activityWebView.loadUrl(strG2);
        }
        l(BaseActivity.ENTER_EVENT);
    }
}
