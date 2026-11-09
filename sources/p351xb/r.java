package p351xb;

import Ya.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.other.CLNoPermissionBean;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43807b;

    public r(Context mContext, ArrayList mData) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mData, "mData");
        this.f43806a = mContext;
        this.f43807b = mData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f43807b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        q holder = (q) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f43807b.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        CLNoPermissionBean cLNoPermissionBean = (CLNoPermissionBean) obj;
        holder.f43805a.setCompoundDrawablesWithIntrinsicBounds(cLNoPermissionBean.getPermissionIcon(), (Drawable) null, (Drawable) null, (Drawable) null);
        holder.f43805a.setText(cLNoPermissionBean.getPermissionContent());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f43806a).inflate(f.cs_cl_no_permisson_dialog_item, parent, false);
        Intrinsics.e(viewInflate);
        return new q(viewInflate);
    }
}
