package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @Nullable
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private Observer<LifecycleOwner> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public DialogFragment() {
        this.mDismissRunnable = new RunnableC1177l(this, 0);
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC1178m(this);
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC1179n(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C1180o(this);
        this.mDialogCreated = false;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public H createFragmentContainer() {
        return new C1181p(this, super.createFragmentContainer());
    }

    public void dismiss() {
        f(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        f(true, false, false);
    }

    @MainThread
    public void dismissNow() {
        f(false, false, true);
    }

    public final void f(boolean z3, boolean z8, boolean z10) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z8) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId < 0) {
            Z parentFragmentManager = getParentFragmentManager();
            C1161a c1161aE = N8.q0.e(parentFragmentManager, parentFragmentManager);
            c1161aE.f17176p = true;
            c1161aE.m(this);
            if (z10) {
                c1161aE.i();
                return;
            } else if (z3) {
                c1161aE.h(true);
                return;
            } else {
                c1161aE.h(false);
                return;
            }
        }
        if (z10) {
            Z parentFragmentManager2 = getParentFragmentManager();
            int i7 = this.mBackStackId;
            if (i7 < 0) {
                parentFragmentManager2.getClass();
                throw new IllegalArgumentException(C0.G.m(i7, "Bad id: "));
            }
            parentFragmentManager2.V(i7, 1);
        } else {
            Z parentFragmentManager3 = getParentFragmentManager();
            int i10 = this.mBackStackId;
            parentFragmentManager3.getClass();
            if (i10 < 0) {
                throw new IllegalArgumentException(C0.G.m(i10, "Bad id: "));
            }
            parentFragmentManager3.w(new X(parentFragmentManager3, null, i10, 1), z3);
        }
        this.mBackStackId = -1;
    }

    @Nullable
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @StyleRes
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @NonNull
    @MainThread
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (Z.L(3)) {
            toString();
        }
        return new androidx.activity.n(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().j(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @CallSuper
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (Z.L(3)) {
            toString();
        }
        f(true, true, false);
    }

    @Nullable
    public View onFindViewById(int i7) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z3 = this.mShowsDialog;
        if (z3 && !this.mCreatingDialog) {
            if (z3 && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                    this.mDialog = dialogOnCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(dialogOnCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th) {
                    this.mCreatingDialog = false;
                    throw th;
                }
            }
            if (Z.L(2)) {
                toString();
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (Z.L(2)) {
            toString();
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i7 = this.mStyle;
        if (i7 != 0) {
            bundle.putInt(SAVED_STYLE, i7);
        }
        int i10 = this.mTheme;
        if (i10 != 0) {
            bundle.putInt(SAVED_THEME, i10);
        }
        boolean z3 = this.mCancelable;
        if (!z3) {
            bundle.putBoolean(SAVED_CANCELABLE, z3);
        }
        boolean z8 = this.mShowsDialog;
        if (!z8) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z8);
        }
        int i11 = this.mBackStackId;
        if (i11 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(p358y0.a.view_tree_lifecycle_owner, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(z0.e.view_tree_view_model_store_owner, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(L0.a.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @NonNull
    public final androidx.activity.n requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof androidx.activity.n) {
            return (androidx.activity.n) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    @NonNull
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z3) {
        this.mCancelable = z3;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z3);
        }
    }

    public void setShowsDialog(boolean z3) {
        this.mShowsDialog = z3;
    }

    public void setStyle(int i7, @StyleRes int i10) {
        if (Z.L(2)) {
            toString();
        }
        this.mStyle = i7;
        if (i7 == 2 || i7 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i10 != 0) {
            this.mTheme = i10;
        }
    }

    @RestrictTo({p192n.c.f39802c})
    public void setupDialog(@NonNull Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@NonNull Z z3, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C1161a c1161aE = N8.q0.e(z3, z3);
        c1161aE.f17176p = true;
        c1161aE.d(0, this, str, 1);
        c1161aE.h(false);
    }

    public void showNow(@NonNull Z z3, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C1161a c1161aE = N8.q0.e(z3, z3);
        c1161aE.f17176p = true;
        c1161aE.d(0, this, str, 1);
        c1161aE.i();
    }

    public int show(@NonNull k0 k0Var, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        k0Var.d(0, this, str, 1);
        this.mViewDestroyed = false;
        int iH = ((C1161a) k0Var).h(false);
        this.mBackStackId = iH;
        return iH;
    }

    public DialogFragment(int i7) {
        super(i7);
        this.mDismissRunnable = new RunnableC1177l(this, 0);
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC1178m(this);
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC1179n(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C1180o(this);
        this.mDialogCreated = false;
    }
}
