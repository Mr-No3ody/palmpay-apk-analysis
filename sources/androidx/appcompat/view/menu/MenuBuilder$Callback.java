package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public interface MenuBuilder$Callback {
    boolean onMenuItemSelected(@NonNull k kVar, @NonNull MenuItem menuItem);

    void onMenuModeChange(@NonNull k kVar);
}
