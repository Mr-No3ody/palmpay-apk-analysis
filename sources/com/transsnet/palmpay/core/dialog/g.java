package com.transsnet.palmpay.core.dialog;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import p052da.C1636h;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBankDialog f27383a;

    public g(SelectBankDialog selectBankDialog) {
        this.f27383a = selectBankDialog;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        BankInfo bankInfo = (BankInfo) obj;
        SelectBankDialog selectBankDialog = this.f27383a;
        if (selectBankDialog.isLoading || selectBankDialog.mCallBack == null) {
            return;
        }
        selectBankDialog.mCallBack.onChooseBankClick(bankInfo);
        C1636h c1636h = selectBankDialog.mBankInfoListAdapter;
        int adapterPosition = viewHolder.getAdapterPosition();
        if (adapterPosition < 0) {
            c1636h.getClass();
        } else {
            c1636h.f35773f = adapterPosition;
            c1636h.notifyDataSetChanged();
        }
    }
}
