package com.transsnet.palmpay.custom_view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "OnDialogDismissListener", "OnDialogViewClickListener", "a", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialogFragment.kt\ncom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n1#2:280\n*E\n"})
public abstract class BaseDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f31234B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Dialog f31235A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31240e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f31245o;
    public Context t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public top.zibin.luban.io.a f31247v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OnDialogDismissListener f31248w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31241f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31242g = 80;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31243i = com.transsnet.palmpay.custom_view.w.Animation_CommonDialog;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31244j = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31246p = true;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment$OnDialogDismissListener;", "", "onDismiss", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnDialogDismissListener {
        void onDismiss();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment$OnDialogViewClickListener;", "", "onDialogViewClick", "", "fragment", "Landroidx/fragment/app/DialogFragment;", "view", "Landroid/view/View;", "extra", "Landroid/os/Bundle;", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnDialogViewClickListener {
        void onDialogViewClick(@Nullable DialogFragment fragment, @Nullable View view, @Nullable Bundle extra);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (h() != Integer.MAX_VALUE) {
            top.zibin.luban.io.a aVar = this.f31247v;
            if (aVar != null) {
                ((Nb.c) aVar.f42645b).removeCallbacksAndMessages(null);
            }
            this.f31247v = null;
        }
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            View currentFocus = dialog != null ? dialog.getCurrentFocus() : null;
            if (currentFocus instanceof TextView) {
                Object systemService = g().getSystemService("input_method");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(((TextView) currentFocus).getWindowToken(), 0);
            }
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        if (h() != Integer.MAX_VALUE) {
            top.zibin.luban.io.a aVar = this.f31247v;
            if (aVar != null) {
                ((Nb.c) aVar.f42645b).removeCallbacksAndMessages(null);
            }
            this.f31247v = null;
        }
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            View currentFocus = dialog != null ? dialog.getCurrentFocus() : null;
            if (currentFocus instanceof TextView) {
                Object systemService = g().getSystemService("input_method");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(((TextView) currentFocus).getWindowToken(), 0);
            }
        }
        super.dismissAllowingStateLoss();
    }

    public final Context g() {
        Context context = this.t;
        if (context != null) {
            return context;
        }
        Intrinsics.n("mContext");
        throw null;
    }

    public int h() {
        return Integer.MAX_VALUE;
    }

    public abstract Dialog i(O6.f fVar);

    @Override // androidx.fragment.app.DialogFragment
    /* JADX INFO: renamed from: isCancelable, reason: from getter */
    public final boolean getF31246p() {
        return this.f31246p;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        Dialog dialog;
        Dialog dialog2;
        this.f31235A = getDialog();
        boolean showsDialog = getShowsDialog();
        setShowsDialog(false);
        super.onActivityCreated(bundle);
        setShowsDialog(showsDialog);
        View view = getView();
        if (view != null) {
            if (view.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            Dialog dialog3 = this.f31235A;
            if (dialog3 != null) {
                dialog3.setContentView(view);
            }
        }
        E activity = getActivity();
        if (activity != null && (dialog2 = this.f31235A) != null) {
            dialog2.setOwnerActivity(activity);
        }
        h hVarWrap = h.f31270b.wrap(this);
        Dialog dialog4 = this.f31235A;
        if (dialog4 != null) {
            dialog4.setOnDismissListener(hVarWrap);
        }
        if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null && (dialog = this.f31235A) != null) {
            dialog.onRestoreInstanceState(bundle2);
        }
        Dialog dialog5 = this.f31235A;
        Intrinsics.e(dialog5);
        hVarWrap.getClass();
        Intrinsics.checkNotNullParameter(dialog5, "dialog");
        Window window = dialog5.getWindow();
        if (window != null) {
            window.getDecorView().getViewTreeObserver().addOnWindowAttachListener(new g(hVarWrap, dialog5));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.t = context;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        OnDialogDismissListener onDialogDismissListener = this.f31248w;
        if (onDialogDismissListener != null) {
            onDialogDismissListener.onDismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        return i(new O6.f(requireContext(), com.transsnet.palmpay.custom_view.w.CommonDialogStyle));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        OnDialogDismissListener onDialogDismissListener = this.f31248w;
        if (onDialogDismissListener != null) {
            onDialogDismissListener.onDismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        Window window2;
        int i7;
        int i10;
        Window window3;
        Window window4;
        Window window5;
        int i11;
        Window window6;
        super.onStart();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            WindowManager.LayoutParams attributes = (dialog == null || (window6 = dialog.getWindow()) == null) ? null : window6.getAttributes();
            int i12 = -1;
            if (attributes != null) {
                if (this.f31244j) {
                    i11 = -1;
                } else {
                    i11 = this.f31239d;
                    if (i11 == 0) {
                        i11 = -2;
                    }
                }
                attributes.width = i11;
            }
            if (attributes != null) {
                attributes.height = (this.f31245o || (i12 = this.f31240e) != 0) ? i12 : -2;
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setCanceledOnTouchOutside(this.f31246p);
            }
            Dialog dialog3 = getDialog();
            if (dialog3 != null) {
                dialog3.setCancelable(this.f31246p);
            }
            Dialog dialog4 = getDialog();
            if (dialog4 != null && (window5 = dialog4.getWindow()) != null) {
                window5.setGravity(this.f31242g);
            }
            Dialog dialog5 = getDialog();
            if (dialog5 != null && (window4 = dialog5.getWindow()) != null) {
                window4.setWindowAnimations(this.f31243i);
            }
            if (this.f31241f) {
                Dialog dialog6 = getDialog();
                if (dialog6 != null && (window3 = dialog6.getWindow()) != null) {
                    window3.addFlags(2);
                }
            } else {
                Dialog dialog7 = getDialog();
                if (dialog7 != null && (window = dialog7.getWindow()) != null) {
                    window.clearFlags(2);
                }
            }
            if (this.f31244j && attributes != null) {
                attributes.width = this.f31242g == 17 ? (int) (((double) ScreenUtils.getScreenWidth()) * 0.91d) : ScreenUtils.getScreenWidth() - (this.f31238c * 2);
            }
            if (!this.f31244j && (i10 = this.f31236a) > 0 && attributes != null) {
                attributes.x = i10;
            }
            if (!this.f31245o && (i7 = this.f31237b) > 0 && attributes != null) {
                attributes.y = i7;
            }
            Dialog dialog8 = getDialog();
            if (dialog8 == null || (window2 = dialog8.getWindow()) == null) {
                return;
            }
            window2.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void setCancelable(boolean z3) {
        this.f31246p = z3;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(Z manager, String str) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (isAdded() || manager.E(str) != null) {
            return;
        }
        C1161a c1161a = new C1161a(manager);
        Intrinsics.checkNotNullExpressionValue(c1161a, "beginTransaction(...)");
        c1161a.d(0, this, str, 1);
        c1161a.h(true);
        if (h() != Integer.MAX_VALUE) {
            top.zibin.luban.io.a aVar = new top.zibin.luban.io.a(14);
            this.f31247v = aVar;
            com.transsnet.adsdk.widgets.banner.bannerview.b bVar = new com.transsnet.adsdk.widgets.banner.bannerview.b(this, 9);
            long jH = h();
            Nb.b bVar2 = new Nb.b((ReentrantLock) aVar.f42646c, bVar);
            Nb.b bVar3 = (Nb.b) aVar.f42647d;
            ReentrantLock reentrantLock = bVar3.f6301d;
            reentrantLock.lock();
            try {
                Nb.b bVar4 = bVar3.f6298a;
                if (bVar4 != null) {
                    bVar4.f6299b = bVar2;
                }
                bVar2.f6298a = bVar4;
                bVar3.f6298a = bVar2;
                bVar2.f6299b = bVar3;
                reentrantLock.unlock();
                ((Nb.c) aVar.f42645b).postDelayed(bVar2.f6300c, jH);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
