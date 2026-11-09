package com.transsnet.palmpay.core.util.statistic;

import N8.q0;
import android.content.Context;
import com.luck.picture.lib.config.PictureMimeType;
import com.transsnet.palmpay.custom_view.p;
import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.model.AspectRatio;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/util/statistic/CommonCropUtils;", "", "<init>", "()V", "buildOptions", "Lcom/yalantis/ucrop/UCrop$Options;", "context", "Landroid/content/Context;", "getSandboxPath", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonCropUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonCropUtils.kt\ncom/transsnet/palmpay/core/util/statistic/CommonCropUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,98:1\n37#2:99\n36#2,3:100\n*S KotlinDebug\n*F\n+ 1 CommonCropUtils.kt\ncom/transsnet/palmpay/core/util/statistic/CommonCropUtils\n*L\n46#1:99\n46#1:100,3\n*E\n"})
public final class CommonCropUtils {

    @NotNull
    public static final CommonCropUtils INSTANCE = new CommonCropUtils();

    private CommonCropUtils() {
    }

    @NotNull
    public final UCrop.Options buildOptions(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UCrop.Options options = new UCrop.Options();
        options.setHideBottomControls(false);
        options.setFreeStyleCropEnabled(true);
        options.setShowCropFrame(true);
        options.setShowCropGrid(true);
        options.setActiveControlsWidgetColor(context.getColor(L6.b.ppColorPrimary));
        AspectRatio[] aspectRatioArr = (AspectRatio[]) C1850q.h(new AspectRatio("1:1", 1.0f, 1.0f), new AspectRatio("2:3", 2.0f, 3.0f), new AspectRatio(context.getString(k.core_original), 0.0f, 0.0f), new AspectRatio("3:4", 3.0f, 4.0f), new AspectRatio("9:16", 9.0f, 16.0f)).toArray(new AspectRatio[0]);
        options.setAspectRatioOptions(2, (AspectRatio[]) Arrays.copyOf(aspectRatioArr, aspectRatioArr.length));
        options.setCropOutputPathDir(INSTANCE.getSandboxPath(context));
        options.isCropDragSmoothToCenter(false);
        options.setSkipCropMimeType(PictureMimeType.ofGIF());
        options.isForbidCropGifWebp(true);
        options.isForbidSkipMultipleCrop(true);
        options.setMaxScaleMultiplier(3.0f);
        options.isDarkStatusBarBlack(true);
        options.setStatusBarColor(context.getColor(L6.b.ppColorTextNormal));
        options.setToolbarColor(context.getColor(L6.b.ppColorTextNormal));
        options.setToolbarWidgetColor(context.getColor(p.md_white_1000));
        return options;
    }

    @NotNull
    public final String getSandboxPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File externalFilesDir = context.getExternalFilesDir("");
        if (externalFilesDir == null) {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }
        File file = new File(externalFilesDir.getAbsolutePath(), "Sandbox");
        if (!file.exists()) {
            file.mkdirs();
        }
        return q0.j(file.getAbsolutePath(), File.separator);
    }
}
