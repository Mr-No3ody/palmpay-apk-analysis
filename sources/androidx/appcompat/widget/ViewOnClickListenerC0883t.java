package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.core.view.AbstractC1051c;

/* JADX INFO: renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0883t implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f13003a;

    public ViewOnClickListenerC0883t(ActivityChooserView activityChooserView) {
        this.f13003a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.f13003a;
        C0881s c0881s = activityChooserView.f12590a;
        if (view == activityChooserView.f12595f) {
            activityChooserView.a();
            c0881s.getClass();
            throw null;
        }
        if (view != activityChooserView.f12593d) {
            throw new IllegalArgumentException();
        }
        c0881s.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0868l c0868l;
        ActivityChooserView activityChooserView = this.f13003a;
        PopupWindow.OnDismissListener onDismissListener = activityChooserView.f12599o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        AbstractC1051c abstractC1051c = activityChooserView.f12596g;
        if (abstractC1051c == null || (c0868l = abstractC1051c.f16203a) == null) {
            return;
        }
        c0868l.onSubUiVisibilityChanged(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        ((C0881s) adapterView.getAdapter()).getClass();
        ActivityChooserView activityChooserView = this.f13003a;
        activityChooserView.a();
        activityChooserView.f12590a.getClass();
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.f13003a;
        if (view != activityChooserView.f12595f) {
            throw new IllegalArgumentException();
        }
        activityChooserView.f12590a.getClass();
        throw null;
    }
}
