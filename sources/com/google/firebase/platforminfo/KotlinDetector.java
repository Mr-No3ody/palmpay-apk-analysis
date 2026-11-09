package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import p355xf.C2130i;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            C2130i.f43967c.getClass();
            return "2.1.20";
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
