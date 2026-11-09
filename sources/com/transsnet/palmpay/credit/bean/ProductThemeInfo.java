package com.transsnet.palmpay.credit.bean;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ProductThemeInfo;", "", "style", "", "button", "Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoButton;", "card", "Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoCard;", ReactTextInputShadowNode.PROP_TEXT, "Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoText;", "nameArea", "Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoNameArea;", "extraInfo", "Lcom/transsnet/palmpay/credit/bean/ExtraThemeInfo;", "increaseArea", "Lcom/transsnet/palmpay/credit/bean/IncreaseThemeInfo;", "couponArea", "Lcom/transsnet/palmpay/credit/bean/CouponThemeInfo;", "<init>", "(Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoButton;Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoCard;Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoText;Lcom/transsnet/palmpay/credit/bean/ProductThemeInfoNameArea;Lcom/transsnet/palmpay/credit/bean/ExtraThemeInfo;Lcom/transsnet/palmpay/credit/bean/IncreaseThemeInfo;Lcom/transsnet/palmpay/credit/bean/CouponThemeInfo;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductThemeInfo {

    @JvmField
    @Nullable
    public final ProductThemeInfoButton button;

    @JvmField
    @Nullable
    public final ProductThemeInfoCard card;

    @JvmField
    @Nullable
    public final CouponThemeInfo couponArea;

    @JvmField
    @Nullable
    public final ExtraThemeInfo extraInfo;

    @JvmField
    @Nullable
    public final IncreaseThemeInfo increaseArea;

    @JvmField
    @Nullable
    public final ProductThemeInfoNameArea nameArea;

    @JvmField
    @Nullable
    public final String style;

    @JvmField
    @Nullable
    public final ProductThemeInfoText text;

    public ProductThemeInfo(@Nullable String str, @Nullable ProductThemeInfoButton productThemeInfoButton, @Nullable ProductThemeInfoCard productThemeInfoCard, @Nullable ProductThemeInfoText productThemeInfoText, @Nullable ProductThemeInfoNameArea productThemeInfoNameArea, @Nullable ExtraThemeInfo extraThemeInfo, @Nullable IncreaseThemeInfo increaseThemeInfo, @Nullable CouponThemeInfo couponThemeInfo) {
        this.style = str;
        this.button = productThemeInfoButton;
        this.card = productThemeInfoCard;
        this.text = productThemeInfoText;
        this.nameArea = productThemeInfoNameArea;
        this.extraInfo = extraThemeInfo;
        this.increaseArea = increaseThemeInfo;
        this.couponArea = couponThemeInfo;
    }
}
