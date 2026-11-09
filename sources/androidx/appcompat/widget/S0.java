package androidx.appcompat.widget;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f12750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f12751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f12752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f12753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f12754e;

    public S0(View view) {
        this.f12750a = (TextView) view.findViewById(R.id.text1);
        this.f12751b = (TextView) view.findViewById(R.id.text2);
        this.f12752c = (ImageView) view.findViewById(R.id.icon1);
        this.f12753d = (ImageView) view.findViewById(R.id.icon2);
        this.f12754e = (ImageView) view.findViewById(p241q.f.edit_query);
    }
}
