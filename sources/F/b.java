package F;

import E.C0216v;
import android.content.pm.ShortcutInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.media.EncoderProfiles;
import android.media.MediaActionSound;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.result.ActivityResult;
import androidx.camera.camera2.internal.compat.l;
import androidx.camera.core.impl.C0973d;
import androidx.camera.core.impl.C0975e;
import androidx.camera.core.impl.C0977f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static C0975e a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new C0973d(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new C0977f(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return C0975e.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static Object b(Bundle bundle, String str) {
        return bundle.getParcelable(str, ActivityResult.class);
    }

    public static C0216v c(l lVar) {
        Long l5 = (Long) lVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l5 != null) {
            return (C0216v) androidx.camera.camera2.internal.compat.params.a.f13414a.get(l5);
        }
        return null;
    }

    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static boolean f() {
        return MediaActionSound.mustPlayShutterSound();
    }

    public static void g(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
