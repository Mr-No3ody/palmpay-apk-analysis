package com.transsnet.palmpay.credit.rnbridge;

import F6.d;
import Pa.F;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.n;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.lifecycle.V;
import com.adjust.sdk.Constants;
import com.didi.drouter.annotation.Service;
import com.facebook.imagepipeline.nativecode.b;
import com.horcrux.svg.d0;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.CreditBorrowParam;
import com.transsnet.palmpay.credit.bean.LoanEnterPreCheckInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143jb.o;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/credit/open"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/LoanCreditApplyBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/bean/CreditBorrowParam;", "<init>", "()V", "Landroidx/fragment/app/E;", "host", "params", "Lcom/transsnet/palmpay/credit/bean/LoanEnterPreCheckInfo;", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "", "navigateAfterPreCheck", "(Landroidx/fragment/app/E;Lcom/transsnet/palmpay/credit/bean/CreditBorrowParam;Lcom/transsnet/palmpay/credit/bean/LoanEnterPreCheckInfo;)V", "startCredit", "(Landroidx/fragment/app/E;Lcom/transsnet/palmpay/credit/bean/CreditBorrowParam;)V", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Lcom/transsnet/palmpay/credit/bean/CreditBorrowParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanCreditApplyBridge extends SyncBridge<CreditBorrowParam> {

    @NotNull
    public static final String TAG = "LoanCreditApplyBridge";

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateAfterPreCheck(E host, CreditBorrowParam params, LoanEnterPreCheckInfo info) {
        d.h(TAG, 3, "preCheck alreadyLoan=" + info.alreadyLoan + ", jumpPath=" + info.jumpPath + ", rnEnabled=" + info.rnEnabled + ", rnNewEnabled=" + info.rnNewEnabled + ", newVersionEnabled=" + info.newVersionEnabled + ", useNewDomain=" + info.useNewDomain);
        b.c(info.rnEnabled, info.rnNewEnabled, info.newVersionEnabled, info.useNewDomain);
        if (Intrinsics.c(info.alreadyLoan, Boolean.TRUE) || TextUtils.isEmpty(info.jumpPath)) {
            startCredit(host, params);
        } else {
            F.f(info.jumpPath, info.jumpType, info.jumpParams);
            handleSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCredit(E host, CreditBorrowParam params) {
        String str;
        ILoanCreditService iLoanCreditService = (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
        Z supportFragmentManager = host.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        n.y(iLoanCreditService, supportFragmentManager, params != null ? params.loanProduct : null, params != null ? params.channelEnum : null, null, 8);
        o jVar = o.f38542z.getInstance();
        if (params != null) {
            jVar.getClass();
            str = params.successUrl;
        } else {
            str = null;
        }
        jVar.f38560r = str;
        jVar.f38559q = params != null ? params.errorUrl : null;
        jVar.f38561s = params != null ? params.pendingUrl : null;
        handleSuccess();
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable CreditBorrowParam params, @Nullable IBridgeCallback callback) {
        d.h(TAG, 3, "onHandle >>> params=" + params);
        Activity activity = getActivity();
        E e10 = activity instanceof E ? (E) activity : null;
        if (e10 == null) {
            handleFail(new IllegalStateException("current activity is not FragmentActivity"));
        } else {
            AbstractC0780y.m(V.f(e10), null, null, new p253qb.b(this, e10, params, null), 3);
        }
    }
}
