package com.transsnet.palmpay.core.dialog;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBillTypeDialog f27385a;

    public i(SelectBillTypeDialog selectBillTypeDialog) {
        this.f27385a = selectBillTypeDialog;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        BillType billType = (BillType) obj;
        int adapterPosition = viewHolder.getAdapterPosition();
        SelectBillTypeDialog selectBillTypeDialog = this.f27385a;
        selectBillTypeDialog.setSelectedPosition(adapterPosition);
        if (selectBillTypeDialog.mCallBack != null) {
            selectBillTypeDialog.mCallBack.onTypeSelected(billType);
        }
    }
}
