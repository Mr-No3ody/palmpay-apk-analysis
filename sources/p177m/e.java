package p177m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType;
import com.luck.picture.lib.config.SelectMimeType;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @Nullable
    public final ResolveInfo getGmsPicker$activity_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
    }

    @JvmStatic
    @Nullable
    public final ResolveInfo getSystemFallbackPicker$activity_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    @Nullable
    public final String getVisualMimeType$activity_release(@NotNull ActivityResultContracts$PickVisualMedia$VisualMediaType input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof g) {
            return SelectMimeType.SYSTEM_IMAGE;
        }
        if (input instanceof f) {
            return null;
        }
        throw new l();
    }

    @JvmStatic
    public final boolean isGmsPickerAvailable$activity_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getGmsPicker$activity_release(context) != null;
    }

    @Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
    @JvmStatic
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final boolean isPhotoPickerAvailable() {
        return isSystemPickerAvailable$activity_release();
    }

    @JvmStatic
    public final boolean isSystemFallbackPickerAvailable$activity_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSystemFallbackPicker$activity_release(context) != null;
    }

    @JvmStatic
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final boolean isSystemPickerAvailable$activity_release() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            return true;
        }
        return i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    private e() {
    }

    @JvmStatic
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final boolean isPhotoPickerAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context) || isGmsPickerAvailable$activity_release(context);
    }

    public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
    }

    public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
    }
}
