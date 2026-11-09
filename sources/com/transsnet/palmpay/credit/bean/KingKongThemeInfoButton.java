package com.transsnet.palmpay.credit.bean;

import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoButton;", "", "bgColor", "", "", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "size", "Lcom/transsnet/palmpay/credit/bean/Size;", "titleColor", "titleFont", "Lcom/transsnet/palmpay/credit/bean/TitleFont;", "<init>", "(Ljava/util/List;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Lcom/transsnet/palmpay/credit/bean/Size;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/TitleFont;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KingKongThemeInfoButton {

    @JvmField
    @NotNull
    public final List<String> bgColor;

    @JvmField
    @NotNull
    public final CornerRadius cornerRadius;

    @JvmField
    @NotNull
    public final Size size;

    @JvmField
    @NotNull
    public final String titleColor;

    @JvmField
    @NotNull
    public final TitleFont titleFont;

    public KingKongThemeInfoButton(@NotNull List<String> bgColor, @NotNull CornerRadius cornerRadius, @NotNull Size size, @NotNull String titleColor, @NotNull TitleFont titleFont) {
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(titleFont, "titleFont");
        this.bgColor = bgColor;
        this.cornerRadius = cornerRadius;
        this.size = size;
        this.titleColor = titleColor;
        this.titleFont = titleFont;
    }
}
