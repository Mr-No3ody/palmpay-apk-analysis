package p052da;

import Kb.c;
import L6.b;
import L9.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.ExpressageInfoBean;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i7 < this.f4985b.size()) {
            ExpressageInfoBean expressageInfoBean = (ExpressageInfoBean) this.f4985b.get(i7);
            L l5 = (L) holder;
            l5.f35710f.setText(expressageInfoBean.messageEng);
            l5.f35711g.setText(expressageInfoBean.time);
            Context context = this.f4984a;
            TextView textView = l5.f35710f;
            View view = l5.f35712i;
            ImageView imageView = l5.f35709e;
            ImageView imageView2 = l5.f35708d;
            if (i7 == 0) {
                imageView2.setVisibility(0);
                imageView.setVisibility(8);
                textView.setTextColor(context.getColor(p.app_color_green_23D184));
                imageView2.setImageResource(r.cv_icon_expressage_arrive);
                int iDp2px = SizeUtils.dp2px(8.0f);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams).topMargin = iDp2px;
                return;
            }
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            if (i7 != 0) {
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                Intrinsics.f(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams2).topMargin = 0;
                return;
            }
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
            textView.setTextColor(context.getColor(b.ppColorPrimary));
            imageView2.setImageResource(r.cv_icon_bus);
            int iDp2px2 = SizeUtils.dp2px(8.0f);
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            Intrinsics.f(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams3).topMargin = iDp2px2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4984a).inflate(L9.b.core_item_expressage_info, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        L l5 = new L(this, itemView);
        View viewFindViewById = itemView.findViewById(a.gieaArriveIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        l5.f35708d = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(a.gieaGrayPoint);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        l5.f35709e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(a.gieaExpressageTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        l5.f35710f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(a.gieaTimeTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        l5.f35711g = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(a.gieaLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        l5.f35712i = viewFindViewById5;
        return l5;
    }
}
