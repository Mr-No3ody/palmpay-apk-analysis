package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public interface MenuView {

    public interface ItemView {
        m getItemData();

        void initialize(m mVar, int i7);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z3);

        void setChecked(boolean z3);

        void setEnabled(boolean z3);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z3, char c6);

        void setTitle(CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(k kVar);
}
