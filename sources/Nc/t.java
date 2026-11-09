package Nc;

import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends AbstractC0482a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f6352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f6353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f6354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f6355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f6356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f6356f = uVar;
        View viewFindViewById = itemView.findViewById(Jc.c.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f6352b = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Jc.c.tvName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f6353c = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Jc.c.ivChecked);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f6354d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Jc.c.tvContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f6355e = (TextView) viewFindViewById4;
    }

    @Override // Nc.AbstractC0482a
    public final void b(Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (Intrinsics.c(str, "selected")) {
                Object obj = bundle.get(str);
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
                this.f6354d.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
            }
        }
    }

    @Override // Nc.AbstractC0482a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(PayoutOption payoutOption, int i7) {
        super.a(i7, payoutOption);
        if (payoutOption != null) {
            r0.l1(payoutOption.getIcon(), this.f6352b);
            this.f6353c.setText(payoutOption.getName());
            TextView textView = this.f6355e;
            textView.setVisibility(8);
            String content = payoutOption.getContent();
            if (content != null && content.length() > 0) {
                textView.setVisibility(0);
                textView.setText(content);
            }
            u uVar = this.f6356f;
            if (uVar.f6359c == -1 && payoutOption.getSelected()) {
                uVar.f6359c = i7;
            }
            this.f6354d.setVisibility(uVar.f6359c == i7 ? 0 : 8);
        }
    }
}
