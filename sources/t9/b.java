package t9;

import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.teller.bean.BettingAcmountItemData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42357b;

    public b(boolean z3) {
        super(Pd.d.qt_layout_item_betting_preset_amount, null);
        this.f42356a = z3;
        this.f42357b = -99L;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BettingAcmountItemData item = (BettingAcmountItemData) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        getItemPosition(item);
        int i7 = Pd.c.tvAmount;
        Long amountOption = item.getAmountOption();
        holder.setText(i7, r0.n0(amountOption != null ? amountOption.longValue() : 0L));
        ImageView imageView = (ImageView) holder.getViewOrNull(Pd.c.tvBonus);
        if (imageView != null) {
            String darkCornerMarkUrl = this.f42356a ? item.getDarkCornerMarkUrl() : item.getCornerMarkUrl();
            if (TextUtils.isEmpty(darkCornerMarkUrl)) {
                p220oa.h.s(imageView, false);
            } else {
                p220oa.h.s(imageView, true);
                r0.l1(darkCornerMarkUrl, imageView);
            }
        }
        long j6 = this.f42357b;
        Long amountOption2 = item.getAmountOption();
        if (j6 > (amountOption2 != null ? amountOption2.longValue() : 0L) || this.f42357b == -99) {
            LinearLayout linearLayout = (LinearLayout) holder.getViewOrNull(Pd.c.amountArea);
            if (linearLayout != null) {
                linearLayout.setBackground(getContext().getDrawable(r.cv_shape_rect_corner_8_bg_dark));
            }
            TextView textView = (TextView) holder.getViewOrNull(Pd.c.tvAmount);
            if (textView != null) {
                textView.setTextColor(androidx.core.content.d.c(L6.b.ppColorTextPrimary, getContext()));
            }
        } else {
            LinearLayout linearLayout2 = (LinearLayout) holder.getViewOrNull(Pd.c.amountArea);
            if (linearLayout2 != null) {
                linearLayout2.setBackground(getContext().getDrawable(r.cv_rect_corner_8_bg_second_storke_purple));
            }
            TextView textView2 = (TextView) holder.getViewOrNull(Pd.c.tvAmount);
            if (textView2 != null) {
                textView2.setTextColor(getContext().getColor(L6.b.ppColorPrimary));
            }
        }
        TextView textView3 = (TextView) holder.getViewOrNull(Pd.c.tvDiscount);
        if (textView3 != null) {
            p220oa.h.s(textView3, !TextUtils.isEmpty(item.getDiscountText()));
            textView3.setText(item.getDiscountText());
        }
    }
}
