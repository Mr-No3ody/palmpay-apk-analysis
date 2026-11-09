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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u0018\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/Button;", "", "bgColor", "", "", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "height", "", "size", "Lcom/transsnet/palmpay/credit/bean/Size;", "titleColor", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "<init>", "(Ljava/util/List;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/Size;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;)V", "Ljava/lang/Integer;", "applyTheme", "", "tv", "Landroid/widget/TextView;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Button {

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
    public final Size size;

    @JvmField
    @Nullable
    public final String titleColor;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public Button(@Nullable List<String> list, @Nullable CornerRadius cornerRadius, @Nullable Integer num, @Nullable Size size, @Nullable String str, @Nullable TitleFont titleFont) {
        this.bgColor = list;
        this.cornerRadius = cornerRadius;
        this.height = num;
        this.size = size;
        this.titleColor = str;
        this.titleFont = titleFont;
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
