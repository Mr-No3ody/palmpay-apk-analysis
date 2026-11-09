package com.transsnet.palmpay.credit.bean.style.local.light;

import N8.q0;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.credit.bean.style.ProductInfoChangeStyleConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/local/light/ProductInfoChangeStyleConfigLocal;", "Lcom/transsnet/palmpay/credit/bean/style/ProductInfoChangeStyleConfig;", "<init>", "()V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductInfoChangeStyleConfigLocal extends ProductInfoChangeStyleConfig {
    public ProductInfoChangeStyleConfigLocal() {
        BaseStyleConfig baseStyleConfigF = q0.f("#ffffff");
        CornerRadius cornerRadius = new CornerRadius();
        cornerRadius.setTopLeft(12);
        cornerRadius.setTopRight(12);
        cornerRadius.setBottomLeft(12);
        cornerRadius.setBottomRight(12);
        baseStyleConfigF.setCornerRadius(cornerRadius);
        this.productInfoChangeBg = baseStyleConfigF;
        TextStyleConfig textStyleConfigG = q0.g("#202046");
        textStyleConfigG.setTextSize(Float.valueOf(14.0f));
        this.productInfoTitle = textStyleConfigG;
        TextStyleConfig textStyleConfigG2 = q0.g("#6F7B85");
        Float fValueOf = Float.valueOf(12.0f);
        textStyleConfigG2.setTextSize(fValueOf);
        this.productInfoSubTitle = textStyleConfigG2;
        BaseStyleConfig baseStyleConfigF2 = q0.f("#6a35ff");
        Float fValueOf2 = Float.valueOf(16.0f);
        baseStyleConfigF2.setHeight(fValueOf2);
        baseStyleConfigF2.setWidth(Float.valueOf(62.0f));
        CornerRadius cornerRadius2 = new CornerRadius();
        cornerRadius2.setTopLeft(16);
        cornerRadius2.setTopRight(16);
        cornerRadius2.setBottomLeft(16);
        cornerRadius2.setBottomRight(16);
        baseStyleConfigF2.setCornerRadius(cornerRadius2);
        setProductInfoLocateBg(baseStyleConfigF2);
        TextStyleConfig textStyleConfig = new TextStyleConfig();
        textStyleConfig.setTextColor("#ffffff");
        textStyleConfig.setTextSize(fValueOf);
        this.productInfoLocateText = textStyleConfig;
        BaseStyleConfig baseStyleConfig = new BaseStyleConfig();
        baseStyleConfig.setHeight(fValueOf2);
        baseStyleConfig.setWidth(fValueOf2);
        this.productInfoTitleImageIcon = baseStyleConfig;
        BaseStyleConfig baseStyleConfig2 = new BaseStyleConfig();
        baseStyleConfig2.setHeight(fValueOf2);
        baseStyleConfig2.setWidth(fValueOf2);
        this.productInfoActiveImageIcon = baseStyleConfig2;
    }
}
