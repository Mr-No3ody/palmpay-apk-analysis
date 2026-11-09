package com.transsnet.palmpay.credit.bean.other;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/other/OcContactSocialLabelBean;", "", "name", "", "icon", "Landroid/graphics/drawable/Drawable;", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "getName", "()Ljava/lang/String;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcContactSocialLabelBean {

    @Nullable
    private final Drawable icon;

    @NotNull
    private final String name;

    public OcContactSocialLabelBean(@NotNull String name, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.icon = drawable;
    }

    @Nullable
    public final Drawable getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
