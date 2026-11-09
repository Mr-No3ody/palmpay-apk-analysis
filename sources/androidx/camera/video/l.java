package androidx.camera.video;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1018g f14793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1018g f14794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1018g f14795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1018g f14796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1018g f14797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1018g f14798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1018g f14799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashSet f14800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f14801i;

    static {
        C1018g c1018g = new C1018g("SD", 4, Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f14793a = c1018g;
        C1018g c1018g2 = new C1018g("HD", 5, Collections.singletonList(new Size(1280, 720)));
        f14794b = c1018g2;
        C1018g c1018g3 = new C1018g("FHD", 6, Collections.singletonList(new Size(1920, 1080)));
        f14795c = c1018g3;
        C1018g c1018g4 = new C1018g("UHD", 8, Collections.singletonList(new Size(3840, 2160)));
        f14796d = c1018g4;
        List list = Collections.EMPTY_LIST;
        C1018g c1018g5 = new C1018g("LOWEST", 0, list);
        f14797e = c1018g5;
        C1018g c1018g6 = new C1018g("HIGHEST", 1, list);
        f14798f = c1018g6;
        f14799g = new C1018g("NONE", -1, list);
        f14800h = new HashSet(Arrays.asList(c1018g5, c1018g6, c1018g, c1018g2, c1018g3, c1018g4));
        f14801i = Arrays.asList(c1018g4, c1018g3, c1018g2, c1018g);
    }
}
