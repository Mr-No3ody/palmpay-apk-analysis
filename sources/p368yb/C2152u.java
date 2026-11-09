package p368yb;

import Ya.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackDetailActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2152u extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OcFeedbackDetailActivity f44263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44264b;

    public C2152u(OcFeedbackDetailActivity mContext, ArrayList mData) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mData, "mData");
        this.f44263a = mContext;
        this.f44264b = mData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44264b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        C2151t viewHolder2 = (C2151t) viewHolder;
        Intrinsics.checkNotNullParameter(viewHolder2, "viewHolder");
        ((m) b.e(this.f44263a).load((String) this.f44264b.get(i7)).c()).S(viewHolder2.f44262a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f44263a).inflate(f.cs_oc_feedback_img_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2151t(viewInflate);
    }
}
