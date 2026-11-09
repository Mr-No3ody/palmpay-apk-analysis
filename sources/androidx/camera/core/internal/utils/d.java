package androidx.camera.core.internal.utils;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Size f14361a = new Size(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Size f14362b = new Size(320, 240);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Size f14363c = new Size(640, 480);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Size f14364d = new Size(720, 480);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f14365e = new Size(1280, 720);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f14366f = new Size(1920, 1080);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f14367g = new Size(1920, 1440);

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
