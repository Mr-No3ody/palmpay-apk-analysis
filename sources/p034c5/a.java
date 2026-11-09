package p034c5;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f18861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f18862c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18863a;

    static {
        try {
            f18861b = Class.forName("com.android.internal.view.menu.ListMenuItemView");
            f18862c = Class.forName("com.android.internal.view.menu.MenuView$ItemView").getDeclaredMethod("getItemData", new Class[0]);
        } catch (Exception e10) {
            h.b("ListMenuItemViewShadow", e10);
        }
    }

    public a(View view) {
        this.f18863a = view;
    }

    public static boolean b(View view) {
        if (view.getClass() == f18861b) {
            return true;
        }
        if (p291t5.a.f42331b && (view instanceof ListMenuItemView)) {
            return true;
        }
        return p291t5.a.f42333d && (view instanceof ListMenuItemView);
    }

    public final MenuItem a() {
        View view = this.f18863a;
        if (view != null) {
            if (view.getClass() != f18861b) {
                if (p291t5.a.f42333d && (view instanceof ListMenuItemView)) {
                    return ((ListMenuItemView) view).getItemData();
                }
                if (p291t5.a.f42331b && (view instanceof ListMenuItemView)) {
                    return ((ListMenuItemView) view).getItemData();
                }
                return null;
            }
            try {
                return (MenuItem) f18862c.invoke(view, new Object[0]);
            } catch (Exception e10) {
                h.b("ListMenuItemViewShadow", e10);
            }
        }
        return null;
    }
}
