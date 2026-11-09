package com.mikepenz.iconics.internal;

import com.mikepenz.iconics.IconicsDrawable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/mikepenz/iconics/internal/CompoundIconicsDrawables;", "", "iconicsDrawableBottom", "Lcom/mikepenz/iconics/IconicsDrawable;", "getIconicsDrawableBottom", "()Lcom/mikepenz/iconics/IconicsDrawable;", "setIconicsDrawableBottom", "(Lcom/mikepenz/iconics/IconicsDrawable;)V", "iconicsDrawableEnd", "getIconicsDrawableEnd", "setIconicsDrawableEnd", "iconicsDrawableStart", "getIconicsDrawableStart", "setIconicsDrawableStart", "iconicsDrawableTop", "getIconicsDrawableTop", "setIconicsDrawableTop", "setDrawableForAll", "", "drawable", "iconics-views"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CompoundIconicsDrawables {
    @Nullable
    IconicsDrawable getIconicsDrawableBottom();

    @Nullable
    IconicsDrawable getIconicsDrawableEnd();

    @Nullable
    IconicsDrawable getIconicsDrawableStart();

    @Nullable
    IconicsDrawable getIconicsDrawableTop();

    void setDrawableForAll(@Nullable IconicsDrawable drawable);

    void setIconicsDrawableBottom(@Nullable IconicsDrawable iconicsDrawable);

    void setIconicsDrawableEnd(@Nullable IconicsDrawable iconicsDrawable);

    void setIconicsDrawableStart(@Nullable IconicsDrawable iconicsDrawable);

    void setIconicsDrawableTop(@Nullable IconicsDrawable iconicsDrawable);
}
