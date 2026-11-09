package com.transsnet.palmpay.credit.bean;

import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ExtraThemeInfo;", "", "remark", "", "height", "", "iconSize", "Lcom/transsnet/palmpay/credit/bean/IconSize;", "titleColor", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "iconUrl", "bgColor", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "tag", "Lcom/transsnet/palmpay/credit/bean/ExtraTagArea;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/IconSize;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Lcom/transsnet/palmpay/credit/bean/ExtraTagArea;)V", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraThemeInfo {

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
    public final String iconUrl;

    @JvmField
    @Nullable
    public final String remark;

    @JvmField
    @Nullable
    public final ExtraTagArea tag;

    @JvmField
    @Nullable
    public final String titleColor;

    @JvmField
    @Nullable
    public final TitleFont titleFont;

    public ExtraThemeInfo(@Nullable String str, @Nullable Integer num, @Nullable IconSize iconSize, @Nullable String str2, @Nullable TitleFont titleFont, @Nullable String str3, @Nullable String str4, @Nullable CornerRadius cornerRadius, @Nullable ExtraTagArea extraTagArea) {
        this.remark = str;
        this.height = num;
        this.iconSize = iconSize;
        this.titleColor = str2;
        this.titleFont = titleFont;
        this.iconUrl = str3;
        this.bgColor = str4;
        this.cornerRadius = cornerRadius;
        this.tag = extraTagArea;
    }
}
