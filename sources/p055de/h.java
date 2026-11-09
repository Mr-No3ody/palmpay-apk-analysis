package p055de;

import Pd.c;
import Pd.f;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p054dd.n;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f35917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35919c;

    public h(View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f35918b = "";
        this.f35919c = "";
        this.f35917a = itemView;
        itemView.findViewById(c.mls_ok).setOnClickListener(new n(1, this, itemView));
    }

    public final void a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f35919c = text;
        int i7 = c.mls_tv1;
        View view = this.f35917a;
        ((TextView) view.findViewById(i7)).setText(view.getContext().getString(f.qt_sorry_this_biller_s_is_currently, text));
    }
}
