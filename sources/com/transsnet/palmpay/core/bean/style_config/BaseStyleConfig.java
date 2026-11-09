package com.transsnet.palmpay.core.bean.style_config;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010*\u001a\u00020\u000fH\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/core/bean/style_config/BaseStyleConfig;", "", "<init>", "()V", "height", "", "getHeight", "()Ljava/lang/Float;", "setHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "width", "getWidth", "setWidth", "bgColor", "", "getBgColor", "()Ljava/lang/String;", "setBgColor", "(Ljava/lang/String;)V", "bgColors", "", "getBgColors", "()Ljava/util/List;", "setBgColors", "(Ljava/util/List;)V", "strokeWidth", "", "getStrokeWidth", "()Ljava/lang/Integer;", "setStrokeWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "strokeColor", "getStrokeColor", "setStrokeColor", "cornerRadius", "Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "getCornerRadius", "()Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;", "setCornerRadius", "(Lcom/transsnet/palmpay/core/bean/style_config/CornerRadius;)V", "toString", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseStyleConfig {

    @Nullable
    private String bgColor;

    @Nullable
    private List<String> bgColors;

    @Nullable
    private CornerRadius cornerRadius;

    @Nullable
    private Float height;

    @Nullable
    private String strokeColor;

    @Nullable
    private Integer strokeWidth;

    @Nullable
    private Float width;

    @Nullable
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    public final List<String> getBgColors() {
        return this.bgColors;
    }

    @Nullable
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    @Nullable
    public final Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    @Nullable
    public final Float getWidth() {
        return this.width;
    }

    public final void setBgColor(@Nullable String str) {
        this.bgColor = str;
    }

    public final void setBgColors(@Nullable List<String> list) {
        this.bgColors = list;
    }

    public final void setCornerRadius(@Nullable CornerRadius cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public final void setHeight(@Nullable Float f10) {
        this.height = f10;
    }

    public final void setStrokeColor(@Nullable String str) {
        this.strokeColor = str;
    }

    public final void setStrokeWidth(@Nullable Integer num) {
        this.strokeWidth = num;
    }

    public final void setWidth(@Nullable Float f10) {
        this.width = f10;
    }

    @NotNull
    public String toString() {
        return "BaseStyleConfig(height=" + this.height + ", width=" + this.width + ", bgColor=" + this.bgColor + ", bgColors=" + this.bgColors + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", cornerRadius=" + this.cornerRadius + ")";
    }
}
