package p351xb;

import Hb.C0313o;
import Pa.r0;
import S6.a;
import Ya.g;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.greenrobot.eventbus.f;
import p025ba.d;
import p294tb.W;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f43773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f43774e;

    public h(Context context, List data, int i7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f43770a = context;
        this.f43771b = data;
        this.f43772c = i7;
    }

    public static void a(IconicsImageView iconicsImageView, boolean z3) {
        Context context = iconicsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, z3 ? a.pay_ArrowUp : a.pay_Arrowdown);
        iconicsDrawable.a(new C0313o(iconicsImageView, 3));
        iconicsImageView.setIcon(iconicsDrawable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f43771b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        g holder = (g) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        CLBorrowCouponData cLBorrowCouponData = (CLBorrowCouponData) this.f43771b.get(holder.getBindingAdapterPosition());
        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
        LinearLayout linearLayout = holder.f43768j;
        linearLayout.setVisibility(8);
        Integer discountType = cLBorrowCouponData.getDiscountType();
        TextView textView = holder.f43760a;
        if (discountType != null && discountType.intValue() == 1) {
            SpanUtils spanUtils = new SpanUtils();
            Integer couponDiscountInfo = cLBorrowCouponData.getCouponDiscountInfo();
            textView.setText(spanUtils.append(String.valueOf(couponDiscountInfo != null ? couponDiscountInfo.intValue() : 0)).append("Days Free").setFontSize(SizeUtils.sp2px(14.0f)).create());
        } else if (discountType != null && discountType.intValue() == 2) {
            SpanUtils spanUtils2 = new SpanUtils();
            Integer couponDiscountInfo2 = cLBorrowCouponData.getCouponDiscountInfo();
            String str = decimalFormat.format(Float.valueOf((couponDiscountInfo2 != null ? couponDiscountInfo2.intValue() : 0) / 100.0f));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(spanUtils2.append(y.k(str, ".00", "")).append(" Off").setFontSize(SizeUtils.sp2px(14.0f)).create());
        }
        holder.f43761b.setText(cLBorrowCouponData.getCouponName());
        holder.f43762c.setText(cLBorrowCouponData.getCouponSubhead());
        holder.f43764e.setText(this.f43770a.getString(g.cs_cl_coupon_valid_date, r0.X1(cLBorrowCouponData.getEndTime(), "MMM dd, yyyy")));
        int i10 = this.f43772c;
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        ImageView imageView = holder.f43763d;
        if (i10 == bindingAdapterPosition) {
            this.f43773d = imageView;
            imageView.setImageResource(d.core_coupon_checked);
        } else {
            imageView.setImageResource(d.core_coupon_uncheck_black);
        }
        boolean zIsEmpty = TextUtils.isEmpty(cLBorrowCouponData.getCouponDesc());
        TextView textView2 = holder.f43769o;
        LinearLayout linearLayout2 = holder.f43766g;
        if (zIsEmpty) {
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(8);
            textView2.setText("");
        } else {
            linearLayout2.setVisibility(0);
            textView2.setText(cLBorrowCouponData.getCouponDesc());
            boolean zC = Intrinsics.c(cLBorrowCouponData.getExpend(), Boolean.TRUE);
            IconicsImageView iconicsImageView = holder.f43765f;
            if (zC) {
                linearLayout.setVisibility(0);
                a(iconicsImageView, true);
            } else {
                a(iconicsImageView, false);
                linearLayout.setVisibility(8);
            }
        }
        r0.h1(holder.f43767i, cLBorrowCouponData.getCouponIcon(), r.cv_coupon_icon);
        p220oa.h.l(new W(cLBorrowCouponData, this, holder), linearLayout2);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        p220oa.h.l(new W(14, this, holder), itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f43770a).inflate(Ya.f.cs_cl_bw_coupon_item, parent, false);
        Intrinsics.e(viewInflate);
        return new g(viewInflate);
    }
}
