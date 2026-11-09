package Nc;

import Ad.c0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.interfac.OnItemClickListener;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f6313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnItemClickListener f6314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CashBoxTransactionMonthViewHolder$OnMonthClickListener f6315e;

    static {
        new d(null);
    }

    public e(int i7) {
        boolean z3 = (i7 & 2) == 0;
        this.f6311a = true;
        this.f6312b = z3;
    }

    public final QueryCashBoxTransactionListResp.CashBoxTransaction a(int i7) {
        List list;
        if (i7 == -1) {
            return null;
        }
        List list2 = this.f6313c;
        if ((list2 != null ? list2.size() : 0) > i7 && (list = this.f6313c) != null) {
            return (QueryCashBoxTransactionListResp.CashBoxTransaction) list.get(i7);
        }
        return null;
    }

    public final void b(long j6, long j10, long j11) {
        int i7;
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransactionA;
        List list = this.f6313c;
        if (list == null) {
            i7 = -1;
            break;
        }
        Iterator it = list.iterator();
        i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            Object next = it.next();
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) next;
            if (cashBoxTransaction.getItemType() == 1 && cashBoxTransaction.getStartTime() == j6) {
                break;
            } else {
                i7 = i10;
            }
        }
        if (i7 == -1 || (cashBoxTransactionA = a(i7)) == null) {
            return;
        }
        cashBoxTransactionA.setInComeAmount(j10);
        cashBoxTransactionA.setPayOutAmount(j11);
        notifyItemChanged(i7, new Bundle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f6313c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransactionA = a(i7);
        if (cashBoxTransactionA != null) {
            return cashBoxTransactionA.getItemType();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        AbstractC0482a holder = (AbstractC0482a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransactionA = a(i7);
        if (cashBoxTransactionA != null) {
            holder.a(i7, cashBoxTransactionA);
        }
        holder.f6305a = new c0(27, cashBoxTransactionA, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i7 == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_history_month, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new f(viewInflate, this.f6315e);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_cash_box_transaction, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new h(viewInflate2, this.f6311a, this.f6312b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List payloads) {
        AbstractC0482a holder = (AbstractC0482a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i7, payloads);
            return;
        }
        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransactionA = a(i7);
        if (cashBoxTransactionA != null) {
            holder.a(i7, cashBoxTransactionA);
        }
    }
}
