package X;

import E.r;
import android.app.job.JobParameters;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long d(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void e(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static int f(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String g(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params m(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int n(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri o(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean p(Handler handler, r rVar, long j6) {
        return handler.postDelayed(rVar, "retry_token", j6);
    }

    public static void q(TextView textView, int i7) {
        textView.setFirstBaselineToTopHeight(i7);
    }

    public static boolean r(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
