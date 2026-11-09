package p052da;

import Ad.V;
import L9.b;
import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CommentImgItem;
import com.transsnet.palmpay.core.ui.activity.CoreCommentActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoreCommentActivity f35675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoreCommentActivity f35676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f35677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35679e;

    public D(CoreCommentActivity context, CoreCommentActivity listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35675a = context;
        this.f35676b = listener;
        this.f35677c = new ArrayList();
        this.f35678d = 1;
        this.f35679e = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return i7 < this.f35677c.size() ? this.f35678d : this.f35679e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(i7) != this.f35678d) {
            ((B) holder).f35672a.setOnClickListener(new ViewOnClickListenerC1649v(this, 1));
            return;
        }
        C c6 = (C) holder;
        ArrayList arrayList = this.f35677c;
        String string = ((CommentImgItem) arrayList.get(i7)).uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() == 0) {
            r0.l1(((CommentImgItem) arrayList.get(i7)).url, c6.f35673a);
        } else {
            r0.l1(string, c6.f35673a);
        }
        c6.f35674b.setOnClickListener(new V(this, i7, 7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i10 = this.f35678d;
        CoreCommentActivity coreCommentActivity = this.f35675a;
        if (i7 == i10) {
            View viewInflate = LayoutInflater.from(coreCommentActivity).inflate(b.core_grab_share_img, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new C(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(coreCommentActivity).inflate(b.core_grab_share_empty, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new B(viewInflate2);
    }
}
