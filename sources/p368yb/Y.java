package p368yb;

import Pa.r0;
import Ya.f;
import Ya.g;
import Za.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f44212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44213b;

    public Y(b context, ArrayList data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44212a = context;
        this.f44213b = data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f44213b;
        if (arrayList.size() > 2) {
            return 2;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CLBorrowCouponData cLBorrowCouponData = (CLBorrowCouponData) this.f44213b.get(i7);
        TextView textView = ((X) holder).f44211a;
        int i10 = g.cs_oc_coupon_off;
        Long consumeAmt = cLBorrowCouponData.getConsumeAmt();
        textView.setText(this.f44212a.getString(i10, r0.B(consumeAmt != null ? consumeAmt.longValue() : 0L, true)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f44212a).inflate(f.cs_oc_repay_coupon_item, parent, false);
        Intrinsics.e(viewInflate);
        return new X(viewInflate);
    }
}
