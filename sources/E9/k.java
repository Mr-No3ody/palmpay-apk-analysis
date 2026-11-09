package E9;

import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Kb.h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(p366y9.c.ci_recharge_amount_item, parent, false);
        Intrinsics.e(viewInflate);
        return new j(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((j) holder).f2261a.setText(BaseApplication.getCurrencySymbol() + r0.E(((Number) this.f4992b.get(i7)).longValue()));
        View view = holder.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (ScreenUtils.getScreenWidth() - DensityUtil.dp2px(56.0f)) / 4;
        view.setLayoutParams(layoutParams);
    }
}
