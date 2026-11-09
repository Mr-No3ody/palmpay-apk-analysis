package p177m;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.activity.result.i;
import com.luck.picture.lib.config.SelectMimeType;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f39408a = new e(null);

    @Override // p177m.b
    public final Intent createIntent(Context context, Object obj) {
        i input = (i) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        e eVar = f39408a;
        if (eVar.isSystemPickerAvailable$activity_release()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(eVar.getVisualMimeType$activity_release(input.f12068a));
            return intent;
        }
        if (eVar.isSystemFallbackPickerAvailable$activity_release(context)) {
            ResolveInfo systemFallbackPicker$activity_release = eVar.getSystemFallbackPicker$activity_release(context);
            if (systemFallbackPicker$activity_release == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(eVar.getVisualMimeType$activity_release(input.f12068a));
            return intent2;
        }
        if (!eVar.isGmsPickerAvailable$activity_release(context)) {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(eVar.getVisualMimeType$activity_release(input.f12068a));
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{SelectMimeType.SYSTEM_IMAGE, SelectMimeType.SYSTEM_VIDEO});
            }
            return intent3;
        }
        ResolveInfo gmsPicker$activity_release = eVar.getGmsPicker$activity_release(context);
        if (gmsPicker$activity_release == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
        Intent intent4 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
        intent4.setType(eVar.getVisualMimeType$activity_release(input.f12068a));
        return intent4;
    }

    @Override // p177m.b
    public final a getSynchronousResult(Context context, Object obj) {
        i input = (i) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // p177m.b
    public final Object parseResult(int i7, Intent intent) {
        if (i7 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) CollectionsKt.firstOrNull(d.f39405a.getClipDataUris$activity_release(intent)) : data;
    }
}
