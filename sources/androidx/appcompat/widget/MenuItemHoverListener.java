package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public interface MenuItemHoverListener {
    void onItemHoverEnter(@NonNull androidx.appcompat.view.menu.k kVar, @NonNull MenuItem menuItem);

    void onItemHoverExit(@NonNull androidx.appcompat.view.menu.k kVar, @NonNull MenuItem menuItem);
}
