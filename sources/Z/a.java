package Z;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.location.Location;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Icon a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float b(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float e(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float f(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static boolean g(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean h(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean i(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static boolean j(File srcFile, File dstFile) {
        Intrinsics.checkNotNullParameter(srcFile, "srcFile");
        Intrinsics.checkNotNullParameter(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void k(MenuItem menuItem, char c6, int i7) {
        menuItem.setAlphabeticShortcut(c6, i7);
    }

    public static void l(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void m(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void n(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void o(MenuItem menuItem, char c6, int i7) {
        menuItem.setNumericShortcut(c6, i7);
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
