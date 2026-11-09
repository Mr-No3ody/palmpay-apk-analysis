package p328ve;

import Ac.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daimajia.swipe.SwipeLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f43189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f43191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwipeLayout f43192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f43193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f43194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, View view) {
        super(view);
        this.f43194f = oVar;
        View viewFindViewById = view.findViewById(e.viewContainer);
        this.f43193e = viewFindViewById;
        this.f43192d = (SwipeLayout) view.findViewById(e.swipe);
        this.f43189a = (ImageView) view.findViewById(e.imageViewIcon);
        this.f43190b = (TextView) view.findViewById(e.textViewLine1);
        View viewFindViewById2 = view.findViewById(e.viewDelete);
        this.f43191c = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new m(this, 0));
        viewFindViewById.setOnClickListener(new m(this, 1));
    }
}
