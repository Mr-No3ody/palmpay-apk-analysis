package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1029b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15322a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15323b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15324c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f15325d;

    public static float e(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract AbstractC1029b a();

    public abstract void b(HashSet hashSet);

    public abstract void c(Context context, AttributeSet attributeSet);

    public void d(HashMap map) {
    }
}
