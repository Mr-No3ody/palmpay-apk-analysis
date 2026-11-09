package M3;

import C0.G;
import E.AbstractC0198c;
import M1.j;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flexibank.sdk.cashier.adapter.FlexiBankCashierCouponListAdapter$ViewHolder;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.flexibank.sdk.m;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import j4.u;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5748b;

    public a() {
        super(q.fb_item_coupon_in_list, null);
        this.f5747a = true;
        this.f5748b = -1;
        addChildClickViewIds(p.fb_llDetailArrow);
        addChildClickViewIds(p.fb_imageViewCheck);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder baseViewHolder, Object obj) {
        Long nominaValue;
        long j6;
        CharSequence string;
        Long endTime;
        int i7;
        Boolean available;
        Long limitAmt;
        Long limitAmt2;
        Long endTime2;
        Long startTime;
        Long startTime2;
        Long startTime3;
        FlexiBankCashierCouponListAdapter$ViewHolder viewHolder = (FlexiBankCashierCouponListAdapter$ViewHolder) baseViewHolder;
        FlexiBankCashierCouponItem flexiBankCashierCouponItem = (FlexiBankCashierCouponItem) obj;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        LinearLayout linearLayout = viewHolder.f21959v;
        linearLayout.setVisibility(8);
        boolean zEquals = "DAYS".equals(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getCouponType() : null);
        TextView textView = viewHolder.f21956j;
        if (zEquals) {
            SpanUtils spanUtils = new SpanUtils();
            Integer preferentialDays = flexiBankCashierCouponItem.getPreferentialDays();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(preferentialDays);
            textView.setText(spanUtils.append(sb2.toString()).append("Days Free").setFontSize(SizeUtils.sp2px(14.0f)).create());
        } else {
            if ("DISCOUNT".equals(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getCouponType() : null)) {
                SpanUtils spanUtils2 = new SpanUtils();
                Integer discountRate = flexiBankCashierCouponItem.getDiscountRate();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(discountRate);
                textView.setText(spanUtils2.append(sb3.toString()).append("% Off").setFontSize(SizeUtils.sp2px(14.0f)).create());
            } else {
                textView.setText(G.i("₦").setFontSize(SizeUtils.sp2px(14.0f)).append(y.k(p118hf.a.s((flexiBankCashierCouponItem == null || (nominaValue = flexiBankCashierCouponItem.getNominaValue()) == null) ? 0L : nominaValue.longValue()), ".00", "")).setFontSize(SizeUtils.sp2px(24.0f)).create());
            }
        }
        String couponName = flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getCouponName() : null;
        TextView textView2 = viewHolder.f21950c;
        textView2.setText(couponName);
        boolean zIsEmpty = TextUtils.isEmpty(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getCouponIcon() : null);
        ImageView imageView = viewHolder.f21948a;
        if (zIsEmpty) {
            imageView.setImageResource(o.fb_flexi_bank_second_icon);
        } else {
            String couponIcon = flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getCouponIcon() : null;
            int i10 = o.fb_flexi_bank_second_icon;
            if (imageView == null ? false : u.b(imageView.getContext())) {
                AbstractC0198c.L(imageView, couponIcon, G1.d.O(i10));
            }
        }
        ImageView imageView2 = viewHolder.f21955i;
        imageView2.setVisibility(0);
        boolean z3 = this.f5747a;
        LinearLayout linearLayout2 = viewHolder.t;
        if (z3) {
            imageView2.setImageResource(this.f5748b == bindingAdapterPosition ? o.fb_coupon_checked : o.fb_coupon_uncheck_black);
            linearLayout2.setVisibility(0);
            textView.setVisibility(0);
            if (((flexiBankCashierCouponItem == null || (startTime3 = flexiBankCashierCouponItem.getStartTime()) == null) ? 0L : startTime3.longValue()) >= System.currentTimeMillis() && flexiBankCashierCouponItem != null) {
                flexiBankCashierCouponItem.r();
            }
        }
        if (((flexiBankCashierCouponItem == null || (startTime2 = flexiBankCashierCouponItem.getStartTime()) == null) ? 0L : startTime2.longValue()) >= System.currentTimeMillis()) {
            Resources resources = getContext().getResources();
            int i11 = r.fb_valid_from_to;
            long jLongValue = (flexiBankCashierCouponItem == null || (startTime = flexiBankCashierCouponItem.getStartTime()) == null) ? 0L : startTime.longValue();
            j6 = 0;
            Locale locale = Locale.ENGLISH;
            String strMillis2String = TimeUtils.millis2String(jLongValue, new SimpleDateFormat("MMM dd, yyyy", locale));
            Intrinsics.checkNotNullExpressionValue(strMillis2String, "millis2String(...)");
            String strMillis2String2 = TimeUtils.millis2String((flexiBankCashierCouponItem == null || (endTime2 = flexiBankCashierCouponItem.getEndTime()) == null) ? 0L : endTime2.longValue(), new SimpleDateFormat("MMM dd, yyyy", locale));
            Intrinsics.checkNotNullExpressionValue(strMillis2String2, "millis2String(...)");
            String string2 = resources.getString(i11, strMillis2String, strMillis2String2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            string = new SpanUtils().append(string2).setForegroundColor(getContext().getColor(m.fb_text_color_purple)).create();
            Intrinsics.e(string);
        } else {
            j6 = 0;
            Resources resources2 = getContext().getResources();
            int i12 = r.fb_valid_until;
            String strMillis2String3 = TimeUtils.millis2String((flexiBankCashierCouponItem == null || (endTime = flexiBankCashierCouponItem.getEndTime()) == null) ? 0L : endTime.longValue(), new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH));
            Intrinsics.checkNotNullExpressionValue(strMillis2String3, "millis2String(...)");
            string = resources2.getString(i12, strMillis2String3);
            Intrinsics.e(string);
        }
        viewHolder.f21952e.setText(string);
        long jLongValue2 = (flexiBankCashierCouponItem == null || (limitAmt2 = flexiBankCashierCouponItem.getLimitAmt()) == null) ? j6 : limitAmt2.longValue();
        TextView textView3 = viewHolder.f21951d;
        if (jLongValue2 > j6) {
            textView3.setVisibility(0);
            textView3.setText(getContext().getString(r.fb_over_amount_available, p118hf.a.t((flexiBankCashierCouponItem == null || (limitAmt = flexiBankCashierCouponItem.getLimitAmt()) == null) ? j6 : limitAmt.longValue(), true)));
            i7 = 8;
        } else {
            i7 = 8;
            textView3.setVisibility(8);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getCouponDesc() : null);
        ImageView imageView3 = viewHolder.f21954g;
        TextView textView4 = viewHolder.f21953f;
        if (zIsEmpty2) {
            imageView3.setVisibility(i7);
            textView4.setVisibility(i7);
            linearLayout2.setVisibility(i7);
            linearLayout.setVisibility(i7);
        } else {
            linearLayout2.setVisibility(0);
            imageView3.setVisibility(0);
            if (flexiBankCashierCouponItem != null ? Intrinsics.c(flexiBankCashierCouponItem.getLayoutExpand(), Boolean.TRUE) : false) {
                linearLayout.setVisibility(0);
                imageView3.setImageResource(o.fb_arrow_up);
                textView4.setVisibility(0);
                textView4.setText(flexiBankCashierCouponItem.getCouponDesc());
                i7 = 8;
            } else {
                imageView3.setImageResource(o.fb_arrow_down);
                i7 = 8;
                textView4.setVisibility(8);
                linearLayout.setVisibility(8);
            }
        }
        TextView textView5 = viewHolder.f21960w;
        textView5.setVisibility(i7);
        boolean zBooleanValue = (flexiBankCashierCouponItem == null || (available = flexiBankCashierCouponItem.getAvailable()) == null) ? false : available.booleanValue();
        TextView textView6 = viewHolder.f21949b;
        LinearLayout linearLayout3 = viewHolder.f21958p;
        a aVar = viewHolder.f21947A;
        if (zBooleanValue) {
            viewHolder.f21957o.setBackground(aVar.getContext().getDrawable(o.fb_coupon_frame_left));
            linearLayout3.setBackground(aVar.getContext().getDrawable(o.fb_coupon_frame_right));
            textView6.setTextColor(aVar.getContext().getColor(m.fb_text_color_purple));
            textView2.setTextColor(aVar.getContext().getColor(m.fb_text_color_black1));
            textView3.setTextColor(aVar.getContext().getColor(m.fb_text_color_gray2));
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(o.fb_coupon_uncheck);
            imageView.setImageResource(o.fb_default_palmpay_icon_gray);
            linearLayout3.setBackground(aVar.getContext().getDrawable(o.fb_coupon_right_gray));
            textView6.setTextColor(aVar.getContext().getColor(m.fb_text_color_gray2));
            textView2.setTextColor(aVar.getContext().getColor(m.fb_text_color_gray2));
            textView3.setTextColor(aVar.getContext().getColor(m.fb_text_color_gray3));
            linearLayout2.setVisibility(8);
            textView4.setVisibility(8);
        }
        if (flexiBankCashierCouponItem != null ? Intrinsics.c(flexiBankCashierCouponItem.getAvailable(), Boolean.TRUE) : false) {
            return;
        }
        if (TextUtils.isEmpty(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getUnavailableReason() : null)) {
            return;
        }
        textView5.setText(flexiBankCashierCouponItem != null ? flexiBankCashierCouponItem.getUnavailableReason() : null);
        textView5.setVisibility(0);
        linearLayout2.setVisibility(8);
        textView4.setVisibility(8);
        linearLayout.setVisibility(0);
    }
}
