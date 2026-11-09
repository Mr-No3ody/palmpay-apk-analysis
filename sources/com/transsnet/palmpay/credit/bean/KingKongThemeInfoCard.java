package com.transsnet.palmpay.credit.bean;

import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoCard;", "", "bgColor", "", "bgImage", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "height", "", "iconSize", "Lcom/transsnet/palmpay/credit/bean/IconSize;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;ILcom/transsnet/palmpay/credit/bean/IconSize;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KingKongThemeInfoCard {

    @JvmField
    @NotNull
    public final String bgColor;

    @JvmField
    @NotNull
    public final String bgImage;

    @JvmField
    @NotNull
    public final CornerRadius cornerRadius;

    @JvmField
    public final int height;

    @JvmField
    @NotNull
    public final IconSize iconSize;

    public KingKongThemeInfoCard(@NotNull String bgColor, @NotNull String bgImage, @NotNull CornerRadius cornerRadius, int i7, @NotNull IconSize iconSize) {
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
        this.bgColor = bgColor;
        this.bgImage = bgImage;
        this.cornerRadius = cornerRadius;
        this.height = i7;
        this.iconSize = iconSize;
    }
}
