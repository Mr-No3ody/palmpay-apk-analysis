package p295tc;

import Kb.c;
import Pa.i0;
import Pa.r0;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.jara_packet.bean.resp.Comment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p236pc.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {
    public static String c(int i7, Comment comment) {
        List<String> list = comment.pictureList;
        if (list == null || list.isEmpty() || i7 >= comment.pictureList.size()) {
            return null;
        }
        return comment.pictureList.get(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        a aVar = (a) holder;
        i0.h0(aVar.f42534d, Color.parseColor("#ffffff"), Color.parseColor("#e5e5e5"), 20);
        Comment comment = (Comment) this.f4985b.get(i7);
        r0.u1(aVar.f42535e, comment.headPortrait, r.cv_avatar_default);
        aVar.f42539j.setText(comment.nickName);
        aVar.f42540o.setText(r0.S(comment.createTime));
        aVar.f42541p.setText(BaseApplication.getCurrencySymbol() + r0.n0(comment.amount));
        aVar.t.setText(comment.commentsContent);
        String strC = c(0, comment);
        ImageView imageView = aVar.f42536f;
        if (strC != null) {
            imageView.setVisibility(0);
            r0.l1(strC, imageView);
        } else {
            imageView.setVisibility(8);
        }
        String strC2 = c(1, comment);
        ImageView imageView2 = aVar.f42537g;
        if (strC2 != null) {
            imageView2.setVisibility(0);
            r0.l1(strC2, imageView2);
        } else {
            imageView2.setVisibility(8);
        }
        String strC3 = c(2, comment);
        ImageView imageView3 = aVar.f42538i;
        if (strC3 == null) {
            imageView3.setVisibility(8);
        } else {
            imageView3.setVisibility(0);
            r0.l1(strC3, imageView3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(e.jp_model_comment, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(this, viewInflate);
    }
}
