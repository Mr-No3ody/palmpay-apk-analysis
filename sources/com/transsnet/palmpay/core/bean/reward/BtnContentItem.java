package com.transsnet.palmpay.core.bean.reward;

import L6.b;
import android.content.Context;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/bean/reward/BtnContentItem;", "", "<init>", "()V", "buttonContent", "", "rewardStatus", "", "Ljava/lang/Integer;", "functionType", "getBtnBackground", "getBtnForeground", "context", "Landroid/content/Context;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BtnContentItem {

    @JvmField
    @Nullable
    public String buttonContent;

    @JvmField
    @Nullable
    public Integer functionType;

    @JvmField
    @Nullable
    public Integer rewardStatus;

    public final int getBtnBackground() {
        Integer num = this.functionType;
        if (num != null && num.intValue() == 1) {
            return r.cv_shape_halfround_purple;
        }
        if (num != null && num.intValue() == 2) {
            return r.cv_shape_round_purple_border;
        }
        return (num != null && num.intValue() == 3) ? r.cv_shape_halfround_purple : r.cv_shape_halfround_purple;
    }

    public final int getBtnForeground(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = this.functionType;
        if (num != null && num.intValue() == 1) {
            return CommonViewExtKt.colorInt(b.ppColorButtonTextWhite, context);
        }
        if (num != null && num.intValue() == 2) {
            return CommonViewExtKt.colorInt(b.ppColorPrimary, context);
        }
        return (num != null && num.intValue() == 3) ? CommonViewExtKt.colorInt(b.ppColorButtonTextWhite, context) : CommonViewExtKt.colorInt(b.ppColorButtonTextWhite, context);
    }
}
