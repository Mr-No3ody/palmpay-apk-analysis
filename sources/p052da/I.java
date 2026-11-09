package p052da;

import C0.G;
import Kb.c;
import L6.b;
import Pa.r0;
import S6.a;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import p025ba.d;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35702g;

    public I(Context context) {
        super(context);
        this.f35700e = false;
        this.f35701f = false;
        this.f35702g = -1;
    }

    public static void c(IconicsImageView iconicsImageView, boolean z3) {
        IconicsDrawable iconicsDrawable = new IconicsDrawable(iconicsImageView.getContext(), z3 ? a.pay_ArrowUp : a.pay_Arrowdown);
        D3.a.F(iconicsDrawable, iconicsImageView.getContext().getColor(b.ppColorTextNormal));
        p118hf.a.I(iconicsDrawable, 12);
        iconicsImageView.setIcon(iconicsDrawable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (i7 < this.f4985b.size()) {
            CouponItem couponItem = (CouponItem) this.f4985b.get(i7);
            H h7 = (H) viewHolder;
            h7.f35686C.setVisibility(8);
            boolean zEquals = "DAYS".equals(couponItem.couponType);
            TextView textView = h7.f35691e;
            TextView textView2 = h7.f35697p;
            if (zEquals) {
                textView.setText(couponItem.preferentialDays + " Days Free");
                textView2.setText(new SpanUtils().append(couponItem.preferentialDays + "").append("Days Free").setFontSize(SizeUtils.sp2px(14.0f)).create());
            } else if ("DISCOUNT".equals(couponItem.couponType)) {
                textView2.setText(new SpanUtils().append(couponItem.discountRate + "").append("% Off").setFontSize(SizeUtils.sp2px(14.0f)).create());
            } else {
                textView2.setText(G.i("₦").setFontSize(SizeUtils.sp2px(14.0f)).append(r0.A(couponItem.nominaValue).replace(".00", "")).setFontSize(SizeUtils.sp2px(24.0f)).create());
            }
            String str = couponItem.couponName;
            TextView textView3 = h7.f35692f;
            textView3.setText(str);
            boolean zIsEmpty = TextUtils.isEmpty(couponItem.couponIcon);
            ImageView imageView = h7.f35690d;
            if (zIsEmpty) {
                imageView.setImageResource(r.cv_coupon_icon);
            } else {
                r0.h1(imageView, couponItem.couponIcon, r.cv_coupon_icon);
            }
            boolean z3 = this.f35701f;
            ImageView imageView2 = h7.f35698v;
            LinearLayout linearLayout = h7.f35685B;
            if (z3) {
                imageView2.setImageResource(this.f35702g == i7 ? d.core_coupon_checked : d.core_coupon_uncheck_black);
                imageView2.setVisibility(0);
                linearLayout.setVisibility(8);
                textView2.setVisibility(0);
                if (couponItem.startTime >= System.currentTimeMillis()) {
                    couponItem.available = false;
                }
            }
            long j6 = couponItem.startTime;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Context context = this.f4984a;
            h7.f35694i.setText(j6 >= jCurrentTimeMillis ? G.i(context.getResources().getString(k.core_valid_from_to, r0.S(couponItem.startTime), r0.S(couponItem.endTime))).setForegroundColor(context.getColor(b.ppColorPrimary)).create() : context.getResources().getString(k.core_valid_until, r0.S(couponItem.endTime)));
            long j10 = couponItem.limitAmt;
            TextView textView4 = h7.f35693g;
            if (j10 > 0) {
                textView4.setVisibility(0);
                textView4.setText(context.getString(k.core_over_amount_available, r0.B(couponItem.limitAmt, true)));
            } else {
                textView4.setVisibility(8);
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(couponItem.couponDesc);
            LinearLayout linearLayout2 = h7.f35686C;
            TextView textView5 = h7.f35695j;
            if (zIsEmpty2) {
                linearLayout.setVisibility(8);
                textView5.setVisibility(8);
                linearLayout2.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                boolean z8 = couponItem.layoutExpand;
                IconicsImageView iconicsImageView = h7.t;
                if (z8) {
                    linearLayout2.setVisibility(0);
                    c(iconicsImageView, true);
                    textView5.setVisibility(0);
                    textView5.setText(couponItem.couponDesc);
                } else {
                    c(iconicsImageView, false);
                    textView5.setVisibility(8);
                    linearLayout2.setVisibility(8);
                }
            }
            TextView textView6 = h7.f35688L;
            textView6.setVisibility(8);
            boolean z10 = couponItem.available;
            ConstraintLayout constraintLayout = h7.f35687H;
            LinearLayout linearLayout3 = h7.f35684A;
            RelativeLayout relativeLayout = h7.f35699w;
            I i10 = h7.f35689M;
            if (z10) {
                relativeLayout.setBackground(i10.f4984a.getDrawable(d.core_coupon_frame_left));
                int i11 = d.core_coupon_frame_right;
                Context context2 = i10.f4984a;
                linearLayout3.setBackground(context2.getDrawable(i11));
                constraintLayout.setBackground(context2.getDrawable(r.cv_shape_rect_corner_12_bg_secondary));
                textView.setTextColor(context2.getColor(b.ppColorPrimary));
                textView3.setTextColor(context2.getColor(b.ppColorTextPrimary));
                textView4.setTextColor(context2.getColor(b.ppColorTextNormal));
            } else {
                relativeLayout.setBackground(i10.f4984a.getDrawable(d.core_coupon_left_gray));
                int i12 = d.core_coupon_right_gray;
                Context context3 = i10.f4984a;
                linearLayout3.setBackground(context3.getDrawable(i12));
                constraintLayout.setBackground(context3.getDrawable(r.cv_shape_rect_corner_12_bg_dark));
                imageView2.setImageResource(d.core_coupon_uncheck_disable);
                imageView.setImageResource(r.cv_coupon_icon_gray);
                textView.setTextColor(context3.getColor(b.ppColorTextNormal));
                textView3.setTextColor(context3.getColor(b.ppColorTextNormal));
                textView4.setTextColor(context3.getColor(b.ppColorTextDisable));
                linearLayout.setVisibility(8);
                textView5.setVisibility(8);
            }
            if (couponItem.available || TextUtils.isEmpty(couponItem.unavailableReason)) {
                return;
            }
            textView6.setText(couponItem.unavailableReason);
            textView6.setVisibility(0);
            linearLayout.setVisibility(8);
            textView5.setVisibility(8);
            linearLayout2.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new H(this, View.inflate(this.f4984a, g.core_item_coupon_in_list, null));
    }
}
