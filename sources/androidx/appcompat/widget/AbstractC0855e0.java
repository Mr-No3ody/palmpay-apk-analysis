package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.ViewProps;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0855e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f12892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f12893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f12894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f12895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Field f12896f;

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z3;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            try {
                field = cls.getField(ViewProps.LEFT);
                try {
                    field2 = cls.getField(ViewProps.TOP);
                    try {
                        field3 = cls.getField(ViewProps.RIGHT);
                        try {
                            field4 = cls.getField(ViewProps.BOTTOM);
                            z3 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z3 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z3 = false;
                    if (z3) {
                        f12892b = method;
                        f12893c = field;
                        f12894d = field2;
                        f12895e = field3;
                        f12896f = field4;
                        f12891a = true;
                        return;
                    }
                    f12892b = null;
                    f12893c = null;
                    f12894d = null;
                    f12895e = null;
                    f12896f = null;
                    f12891a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z3 = false;
                    if (z3) {
                        f12892b = method;
                        f12893c = field;
                        f12894d = field2;
                        f12895e = field3;
                        f12896f = field4;
                        f12891a = true;
                        return;
                    }
                    f12892b = null;
                    f12893c = null;
                    f12894d = null;
                    f12895e = null;
                    f12896f = null;
                    f12891a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z3 = false;
                    if (z3) {
                        f12892b = method;
                        f12893c = field;
                        f12894d = field2;
                        f12895e = field3;
                        f12896f = field4;
                        f12891a = true;
                        return;
                    }
                    f12892b = null;
                    f12893c = null;
                    f12894d = null;
                    f12895e = null;
                    f12896f = null;
                    f12891a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z3 = false;
                if (z3) {
                    f12892b = method;
                    f12893c = field;
                    f12894d = field2;
                    f12895e = field3;
                    f12896f = field4;
                    f12891a = true;
                    return;
                }
                f12892b = null;
                f12893c = null;
                f12894d = null;
                f12895e = null;
                f12896f = null;
                f12891a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z3 = false;
                if (z3) {
                    f12892b = method;
                    f12893c = field;
                    f12894d = field2;
                    f12895e = field3;
                    f12896f = field4;
                    f12891a = true;
                    return;
                }
                f12892b = null;
                f12893c = null;
                f12894d = null;
                f12895e = null;
                f12896f = null;
                f12891a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z3 = false;
                if (z3) {
                    f12892b = method;
                    f12893c = field;
                    f12894d = field2;
                    f12895e = field3;
                    f12896f = field4;
                    f12891a = true;
                    return;
                }
                f12892b = null;
                f12893c = null;
                f12894d = null;
                f12895e = null;
                f12896f = null;
                f12891a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z3) {
            f12892b = method;
            f12893c = field;
            f12894d = field2;
            f12895e = field3;
            f12896f = field4;
            f12891a = true;
            return;
        }
        f12892b = null;
        f12893c = null;
        f12894d = null;
        f12895e = null;
        f12896f = null;
        f12891a = false;
    }
}
