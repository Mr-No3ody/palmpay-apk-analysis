package p385ze;

import Ac.f;
import Kb.c;
import Pa.r0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.D;
import com.airbnb.lottie.p;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.main.export.bean.rsp.ProductData;
import com.transsnet.palmpay.managemoney.ui.activity.C1555a;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import p354xe.e;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44697e;

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.f44697e) {
            return super.getItemCount();
        }
        if (this.f4985b.size() < 8) {
            return super.getItemCount();
        }
        return 8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof g) {
            g gVar = (g) viewHolder;
            List list = this.f4985b;
            if (list == null || i7 >= list.size()) {
                return;
            }
            ProductData productData = (ProductData) this.f4985b.get(i7);
            gVar.f44695f.setText(productData.name);
            String str = productData.iconLottieUrl;
            if (!TextUtils.isEmpty(str) && !BaseApplication.get().isOldAndroidDevice()) {
                try {
                    D dH = p.h(gVar.itemView.getContext(), str);
                    dH.b(new C1555a(gVar, 2));
                    dH.a(new e(gVar, productData, 1));
                } catch (Exception unused) {
                    r0.h1(gVar.d(gVar.itemView.getContext()), productData.imageUrl, r.cv_palmpay_icon_gray);
                }
            } else if (!TextUtils.isEmpty(productData.imageUrl)) {
                r0.h1(gVar.d(gVar.itemView.getContext()), productData.imageUrl, r.cv_palmpay_icon_gray);
            }
            String str2 = productData.subscriptUrl;
            if (TextUtils.isEmpty(str2)) {
                ImageView imageView = gVar.f44693d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    return;
                }
                return;
            }
            if (gVar.f44693d == null) {
                ImageView imageView2 = new ImageView(gVar.f44696g.f4984a);
                gVar.f44693d = imageView2;
                imageView2.setAdjustViewBounds(true);
                int iDp2px = SizeUtils.dp2px(12.0f);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, iDp2px);
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iDp2px;
                layoutParams.f15650i = 0;
                layoutParams.f15668s = Ac.e.barrier;
                View view = gVar.itemView;
                if (view instanceof ConstraintLayout) {
                    ((ConstraintLayout) view).addView(gVar.f44693d, layoutParams);
                }
            }
            gVar.f44693d.setVisibility(0);
            r0.l1(str2, gVar.f44693d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new g(this, LayoutInflater.from(viewGroup.getContext()).inflate(f.main_item_saving_page_horizontal_menu, viewGroup, false));
    }
}
