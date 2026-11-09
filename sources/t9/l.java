package t9;

import Pa.r0;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.z;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.betting.bean.BettingGameItem;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;
import p270rd.C1976t;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f42367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f42368b;

    public l() {
        super(Pd.d.qt_item_quick_betting_game, null);
        this.f42367a = C2131j.b(new C1976t(14));
        this.f42368b = C2131j.b(new p068ec.d(this, 18));
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BettingGameItem item = (BettingGameItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getView(Pd.c.ivGameIcon);
        String gameImg = item.getGameImg();
        if (gameImg == null) {
            gameImg = "";
        }
        r0.j1(imageView, gameImg, (G1.d) ((G1.d) new G1.d().y((Drawable) this.f42368b.getValue())).H(new z(CommonViewExtKt.getDp(8))));
    }

    @Override // M1.j
    public final BaseViewHolder createBaseViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new RecyclerView.LayoutParams(-2, CommonViewExtKt.getDp(80));
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = ((Number) this.f42367a.getValue()).intValue();
        view.setLayoutParams(layoutParams2);
        return super.createBaseViewHolder(view);
    }
}
