package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface EncoderProfilesProxy {
    @NonNull
    static String getAudioCodecMimeType(int i7) {
        switch (i7) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return "audio/none";
        }
    }

    static int getRequiredAudioProfile(int i7) {
        if (i7 == 3) {
            return 2;
        }
        if (i7 != 4) {
            return i7 != 5 ? -1 : 39;
        }
        return 5;
    }

    @NonNull
    static String getVideoCodecMimeType(int i7) {
        switch (i7) {
            case 1:
                return "video/3gpp";
            case 2:
                return "video/avc";
            case 3:
                return "video/mp4v-es";
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return "video/none";
        }
    }

    @NonNull
    List<C0973d> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    @NonNull
    List<C0977f> getVideoProfiles();
}
