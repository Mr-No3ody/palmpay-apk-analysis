package W9;

import C9.V;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.SingleAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f10653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f10654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(A a3, View view) {
        super(view);
        this.f10654c = a3;
        SingleAdView singleAdView = (SingleAdView) view.findViewById(R9.d.adView);
        this.f10653b = singleAdView;
        this.f10652a = (TextView) view.findViewById(R9.d.new_contact_number);
        view.findViewById(R9.d.new_contact_view).setOnClickListener(new F5.b(5));
        view.findViewById(R9.d.add_contact_view).setOnClickListener(new W8.d(10));
        view.findViewById(R9.d.viewSearch).setOnClickListener(new V(this, 5, view.findViewById(R9.d.viewSearch), false));
        singleAdView.setAdListener(new com.chuanyi.ad.a(singleAdView, "ContactHeaderViewHolder"));
    }
}
