package p385ze;

import Ac.f;
import C9.V;
import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.main.export.bean.rsp.AccountData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p294tb.W;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f44692b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.f44692b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        a holder = (a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f44692b;
        AccountData accountData = list != null ? (AccountData) list.get(i7) : null;
        if (accountData != null) {
            holder.f44689c.setTag(Integer.valueOf(i7));
            holder.itemView.setOnClickListener(new V(holder, 9, accountData, false));
            holder.f44687a.setText(accountData.name);
            TextView textView = holder.f44689c;
            textView.setText("");
            String str = accountData.income;
            if (str != null) {
                if (y.m(str, "-", false)) {
                    textView.setTextColor(holder.itemView.getContext().getResources().getColor(L6.b.ppColorError));
                } else {
                    textView.setTextColor(holder.itemView.getContext().getResources().getColor(L6.b.ppColorSuccess));
                }
            }
            boolean z3 = holder.f44690d.f44691a;
            TextView textView2 = holder.f44688b;
            if (z3) {
                textView2.setText(accountData.value);
                String str2 = accountData.income;
                if (str2 != null) {
                    textView.setText(str2);
                }
            } else {
                textView2.setText("****");
                if (accountData.income != null) {
                    textView.setText("****");
                }
            }
            r0.R1(textView2, "fonts/PalmPayNum-Bold.ttf");
            View view = holder.itemView;
            if (view != null) {
                view.setOnClickListener(new W(20, accountData, holder));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(f.main_saving_basic_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(this, viewInflate);
    }
}
