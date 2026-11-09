package p052da;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f35739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f35740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f35741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f35742d;

    public Y(View view) {
        super(view);
        this.f35739a = (ImageView) view.findViewById(e.ivItemIcon);
        this.f35740b = (TextView) view.findViewById(e.tvItemName);
        this.f35741c = (TextView) view.findViewById(e.tvItemValue);
        this.f35742d = (TextView) view.findViewById(e.tvItemCopy);
    }
}
