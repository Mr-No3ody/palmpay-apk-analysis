package p185ma;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.dialog.SelectPayMethodDialog;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemFooterViewOnClickListener;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements BaseRecyclerViewAdapter$ItemViewOnClickListener, BaseRecyclerViewAdapter$ItemFooterViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectPayMethodDialog f39615a;

    public /* synthetic */ o(SelectPayMethodDialog selectPayMethodDialog) {
        this.f39615a = selectPayMethodDialog;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemFooterViewOnClickListener
    public void OnItemFooterViewOnClick(View view, RecyclerView.ViewHolder viewHolder) {
        this.f39615a.lambda$initViews$1(view, viewHolder);
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        this.f39615a.lambda$initViews$0(view, (PaymentMethod) obj, viewHolder);
    }
}
