package p052da;

import G8.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.v;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f35707f;

    public K(Context context, int i7) {
        String string = context.getString(v.cv_loading);
        String string2 = context.getString(v.cv_load_complete);
        String string3 = context.getString(v.cv_load_end);
        String string4 = (i7 & 16) != 0 ? context.getString(v.cv_load_fail) : "Pull up to load more";
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35704c = string;
        this.f35705d = string2;
        this.f35706e = string3;
        this.f35707f = string4;
    }

    @Override // G8.a
    public final View A(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.getView(e.tv_load_status);
        ((TextView) view).setText(this.f35706e);
        return view;
    }

    @Override // G8.a
    public final View B(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.getView(e.tv_load_status);
        ((TextView) view).setText(this.f35707f);
        return view;
    }

    @Override // G8.a
    public final View C(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.getView(e.load_more_loading_view);
        TextView textView = (TextView) view.findViewById(e.tv_loading);
        if (textView != null) {
            textView.setText(this.f35704c);
        }
        return view;
    }

    @Override // G8.a
    public final View D(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return a.y(parent, g.core_view_custom_loader_more);
    }

    @Override // G8.a
    public final View z(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.getView(e.tv_load_status);
        ((TextView) view).setText(this.f35705d);
        return view;
    }
}
