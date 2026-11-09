package com.transsnet.palmpay.credit.bean;

import Eb.a;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoCard;", "", "remark", "", "bgColor", "bgImage", "coinImage", "mainColor", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "height", "", "iconSize", "Lcom/transsnet/palmpay/credit/bean/IconSize;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/IconSize;)V", "Ljava/lang/Integer;", "applyBackground", "", "view", "Landroid/view/View;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductThemeInfoCard {

    @JvmField
    @Nullable
    public final String bgColor;

    @JvmField
    @Nullable
    public final String bgImage;

    @JvmField
    @Nullable
    public final String coinImage;

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
    public final String mainColor;

    @JvmField
    @Nullable
    public final String remark;

    public ProductThemeInfoCard(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable CornerRadius cornerRadius, @Nullable Integer num, @Nullable IconSize iconSize) {
        this.remark = str;
        this.bgColor = str2;
        this.bgImage = str3;
        this.coinImage = str4;
        this.mainColor = str5;
        this.cornerRadius = cornerRadius;
        this.height = num;
        this.iconSize = iconSize;
    }

    public final void applyBackground(@Nullable View view) {
        String str;
        if (!TextUtils.isEmpty(this.bgImage)) {
            r0.n1(view, this.bgImage);
        } else {
            if (this.cornerRadius == null || (str = this.bgColor) == null || str.length() == 0 || view == null) {
                return;
            }
            view.setBackground(a.h(this.bgColor, this.cornerRadius, 0, -1));
        }
    }
}
