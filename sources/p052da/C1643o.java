package p052da;

import C0.G;
import Hb.C0313o;
import Kb.c;
import L6.b;
import Pa.r0;
import S6.a;
import android.content.Context;
import android.content.res.Resources;
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
import com.transsnet.palmpay.core.bean.cashier.CashierCouponItem;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p025ba.d;
import p025ba.g;
import p025ba.k;

/* JADX INFO: renamed from: da.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1643o extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35800g;

    static {
        new C1641m(null);
        new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    }

    public static void c(IconicsImageView iconicsImageView, boolean z3) {
        Context context = iconicsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, z3 ? a.pay_ArrowUp : a.pay_Arrowdown);
        iconicsDrawable.a(new C0313o(iconicsImageView, 2));
        iconicsImageView.setIcon(iconicsDrawable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        long j6;
        CharSequence string;
        int i10;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i7 < this.f4985b.size()) {
            Object obj = this.f4985b.get(i7);
            Intrinsics.e(obj);
            CashierCouponItem cashierCouponItem = (CashierCouponItem) obj;
            C1642n c1642n = (C1642n) holder;
            c1642n.f35784B.setVisibility(8);
            boolean zEquals = "DAYS".equals(cashierCouponItem.couponType);
            TextView textView = c1642n.t;
            if (zEquals) {
                SpanUtils spanUtils = new SpanUtils();
                Integer num = cashierCouponItem.preferentialDays;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(num);
                textView.setText(spanUtils.append(sb2.toString()).append("Days Free").setFontSize(SizeUtils.sp2px(14.0f)).create());
            } else if ("DISCOUNT".equals(cashierCouponItem.couponType)) {
                SpanUtils spanUtils2 = new SpanUtils();
                Integer num2 = cashierCouponItem.discountRate;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(num2);
                textView.setText(spanUtils2.append(sb3.toString()).append("% Off").setFontSize(SizeUtils.sp2px(14.0f)).create());
            } else {
                SpanUtils fontSize = G.i("₦").setFontSize(SizeUtils.sp2px(14.0f));
                Long l5 = cashierCouponItem.nominaValue;
                String strA = r0.A(l5 != null ? l5.longValue() : 0L);
                Intrinsics.checkNotNullExpressionValue(strA, "getAmountString(...)");
                textView.setText(fontSize.append(y.k(strA, ".00", "")).setFontSize(SizeUtils.sp2px(24.0f)).create());
            }
            String str = cashierCouponItem.couponName;
            TextView textView2 = c1642n.f35790f;
            textView2.setText(str);
            boolean zIsEmpty = TextUtils.isEmpty(cashierCouponItem.couponIcon);
            ImageView imageView = c1642n.f35788d;
            if (zIsEmpty) {
                imageView.setImageResource(r.cv_coupon_icon);
            } else {
                r0.h1(imageView, cashierCouponItem.couponIcon, r.cv_coupon_icon);
            }
            ImageView imageView2 = c1642n.f35795p;
            imageView2.setVisibility(0);
            boolean z3 = this.f35798e;
            LinearLayout linearLayout = c1642n.f35783A;
            if (z3) {
                imageView2.setImageResource(this.f35800g == i7 ? d.core_coupon_checked : d.core_coupon_uncheck_black);
                linearLayout.setVisibility(0);
                textView.setVisibility(0);
                Long l6 = cashierCouponItem.startTime;
                if ((l6 != null ? l6.longValue() : 0L) >= System.currentTimeMillis()) {
                    cashierCouponItem.available = Boolean.FALSE;
                }
            }
            Long l8 = cashierCouponItem.startTime;
            long jLongValue = l8 != null ? l8.longValue() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Context context = this.f4984a;
            if (jLongValue >= jCurrentTimeMillis) {
                Resources resources = context.getResources();
                int i11 = k.core_valid_from_to;
                Long l10 = cashierCouponItem.startTime;
                String strS = r0.S(l10 != null ? l10.longValue() : 0L);
                j6 = 0;
                Long l11 = cashierCouponItem.endTime;
                String string2 = resources.getString(i11, strS, r0.S(l11 != null ? l11.longValue() : 0L));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                string = new SpanUtils().append(string2).setForegroundColor(context.getColor(b.ppColorPrimary)).create();
                Intrinsics.e(string);
            } else {
                j6 = 0;
                Resources resources2 = context.getResources();
                int i12 = k.core_valid_until;
                Long l12 = cashierCouponItem.endTime;
                string = resources2.getString(i12, r0.S(l12 != null ? l12.longValue() : 0L));
                Intrinsics.e(string);
            }
            c1642n.f35792i.setText(string);
            Long l13 = cashierCouponItem.limitAmt;
            long jLongValue2 = l13 != null ? l13.longValue() : j6;
            TextView textView3 = c1642n.f35791g;
            if (jLongValue2 > j6) {
                textView3.setVisibility(0);
                int i13 = k.core_over_amount_available;
                Long l14 = cashierCouponItem.limitAmt;
                textView3.setText(context.getString(i13, r0.B(l14 != null ? l14.longValue() : j6, true)));
            } else {
                textView3.setVisibility(8);
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(cashierCouponItem.couponDesc);
            LinearLayout linearLayout2 = c1642n.f35784B;
            IconicsImageView iconicsImageView = c1642n.f35794o;
            TextView textView4 = c1642n.f35793j;
            if (zIsEmpty2) {
                iconicsImageView.setVisibility(8);
                textView4.setVisibility(8);
                linearLayout.setVisibility(8);
                linearLayout2.setVisibility(8);
                i10 = 8;
            } else {
                linearLayout.setVisibility(0);
                iconicsImageView.setVisibility(0);
                if (Intrinsics.c(cashierCouponItem.layoutExpand, Boolean.TRUE)) {
                    linearLayout2.setVisibility(0);
                    c(iconicsImageView, true);
                    textView4.setVisibility(0);
                    textView4.setText(cashierCouponItem.couponDesc);
                    i10 = 8;
                } else {
                    c(iconicsImageView, false);
                    i10 = 8;
                    textView4.setVisibility(8);
                    linearLayout2.setVisibility(8);
                }
            }
            TextView textView5 = c1642n.f35786H;
            textView5.setVisibility(i10);
            Boolean bool = cashierCouponItem.available;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            C1643o c1643o = c1642n.f35787L;
            TextView textView6 = c1642n.f35789e;
            ConstraintLayout constraintLayout = c1642n.f35785C;
            LinearLayout linearLayout3 = c1642n.f35797w;
            RelativeLayout relativeLayout = c1642n.f35796v;
            if (zBooleanValue) {
                imageView.setAlpha(1.0f);
                textView.setAlpha(1.0f);
                relativeLayout.setBackground(c1643o.f4984a.getDrawable(d.core_coupon_frame_left));
                int i14 = d.core_coupon_frame_right;
                Context context2 = c1643o.f4984a;
                linearLayout3.setBackground(context2.getDrawable(i14));
                constraintLayout.setBackground(context2.getDrawable(r.cv_shape_rect_corner_12_bg_secondary));
                textView6.setTextColor(context2.getColor(b.ppColorPrimary));
                textView2.setTextColor(context2.getColor(b.ppColorTextPrimary));
                textView3.setTextColor(context2.getColor(b.ppColorTextNormal));
            } else {
                imageView.setAlpha(0.5f);
                if (c1643o.f35799f) {
                    textView.setAlpha(0.2f);
                } else {
                    textView.setAlpha(1.0f);
                }
                imageView2.setVisibility(0);
                imageView2.setImageResource(d.core_coupon_uncheck_disable);
                int i15 = d.core_coupon_left_gray;
                Context context3 = c1643o.f4984a;
                relativeLayout.setBackground(context3.getDrawable(i15));
                linearLayout3.setBackground(context3.getDrawable(d.core_coupon_right_gray));
                constraintLayout.setBackground(context3.getDrawable(r.cv_shape_rect_corner_12_bg_dark));
                textView6.setTextColor(context3.getColor(b.ppColorTextNormal));
                textView2.setTextColor(context3.getColor(b.ppColorTextDisable));
                textView3.setTextColor(context3.getColor(b.ppColorTextDisable));
                linearLayout.setVisibility(8);
                textView4.setVisibility(8);
            }
            if (Intrinsics.c(cashierCouponItem.available, Boolean.TRUE) || TextUtils.isEmpty(cashierCouponItem.unavailableReason)) {
                return;
            }
            textView5.setText(cashierCouponItem.unavailableReason);
            textView5.setVisibility(0);
            linearLayout.setVisibility(8);
            textView4.setVisibility(8);
            linearLayout2.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = View.inflate(this.f4984a, g.core_item_coupon_in_list, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new C1642n(this, viewInflate);
    }
}
