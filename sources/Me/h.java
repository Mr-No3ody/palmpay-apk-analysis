package Me;

import Gb.T;
import Pa.r0;
import android.text.TextUtils;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.main.export.bean.rsp.HomeWealthItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5971a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(Ac.f.main_home_page_wealth_product_item, null);
        this.f5971a = iVar;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        HomeWealthItem item = (HomeWealthItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (!TextUtils.isEmpty(item.productTitle)) {
            holder.setText(Ac.e.tvProductTitle, item.productTitle);
        }
        if (!TextUtils.isEmpty(item.productSubTitle)) {
            holder.setText(Ac.e.tvProductSubTitle, item.productSubTitle);
        }
        if (!TextUtils.isEmpty(item.productContent)) {
            holder.setText(Ac.e.tvProductContent, item.productContent);
        }
        if (!TextUtils.isEmpty(item.productSubContent)) {
            holder.setText(Ac.e.tvProductSubContent, item.productSubContent);
        }
        if (TextUtils.isEmpty(item.cornerMark)) {
            TextView textView = (TextView) holder.getView(Ac.e.tvCornerMark);
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            holder.setText(Ac.e.tvCornerMark, item.cornerMark);
            TextView textView2 = (TextView) holder.getView(Ac.e.tvCornerMark);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = (TextView) holder.getView(Ac.e.tvCornerMark);
            if (textView3 != null) {
                textView3.setRotation(45.0f);
            }
        }
        if (TextUtils.isEmpty(item.buttonContent)) {
            PpButton ppButton = (PpButton) holder.getView(Ac.e.btnOp);
            if (ppButton != null) {
                ppButton.setVisibility(8);
            }
        } else {
            PpButton ppButton2 = (PpButton) holder.getView(Ac.e.btnOp);
            if (ppButton2 != null) {
                ppButton2.setVisibility(0);
            }
            PpButton ppButton3 = (PpButton) holder.getView(Ac.e.btnOp);
            if (ppButton3 != null) {
                ppButton3.setText(item.buttonContent);
            }
        }
        PpButton ppButton4 = (PpButton) holder.getView(Ac.e.btnOp);
        if (ppButton4 != null) {
            ppButton4.setOnClickListener(new T(13, item, this.f5971a));
        }
        r0.R1((TextView) holder.getView(Ac.e.tvProductContent), "fonts/PalmPayNum-Bold.ttf");
    }
}
