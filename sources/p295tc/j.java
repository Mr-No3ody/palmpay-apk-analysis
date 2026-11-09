package p295tc;

import Kb.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecord;
import kotlin.jvm.internal.Intrinsics;
import p236pc.e;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        i iVar = (i) holder;
        ReferEarnRecord referEarnRecord = (ReferEarnRecord) this.f4985b.get(i7);
        if (referEarnRecord.verifyStatus == 0) {
            iVar.f42572g.setVisibility(8);
            iVar.f42571f.setVisibility(0);
        } else {
            iVar.f42572g.setVisibility(0);
            iVar.f42571f.setVisibility(8);
        }
        TextView textView = iVar.f42569d;
        String strSubstring = referEarnRecord.phone.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String str = referEarnRecord.phone;
        String strSubstring2 = str.substring(str.length() - 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        textView.setText(strSubstring + "*****" + strSubstring2);
        iVar.f42570e.setText(referEarnRecord.friendName);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(e.jp_item_resolve, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new i(this, viewInflate);
    }
}
