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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/Card;", "", "bgColor", "", "bgImage", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "applyBackground", "", "view", "Landroid/view/View;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Card {

    @JvmField
    @Nullable
    public final String bgColor;

    @JvmField
    @Nullable
    public final String bgImage;

    @JvmField
    @Nullable
    public final CornerRadius cornerRadius;

    @JvmField
    @Nullable
    public final Integer height;

    public Card(@Nullable String str, @Nullable String str2, @Nullable CornerRadius cornerRadius, @Nullable Integer num) {
        this.bgColor = str;
        this.bgImage = str2;
        this.cornerRadius = cornerRadius;
        this.height = num;
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
