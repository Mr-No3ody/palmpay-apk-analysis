package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.camera2.internal.compat.l;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements Quirk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f13472b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f13473a;

    public TorchFlashRequiredFor3aUpdateQuirk(l lVar) {
        this.f13473a = lVar;
    }
}
