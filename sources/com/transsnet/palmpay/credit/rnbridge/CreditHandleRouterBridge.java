package com.transsnet.palmpay.credit.rnbridge;

import C0.G;
import F6.d;
import Pa.C0525w;
import Pa.T;
import android.app.Activity;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.core.impl.utils.n;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.didi.drouter.annotation.Service;
import com.horcrux.svg.d0;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.HandleRouterParam;
import com.transsnet.palmpay.credit.bean.RouterNodeInfo;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129ib.m;
import p143jb.j;
import p143jb.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/credit/routeManager"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\bJ#\u0010\u0019\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/CreditHandleRouterBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/bean/HandleRouterParam;", "<init>", "()V", "params", "", CreditHandleRouterBridge.ACTION_ROUTER_PRE, "(Lcom/transsnet/palmpay/credit/bean/HandleRouterParam;)V", CreditHandleRouterBridge.ACTION_ROUTER_START, CreditHandleRouterBridge.ACTION_ROUTER_NEXT, CreditHandleRouterBridge.ACTION_ROUTER_END, "upgradeBvnSuccess", "Lcom/transsnet/palmpay/core/interfaces/ILoanCreditService;", "loanCreditService", "()Lcom/transsnet/palmpay/core/interfaces/ILoanCreditService;", CreditHandleRouterBridge.KEY_START_LOAN_HOME_ALERT, "Lib/m;", "resolveHomeDialogHandler", "()Lib/m;", CreditHandleRouterBridge.KEY_START_CREDIT_APPLY, CreditHandleRouterBridge.KEY_START_CREDIT_APPLY_WITH_REVIEW, "borrowPermissionCheck", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Lcom/transsnet/palmpay/credit/bean/HandleRouterParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreditHandleRouterBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreditHandleRouterBridge.kt\ncom/transsnet/palmpay/credit/rnbridge/CreditHandleRouterBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n808#2,11:260\n295#2,2:271\n1#3:273\n*S KotlinDebug\n*F\n+ 1 CreditHandleRouterBridge.kt\ncom/transsnet/palmpay/credit/rnbridge/CreditHandleRouterBridge\n*L\n179#1:260,11\n180#1:271,2\n*E\n"})
public final class CreditHandleRouterBridge extends SyncBridge<HandleRouterParam> {

    @NotNull
    public static final String ACTION_ROUTER_END = "routerEnd";

    @NotNull
    public static final String ACTION_ROUTER_NEXT = "routerNext";

    @NotNull
    public static final String ACTION_ROUTER_PRE = "routerPre";

    @NotNull
    public static final String ACTION_ROUTER_START = "routerStart";

    @NotNull
    public static final String ACTION_UPGRADE_BVN_SUCCESS = "UpgradeByBVNSuccess";

    @NotNull
    public static final String KEY_BORROW_PERMISSION_CHECK = "borrowPermissonCheck";

    @NotNull
    public static final String KEY_START_CREDIT_APPLY = "startCreditApply";

    @NotNull
    public static final String KEY_START_CREDIT_APPLY_WITH_REVIEW = "startCreditApplyWithReview";

    @NotNull
    public static final String KEY_START_LOAN_HOME_ALERT = "startLoanHomeAlertCheck";

    @NotNull
    public static final String TAG = "CreditHandleRouterBridge";

