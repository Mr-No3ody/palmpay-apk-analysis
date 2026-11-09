package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.m;
import com.google.android.material.R;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class NavigationBarSubheaderView extends FrameLayout implements NavigationBarMenuItemView {
    private boolean expanded;

    @Nullable
    private m itemData;
    boolean onlyShowWhenExpanded;
    private final TextView subheaderLabel;

    @Nullable
    private ColorStateList textColor;

    public NavigationBarSubheaderView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.subheaderLabel = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    private void updateVisibility() {
        m mVar = this.itemData;
        if (mVar != null) {
            setVisibility((!mVar.isVisible() || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public m getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull m mVar, int i7) {
        this.itemData = mVar;
        mVar.setCheckable(false);
        this.subheaderLabel.setText(mVar.f12446e);
        updateVisibility();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isExpanded() {
        return this.expanded;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z3) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z3) {
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z3) {
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z3) {
        this.expanded = z3;
        updateVisibility();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z3) {
        this.onlyShowWhenExpanded = z3;
        updateVisibility();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z3, char c6) {
    }

    public void setTextAppearance(@StyleRes int i7) {
        this.subheaderLabel.setTextAppearance(i7);
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            this.subheaderLabel.setTextColor(colorStateList);
        }
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
        if (colorStateList != null) {
            this.subheaderLabel.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return false;
    }
}
