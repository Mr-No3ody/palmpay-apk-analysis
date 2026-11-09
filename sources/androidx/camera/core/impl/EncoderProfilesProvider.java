package androidx.camera.core.impl;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface EncoderProfilesProvider {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final List f13858q = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    @Nullable
    EncoderProfilesProxy getAll(int i7);

    boolean hasProfile(int i7);
}
