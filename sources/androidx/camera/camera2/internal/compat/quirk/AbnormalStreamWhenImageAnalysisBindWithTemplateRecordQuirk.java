package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean workaroundByCaptureIntentPreview() {
        return Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && Build.MODEL.toLowerCase(Locale.US).startsWith("sm-m556");
    }
}
