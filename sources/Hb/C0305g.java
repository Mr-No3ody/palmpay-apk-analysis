package Hb;

import Pa.r0;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.credit.bean.ExtraInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0305g extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f3827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProductContentInfo f3828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0305g(boolean z3, BaseViewHolder baseViewHolder, ProductContentInfo productContentInfo, int i7, ArrayList arrayList) {
        super(i7, arrayList);
        this.f3826a = z3;
        this.f3827b = baseViewHolder;
        this.f3828c = productContentInfo;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder helper, Object obj) {
        String str;
        TitleFont titleFont;
        Float f10;
        String str2;
        TitleFont titleFont2;
        Float f11;
        ExtraInfo item2 = (ExtraInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item2, "item2");
        r0.l1(this.f3826a ? item2.iconDark : item2.icon, (ImageView) helper.getView(Ya.e.ivIcon));
        helper.setText(Ya.e.tvMiddle, item2.title);
        helper.setText(Ya.e.tvBottom, item2.subTitle);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = this.f3827b.getBindingAdapter();
        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
        ProductThemeInfo productThemeInfoC = ((Gb.O) bindingAdapter).f3254b.c(this.f3828c.style);
        if (productThemeInfoC != null) {
            TextView textView = (TextView) helper.getView(Ya.e.tvMiddle);
            if (textView != null) {
                ProductThemeInfoText productThemeInfoText = productThemeInfoC.text;
                if (productThemeInfoText != null && (titleFont2 = productThemeInfoText.extraTitleFont) != null && (f11 = titleFont2.fontSize) != null) {
                    textView.setTextSize(1, f11.floatValue());
                }
                ProductThemeInfoText productThemeInfoText2 = productThemeInfoC.text;
                if (productThemeInfoText2 != null && (str2 = productThemeInfoText2.extraTitleColor) != null) {
                    textView.setTextColor(CommonViewExtKt.hexToColorInt(str2, getContext(), L6.b.ppColorTextPrimary));
                }
            }
            TextView textView2 = (TextView) helper.getView(Ya.e.tvBottom);
            if (textView2 != null) {
                ProductThemeInfoText productThemeInfoText3 = productThemeInfoC.text;
                if (productThemeInfoText3 != null && (titleFont = productThemeInfoText3.extraSubTitleFont) != null && (f10 = titleFont.fontSize) != null) {
                    textView2.setTextSize(1, f10.floatValue());
                }
                ProductThemeInfoText productThemeInfoText4 = productThemeInfoC.text;
                if (productThemeInfoText4 == null || (str = productThemeInfoText4.extraSubTitleColor) == null) {
                    return;
                }
                textView2.setTextColor(CommonViewExtKt.hexToColorInt(str, getContext(), L6.b.ppColorTextPrimary));
            }
        }
    }
}
