package com.transsnet.adsdk.widgets.banner.bannerview;

import Bc.h;
import Bc.i;
import C0.G;
import Pa.e0;
import Pa.i0;
import Pa.k0;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.api.Service;
import com.reactnativepagerview.NestedScrollableHost;
import com.th3rdwave.safeareacontext.SafeAreaView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.palmpay.account.init.BaseAppsFlyerInitTask;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.init.WebViewInitTask;
import com.transsnet.palmpay.core.rnbridge.bridge.MfbNetworkingBridge;
import com.transsnet.palmpay.core.ui.activity.MapsActivity;
import com.transsnet.palmpay.credit.bean.req.CLQueryApplyAuditResultReq;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridge;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import com.transsnet.palmpay.credit.ui.activity.CreditCashierPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.LoanHomeActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInstallmentUpGradeResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLBvnDialog;
import com.transsnet.palmpay.credit.ui.dialog.OcALiFaceSuccessDialog;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRewardDialogActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashViewModel;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p140j8.f;
import p185ma.r;
import p279s5.d;
import p279s5.e;
import p279s5.g;
import p279s5.l;
import p279s5.m;
import p294tb.C2055q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25622b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f25621a = i7;
        this.f25622b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    @Override // java.lang.Runnable
    public final void run() {
        CardView cardView;
        h hVar;
        MarqueeView marqueeView;
        boolean zIsEmpty;
        TextView textViewM;
        String applyId;
        Animation animation = null;
        String str = "";
        char c6 = 1;
        Object obj = this.f25622b;
        switch (this.f25621a) {
            case 0:
                ((BannerViewPager) obj).handlePosition();
                break;
            case 1:
                BaseAppsFlyerInitTask.Companion.parseIntent$lambda$5$lambda$4((Intent) obj);
                break;
            case 2:
                ((BaseActivity) obj).lambda$addScreenCaptureCallback$5();
                break;
            case 3:
                WebViewInitTask.prewarmWebViewPlanB$lambda$4$lambda$3((Application) obj);
                break;
            case 4:
                MfbNetworkingBridge.AnonymousClass1.onResponse$lambda$1$lambda$0((MfbNetworkingBridge) obj);
                break;
            case 5:
                i iVar = ((MapsActivity) obj).f27671c;
                if (iVar != null && (cardView = (CardView) iVar.f730i) != null) {
                    p220oa.h.s(cardView, false);
                    break;
                }
                break;
            case 6:
                ((e0) obj).refreshDeviceToken();
                break;
            case 7:
                CLBvnDialog.mRunnable_delegate$lambda$3$lambda$2((CLBvnDialog) obj);
                break;
            case 8:
                OcALiFaceSuccessDialog.mRunnable_delegate$lambda$2$lambda$1((OcALiFaceSuccessDialog) obj);
                break;
            case 9:
                int i7 = BaseDialogFragment.f31234B;
                BaseDialogFragment baseDialogFragment = (BaseDialogFragment) obj;
                baseDialogFragment.dismissAllowingStateLoss();
                BaseDialogFragment.OnDialogDismissListener onDialogDismissListener = baseDialogFragment.f31248w;
                if (onDialogDismissListener != null) {
                    onDialogDismissListener.onDismiss();
                }
                break;
            case 10:
                ((LoadingDialog) obj).lambda$showAsDialog$0();
                break;
            case 11:
                ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) ((Recharge2CashHomeActivity) obj).l();
                recharge2CashViewModel.getClass();
                f.s(recharge2CashViewModel, new p085fd.h(1, null), recharge2CashViewModel.f33141e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                break;
            case 12:
                int i10 = LifeBillsHomeActivity.f34485A;
                LifeBillsHomeActivity lifeBillsHomeActivity = (LifeBillsHomeActivity) obj;
                if (i0.W(lifeBillsHomeActivity) && (hVar = (h) lifeBillsHomeActivity.f27334c) != null && (marqueeView = hVar.f722o) != null) {
                    marqueeView.requestFocus();
                }
                break;
            case 13:
                int i11 = SafeAreaView.f25533f;
                ((UIManagerModule) obj).getUIImplementation().dispatchViewUpdates(-1);
                break;
            case 14:
                p152k5.f fVar = (p152k5.f) obj;
                fVar.getClass();
                boolean z3 = ((com.growingio.android.sdk.a) d.b().f42025b).f23190i;
                p152k5.d dVar = fVar.f38688a;
                Context context = fVar.f38690c;
                if (z3) {
                    ((com.growingio.android.sdk.a) d.b().f42025b).getClass();
                    ArrayList arrayList2 = new ArrayList();
                    HashSet hashSet = new HashSet();
                    try {
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                        int iMyUid = Process.myUid();
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (iMyUid == runningAppProcessInfo.uid) {
                                hashSet.add(Integer.valueOf(runningAppProcessInfo.pid));
                            }
                        }
                    } catch (Throwable th) {
                        p198n5.h.c("PersistentDataProvider", th.getMessage(), th);
                    }
                    for (Integer num : dVar.getIntArray("ALIVE_PID", new ArrayList())) {
                        num.getClass();
                        if (hashSet.contains(num)) {
                            arrayList2.add(num);
                        }
                    }
                    zIsEmpty = arrayList2.isEmpty();
                    arrayList2.add(Integer.valueOf(Process.myPid()));
                    dVar.putIntArray("ALIVE_PID", arrayList2);
                } else {
                    try {
                        String strC = p291t5.b.c();
                        zIsEmpty = !TextUtils.isEmpty(strC) && strC.equals(context.getPackageName());
                    } catch (Exception e10) {
                        p198n5.h.b("SystemUtil", e10);
                    }
                    if (zIsEmpty) {
                        dVar.putIntArray("ALIVE_PID", new ArrayList(Process.myPid()));
                    }
                }
                if (zIsEmpty) {
                    fVar.f38691d = 0;
                    fVar.f38692e = System.currentTimeMillis();
                    dVar.putString("LATEST_NON_NULL_USER_ID", dVar.getString("LOGIN_USER_ID", ""));
                    l.f42040a.getClass();
                    m.b();
                    m.a();
                }
                break;
            case 15:
                ShareDialog shareDialog = ((r) obj).f39621i;
                if (shareDialog.isActivityValid(shareDialog.getContext())) {
                    shareDialog.viewShareText.setVisibility(0);
                    shareDialog.tvShareText.setText(k0.c(shareDialog.getContext(), shareDialog.mShareText));
                }
                break;
            case 16:
                ?? callback = (o) obj;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.invoke();
                break;
            case 17:
                CreditHandleRouterBridge.upgradeBvnSuccess$lambda$4((CreditHandleRouterBridge) obj);
                break;
            case 18:
                CreditHandleRouterBridgeV2.upgradeBvnSuccess$lambda$15((CreditHandleRouterBridgeV2) obj);
                break;
            case 19:
                MessageQueueThreadImpl.resetPerfStats$lambda$1((MessageQueueThreadImpl) obj);
                break;
            case 20:
                MessageQueueThreadImpl.Companion.startNewBackgroundThread$lambda$1((SimpleSettableFuture) obj);
                break;
            case 21:
                Uri uri = (Uri) obj;
                if (!"growingio".equals(uri.getHost()) || !"/webservice".equals(uri.getPath())) {
                    HashMap map = new HashMap();
                    for (String str2 : uri.getQueryParameterNames()) {
                        map.put(str2, uri.getQueryParameter(str2));
                    }
                    com.growingio.android.sdk.d.a().b(new p319v5.c(map), p319v5.c.class, new g());
                    break;
                } else {
                    String queryParameter = uri.getQueryParameter("serviceType");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        p198n5.h.a("DeepLinkProvider", G.o("Start web service ", queryParameter), new Object[0]);
                        HashMap map2 = new HashMap();
                        for (String str3 : uri.getQueryParameterNames()) {
                            map2.put(str3, uri.getQueryParameter(str3));
                        }
                        if (queryParameter.equals("debugger")) {
                            com.growingio.android.sdk.d.a().b(new p319v5.b(map2), p319v5.b.class, new e());
                        } else if (queryParameter.equals("circle")) {
                            com.growingio.android.sdk.d.a().b(new p319v5.a(map2), p319v5.a.class, new p279s5.f());
                        }
                    }
                    String queryParameter2 = uri.getQueryParameter("openConsoleLog");
                    if (!TextUtils.isEmpty(queryParameter2) && "YES".equalsIgnoreCase(queryParameter2)) {
                        p198n5.h.f39849b.put("Logcat", new p198n5.e());
                        break;
                    }
                }
                break;
            case 22:
                CreditCashierPreviewActivity.q0((CreditCashierPreviewActivity) obj);
                break;
            case 23:
                int i12 = LoanHomeActivity.f28689f;
                LoanHomeActivity loanHomeActivity = (LoanHomeActivity) obj;
                loanHomeActivity.n(loanHomeActivity.getIntent());
                break;
            case 24:
                int i13 = ReferEarnHomePageActivity.f31872z0;
                ReferEarnHomePageActivity referEarnHomePageActivity = (ReferEarnHomePageActivity) obj;
                if (!referEarnHomePageActivity.isFinishing() && (textViewM = referEarnHomePageActivity.m()) != null && i0.X(referEarnHomePageActivity)) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(referEarnHomePageActivity, p236pc.a.jp_anim_scale);
                        if (animationLoadAnimation != null) {
                            animationLoadAnimation.setRepeatCount(-1);
                            animationLoadAnimation.setRepeatMode(2);
                            animation = animationLoadAnimation;
                        }
                        referEarnHomePageActivity.f31904x0 = animation;
                        if (animation != null) {
                            textViewM.startAnimation(animation);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                ((ReferEarnRewardDialogActivity) obj).n().e();
                break;
            case 26:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.measure(View.MeasureSpec.makeMeasureSpec(viewPager2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewPager2.getHeight(), 1073741824));
                viewPager2.layout(viewPager2.getLeft(), viewPager2.getTop(), viewPager2.getRight(), viewPager2.getBottom());
                break;
            case 27:
                ((NestedScrollableHost) obj).setDidSetInitialIndex(true);
                break;
            case 28:
                int i14 = CLBorrowResultActivity.f28876k0;
                CLBorrowResultActivity cLBorrowResultActivity = (CLBorrowResultActivity) obj;
                F6.d.h(cLBorrowResultActivity.TAG, 3, "getDataPolling >>>");
                cLBorrowResultActivity.n();
                break;
            default:
                int i15 = CLInstallmentUpGradeResultActivity.f28931j;
                CLInstallmentUpGradeResultActivity cLInstallmentUpGradeResultActivity = (CLInstallmentUpGradeResultActivity) obj;
                IApiCreditService iApiCreditServiceH = G.h(p221ob.c.f40268a);
                CLOpenAccountData cLOpenAccountData = cLInstallmentUpGradeResultActivity.f28932f;
                if (cLOpenAccountData != null && (applyId = cLOpenAccountData.getApplyId()) != null) {
                    str = applyId;
                }
                iApiCreditServiceH.queryCashLoanStatus(new CLQueryApplyAuditResultReq(str)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(cLInstallmentUpGradeResultActivity, c6 == true ? 1 : 0));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(Function0 function0) {
        this.f25621a = 16;
        this.f25622b = (o) function0;
    }

    public /* synthetic */ b(p279s5.i iVar, Uri uri) {
        this.f25621a = 21;
        this.f25622b = uri;
    }
}
