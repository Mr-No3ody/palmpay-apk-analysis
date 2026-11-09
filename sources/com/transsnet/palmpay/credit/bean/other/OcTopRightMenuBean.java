package com.transsnet.palmpay.credit.bean.other;

import android.graphics.drawable.Drawable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/other/OcTopRightMenuBean;", "", FirebaseAnalytics.Param.CONTENT, "", "imgDrawable", "Landroid/graphics/drawable/Drawable;", "type", "", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)V", "getContent", "()Ljava/lang/String;", "getImgDrawable", "()Landroid/graphics/drawable/Drawable;", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcTopRightMenuBean {

    @Nullable
    private final String content;

    @Nullable
    private final Drawable imgDrawable;

    @Nullable
    private final Integer type;

    public OcTopRightMenuBean(@Nullable String str, @Nullable Drawable drawable, @Nullable Integer num) {
        this.content = str;
        this.imgDrawable = drawable;
        this.type = num;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Drawable getImgDrawable() {
        return this.imgDrawable;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }
}
