package com.transsnet.palmpay.credit.bean;

import Eb.a;
import L6.b;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ExtraTagArea;", "", "height", "", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "titleColor", "", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", ViewProps.BORDER_WIDTH, "", ViewProps.BORDER_COLOR, "bgColor", "bgColor2", "borderColor2", "iconSize", "Lcom/transsnet/palmpay/credit/bean/IconSize;", "<init>", "(Ljava/lang/Float;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/IconSize;)V", "Ljava/lang/Float;", "Ljava/lang/Integer;", "applyTheme", "", "tv", "Landroid/widget/TextView;", "applyTheme2", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraTagArea {

    @JvmField
    @Nullable
    public final String bgColor;

    @JvmField
    @Nullable
    public final String bgColor2;

    @JvmField
    @Nullable
    public final String borderColor;

    @JvmField
    @Nullable
    public final String borderColor2;

    @JvmField
    @Nullable
    public final Integer borderWidth;

    @JvmField
    @Nullable
    public final CornerRadius cornerRadius;

    @JvmField
    @Nullable
    public final Float height;

    @JvmField
    @Nullable
    public final IconSize iconSize;

    @JvmField
    @Nullable
    public final String titleColor;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public ExtraTagArea(@Nullable Float f10, @Nullable CornerRadius cornerRadius, @Nullable String str, @Nullable TitleFont titleFont, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable IconSize iconSize) {
        this.height = f10;
        this.cornerRadius = cornerRadius;
        this.titleColor = str;
        this.titleFont = titleFont;
        this.borderWidth = num;
        this.borderColor = str2;
        this.bgColor = str3;
        this.bgColor2 = str4;
        this.borderColor2 = str5;
        this.iconSize = iconSize;
    }

    public final void applyTheme(@Nullable TextView tv) {
        String str;
        if (this.cornerRadius != null && tv != null) {
            if (TextUtils.isEmpty(this.bgColor)) {
                str = "#00000000";
            } else {
                str = this.bgColor;
                Intrinsics.e(str);
            }
            CornerRadius cornerRadius = this.cornerRadius;
            Integer num = this.borderWidth;
            tv.setBackground(a.h(str, cornerRadius, SizeUtils.dp2px(num != null ? num.intValue() : 0.0f), a.t(tv.getContext(), this.borderColor)));
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

    public final void applyTheme2(@Nullable TextView tv) {
        String str;
        if (this.cornerRadius != null) {
            if (!TextUtils.isEmpty(this.bgColor2)) {
                str = this.bgColor2;
                Intrinsics.e(str);
            } else if (TextUtils.isEmpty(this.bgColor)) {
                str = "#00000000";
            } else {
                str = this.bgColor;
                Intrinsics.e(str);
            }
            String str2 = !TextUtils.isEmpty(this.borderColor2) ? this.borderColor2 : this.borderColor;
            if (tv != null) {
                CornerRadius cornerRadius = this.cornerRadius;
                Integer num = this.borderWidth;
                tv.setBackground(a.h(str, cornerRadius, SizeUtils.dp2px(num != null ? num.intValue() : 0.0f), a.t(tv.getContext(), str2)));
            }
        }
        TitleFont titleFont = this.titleFont;
        if (titleFont != null) {
            titleFont.applyTheme(tv);
        }
        if (this.titleColor == null || tv == null) {
            return;
        }
        Context context = tv.getContext();
        String str3 = this.titleColor;
        tv.setTextColor(str3 != null ? CommonViewExtKt.hexToColorInt(str3, context, b.ppColorTextPrimary) : -16777216);
    }

    public /* synthetic */ ExtraTagArea(Float f10, CornerRadius cornerRadius, String str, TitleFont titleFont, Integer num, String str2, String str3, String str4, String str5, IconSize iconSize, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, cornerRadius, str, titleFont, num, str2, str3, str4, str5, (i7 & 512) != 0 ? null : iconSize);
    }
}
