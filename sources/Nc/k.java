package Nc;

import Ad.c0;
import Pa.C0525w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6330a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f6331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.palmpay.lib.bridgewrapper.photo.upload.a f6332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0525w f6333d;

    static {
        new j(null);
    }

    public final QueryCashBoxTransactionListResp.CashBoxTransaction a(int i7) {
        List list;
        if (i7 == -1) {
            return null;
        }
        List list2 = this.f6331b;
        if ((list2 != null ? list2.size() : 0) > i7 && (list = this.f6331b) != null) {
            return (QueryCashBoxTransactionListResp.CashBoxTransaction) list.get(i7);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f6331b;
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
        holder.f6305a = new c0(28, cashBoxTransactionA, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i7 == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_history_month, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new f(viewInflate, this.f6333d);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(Jc.d.mm_item_fund_transaction, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new h(viewInflate2, this.f6330a, false);
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
