package com.transsnet.palmpay.credit.bean;

import Eb.a;
import L6.b;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/OverdueArea;", "", "height", "", "bgColor", "", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "titleColor", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "button", "Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoButton;", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoButton;)V", "Ljava/lang/Float;", "applyTheme", "", "view", "Landroid/view/View;", "tv", "Landroid/widget/TextView;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OverdueArea {

    @JvmField
    @Nullable
    public final String bgColor;

    @JvmField
    @Nullable
    public final ProductThemeInfoButton button;

    @JvmField
    @Nullable
    public final CornerRadius cornerRadius;

    @JvmField
    @Nullable
    public final Float height;

    @JvmField
    @Nullable
    public final String titleColor;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public OverdueArea(@Nullable Float f10, @Nullable String str, @Nullable TitleFont titleFont, @Nullable String str2, @Nullable CornerRadius cornerRadius, @Nullable ProductThemeInfoButton productThemeInfoButton) {
        this.height = f10;
        this.bgColor = str;
        this.titleFont = titleFont;
        this.titleColor = str2;
        this.cornerRadius = cornerRadius;
        this.button = productThemeInfoButton;
    }

    public final void applyTheme(@Nullable View view, @Nullable TextView tv) {
        String str;
        if (this.cornerRadius != null && (str = this.bgColor) != null && str.length() != 0 && view != null) {
            view.setBackground(a.h(this.bgColor, this.cornerRadius, 0, -1));
        }
        TitleFont titleFont = this.titleFont;
        if (titleFont != null) {
            titleFont.applyTheme(tv);
        }
        if (this.titleColor == null || tv == null) {
            return;
        }
        Context context = tv.getContext();
        String str2 = this.titleColor;
        tv.setTextColor(str2 != null ? CommonViewExtKt.hexToColorInt(str2, context, b.ppColorTextPrimary) : -16777216);
    }
}
