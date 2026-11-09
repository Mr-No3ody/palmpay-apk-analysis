package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.C0833k;
import androidx.appcompat.app.DialogInterfaceC0834l;

/* JADX INFO: loaded from: classes.dex */
public final class I implements AppCompatSpinner.SpinnerPopup, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0834l f12686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f12687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f12688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f12689d;

    public I(AppCompatSpinner appCompatSpinner) {
        this.f12689d = appCompatSpinner;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void dismiss() {
        DialogInterfaceC0834l dialogInterfaceC0834l = this.f12686a;
        if (dialogInterfaceC0834l != null) {
            dialogInterfaceC0834l.dismiss();
            this.f12686a = null;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final Drawable getBackground() {
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final CharSequence getHintText() {
        return this.f12688c;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final int getHorizontalOffset() {
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final int getHorizontalOriginalOffset() {
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final int getVerticalOffset() {
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final boolean isShowing() {
        DialogInterfaceC0834l dialogInterfaceC0834l = this.f12686a;
        if (dialogInterfaceC0834l != null) {
            return dialogInterfaceC0834l.isShowing();
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        AppCompatSpinner appCompatSpinner = this.f12689d;
        appCompatSpinner.setSelection(i7);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i7, this.f12687b.getItemId(i7));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setAdapter(ListAdapter listAdapter) {
        this.f12687b = listAdapter;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setHorizontalOffset(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setHorizontalOriginalOffset(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setPromptText(CharSequence charSequence) {
        this.f12688c = charSequence;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setVerticalOffset(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void show(int i7, int i10) {
        if (this.f12687b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f12689d;
        C0833k c0833k = new C0833k(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.f12688c;
        if (charSequence != null) {
            c0833k.setTitle(charSequence);
        }
        c0833k.setSingleChoiceItems(this.f12687b, appCompatSpinner.getSelectedItemPosition(), this);
        DialogInterfaceC0834l dialogInterfaceC0834lCreate = c0833k.create();
        this.f12686a = dialogInterfaceC0834lCreate;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0834lCreate.f12306a.f12286g;
        alertController$RecycleListView.setTextDirection(i7);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f12686a.show();
    }
}
