package p368yb;

import Gd.e;
import Pa.r0;
import Ya.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.credit.bean.resp.OcFinanceMenuData;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnRvItemClickListener f44156c;

    public B(Context context, ArrayList data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44154a = context;
        this.f44155b = data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44155b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        A a3 = (A) holder;
        OcFinanceMenuData ocFinanceMenuData = (OcFinanceMenuData) this.f44155b.get(i7);
        if (ocFinanceMenuData != null) {
            ImageView imageView = a3.f44152a;
            Context context = this.f44154a;
            Intrinsics.f(context, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
            r0.l1(((BaseActivity) context).isDarkMode() ? ocFinanceMenuData.getIconDark() : ocFinanceMenuData.getIcon(), imageView);
            a3.f44153b.setText(ocFinanceMenuData.getTitle());
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            h.l(new e(this, holder, i7, 5), itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f44154a).inflate(f.cs_finance_menu_item, parent, false);
        Intrinsics.e(viewInflate);
        return new A(viewInflate);
    }
}
