package yc;

import Kb.c;
import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.jara_packet.bean.resp.Comment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p236pc.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {
    @Override // Kb.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Comment getItem(int i7) {
        if (this.f4985b.size() == 0) {
            return new Comment("", "", 0L, 0L, "", "", new ArrayList());
        }
        Object item = super.getItem(i7 % this.f4985b.size());
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return (Comment) item;
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        a aVar = (a) holder;
        Comment item = getItem(i7);
        aVar.f44281f.setText(item.commentsContent);
        r0.u1(aVar.f44280e, item.headPortrait, r.cv_avatar_default);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(e.jp_re_comment, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(this, viewInflate);
    }
}
