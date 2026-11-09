package p364y6;

import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f44075a = new f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Path f44076b;

    static {
        Path path = new Path();
        path.reset();
        path.moveTo(4.2f, 125.3f);
        path.cubicTo(4.8f, 115.9f, 6.2f, 92.0f, 17.4f, 69.9f);
        path.cubicTo(37.1f, 30.7f, 77.2f, 4.0f, 123.1f, 4.0f);
        path.cubicTo(189.0f, 4.0f, 241.9f, 58.1f, 241.9f, 125.3f);
        path.cubicTo(241.9f, 141.3f, 237.2f, 175.2f, 235.0f, 188.8f);
        path.cubicTo(232.5f, 203.67f, 229.2f, 218.39f, 225.1f, 232.9f);
        path.cubicTo(206.5f, 293.9f, 162.9f, 336.8f, 123.1f, 336.8f);
        path.cubicTo(69.6f, 336.8f, 31.9f, 267.3f, 21.0f, 233.5f);
        path.cubicTo(15.9f, 217.5f, 11.3f, 192.2f, 10.5f, 188.3f);
        path.cubicTo(6.2f, 164.5f, 2.9f, 146.9f, 4.2f, 125.3f);
        f44076b = path;
    }
}
