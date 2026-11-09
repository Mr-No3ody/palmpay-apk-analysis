package com.transsnet.palmpay.credit.bean.other;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/other/CLNoPermissionBean;", "", "permissionIcon", "Landroid/graphics/drawable/Drawable;", "permissionContent", "", "<init>", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "getPermissionIcon", "()Landroid/graphics/drawable/Drawable;", "getPermissionContent", "()Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLNoPermissionBean {

    @Nullable
    private final String permissionContent;

    @Nullable
    private final Drawable permissionIcon;

    public CLNoPermissionBean(@Nullable Drawable drawable, @Nullable String str) {
        this.permissionIcon = drawable;
        this.permissionContent = str;
    }

    @Nullable
    public final String getPermissionContent() {
        return this.permissionContent;
    }

    @Nullable
    public final Drawable getPermissionIcon() {
        return this.permissionIcon;
    }
}
