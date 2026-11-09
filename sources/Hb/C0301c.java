package Hb;

import Pa.r0;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.credit.bean.ExtraInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0301c extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0302d f3819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f3820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProductContentInfo f3821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301c(int i7, C0302d c0302d, BaseViewHolder baseViewHolder, ProductContentInfo productContentInfo, ArrayList arrayList) {
        super(i7, arrayList);
        this.f3819a = c0302d;
        this.f3820b = baseViewHolder;
        this.f3821c = productContentInfo;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        TextView textView;
        String str;
        TitleFont titleFont;
        Float f10;
        ExtraInfo item1 = (ExtraInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item1, "item1");
        r0.l1(((BaseActivity) this.f3819a.c()).isDarkMode() ? item1.iconDark : item1.icon, (ImageView) holder.getView(Ya.e.ivInfoItemIcon));
        holder.setText(Ya.e.tvInfoItemTitle, item1.title);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = this.f3820b.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        ProductThemeInfo productThemeInfoC = ((Gb.O) bindingAdapter).f3254b.c(this.f3821c.style);
        if (productThemeInfoC == null || (textView = (TextView) holder.getView(Ya.e.tvInfoItemTitle)) == null) {
            return;
        }
        ProductThemeInfoText productThemeInfoText = productThemeInfoC.text;
        if (productThemeInfoText != null && (titleFont = productThemeInfoText.extraTitleFont) != null && (f10 = titleFont.fontSize) != null) {
            textView.setTextSize(1, f10.floatValue());
        }
        ProductThemeInfoText productThemeInfoText2 = productThemeInfoC.text;
        if (productThemeInfoText2 == null || (str = productThemeInfoText2.extraTitleColor) == null) {
            return;
        }
        textView.setTextColor(CommonViewExtKt.hexToColorInt(str, getContext(), L6.b.ppColorTextPrimary));
    }
}
