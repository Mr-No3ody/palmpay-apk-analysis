package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import face.security.device.api.FaceSecCode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f13379b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13380a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf(FaceSecCode.SC_NOT_INIT), Integer.valueOf(FaceSecCode.SC_NOT_PERMISSION))));
    }

    public a(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f13380a = FaceSecCode.SC_NOT_INIT;
        if (f13379b.contains(Integer.valueOf(FaceSecCode.SC_NOT_INIT))) {
            new CameraAccessException(FaceSecCode.SC_NOT_INIT, null, runtimeException);
        }
    }

    public a(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f13380a = cameraAccessException.getReason();
    }

    public a(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", Integer.valueOf(FaceSecCode.SC_NOT_PERMISSION), str), assertionError);
        this.f13380a = FaceSecCode.SC_NOT_PERMISSION;
        if (f13379b.contains(Integer.valueOf(FaceSecCode.SC_NOT_PERMISSION))) {
            new CameraAccessException(FaceSecCode.SC_NOT_PERMISSION, str, assertionError);
        }
    }
}
