package com.transsnet.palmpay.credit.bean.style;

import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/ProductInfoChangeStyleConfig;", "", "<init>", "()V", "productInfoChangeBg", "Lcom/transsnet/palmpay/core/bean/style_config/BaseStyleConfig;", "productInfoTitle", "Lcom/transsnet/palmpay/core/bean/style_config/TextStyleConfig;", "productInfoSubTitle", "productInfoTitleImageIcon", "productInfoActiveImageIcon", "productInfoLocateBg", "getProductInfoLocateBg", "()Lcom/transsnet/palmpay/core/bean/style_config/BaseStyleConfig;", "setProductInfoLocateBg", "(Lcom/transsnet/palmpay/core/bean/style_config/BaseStyleConfig;)V", "productInfoLocateText", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ProductInfoChangeStyleConfig {

    @JvmField
    @Nullable
    public BaseStyleConfig productInfoActiveImageIcon;

    @JvmField
    @Nullable
    public BaseStyleConfig productInfoChangeBg;

    @Nullable
    private BaseStyleConfig productInfoLocateBg;

    @JvmField
    @Nullable
    public TextStyleConfig productInfoLocateText;

    @JvmField
    @Nullable
    public TextStyleConfig productInfoSubTitle;

    @JvmField
    @Nullable
    public TextStyleConfig productInfoTitle;

    @JvmField
    @Nullable
    public BaseStyleConfig productInfoTitleImageIcon;

    @Nullable
    public final BaseStyleConfig getProductInfoLocateBg() {
        return this.productInfoLocateBg;
    }

    public final void setProductInfoLocateBg(@Nullable BaseStyleConfig baseStyleConfig) {
        this.productInfoLocateBg = baseStyleConfig;
    }
}
