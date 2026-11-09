package com.transsnet.palmpay.credit.rnbridge;

import F6.d;
import android.app.Activity;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.launcher.ARouter;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.CreditBorrowParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/credit/borrow"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/LoanCreditBorrowBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/bean/CreditBorrowParam;", "<init>", "()V", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", "onHandle", "(Lcom/transsnet/palmpay/credit/bean/CreditBorrowParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanCreditBorrowBridge extends SyncBridge<CreditBorrowParam> {

    @NotNull
    public static final String TAG = "LoanCreditBorrowBridge";

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable CreditBorrowParam params, @Nullable IBridgeCallback callback) {
        d.h(TAG, 3, "onHandle >>> params=" + params);
        Object objNavigation = ARouter.getInstance().build("/credit_score/loan_credit_service").navigation();
        Intrinsics.f(objNavigation, "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
        ILoanCreditService iLoanCreditService = (ILoanCreditService) objNavigation;
        Activity activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Z supportFragmentManager = ((E) activity).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        iLoanCreditService.startBorrow(supportFragmentManager, params != null ? params.loanProduct : null, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        handleSuccess();
    }
}
