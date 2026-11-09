package com.transsnet.palmpay.credit.bean;

import Eb.a;
import L6.b;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoButton;", "", "remark", "", "bgColor", "", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "height", "", "titleColor", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "size", "Lcom/transsnet/palmpay/credit/bean/IconSize;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Ljava/lang/Integer;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Lcom/transsnet/palmpay/credit/bean/IconSize;)V", "Ljava/lang/Integer;", "applyTheme", "", "tv", "Landroid/widget/TextView;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductThemeInfoButton {

    @JvmField
    @Nullable
    public final List<String> bgColor;

    @JvmField
    @Nullable
    public final CornerRadius cornerRadius;

    @JvmField
    @Nullable
    public final Integer height;

    @JvmField
    @Nullable
    public final String remark;

    @JvmField
    @Nullable
    public final IconSize size;

    @JvmField
    @Nullable
    public final String titleColor;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public ProductThemeInfoButton(@Nullable String str, @Nullable List<String> list, @Nullable CornerRadius cornerRadius, @Nullable Integer num, @Nullable String str2, @Nullable TitleFont titleFont, @Nullable IconSize iconSize) {
        this.remark = str;
        this.bgColor = list;
        this.cornerRadius = cornerRadius;
        this.height = num;
        this.titleColor = str2;
        this.titleFont = titleFont;
        this.size = iconSize;
    }

    public final void applyTheme(@Nullable TextView tv) {
        List<String> list;
        if (this.cornerRadius != null && (list = this.bgColor) != null && !list.isEmpty()) {
            if (tv != null) {
                tv.setBackgroundTintList(null);
            }
            if (tv != null) {
                tv.setBackground(a.i(this.bgColor, this.cornerRadius, 0, -1));
            }
        }
        if (!TextUtils.isEmpty(this.titleColor) && tv != null) {
            Context context = tv.getContext();
            String str = this.titleColor;
            tv.setTextColor(str != null ? CommonViewExtKt.hexToColorInt(str, context, b.ppColorTextPrimary) : -16777216);
        }
        TitleFont titleFont = this.titleFont;
        if (titleFont != null) {
            titleFont.applyTheme(tv);
        }
    }
}
