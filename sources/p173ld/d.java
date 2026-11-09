package p173ld;

import C0.G;
import Ea.a;
import Kb.c;
import Pa.r0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.i;
import com.transsnet.palmpay.core.bean.MerchantLogo;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import p052da.ViewOnClickListenerC1649v;
import p159kd.b;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MoneyTransferHistoryFragment f39330e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        Object obj = this.f4985b.get(i7);
        Intrinsics.e(obj);
        return ((TransHistoryRsp.DataBean.ListBean) obj).itemType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        String str;
        int color;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f4985b.get(i7);
        Intrinsics.e(obj);
        TransHistoryRsp.DataBean.ListBean bean = (TransHistoryRsp.DataBean.ListBean) obj;
        if (bean.itemType == 1) {
            C1895b c1895b = (C1895b) holder;
            c1895b.getClass();
            Intrinsics.checkNotNullParameter(bean, "bean");
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(bean.updateTime);
            int i12 = calendar.get(2);
            int i13 = i12 + 1;
            int i14 = calendar.get(1);
            d dVar = c1895b.f39321g;
            if (i13 > 0) {
                int iN0 = r0.N0(System.currentTimeMillis());
                TextView textView = c1895b.f39318d;
                if (iN0 == i14) {
                    textView.setText(r0.i0(i12));
                } else {
                    textView.setText(r0.i0(i12) + " " + i14);
                }
                textView.setOnClickListener(new ViewOnClickListenerC1649v(dVar, 28));
            }
            long j6 = bean.inComeAmount;
            long j10 = bean.payOutAmount;
            TextView textView2 = c1895b.f39319e;
            textView2.setVisibility(0);
            TextView textView3 = c1895b.f39320f;
            textView3.setVisibility(0);
            int i15 = dVar.f39330e.f33672C;
            if (i15 == 1) {
                textView2.setVisibility(8);
            } else if (i15 == 2) {
                textView3.setVisibility(8);
            }
            textView3.setText(G.i("In  ").setForegroundColor(b.sm_color_858a8f).append(r0.B(j6, false)).create());
            textView2.setText(new SpanUtils().append("Out  ").setForegroundColor(b.sm_color_858a8f).append(r0.B(Math.abs(j10), false)).create());
            return;
        }
        c cVar = (c) holder;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(bean, "bean");
        boolean zEquals = TransType.TRANS_TYPE_BULK_DISBURSEMENT.equals(bean.transType);
        ImageView imageView = cVar.f39322d;
        if ((zEquals || TransType.TRANS_TYPE_MERCHANT_DISBURSEMENT.equals(bean.transType) || TransType.TRANS_TYPE_AIRTIME_DISBURSEMENT.equals(bean.transType)) && !TextUtils.isEmpty(bean.merchantNo)) {
            com.bumptech.glide.b.f(imageView).load(new MerchantLogo(bean.merchantNo)).a(((G1.d) ((G1.d) new G1.d().I(new i(), true)).j(r.cv_default_merchat)).x(r.cv_default_merchat)).S(imageView);
        } else if (TextUtils.isEmpty(bean.companyIconUrl)) {
            String transType = bean.transType;
            Intrinsics.checkNotNullExpressionValue(transType, "transType");
            Uri uriC = a.c(transType, Integer.valueOf(bean.businessType), Integer.valueOf(bean.payerAccountType), Long.valueOf(bean.amount));
            String transType2 = bean.transType;
            Intrinsics.checkNotNullExpressionValue(transType2, "transType");
            int iB = a.b(bean.amount, transType2, bean.businessType, bean.payerAccountType);
            r0.g1(imageView, uriC, (G1.d) G1.d.O(iB).j(iB));
        } else {
            String str2 = bean.companyIconUrl;
            if (str2 == null) {
                str2 = "";
            }
            String transType3 = bean.transType;
            Intrinsics.checkNotNullExpressionValue(transType3, "transType");
            r0.u1(imageView, str2, a.b(bean.amount, transType3, bean.businessType, bean.payerAccountType));
        }
        long j11 = bean.amount;
        d dVar2 = cVar.f39329p;
        TextView textView4 = cVar.f39323e;
        if (j11 > 0) {
            textView4.setTextColor(dVar2.f4984a.getColor(L6.b.ppColorTextPrimary));
            G.x("+", r0.A(j11), textView4);
        } else {
            textView4.setTextColor(dVar2.f4984a.getColor(L6.b.ppColorTextPrimary));
            textView4.setText(r0.A(j11));
        }
        String str3 = bean.orderStatus;
        if ("Pending".equalsIgnoreCase(str3)) {
            str3 = "Processing";
        } else if ("Failed".equalsIgnoreCase(str3) || "Cancelled".equalsIgnoreCase(str3) || "Expired".equalsIgnoreCase(str3) || "Closed".equalsIgnoreCase(str3) || "Pending".equalsIgnoreCase(str3) || "Processing".equalsIgnoreCase(str3)) {
            textView4.setTextColor(dVar2.f4984a.getColor(L6.b.ppColorTextPrimary));
        }
        cVar.f39325g.setText(bean.transTypeDesc);
        long j12 = bean.updateTime;
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", locale);
        Date date = new Date(j12);
        if (TimeUtils.isToday(j12)) {
            str = simpleDateFormat.format(date);
        } else if (TimeUtils.isYesterday(j12)) {
            str = "Yesterday " + simpleDateFormat.format(date);
        } else {
            str = new SimpleDateFormat("MMM dd, yyyy, HH:mm", locale).format(date);
        }
        cVar.f39326i.setText(str);
        if ("Waiting to receive".equalsIgnoreCase(str3) || "Waiting to pay".equalsIgnoreCase(str3) || "Pending".equalsIgnoreCase(str3) || "Processing".equalsIgnoreCase(str3)) {
            color = dVar2.f4984a.getColor(L6.b.ppColorWarning);
        } else if ("Successful".equalsIgnoreCase(str3)) {
            color = -1;
        } else if ("Failed".equalsIgnoreCase(str3) || "Declined".equalsIgnoreCase(str3)) {
            color = dVar2.f4984a.getColor(L6.b.ppColorError);
        } else if ("Cancelled".equalsIgnoreCase(str3) || "Expired".equalsIgnoreCase(str3) || "Closed".equalsIgnoreCase(str3)) {
            color = dVar2.f4984a.getColor(L6.b.ppColorTextDisable);
        } else {
            color = "Refunded".equalsIgnoreCase(str3) ? dVar2.f4984a.getColor(L6.b.ppColorPrimary) : dVar2.f4984a.getColor(L6.b.ppColorTextPrimary);
        }
        TextView textView5 = cVar.f39324f;
        if (color == -1) {
            textView5.setText("");
        } else {
            textView5.setTextColor(color);
            textView5.setText(str3);
        }
        boolean zEquals2 = "04".equals(bean.transType);
        TextView textView6 = cVar.f39328o;
        if (zEquals2 && bean.businessType == 12) {
            i10 = 0;
            textView6.setVisibility(0);
            i11 = 8;
        } else {
            i10 = 0;
            i11 = 8;
            textView6.setVisibility(8);
        }
        if (TextUtils.isEmpty(textView5.getText().toString())) {
            i10 = i11;
        }
        textView5.setVisibility(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = this.f4984a;
        if (i7 == 1) {
            View viewInflate = LayoutInflater.from(context).inflate(f.sm_item_history_month, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new C1895b(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(f.sm_layout_trans_history_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new c(this, viewInflate2);
    }
}
