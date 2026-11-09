package com.transsnet.palmpay.core.bean.style_config;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/core/bean/style_config/TextStyleConfig;", "Lcom/transsnet/palmpay/core/bean/style_config/BaseStyleConfig;", "<init>", "()V", "textColor", "", "getTextColor", "()Ljava/lang/String;", "setTextColor", "(Ljava/lang/String;)V", "textSize", "", "getTextSize", "()Ljava/lang/Float;", "setTextSize", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextStyleConfig extends BaseStyleConfig {

    @Nullable
    private String textColor;

    @Nullable
    private Float textSize;

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final Float getTextSize() {
        return this.textSize;
    }

    public final void setTextColor(@Nullable String str) {
        this.textColor = str;
    }

    public final void setTextSize(@Nullable Float f10) {
        this.textSize = f10;
    }
}
