package p368yb;

import Kb.g;
import Kb.h;
import Pa.r0;
import Ya.b;
import Ya.d;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcFeedbackHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import p294tb.W;
import p310ub.h1;

/* JADX INFO: renamed from: yb.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2154w extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_feedback_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2153v(viewInflate);
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder b(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_feedback_empty, parent, false);
        View viewFindViewById = itemView.findViewById(e.write_feedback_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        p220oa.h.l(new h1(13), viewFindViewById);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new g(itemView);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C2153v c2153v = (C2153v) holder;
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail = (OcFeedbackHistoryDetail) this.f4992b.get(i7);
        c2153v.f44265a.setText(ocFeedbackHistoryDetail.getFeedbackType());
        Integer status = ocFeedbackHistoryDetail.getStatus();
        TextView textView = c2153v.f44266b;
        Context context = this.f4991a;
        if (status != null && status.intValue() == 2) {
            textView.setTextColor(context.getColor(b.cs_oc_feed_complete_txt_color));
            textView.setBackground(context.getResources().getDrawable(d.cs_oc_feedback_status_tv_bg));
            textView.setText(context.getString(Ya.g.cs_oc_feedback_completed));
        } else {
            textView.setTextColor(context.getColor(b.cs_oc_feed_uncomplete_txt_color));
            textView.setBackground(context.getResources().getDrawable(d.cs_oc_feedback_status_tv_bg2));
            textView.setText(context.getString(Ya.g.cs_oc_feedback_ongoing));
        }
        String content = ocFeedbackHistoryDetail.getContent();
        if (content == null) {
            content = "";
        }
        boolean z3 = !TextUtils.isEmpty(content);
        TextView textView2 = c2153v.f44267c;
        p220oa.h.s(textView2, z3);
        textView2.setText(ocFeedbackHistoryDetail.getContent());
        Long createTime = ocFeedbackHistoryDetail.getCreateTime();
        c2153v.f44269e.setText(r0.X1(Long.valueOf(createTime != null ? createTime.longValue() : 0L), "HH:mm, MMM dd, yyyy"));
        p220oa.h.l(new W(16, this, ocFeedbackHistoryDetail), c2153v.f44268d);
    }
}
