package p351xb;

import Pa.r0;
import Ya.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.RaiseRecord;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f43786a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f43786a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        RaiseRecord raiseRecord;
        String str;
        k holder = (k) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f43786a;
        if (list == null || (raiseRecord = (RaiseRecord) list.get(i7)) == null) {
            return;
        }
        holder.f43783a.setText(raiseRecord.desc);
        Long l5 = raiseRecord.changeQuota;
        if ((l5 != null ? l5.longValue() : 0L) > 0) {
            Long l6 = raiseRecord.changeQuota;
            str = "+" + r0.B(l6 != null ? l6.longValue() : 0L, true);
        } else {
            Long l8 = raiseRecord.changeQuota;
            str = "-" + r0.B(Math.abs(l8 != null ? l8.longValue() : 0L), true);
        }
        holder.f43785c.setText(str);
        Long l10 = raiseRecord.createTime;
        holder.f43784b.setText(r0.R(l10 != null ? l10.longValue() : 0L));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f.cs_cl_item_credit_management, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new k(viewInflate);
    }
}
