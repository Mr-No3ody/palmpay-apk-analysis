package com.github.xiaofeidev.shadow.shadow;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.github.xiaofeidev.shadow.round.RoundStatus;

/* JADX INFO: loaded from: classes.dex */
public interface ShadowStatus {
    int getBlurRadius();

    RoundStatus getRoundStatus();

    @ColorInt
    int getShadowColor();

    int getShadowOffsetX();

    int getShadowOffsetY();

    void setBlurRadius(int i7);

    void setRadius(@NonNull RoundStatus roundStatus);

    void setShadowColor(@ColorInt int i7);

    void setShadowOffsetX(int i7);

    void setShadowOffsetY(int i7);
}
