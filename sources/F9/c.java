package F9;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.cash_in.ui.dialog.SelectPaymentBankCardDialog;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemFooterViewOnClickListener;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements BaseRecyclerViewAdapter$ItemViewOnClickListener, BaseRecyclerViewAdapter$ItemFooterViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectPaymentBankCardDialog f2629a;

    public /* synthetic */ c(SelectPaymentBankCardDialog selectPaymentBankCardDialog) {
        this.f2629a = selectPaymentBankCardDialog;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemFooterViewOnClickListener
    public void OnItemFooterViewOnClick(View view, RecyclerView.ViewHolder viewHolder) {
        this.f2629a.lambda$initViews$1(view, viewHolder);
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        this.f2629a.lambda$initViews$0(view, (BankCardInfo) obj, viewHolder);
    }
}
