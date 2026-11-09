package p351xb;

import Pa.r0;
import Ya.f;
import Ya.g;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcAutoRepaymentData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLAutoRepaymentExplainActivity;
import com.transsnet.palmpay.custom_view.r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CLAutoRepaymentExplainActivity f43752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43753b;

    public b(CLAutoRepaymentExplainActivity mContext, ArrayList mData) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mData, "mData");
        this.f43752a = mContext;
        this.f43753b = mData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f43753b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        C2118a holder = (C2118a) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        OcAutoRepaymentData ocAutoRepaymentData = (OcAutoRepaymentData) this.f43753b.get(i7);
        if (Intrinsics.c(ocAutoRepaymentData.getBankName(), "Palmpay")) {
            holder.f43748a.setImageResource(r.cv_palmpay_icon_circle_purple);
            holder.f43749b.setText(ocAutoRepaymentData.getBankName());
            holder.f43750c.setText(r0.Y(ocAutoRepaymentData.getCardNo()));
            holder.f43751d.setVisibility(0);
            return;
        }
        holder.f43749b.setText(ocAutoRepaymentData.getBankName());
        boolean zIsEmpty = TextUtils.isEmpty(ocAutoRepaymentData.getCardNo());
        TextView textView = holder.f43750c;
        if (zIsEmpty) {
            textView.setText("****");
        } else {
            textView.setText(this.f43752a.getString(g.cs_oc_payment_num_syx, r0.I(ocAutoRepaymentData.getCardNo())));
        }
        r0.o1(ocAutoRepaymentData.getIcon(), holder.f43748a);
        holder.f43751d.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f43752a).inflate(f.cs_cl_auto_repay_explain_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2118a(viewInflate);
    }
}
