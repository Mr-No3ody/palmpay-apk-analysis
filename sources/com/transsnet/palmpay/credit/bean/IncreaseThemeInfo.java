package com.transsnet.palmpay.credit.bean;

import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/IncreaseThemeInfo;", "", "height", "", "bgColor", "", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "titleColor", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "iconUrl", "iconSize", "Lcom/transsnet/palmpay/credit/bean/IconSize;", "iconUrl2", "iconSize2", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/IconSize;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/IconSize;)V", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IncreaseThemeInfo {

    @JvmField
    @Nullable
    public final String bgColor;

    @JvmField
    @Nullable
    public final CornerRadius cornerRadius;

    @JvmField
    @Nullable
    public final Integer height;

    @JvmField
    @Nullable
    public final IconSize iconSize;

    @JvmField
    @Nullable
    public final IconSize iconSize2;

    @JvmField
    @Nullable
    public final String iconUrl;

    @JvmField
    @Nullable
    public final String iconUrl2;

    @JvmField
    @Nullable
    public final String titleColor;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public IncreaseThemeInfo(@Nullable Integer num, @Nullable String str, @Nullable CornerRadius cornerRadius, @Nullable String str2, @Nullable TitleFont titleFont, @Nullable String str3, @Nullable IconSize iconSize, @Nullable String str4, @Nullable IconSize iconSize2) {
        this.height = num;
        this.bgColor = str;
        this.cornerRadius = cornerRadius;
        this.titleColor = str2;
        this.titleFont = titleFont;
        this.iconUrl = str3;
        this.iconSize = iconSize;
        this.iconUrl2 = str4;
        this.iconSize2 = iconSize2;
    }
}
