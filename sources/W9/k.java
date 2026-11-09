package W9;

import Pa.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.contacts.bean.resp.MemberRelationshipLogMessageDTO;
import com.transsnet.palmpay.contacts.bean.resp.RelationShipLogListBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Kb.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10640e;

    static {
        new h(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        RelationShipLogListBean relationShipLogListBean = (RelationShipLogListBean) getItem(i7);
        Intrinsics.e(relationShipLogListBean);
        MemberRelationshipLogMessageDTO memberRelationshipLogMessageDTO = relationShipLogListBean.memberRelationshipLogMessageDTO;
        Intrinsics.e(memberRelationshipLogMessageDTO);
        return !memberRelationshipLogMessageDTO.self ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        MemberRelationshipLogMessageDTO memberRelationshipLogMessageDTO;
        MemberRelationshipLogMessageDTO memberRelationshipLogMessageDTO2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int itemViewType = getItemViewType(i7);
        Context context = this.f4984a;
        if (itemViewType == 0) {
            j jVar = (j) holder;
            RelationShipLogListBean relationShipLogListBean = (RelationShipLogListBean) getItem(i7);
            if (relationShipLogListBean == null || (memberRelationshipLogMessageDTO2 = relationShipLogListBean.memberRelationshipLogMessageDTO) == null) {
                return;
            }
            jVar.f10635d.setText(memberRelationshipLogMessageDTO2.title);
            jVar.f10636e.setText(memberRelationshipLogMessageDTO2.text);
            p220oa.h.s(jVar.f10637f, false);
            jVar.f10638g.setText(context.getString(R9.f.ct_link_from_s_time_s, memberRelationshipLogMessageDTO2.source, r0.X1(Long.valueOf(memberRelationshipLogMessageDTO2.gmtCreatedTimestamp), "HH:mm, MMM dd, yyyy")));
            r0.m1(memberRelationshipLogMessageDTO2.sendHeadPortrait, jVar.f10639i);
            return;
        }
        if (getItemViewType(i7) == 1) {
            i iVar = (i) holder;
            RelationShipLogListBean relationShipLogListBean2 = (RelationShipLogListBean) getItem(i7);
            if (relationShipLogListBean2 == null || (memberRelationshipLogMessageDTO = relationShipLogListBean2.memberRelationshipLogMessageDTO) == null) {
                return;
            }
            iVar.f10630d.setText(memberRelationshipLogMessageDTO.title);
            iVar.f10631e.setText(memberRelationshipLogMessageDTO.text);
            TextView textView = iVar.f10632f;
            p220oa.h.s(textView, true);
            iVar.f10633g.setText(context.getString(R9.f.ct_link_from_s_time_s, memberRelationshipLogMessageDTO.source, r0.X1(Long.valueOf(memberRelationshipLogMessageDTO.gmtCreatedTimestamp), "HH:mm, MMM dd, yyyy")));
            r0.m1(memberRelationshipLogMessageDTO.sendHeadPortrait, iVar.f10634i);
            textView.setOnClickListener(new Oc.j(21, relationShipLogListBean2, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = this.f4984a;
        if (i7 == 0) {
            View viewInflate = LayoutInflater.from(context).inflate(R9.e.ct_personal_transfer_right_item_layout, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new j(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(R9.e.ct_personal_transfer_left_item_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new i(this, viewInflate2);
    }
}
