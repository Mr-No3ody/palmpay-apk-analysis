package com.transsnet.palmpay.credit.bean;

import L6.b;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/TitleFont;", "", ViewProps.FONT_SIZE, "", ViewProps.FONT_WEIGHT, "", "fontColor", "", "<init>", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Float;", "Ljava/lang/Integer;", "applyTheme", "", "tv", "Landroid/widget/TextView;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TitleFont {

    @JvmField
    @Nullable
    public final String fontColor;

    @JvmField
    @Nullable
    public final Float fontSize;

    @JvmField
    @Nullable
    public final Integer fontWeight;

    public TitleFont(@Nullable Float f10, @Nullable Integer num, @Nullable String str) {
        this.fontSize = f10;
        this.fontWeight = num;
        this.fontColor = str;
    }

    public final void applyTheme(@Nullable TextView tv) {
        Float f10 = this.fontSize;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            if (tv != null) {
                tv.setTextSize(1, fFloatValue);
            }
        }
        if (this.fontWeight != null && tv != null) {
            tv.setTypeface(tv.getTypeface(), this.fontWeight.intValue());
        }
        String str = this.fontColor;
        if (str == null || tv == null) {
            return;
        }
        tv.setTextColor(CommonViewExtKt.hexToColorInt(str, tv.getContext(), b.ppColorTextPrimary));
    }
}
