package Nc;

import C0.G;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends AbstractC0482a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f6362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f6363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f6364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f6365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f6366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A f6367g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A a3, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f6367g = a3;
        View viewFindViewById = itemView.findViewById(Jc.c.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f6362b = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Jc.c.tvTransactionName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f6363c = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Jc.c.tvTransactionTime);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f6364d = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Jc.c.tvTransactionStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f6365e = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(Jc.c.tvTransactionAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f6366f = (TextView) viewFindViewById5;
    }

    @Override // Nc.AbstractC0482a
    public final void a(int i7, Object obj) {
        ProductBean productBean = (ProductBean) obj;
        super.a(i7, productBean);
        if (productBean != null) {
            r0.h1(this.f6362b, productBean.getProductIcon(), com.transsnet.palmpay.custom_view.r.cv_fixed_saving);
            this.f6363c.setText(productBean.getShowName());
            this.f6364d.setText(TimeUtils.millis2String(productBean.getPayTime(), new SimpleDateFormat("hh:mm,dd MMM yyyy", Locale.ENGLISH)));
            A a3 = this.f6367g;
            String string = a3.f6303b == 1 ? this.itemView.getResources().getString(Jc.f.mm_transaction_completed) : this.itemView.getResources().getString(Jc.f.mm_total_payback);
            TextView textView = this.f6365e;
            textView.setText(string);
            int i10 = a3.f6303b;
            textView.setTextColor(i10 == 1 ? this.itemView.getContext().getColor(Jc.a.mm_color_38d79f) : this.itemView.getContext().getColor(Jc.a.mm_color_858a8f));
            this.f6366f.setText(i10 == 1 ? G.o("+", r0.A(productBean.getPrincipal())) : G.o("-", r0.A(productBean.getTotalPayback())));
        }
    }

    @Override // Nc.AbstractC0482a
    public final void b(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            if (Intrinsics.c(str, "plan_status")) {
                int i7 = bundle.getInt(str);
                String string = i7 == 1 ? this.itemView.getResources().getString(Jc.f.mm_transaction_completed) : this.itemView.getResources().getString(Jc.f.mm_total_payback);
                TextView textView = this.f6365e;
                textView.setText(string);
                textView.setTextColor(i7 == 1 ? this.itemView.getContext().getColor(Jc.a.mm_color_38d79f) : this.itemView.getContext().getColor(Jc.a.mm_color_858a8f));
            }
        }
    }
}
