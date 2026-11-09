package com.transsnet.palmpay.core.dialog;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.BaseData;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import p052da.C1630b;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBankDialogV2 f27384a;

    public h(SelectBankDialogV2 selectBankDialogV2) {
        this.f27384a = selectBankDialogV2;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        BaseData baseData = (BaseData) obj;
        SelectBankDialogV2 selectBankDialogV2 = this.f27384a;
        if (selectBankDialogV2.isLoading || selectBankDialogV2.mCallBack == null) {
            return;
        }
        if (baseData instanceof BankInfo) {
            selectBankDialogV2.mCallBack.onChooseBankClick((BankInfo) baseData);
            C1630b c1630b = selectBankDialogV2.mBankInfoListAdapter;
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition >= 0) {
                c1630b.f35756f = adapterPosition;
                c1630b.notifyDataSetChanged();
            } else {
                c1630b.getClass();
            }
        } else if (baseData instanceof PaymentMethod) {
            selectBankDialogV2.mCallBack.onClickPayMethod((PaymentMethod) baseData);
            C1630b c1630b2 = selectBankDialogV2.mBankInfoListAdapter;
            int adapterPosition2 = viewHolder.getAdapterPosition();
            if (adapterPosition2 >= 0) {
                c1630b2.f35756f = adapterPosition2;
                c1630b2.notifyDataSetChanged();
            } else {
                c1630b2.getClass();
            }
        }
        selectBankDialogV2.mNowSelectedItem = baseData;
    }
}
