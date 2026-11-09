package androidx.core.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC1051c;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39802c})
public interface SupportMenuItem extends MenuItem {
    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @Nullable
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @Nullable
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @Nullable
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Nullable
    AbstractC1051c getSupportActionProvider();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    boolean requiresActionButton();

    boolean requiresOverflow();

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(int i7);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(@Nullable View view);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char c6, int i7);

    @Override // android.view.MenuItem
    @NonNull
    SupportMenuItem setContentDescription(@Nullable CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(@Nullable ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(@Nullable PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char c6, int i7);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char c6, char c10, int i7, int i10);

    @Override // android.view.MenuItem
    void setShowAsAction(int i7);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShowAsActionFlags(int i7);

    @NonNull
    SupportMenuItem setSupportActionProvider(@Nullable AbstractC1051c abstractC1051c);

    @Override // android.view.MenuItem
    @NonNull
    SupportMenuItem setTooltipText(@Nullable CharSequence charSequence);
}
