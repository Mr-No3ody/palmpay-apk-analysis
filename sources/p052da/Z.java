package p052da;

import N8.ViewOnClickListenerC0468l;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.rsp.CommonShareNewRsp;
import com.transsnet.palmpay.custom_view.r;
import java.util.ArrayList;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Z extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f35744b = new ArrayList();

    public Z(Context context) {
        this.f35743a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f35744b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        Y y8 = (Y) viewHolder;
        CommonShareNewRsp.ShareItem shareItem = (CommonShareNewRsp.ShareItem) this.f35744b.get(i7);
        if (shareItem == null) {
            return;
        }
        y8.f35740b.setText(TextUtils.isEmpty(shareItem.itemName) ? "" : shareItem.itemName);
        y8.f35741c.setText(TextUtils.isEmpty(shareItem.itemUrl) ? "" : shareItem.itemUrl);
        r0.h1(y8.f35739a, shareItem.itemIcon, r.cv_palmpay_icon_circle_purple);
        boolean zIsEmpty = TextUtils.isEmpty(shareItem.itemUrl);
        boolean z3 = !zIsEmpty;
        TextView textView = y8.f35742d;
        textView.setEnabled(z3);
        textView.setAlpha(!zIsEmpty ? 1.0f : 0.4f);
        textView.setOnClickListener(new ViewOnClickListenerC0468l(z3, shareItem, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new Y(LayoutInflater.from(this.f35743a).inflate(g.core_item_share_channel, viewGroup, false));
    }
}
