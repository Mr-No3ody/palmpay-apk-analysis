package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import F6.d;
import O6.c;
import Ya.g;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodResp;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.ui.activity.CreditCashierPreviewActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.e;
import p220oa.h;
import p285sc.x;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit借款收银台", path = "/credit_score/cl_borrow_preview_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLBorrowPreviewActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/CreditCashierPreviewActivity;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Wd/z", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLBorrowPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLBorrowPreviewActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/cashloan/CLBorrowPreviewActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,108:1\n694#2,50:109\n*S KotlinDebug\n*F\n+ 1 CLBorrowPreviewActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/cashloan/CLBorrowPreviewActivity\n*L\n72#1:109,50\n*E\n"})
public final class CLBorrowPreviewActivity extends CreditCashierPreviewActivity {
    public static final /* synthetic */ int d1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f28875c1;

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    /* JADX INFO: renamed from: getTransType */
    public final String getF27455e() {
        return TransType.TRANS_TYPE_CL_BORROW;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    public final void m0(DefaultCalcOfPaymentMethodResp.DataBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.m0(data);
        J();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        switch (event.getEventType()) {
            case MessageEvent.EVENT_CL_BORROW_SUCCESS /* 355 */:
            case MessageEvent.EVENT_CL_BORROW_PENDING /* 356 */:
            case MessageEvent.EVENT_CL_BORROW_FAILED /* 357 */:
                finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    /* JADX INFO: renamed from: r */
    public final String getF27457g() {
        return TransType.TRANS_TYPE_EX_GRATIA_REFUND;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        return "1";
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        View viewFindViewById = findViewById(e.ll_cashier_confirm_to_pay);
        if (viewFindViewById != null) {
            h.c(viewFindViewById);
        }
        View viewFindViewById2 = findViewById(e.ll_pay_amount);
        if (viewFindViewById2 != null) {
            h.c(viewFindViewById2);
        }
        this.f28875c1 = getIntent().getBooleanExtra("cl_free_pass_word", false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, com.transsnet.palmpay.core.base.IBaseView
    public final void showLoadingDialog(boolean z3) {
        showLoadingDialog(z3 || this.f28875c1, "");
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void x(String code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!y.m(code, "33000008", false)) {
            super.x(code, message);
            return;
        }
        d.h(this.TAG, 3, "showAlertDialog >>> handle loan error code");
        int i7 = g.cs_cl_upgrade_to_unlock_more_funds;
        String strString = CommonViewExtKt.string(g.cs_cl_upgrade_content, this);
        x xVar = new x(this, 7);
        c cVar = new c(this);
        cVar.f6614u = 1;
        cVar.e(i7);
        cVar.f6598d = strString;
        cVar.f6604j = xVar;
        cVar.f6605k = true;
        cVar.f6606l = 1;
        G.v(cVar, false, false);
    }
}
