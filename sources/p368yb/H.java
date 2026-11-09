package p368yb;

import Pa.r0;
import Ya.f;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.resp.IntervalRule;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f44175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44176b;

    public H(Activity mContext, ArrayList mData) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mData, "mData");
        this.f44175a = mContext;
        this.f44176b = mData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44176b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.f44176b;
        IntervalRule intervalRule = (IntervalRule) arrayList.get(i7);
        G g7 = (G) holder;
        if (intervalRule.getMaxAmount() != null) {
            TextView textView = g7.f44172a;
            String currencySymbol = BaseApplication.getCurrencySymbol();
            Long minAmount = intervalRule.getMinAmount();
            String strN0 = r0.n0(minAmount != null ? minAmount.longValue() : 0L);
            String currencySymbol2 = BaseApplication.getCurrencySymbol();
            Long maxAmount = intervalRule.getMaxAmount();
            textView.setText(u.n(currencySymbol, strN0, " - ", currencySymbol2, r0.n0(maxAmount != null ? maxAmount.longValue() : 0L)));
        } else {
            TextView textView2 = g7.f44172a;
            String currencySymbol3 = BaseApplication.getCurrencySymbol();
            Long minAmount2 = intervalRule.getMinAmount();
            textView2.setText(currencySymbol3 + r0.n0(minAmount2 != null ? minAmount2.longValue() : 0L) + "+");
        }
        TextView textView3 = g7.f44173b;
        String currencySymbol4 = BaseApplication.getCurrencySymbol();
        Long penaltyAmount = intervalRule.getPenaltyAmount();
        textView3.setText(currencySymbol4 + r0.n0(penaltyAmount != null ? penaltyAmount.longValue() : 0L));
        int size = arrayList.size() + (-1);
        View view = g7.f44174c;
        if (i7 == size) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f44175a).inflate(f.cs_oc_interest_item, parent, false);
        Intrinsics.e(viewInflate);
        return new G(viewInflate);
    }
}
