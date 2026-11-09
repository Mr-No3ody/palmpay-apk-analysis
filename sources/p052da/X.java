package p052da;

import Kb.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.ShareAppInfo;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder == null || i7 >= this.f4985b.size()) {
            return;
        }
        ShareAppInfo shareAppInfo = (ShareAppInfo) this.f4985b.get(i7);
        W w3 = (W) viewHolder;
        w3.f35737d.setImageDrawable(shareAppInfo.icon);
        w3.f35738e.setText(shareAppInfo.label);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(g.core_item_share_app, (ViewGroup) null);
        W w3 = new W(this, viewInflate);
        w3.f35737d = (ImageView) viewInflate.findViewById(e.cisa_iv);
        w3.f35738e = (TextView) viewInflate.findViewById(e.cisa_tv);
        w3.a(viewInflate);
        return w3;
    }
}
