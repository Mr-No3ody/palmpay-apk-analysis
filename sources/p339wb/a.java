package p339wb;

import Ya.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f43353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f43354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f43359g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f43360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f43361j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f43361j = bVar;
        this.f43353a = (RelativeLayout) itemView.findViewById(e.rl_container);
        this.f43354b = (ImageView) itemView.findViewById(e.icon);
        this.f43355c = (TextView) itemView.findViewById(e.text1);
        this.f43356d = (TextView) itemView.findViewById(e.text2);
        this.f43357e = (TextView) itemView.findViewById(e.textPerDay);
        this.f43358f = (TextView) itemView.findViewById(e.text3);
        this.f43359g = (TextView) itemView.findViewById(e.text4);
        this.f43360i = (TextView) itemView.findViewById(e.gobtn);
    }
}
