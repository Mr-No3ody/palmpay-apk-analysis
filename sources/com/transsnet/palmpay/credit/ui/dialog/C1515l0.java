package com.transsnet.palmpay.credit.ui.dialog;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.credit.ui.dialog.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1515l0 extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f30152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515l0(ArrayList arrayList, int[] iArr, int i7) {
        super(i7, arrayList);
        this.f30152a = iArr;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        OcRouterDetail ocRouterDetail = (OcRouterDetail) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int[] iArr = this.f30152a;
        if (iArr[0] > 0) {
            View view = holder.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = iArr[0];
            view.setLayoutParams(layoutParams2);
        }
        if (ocRouterDetail != null) {
            Pa.r0.l1(ocRouterDetail.getIconUrlV2(), (ImageView) holder.getView(Ya.e.ivIcon));
            holder.setText(Ya.e.tvName, ocRouterDetail.getRouteName());
        }
    }
}
