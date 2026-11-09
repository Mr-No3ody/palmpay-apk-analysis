package com.transsnet.palmpay.credit.rnbridge;

import C0.G;
import F6.d;
import Pa.T;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.launcher.ARouter;
import com.didi.drouter.annotation.Service;
import com.google.gson.Gson;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.HandleRouterParam;
import com.transsnet.palmpay.credit.bean.req.CLOpenAccountReq;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.Utils;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p140j8.f;
import p143jb.p;
import p143jb.t;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/credit/creditManager"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0019\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/CreditHandleRouterBridgeV2;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/bean/HandleRouterParam;", "<init>", "()V", "params", "", "routerPreV2", "(Lcom/transsnet/palmpay/credit/bean/HandleRouterParam;)V", "routerStartV2", "routerNextV2", CreditHandleRouterBridgeV2.ACTION_SYNC_CREDIT_DATA, "getDeviceInfo", "getMediaInfo", "getSubmitReqInfo", CreditHandleRouterBridgeV2.ACTION_GET_CREDIT_AUTH, CreditHandleRouterBridgeV2.ACTION_POP_PPCARD_CREDIT_PROCESS, CreditHandleRouterBridgeV2.ACTION_SHOW_FLEXI_CREDIT_RESULT, "upgradeBvnSuccess", "", "loanProduct", "getUploadNode", "(Ljava/lang/String;)Ljava/lang/String;", "creditType", "getUploadNodeDetail", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Lcom/transsnet/palmpay/credit/bean/HandleRouterParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreditHandleRouterBridgeV2 extends SyncBridge<HandleRouterParam> {

    @NotNull
    public static final String ACTION_DEVICE_INFO = "deviceInfo";

    @NotNull
    public static final String ACTION_GET_CREDIT_AUTH = "getCreditAuth";

    @NotNull
    public static final String ACTION_MEDIA_INFO = "mediaInfo";

    @NotNull
    public static final String ACTION_POP_PPCARD_CREDIT_PROCESS = "popPPCardCreditProcess";

    @NotNull
    public static final String ACTION_ROUTER_NEXT_FROM_RN = "routerNextFromRN";

    @NotNull
    public static final String ACTION_ROUTER_PRE_FROM_RN = "routerPreFromRN";

    @NotNull
    public static final String ACTION_ROUTER_START_FROM_RN = "routerStartFromRN";

    @NotNull
    public static final String ACTION_SHOW_FLEXI_CREDIT_RESULT = "showFlexiCreditResult";

    @NotNull
    public static final String ACTION_SUBMIT_REQ_INFO = "submitReqInfo";

    @NotNull
    public static final String ACTION_SYNC_CREDIT_DATA = "syncCreditData";

    @NotNull
    public static final String ACTION_UPGRADE_BVN_SUCCESS = "UpgradeByBVNSuccess";

    @NotNull
    public static final String TAG = "CreditHandleRouterBridgeV2";

    private final void getCreditAuth(HandleRouterParam params) {
        Object objF;
        d.h(TAG, 3, "getCreditAuth >>> routerParam=" + params);
        try {
            o oVar = q.f43977a;
            if (getActivity() instanceof E) {
                Activity activity = getActivity();
                Intrinsics.f(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                Z supportFragmentManager = ((E) activity).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                Object objNavigation = ARouter.getInstance().build("/credit_score/loan_credit_service").navigation();
                Intrinsics.f(objNavigation, "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
                ((ILoanCreditService) objNavigation).checkPermission(supportFragmentManager);
                handleSuccess();
            } else {
                handleFail(new Throwable("current activity is not FragmentActivity"));
            }
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c(TAG, thA);
            handleFail(thA);
        }
    }

    private final void getDeviceInfo(HandleRouterParam params) {
        Object objF;
        d.h(TAG, 3, "getDeviceInfo >>> routerParam=" + params);
        try {
            o oVar = q.f43977a;
            BaseBridge.handleSuccess$default(this, new Gson().toJson(Fb.d.f2639a.getOcDeviceInfo(params.applyId, getUploadNode(params.loanProduct), getUploadNodeDetail(params.creditType))), null, 2, null);
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c(TAG, thA);
            handleFail(thA);
        }
    }

    private final void getMediaInfo(HandleRouterParam params) {
        Object objF;
        d.h(TAG, 3, "getMediaInfo >>> routerParam=" + params);
        try {
            o oVar = q.f43977a;
            Pair pairL = f.l(getActivity());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pictNum", ((Number) pairL.f38891a).intValue());
            jSONObject.put("videoNum", ((Number) pairL.f38892b).intValue());
            BaseBridge.handleSuccess$default(this, jSONObject.toString(), null, 2, null);
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c(TAG, thA);
            handleFail(thA);
        }
    }

    private final void getSubmitReqInfo(HandleRouterParam params) {
        Object objF;
        d.h(TAG, 3, "getSubmitReqInfo >>> routerParam=" + params);
        try {
            o oVar = q.f43977a;
            String str = params.applyId;
            Context context = BaseApplication.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            int size = 0;
            try {
                PackageManager packageManager = context.getPackageManager();
                List<PackageInfo> installedPackages = packageManager != null ? packageManager.getInstalledPackages(0) : null;
                List<PackageInfo> list = installedPackages;
                if (list != null && !list.isEmpty()) {
                    size = installedPackages.size();
                }
            } catch (Exception unused) {
            }
            BaseBridge.handleSuccess$default(this, new Gson().toJson(new CLOpenAccountReq(params.channelEnum, str, null, Integer.valueOf(size), false, false, params.routeTag, null, null, null, null, null, null, null, null, params.loanProduct, 32692, null)), null, 2, null);
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c(TAG, thA);
            handleFail(thA);
        }
    }

    private final String getUploadNode(String loanProduct) {
        return TextUtils.equals(loanProduct, "OK_CARD") ? "flexi" : "flexi cash";
    }

    private final String getUploadNodeDetail(String creditType) {
        return TextUtils.equals(creditType, "LOAN_WITHDRAW") ? "trade" : "credit";
    }

    private final void popPPCardCreditProcess(HandleRouterParam params) {
        Object objF;
        d.h(TAG, 3, "popPPCardCreditProcess >>> routerParam=" + params);
        t.f38573n.getInstance().getClass();
        d.h("CreditRouterManagerV2", 3, "closeAllRoutePage >>>");
        try {
            o oVar = q.f43977a;
            HomeActivity.a aVar = HomeActivity.f34463H;
            LinkedList<Activity> activityList = Utils.getActivityList();
            Intrinsics.checkNotNullExpressionValue(activityList, "getActivityList(...)");
            int size = activityList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i7 = size - 1;
                    Activity activity = activityList.get(size);
                    if (!activity.getClass().equals(HomeActivity.class)) {
                        ActivityUtils.finishActivity(activity, true);
                        if (i7 < 0) {
                            break;
                        } else {
                            size = i7;
                        }
                    }
                    handleSuccess();
                }
            }
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c("CreditRouterManagerV2", thA);
        }
        handleSuccess();
    }

    private final void routerNextV2(HandleRouterParam params) {
        d.h(TAG, 3, "routerNextV2 >>> routerParam=" + params);
        String str = params.curRouteId;
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        if (intOrNull == null) {
            handleReject("param curRouteId is null");
            return;
        }
        p pVar = t.f38573n;
        pVar.getInstance().f38586l = intOrNull;
        pVar.getInstance().b(intOrNull.intValue());
    }

    private final void routerPreV2(HandleRouterParam params) {
        d.h(TAG, 3, "routerPreV2 >>> routerParam=" + params);
        String str = params.curRouteId;
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        if (intOrNull == null) {
            handleReject("param curRouteId is null");
        } else {
            t.f38573n.getInstance().f38586l = intOrNull;
        }
    }

    private final void routerStartV2(HandleRouterParam params) {
        d.h(TAG, 3, "routerStartV2 >>> routerParam=" + params);
        String str = params.curRouteId;
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        if (intOrNull == null) {
            handleReject("param curRouteId is null");
            return;
        }
        p pVar = t.f38573n;
        pVar.getInstance().f38586l = intOrNull;
        pVar.getInstance().f38587m = params.pageInfo;
        pVar.getInstance().b(intOrNull.intValue());
    }

    private final void showFlexiCreditResult(HandleRouterParam params) {
        d.h(TAG, 3, "showFlexiCreditResult >>> routerParam=" + params);
        CLOpenAccountData data = params.creditResult;
        if (data == null) {
            handleFail(new IllegalArgumentException("params creditResult is null"));
            return;
        }
        t.f38573n.getInstance().getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        d.h("CreditRouterManagerV2", 3, "showFlexiCreditResult >>>");
        ARouter.getInstance().build("/credit_score/ol_open_result_activity").withString("cl_open_result", new Gson().toJson(data)).withString("cl_loan_product_type", "OK_CARD").navigation();
        handleSuccess();
    }

    private final void syncCreditData(HandleRouterParam params) {
        Object objF;
        String str;
        d.h(TAG, 3, "syncCreditData >>> routerParam=" + params);
        try {
            o oVar = q.f43977a;
            if (!TextUtils.isEmpty(params.applyId) && (str = params.routeInfoList) != null && str.length() != 0) {
                t.f38573n.getInstance().g(params);
                handleSuccess();
                objF = Unit.f38893a;
                Throwable thA = q.a(objF);
                if (thA != null) {
                    handleFail(thA);
                    return;
                }
                return;
            }
            handleFail(new IllegalArgumentException("params applyId or routeInfoList is null"));
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
    }

    private final void upgradeBvnSuccess(HandleRouterParam params) {
        d.h(TAG, 3, "upgradeBvnSuccess >>> routerParam=" + params);
        handleSuccess();
        T.b(-4).submit(new b(this, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgradeBvnSuccess$lambda$15(CreditHandleRouterBridgeV2 creditHandleRouterBridgeV2) {
        if (BaseApplication.hasLogin()) {
            try {
                o oVar = q.f43977a;
                c.b().f(new MessageEvent(4));
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                o oVar2 = q.f43977a;
                g.f(th);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable HandleRouterParam params, @Nullable IBridgeCallback callback) {
        Object objF;
        d.h(TAG, 5, "onHandle >>> routerParam=" + params + "}");
        if (params == null || TextUtils.isEmpty(params.key)) {
            handleReject("params key is null");
            return;
        }
        try {
            o oVar = q.f43977a;
            String str = params.key;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2007361697:
                        if (!str.equals(ACTION_ROUTER_START_FROM_RN)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            routerStartV2(params);
                            handleSuccess();
                        }
                        break;
                    case -862613449:
                        if (!str.equals(ACTION_GET_CREDIT_AUTH)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            getCreditAuth(params);
                        }
                        break;
                    case -325360992:
                        if (!str.equals(ACTION_ROUTER_PRE_FROM_RN)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            routerPreV2(params);
                            handleSuccess();
                        }
                        break;
                    case 586137698:
                        if (!str.equals(ACTION_ROUTER_NEXT_FROM_RN)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            routerNextV2(params);
                            handleSuccess();
                        }
                        break;
                    case 780852260:
                        if (!str.equals(ACTION_DEVICE_INFO)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            getDeviceInfo(params);
                        }
                        break;
                    case 845913908:
                        if (!str.equals(ACTION_SUBMIT_REQ_INFO)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            getSubmitReqInfo(params);
                        }
                        break;
                    case 1367683036:
                        if (!str.equals("UpgradeByBVNSuccess")) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            upgradeBvnSuccess(params);
                        }
                        break;
                    case 1689909237:
                        if (!str.equals(ACTION_POP_PPCARD_CREDIT_PROCESS)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            popPPCardCreditProcess(params);
                        }
                        break;
                    case 1786616638:
                        if (!str.equals(ACTION_SYNC_CREDIT_DATA)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            syncCreditData(params);
                        }
                        break;
                    case 1892883113:
                        if (!str.equals(ACTION_SHOW_FLEXI_CREDIT_RESULT)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            showFlexiCreditResult(params);
                        }
                        break;
                    case 2140124850:
                        if (!str.equals(ACTION_MEDIA_INFO)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            getMediaInfo(params);
                        }
                        break;
                    default:
                        handleReject("routerParam->key[" + params.key + "] is illegal");
                        break;
                }
            } else {
                handleReject("routerParam->key[" + params.key + "] is illegal");
            }
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        if (!(objF instanceof p355xf.p)) {
            d.h(TAG, 3, "onHandle >>> onSuccess");
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c(TAG, G.o("onHandle >>> onFailure, ", thA.getMessage()));
            handleReject("handleRouter error, " + thA.getMessage());
        }
    }
}
