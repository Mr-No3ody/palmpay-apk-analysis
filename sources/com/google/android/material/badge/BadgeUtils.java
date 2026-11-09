package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import com.google.android.material.R;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;
import p074f0.d;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalBadgeUtils
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";

    private BadgeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void attachBadgeContentDescription(@NonNull final BadgeDrawable badgeDrawable, @NonNull final View view) {
        if (Build.VERSION.SDK_INT < 29 || !N.j(view)) {
            N.q(view, new C1050b() { // from class: com.google.android.material.badge.BadgeUtils.3
                @Override // androidx.core.view.C1050b
                public void onInitializeAccessibilityNodeInfo(View view2, d dVar) {
                    super.onInitializeAccessibilityNodeInfo(view2, dVar);
                    dVar.o(BadgeUtils.getBadgeAnchorContentDescription(view, badgeDrawable));
                }
            });
        } else {
            N.q(view, new C1050b(view.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.2
                @Override // androidx.core.view.C1050b
                public void onInitializeAccessibilityNodeInfo(View view2, d dVar) {
                    super.onInitializeAccessibilityNodeInfo(view2, dVar);
                    dVar.o(BadgeUtils.getBadgeAnchorContentDescription(view, badgeDrawable));
                }
            });
        }
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable, @NonNull View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    @NonNull
    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, @NonNull ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i7 = 0; i7 < parcelableSparseArray.size(); i7++) {
            int iKeyAt = parcelableSparseArray.keyAt(i7);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i7);
            sparseArray.put(iKeyAt, state != null ? BadgeDrawable.createFromSavedState(context, state) : null);
        }
        return sparseArray;
    }

    @NonNull
    public static ParcelableSparseArray createParcelableBadgeStates(@NonNull SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int iKeyAt = sparseArray.keyAt(i7);
            BadgeDrawable badgeDrawableValueAt = sparseArray.valueAt(i7);
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt != null ? badgeDrawableValueAt.getSavedState() : null);
        }
        return parcelableSparseArray;
    }

    private static void detachBadgeContentDescription(@NonNull final View view) {
        if (Build.VERSION.SDK_INT < 29 || !N.j(view)) {
            N.q(view, null);
        } else {
            N.q(view, new C1050b(view.getAccessibilityDelegate()) { // from class: com.google.android.material.badge.BadgeUtils.4
                @Override // androidx.core.view.C1050b
                public void onInitializeAccessibilityNodeInfo(View view2, d dVar) {
                    super.onInitializeAccessibilityNodeInfo(view2, dVar);
                    dVar.o(view.getContentDescription());
                }
            });
        }
    }

    public static void detachBadgeDrawable(@Nullable BadgeDrawable badgeDrawable, @NonNull View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CharSequence getBadgeAnchorContentDescription(View view, BadgeDrawable badgeDrawable) {
        CharSequence contentDescription = badgeDrawable.getContentDescription();
        return contentDescription != null ? contentDescription : view.getContentDescription();
    }

    @VisibleForTesting
    public static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    @VisibleForTesting
    public static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.setAdditionalHorizontalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        badgeDrawable.setAdditionalVerticalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void updateBadgeBounds(@NonNull Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(@Nullable BadgeDrawable badgeDrawable, @NonNull Toolbar toolbar, @IdRes int i7) {
        ActionMenuItemView actionMenuItemView;
        if (badgeDrawable == null || (actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i7)) == null) {
            return;
        }
        removeToolbarOffset(badgeDrawable);
        detachBadgeDrawable(badgeDrawable, actionMenuItemView);
        detachBadgeContentDescription(actionMenuItemView);
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable, @NonNull Toolbar toolbar, @IdRes int i7) {
        attachBadgeDrawable(badgeDrawable, toolbar, i7, null);
    }

    public static void attachBadgeDrawable(@NonNull final BadgeDrawable badgeDrawable, @NonNull final Toolbar toolbar, @IdRes final int i7, @Nullable final FrameLayout frameLayout) {
        toolbar.post(new Runnable() { // from class: com.google.android.material.badge.BadgeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i7);
                if (actionMenuItemView != null) {
                    BadgeUtils.setToolbarOffset(badgeDrawable, toolbar.getResources());
                    BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, frameLayout);
                    BadgeUtils.attachBadgeContentDescription(badgeDrawable, actionMenuItemView);
                }
            }
        });
    }
}
