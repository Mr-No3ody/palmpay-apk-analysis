package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public interface MenuPresenter {

    public interface Callback {
        void onCloseMenu(@NonNull k kVar, boolean z3);

        boolean onOpenSubMenu(@NonNull k kVar);
    }

    boolean collapseItemActionView(k kVar, m mVar);

    boolean expandItemActionView(k kVar, m mVar);

    boolean flagActionItems();

    int getId();

    MenuView getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, k kVar);

    void onCloseMenu(k kVar, boolean z3);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(w wVar);

    void setCallback(Callback callback);

    void updateMenuView(boolean z3);
}
