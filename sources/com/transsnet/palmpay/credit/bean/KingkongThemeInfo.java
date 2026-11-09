package com.transsnet.palmpay.credit.bean;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/KingkongThemeInfo;", "", "button", "Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoButton;", "card", "Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoCard;", ReactTextInputShadowNode.PROP_TEXT, "Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoText;", "style", "", "<init>", "(Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoButton;Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoCard;Lcom/transsnet/palmpay/credit/bean/KingKongThemeInfoText;Ljava/lang/String;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KingkongThemeInfo {

    @JvmField
    @NotNull
    public final KingKongThemeInfoButton button;

    @JvmField
    @NotNull
    public final KingKongThemeInfoCard card;

    @JvmField
    @NotNull
    public final String style;

    @JvmField
    @NotNull
    public final KingKongThemeInfoText text;

    public KingkongThemeInfo(@NotNull KingKongThemeInfoButton button, @NotNull KingKongThemeInfoCard card, @NotNull KingKongThemeInfoText text, @NotNull String style) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.button = button;
        this.card = card;
        this.text = text;
        this.style = style;
    }
}
