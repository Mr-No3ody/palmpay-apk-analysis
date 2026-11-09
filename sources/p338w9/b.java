package p338w9;

import M1.j;
import Pa.r0;
import Pd.f;
import android.view.View;
import androidx.activity.H;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.teller.bean.BettingAcmountItemData;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements PpAmountEditText.OnTextInputListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelBettingRootView f43339a;

    public /* synthetic */ b(ModelBettingRootView modelBettingRootView) {
        this.f43339a = modelBettingRootView;
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        int i7 = ModelBettingRootView.f26741w;
        this.f43339a.f();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        Long amountOption;
        int i10 = ModelBettingRootView.f26741w;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ModelBettingRootView modelBettingRootView = this.f43339a;
        t9.b bVar = modelBettingRootView.f26749o;
        BettingAcmountItemData bettingAcmountItemData = bVar != null ? (BettingAcmountItemData) bVar.getItem(i7) : null;
        H h7 = modelBettingRootView.f26746g;
        PaymentItemBean paymentItemBean = h7 != null ? (PaymentItemBean) h7.invoke() : null;
        long jLongValue = 0;
        if (paymentItemBean == null || paymentItemBean.isAmountFixed != 0 || paymentItemBean.amount <= 0) {
            if (bettingAcmountItemData != null && (amountOption = bettingAcmountItemData.getAmountOption()) != null) {
                jLongValue = amountOption.longValue();
            }
            String strE = r0.E(jLongValue);
            Intrinsics.checkNotNullExpressionValue(strE, "getAmountStringWithThousandCharacterNoPoint(...)");
            modelBettingRootView.setInputAmount(strE);
        }
        String customerId = modelBettingRootView.getCustomerId();
        if (customerId == null || customerId.length() == 0) {
            String string = modelBettingRootView.getContext().getString(f.qt_please_enter_user_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            modelBettingRootView.setCustomerIdError(string);
        }
        if (modelBettingRootView.c()) {
            modelBettingRootView.e();
        }
    }
}
