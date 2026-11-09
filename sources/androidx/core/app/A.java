package androidx.core.app;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i7) {
        return builder.setContentType(i7);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i7) {
        return builder.setUsage(i7);
    }
}
