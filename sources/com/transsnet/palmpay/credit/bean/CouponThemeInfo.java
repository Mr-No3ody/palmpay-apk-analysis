package com.transsnet.palmpay.credit.bean;

import Eb.a;
import L6.b;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/CouponThemeInfo;", "", "remark", "", "height", "", "bgColor", "bgImage", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "titleColor", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "button", "Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoButton;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoButton;)V", "Ljava/lang/Integer;", "applyBackground", "", "view", "Landroid/view/View;", "applyTextTheme", "tv", "Landroid/widget/TextView;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CouponThemeInfo {

    @JvmField
    @Nullable
    public final String bgColor;

    @JvmField
    @Nullable
    public final String bgImage;

    @JvmField
    @Nullable
    public final ProductThemeInfoButton button;

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
    public final String titleColor;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public CouponThemeInfo(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable CornerRadius cornerRadius, @Nullable String str4, @Nullable TitleFont titleFont, @Nullable ProductThemeInfoButton productThemeInfoButton) {
        this.remark = str;
        this.height = num;
        this.bgColor = str2;
        this.bgImage = str3;
        this.cornerRadius = cornerRadius;
        this.titleColor = str4;
        this.titleFont = titleFont;
        this.button = productThemeInfoButton;
    }

    public final void applyBackground(@Nullable View view) {
        String str;
        if (this.cornerRadius == null || view == null) {
            return;
        }
        if (TextUtils.isEmpty(this.bgColor)) {
            str = "#00000000";
        } else {
            str = this.bgColor;
            Intrinsics.e(str);
        }
        view.setBackground(a.h(str, this.cornerRadius, 0, -1));
    }

    public final void applyTextTheme(@Nullable TextView tv) {
        TitleFont titleFont = this.titleFont;
        if (titleFont != null) {
            titleFont.applyTheme(tv);
        }
        if (this.titleColor == null || tv == null) {
            return;
        }
        Context context = tv.getContext();
        String str = this.titleColor;
        int iHexToColorInt = (4 & 4) != 0 ? -16777216 : 0;
        if (str != null) {
            iHexToColorInt = CommonViewExtKt.hexToColorInt(str, context, b.ppColorTextPrimary);
        }
        tv.setTextColor(iHexToColorInt);
    }
}
