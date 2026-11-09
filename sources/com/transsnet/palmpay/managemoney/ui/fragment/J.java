package com.transsnet.palmpay.managemoney.ui.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends Yb.a {
    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i10) {
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) this.f11323a.get(i7);
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction2 = (QueryCashBoxTransactionListResp.CashBoxTransaction) this.f11324b.get(i10);
        return cashBoxTransaction.getTransactionStatus() == cashBoxTransaction2.getTransactionStatus() && cashBoxTransaction.getTransactionDirection() == cashBoxTransaction2.getTransactionDirection();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i10) {
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) this.f11323a.get(i7);
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction2 = (QueryCashBoxTransactionListResp.CashBoxTransaction) this.f11324b.get(i10);
        if (TextUtils.isEmpty(cashBoxTransaction.getPayId()) && TextUtils.isEmpty(cashBoxTransaction2.getPayId())) {
            return cashBoxTransaction.getStartTime() == cashBoxTransaction2.getStartTime();
        }
        return TextUtils.equals(cashBoxTransaction.getPayId(), cashBoxTransaction2.getPayId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final Object getChangePayload(int i7, int i10) {
        Bundle bundle = new Bundle();
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) this.f11323a.get(i7);
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction2 = (QueryCashBoxTransactionListResp.CashBoxTransaction) this.f11324b.get(i10);
        if (cashBoxTransaction.getTransactionStatus() != cashBoxTransaction2.getTransactionStatus()) {
            bundle.putInt("key_transaction_status", cashBoxTransaction2.getTransactionStatus());
        }
        if (cashBoxTransaction.getTransactionDirection() != cashBoxTransaction2.getTransactionDirection()) {
            bundle.putInt("key_transaction_direction", cashBoxTransaction2.getTransactionDirection());
        }
        return bundle;
    }
}
