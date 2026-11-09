package com.transsnet.palmpay.credit.bean;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/OutstandingThemeInfo;", "", "style", "", "button", "Lcom/transsnet/palmpay/credit/bean/Button;", "card", "Lcom/transsnet/palmpay/credit/bean/Card;", "tag", "Lcom/transsnet/palmpay/credit/bean/Tag;", ReactTextInputShadowNode.PROP_TEXT, "Lcom/transsnet/palmpay/credit/bean/Text;", "topLine", "Lcom/transsnet/palmpay/credit/bean/TopLine;", "<init>", "(Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/Button;Lcom/transsnet/palmpay/credit/bean/Card;Lcom/transsnet/palmpay/credit/bean/Tag;Lcom/transsnet/palmpay/credit/bean/Text;Lcom/transsnet/palmpay/credit/bean/TopLine;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutstandingThemeInfo {

    @JvmField
    @Nullable
    public final Button button;

    @JvmField
    @Nullable
    public final Card card;

    @JvmField
    @Nullable
    public final String style;

    @JvmField
    @Nullable
    public final Tag tag;

    @JvmField
    @Nullable
    public final Text text;

    @JvmField
    @Nullable
    public final TopLine topLine;

    public OutstandingThemeInfo(@Nullable String str, @Nullable Button button, @Nullable Card card, @Nullable Tag tag, @Nullable Text text, @Nullable TopLine topLine) {
        this.style = str;
        this.button = button;
        this.card = card;
        this.tag = tag;
        this.text = text;
        this.topLine = topLine;
    }
}
