package p132ie;

import Ac.e;
import S6.a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.ui.activity.bankcard.BankAccountDetailActivity;
import com.transsnet.palmpay.ui.activity.bankcard.BankCardDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p010a9.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f37578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f37579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f37580c;

    public b(View mItemView, a icon, int i7, BankAccountDetailActivity bankAccountDetailActivity) {
        Intrinsics.checkNotNullParameter(mItemView, "mItemView");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f37579b = mItemView;
        View viewFindViewById = mItemView.findViewById(e.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = mItemView.findViewById(e.tvText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f37578a = textView;
        View viewFindViewById3 = mItemView.findViewById(e.viewLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f37580c = viewFindViewById3;
        mItemView.setOnClickListener(bankAccountDetailActivity);
        Context context = mItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, icon);
        iconicsDrawable.a(new m(this, 28));
        ((ImageView) viewFindViewById).setImageDrawable(iconicsDrawable);
        textView.setText(i7);
    }

    public b(View view, a aVar, int i7, BankCardDetailActivity bankCardDetailActivity) {
        this.f37579b = view;
        ImageView imageView = (ImageView) view.findViewById(e.ivIcon);
        TextView textView = (TextView) view.findViewById(e.tvText);
        this.f37578a = textView;
        this.f37580c = view.findViewById(e.viewLine);
        view.setOnClickListener(bankCardDetailActivity);
        imageView.setImageDrawable(p059e1.a.h(view.getContext(), aVar, null, 20, view.getContext().getColor(L6.b.ppColorTextPrimary)));
        textView.setText(i7);
    }
}
