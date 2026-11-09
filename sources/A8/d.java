package A8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f85d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f86a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f87b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f88c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, View view) {
        super(view);
        this.f88c = eVar;
        this.f86a = (ImageView) view.findViewById(p349x8.a.mtn_logo);
        this.f87b = (TextView) view.findViewById(p349x8.a.mtn_name);
    }
}
