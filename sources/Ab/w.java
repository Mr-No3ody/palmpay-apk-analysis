package Ab;

import Pa.r0;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f147a;

    public w(ArrayList banners) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        this.f147a = banners;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f147a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        v holder = (v) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        r0.r1((String) this.f147a.get(i7), holder.f146a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AppCompatImageView appCompatImageView = new AppCompatImageView(parent.getContext());
        appCompatImageView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView.setAdjustViewBounds(true);
        return new v(appCompatImageView);
    }
}