    private final void borrowPermissionCheck(HandleRouterParam params) {
        String string;
        String str = params.loanProduct;
        if (str == null || str.length() == 0) {
            d.c(TAG, "borrowPermissonCheck empty loanProduct");
            handleSuccess();
            return;
        }
        Activity activity = getActivity();
        E e10 = activity instanceof E ? (E) activity : null;
        Z supportFragmentManager = e10 != null ? e10.getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            handleSuccess();
            return;
        }
        Long l5 = params.availableBalance;
        Long l6 = (l5 == null || l5.longValue() <= 0) ? null : l5;
        Integer num = params.productSubId;
        Integer num2 = (num == null || num.intValue() <= 0) ? null : num;
        String str2 = params.path;
        String str3 = (str2 == null || (string = StringsKt.V(str2).toString()) == null || string.length() <= 0) ? null : string;
        String str4 = params.loanProduct;
        String str5 = params.path;
        Integer num3 = params.sceneSource;
        StringBuilder sbF = F.f("borrowPermissonCheck >>> loanProduct=", str4, ", path(raw)=", str5, ", borrowRoutePath=");
        sbF.append(str3);
        sbF.append(", productSubId=");
        sbF.append(num2);
        sbF.append(", loanAmount=");
        sbF.append(l6);
        sbF.append(", sceneSource=");
        sbF.append(num3);
        d.h(TAG, 3, sbF.toString());
        loanCreditService().startBorrow(supportFragmentManager, params.loanProduct, l6, params.sceneSource, null, str3, num2);
        handleSuccess();
    }

    private final ILoanCreditService loanCreditService() {
        return (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
    }

    private final m resolveHomeDialogHandler() {
        Object next;
        Activity activity = getActivity();
        E e10 = activity instanceof E ? (E) activity : null;
        if (e10 != null) {
            List listF = e10.getSupportFragmentManager().f17069c.f();
            Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (obj instanceof LoanHomeFragment) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((LoanHomeFragment) next).isAdded());
            LoanHomeFragment callBack = (LoanHomeFragment) next;
            if (callBack != null) {
                m mVar = callBack.f30349o;
                if (mVar != null) {
                    return mVar;
                }
                m mVar2 = new m(callBack);
                Intrinsics.checkNotNullParameter(callBack, "callBack");
                mVar2.f37485d = callBack;
                callBack.f30349o = mVar2;
                return mVar2;
            }
        }
        return null;
    }

    private final void routerEnd(HandleRouterParam params) {
        d.h(TAG, 3, "routerEnd >>> routerParam=" + params);
        j jVar = o.f38542z;
        jVar.getInstance().f38565x = params.routeInfo;
        o jVar2 = jVar.getInstance();
        d.h("CreditRouterManager", 3, G.o("doRouterEnd >>> routeNodeInfo=", jVar2.f38565x));
        jVar2.s();
    }

    private final void routerNext(HandleRouterParam params) {
        d.h(TAG, 3, "routerNext >>> routerParam=" + params);
        C0525w c0525wF = C0525w.f();
        String str = params.routeInfo;
        c0525wF.getClass();
        RouterNodeInfo routerNodeInfo = (RouterNodeInfo) C0525w.d(str, RouterNodeInfo.class);
        if (routerNodeInfo == null) {
            handleReject("routerNode current is null");
            return;
        }
        j jVar = o.f38542z;
        jVar.getInstance().f38565x = params.routeInfo;
        jVar.getInstance().p(routerNodeInfo.current);
    }

    private final void routerPre(HandleRouterParam params) {
        d.h(TAG, 3, "routerPre >>> routerParam=" + params);
        o.f38542z.getInstance().f38565x = params.routeInfo;
    }

    private final void routerStart(HandleRouterParam params) {
        d.h(TAG, 3, "routerStart >>> routerParam=" + params);
        C0525w c0525wF = C0525w.f();
        String str = params.routeInfo;
        c0525wF.getClass();
        RouterNodeInfo routerNodeInfo = (RouterNodeInfo) C0525w.d(str, RouterNodeInfo.class);
        if (routerNodeInfo == null) {
            handleReject("routerNode current is null");
            return;
        }
        j jVar = o.f38542z;
        jVar.getInstance().f38565x = params.routeInfo;
        jVar.getInstance().f38566y = params.pageInfo;
        jVar.getInstance().p(routerNodeInfo.current);
    }

    private final void startCreditApply(HandleRouterParam params) {
        String str = params.loanProduct;
        if (str == null || str.length() == 0) {
            d.c(TAG, "startCreditApply empty loanProduct");
            handleSuccess();
            return;
        }
        Activity activity = getActivity();
        E e10 = activity instanceof E ? (E) activity : null;
        Z supportFragmentManager = e10 != null ? e10.getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            d.c(TAG, "startCreditApply activity is not FragmentActivity");
            handleSuccess();
            return;
        }
        ILoanCreditService iLoanCreditServiceLoanCreditService = loanCreditService();
        String str2 = params.source;
        if (str2 == null) {
            str2 = "HOME";
        }
        n.y(iLoanCreditServiceLoanCreditService, supportFragmentManager, str, str2, null, 8);
        handleSuccess();
    }

    private final void startCreditApplyWithReview(HandleRouterParam params) {
        String str;
        String str2 = params.loanProduct;
        if (str2 == null || str2.length() == 0 || (str = params.applyId) == null || str.length() == 0) {
            d.c(TAG, "startCreditApplyWithReview missing loanProduct/applyId");
            handleSuccess();
            return;
        }
        Activity activity = getActivity();
        E e10 = activity instanceof E ? (E) activity : null;
        Z supportFragmentManager = e10 != null ? e10.getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            handleSuccess();
            return;
        }
        ILoanCreditService iLoanCreditServiceLoanCreditService = loanCreditService();
        String str3 = params.loanProduct;
        String str4 = params.source;
        if (str4 == null) {
            str4 = "HOME";
        }
        iLoanCreditServiceLoanCreditService.startCredit(supportFragmentManager, str3, str4, params.applyId);
        handleSuccess();
    }

    private final void startLoanHomeAlertCheck(HandleRouterParam params) {
        m mVarResolveHomeDialogHandler = resolveHomeDialogHandler();
        if (mVarResolveHomeDialogHandler == null) {
            d.c(TAG, "startLoanHomeAlertCheck HomeDialogHandler is null");
            handleSuccess();
        } else {
            mVarResolveHomeDialogHandler.a(params.needRepaymentInfo);
            handleSuccess();
        }
    }

    private final void upgradeBvnSuccess(HandleRouterParam params) {
        d.h(TAG, 3, "upgradeBvnSuccess >>> routerParam=" + params);
        handleSuccess();
        T.b(-4).submit(new b(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upgradeBvnSuccess$lambda$4(CreditHandleRouterBridge creditHandleRouterBridge) {
        try {
            p355xf.o oVar = q.f43977a;
            if (BaseApplication.hasLogin()) {
                c.b().f(new MessageEvent(4));
            }
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            p355xf.o oVar2 = q.f43977a;
            g.f(th);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable HandleRouterParam params, @Nullable IBridgeCallback callback) {
        Object objF;
        d.h(TAG, 3, "onHandle >>> routerParam=" + params + "}");
        if (params == null || TextUtils.isEmpty(params.key)) {
            handleReject("params key is null");
            return;
        }
        try {
            p355xf.o oVar = q.f43977a;
            String str = params.key;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2003299835:
                        if (!str.equals(KEY_BORROW_PERMISSION_CHECK)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            borrowPermissionCheck(params);
                        }
                        break;
                    case -1551790541:
                        if (!str.equals(KEY_START_CREDIT_APPLY)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            startCreditApply(params);
                        }
                        break;
                    case -1386118051:
                        if (!str.equals(KEY_START_LOAN_HOME_ALERT)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            startLoanHomeAlertCheck(params);
                        }
                        break;
                    case -1255906663:
                        if (!str.equals(ACTION_ROUTER_START)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            routerStart(params);
                            handleSuccess();
                        }
                        break;
                    case 168511698:
                        if (!str.equals(ACTION_ROUTER_END)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            routerEnd(params);
                            handleSuccess();
                        }
                        break;
                    case 168522394:
                        if (!str.equals(ACTION_ROUTER_PRE)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            routerPre(params);
                            handleSuccess();
                        }
                        break;
                    case 929155548:
                        if (!str.equals(ACTION_ROUTER_NEXT)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            routerNext(params);
                            handleSuccess();
                        }
                        break;
                    case 1367683036:
                        if (!str.equals("UpgradeByBVNSuccess")) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            upgradeBvnSuccess(params);
                        }
                        break;
                    case 1900211793:
                        if (!str.equals(KEY_START_CREDIT_APPLY_WITH_REVIEW)) {
                            handleReject("routerParam->key[" + params.key + "] is illegal");
                        } else {
                            startCreditApplyWithReview(params);
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
            p355xf.o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        if (!(objF instanceof p)) {
            d.h(TAG, 3, "onHandle >>> onSuccess");
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            d.c(TAG, G.o("onHandle >>> onFailure, ", thA.getMessage()));
            handleReject("handleRouter error, " + thA.getMessage());
        }
    }
}
