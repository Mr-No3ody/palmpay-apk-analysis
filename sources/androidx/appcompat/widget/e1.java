package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import com.transsnet.palmpay.bean.HomeDialogState;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements MenuPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.k f12897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.appcompat.view.menu.m f12898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f12899c;

    public e1(Toolbar toolbar) {
        this.f12899c = toolbar;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(androidx.appcompat.view.menu.k kVar, androidx.appcompat.view.menu.m mVar) {
        Toolbar toolbar = this.f12899c;
        KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof CollapsibleActionView) {
            ((CollapsibleActionView) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.mExpandedActionView);
        toolbar.removeView(toolbar.mCollapseButtonView);
        toolbar.mExpandedActionView = null;
        toolbar.addChildrenForExpandedActionView();
        this.f12898b = null;
        toolbar.requestLayout();
        mVar.f12440C = false;
        mVar.f12455n.onItemsChanged(false);
        toolbar.updateBackInvokedCallbackState();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(androidx.appcompat.view.menu.k kVar, androidx.appcompat.view.menu.m mVar) {
        Toolbar toolbar = this.f12899c;
        toolbar.ensureCollapseButtonView();
        ViewParent parent = toolbar.mCollapseButtonView.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
            }
            toolbar.addView(toolbar.mCollapseButtonView);
        }
        View actionView = mVar.getActionView();
        toolbar.mExpandedActionView = actionView;
        this.f12898b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
            }
            Toolbar.LayoutParams layoutParamsGenerateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f12075a = (toolbar.mButtonGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) | 8388611;
            layoutParamsGenerateDefaultLayoutParams.f12829b = 2;
            toolbar.mExpandedActionView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            toolbar.addView(toolbar.mExpandedActionView);
        }
        toolbar.removeChildrenForExpandedActionView();
        toolbar.requestLayout();
        mVar.f12440C = true;
        mVar.f12455n.onItemsChanged(false);
        KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof CollapsibleActionView) {
            ((CollapsibleActionView) callback).onActionViewExpanded();
        }
        toolbar.updateBackInvokedCallbackState();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, androidx.appcompat.view.menu.k kVar) {
        androidx.appcompat.view.menu.m mVar;
        androidx.appcompat.view.menu.k kVar2 = this.f12897a;
        if (kVar2 != null && (mVar = this.f12898b) != null) {
            kVar2.collapseItemActionView(mVar);
        }
        this.f12897a = kVar;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(androidx.appcompat.view.menu.k kVar, boolean z3) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.w wVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z3) {
        if (this.f12898b != null) {
            androidx.appcompat.view.menu.k kVar = this.f12897a;
            if (kVar != null) {
                int size = kVar.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f12897a.getItem(i7) == this.f12898b) {
                        return;
                    }
                }
            }
            collapseItemActionView(this.f12897a, this.f12898b);
        }
    }
}
