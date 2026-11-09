package com.transsnet.palmpay.credit.ui.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;

/* JADX INFO: loaded from: classes4.dex */
public interface ContactListAdapter$ItemViewOnClickListener {
    void OnItemViewOnClick(int i7, RecipientListResp.RecipientBean recipientBean, RecyclerView.ViewHolder viewHolder);

    void onDelete(int i7, RecipientListResp.RecipientBean recipientBean);
}
