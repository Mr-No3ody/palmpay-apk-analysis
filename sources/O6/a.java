package O6;

import L6.i;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends f implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnShowListener f6592c;

    public a(Context context, int i7) {
        super(context, i.ppBaseDialogTheme);
        this.f6591b = i7;
    }

    public abstract void a(Context context);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null || !(ownerActivity.isFinishing() || ownerActivity.isDestroyed())) {
            try {
                if (isShowing()) {
                    super.dismiss();
                }
            } catch (Exception e10) {
                Log.e("BaseDialog", "dismiss: ", e10);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        int i7 = this.f6591b;
        if (i7 > 0) {
            setContentView(i7);
        }
        a(getContext());
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f6592c;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        super.setOnShowListener(this);
    }

    @Override // O6.f, android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f6592c = onShowListener;
    }

    public final void showAtBottom(Window window) {
        int i7 = i.ppDialogBottomInOutTheme;
        if (window == null) {
            return;
        }
        window.setGravity(80);
        window.setWindowAnimations(i7);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = p059e1.a.y(this.f6590a);
        attributes.height = -2;
        window.setAttributes(attributes);
    }
}
