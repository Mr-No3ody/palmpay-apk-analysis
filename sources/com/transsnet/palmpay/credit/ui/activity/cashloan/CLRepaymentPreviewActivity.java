package com.transsnet.palmpay.credit.ui.activity.cashloan;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.ui.activity.CreditCashierPreviewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit还款收银台", path = "/credit_score/cl_repayment_preview_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRepaymentPreviewActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/CreditCashierPreviewActivity;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Wd/z", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentPreviewActivity extends CreditCashierPreviewActivity {

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

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    /* JADX INFO: renamed from: getTransType */
    public final String getF27455e() {
        return TransType.TRANS_TYPE_CL_REPAY;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        switch (event.getEventType()) {
            case MessageEvent.EVENT_CL_REPAYMENT_SUCCESS /* 358 */:
            case MessageEvent.EVENT_CL_REPAYMENT_PENDING /* 359 */:
            case MessageEvent.EVENT_CL_REPAYMENT_FAILED /* 360 */:
                finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    /* JADX INFO: renamed from: r */
    public final String getF27457g() {
        return TransType.TRANS_TYPE_EX_GRATIA_BONUS;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        return "29";
    }
}
