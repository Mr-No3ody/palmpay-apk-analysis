package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: androidx.appcompat.widget.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0869l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f12957a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
        f12957a = declaredField;
    }
}
