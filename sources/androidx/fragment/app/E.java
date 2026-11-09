package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.AbstractActivityC0822m;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback;
import androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator;
import androidx.core.util.Consumer;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends AbstractActivityC0822m implements ActivityCompat$OnRequestPermissionsResultCallback, ActivityCompat$RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final I mFragments;
    boolean mResumed;
    final C1212w mFragmentLifecycleRegistry = new C1212w(this);
    boolean mStopped = true;

    public E() {
        final AbstractActivityC0837o abstractActivityC0837o = (AbstractActivityC0837o) this;
        this.mFragments = new I(new D(abstractActivityC0837o));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new A(abstractActivityC0837o, 0));
        final int i7 = 0;
        addOnConfigurationChangedListener(new Consumer() { // from class: androidx.fragment.app.B
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        abstractActivityC0837o.mFragments.a();
                        break;
                    default:
                        abstractActivityC0837o.mFragments.a();
                        break;
                }
            }
        });
        final int i10 = 1;
        addOnNewIntentListener(new Consumer() { // from class: androidx.fragment.app.B
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        abstractActivityC0837o.mFragments.a();
                        break;
                    default:
                        abstractActivityC0837o.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.fragment.app.C
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                D d2 = abstractActivityC0837o.mFragments.f17023a;
                d2.f17028d.b(d2, d2, null);
            }
        });
    }

    public static boolean d(Z z3) {
        EnumC1204n enumC1204n = EnumC1204n.f17462c;
        boolean zD = false;
        for (Fragment fragment : z3.f17069c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zD |= d(fragment.getChildFragmentManager());
                }
                t0 t0Var = fragment.mViewLifecycleOwner;
                EnumC1204n enumC1204n2 = EnumC1204n.f17463d;
                if (t0Var != null) {
                    t0Var.b();
                    if (t0Var.f17212e.f17478d.a(enumC1204n2)) {
                        fragment.mViewLifecycleOwner.f17212e.g(enumC1204n);
                        zD = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f17478d.a(enumC1204n2)) {
                    fragment.mLifecycleRegistry.g(enumC1204n);
                    zD = true;
                }
            }
        }
        return zD;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f17023a.f17028d.f17072f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                A0.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f17023a.f17028d.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public Z getSupportFragmentManager() {
        return this.mFragments.f17023a.f17028d;
    }

    @NonNull
    @Deprecated
    public A0.a getSupportLoaderManager() {
        return A0.a.a(this);
    }

    public void markFragmentsCreated() {
        while (d(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    @CallSuper
    public void onActivityResult(int i7, int i10, @Nullable Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i7, i10, intent);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC1203m.ON_CREATE);
        C1162a0 c1162a0 = this.mFragments.f17023a.f17028d;
        c1162a0.f17058H = false;
        c1162a0.f17059I = false;
        c1162a0.f17065O.f17106j = false;
        c1162a0.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f17023a.f17028d.k();
        this.mFragmentLifecycleRegistry.e(EnumC1203m.ON_DESTROY);
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return this.mFragments.f17023a.f17028d.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f17023a.f17028d.t(5);
        this.mFragmentLifecycleRegistry.e(EnumC1203m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    @CallSuper
    public void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f17023a.f17028d.y(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC1203m.ON_RESUME);
        C1162a0 c1162a0 = this.mFragments.f17023a.f17028d;
        c1162a0.f17058H = false;
        c1162a0.f17059I = false;
        c1162a0.f17065O.f17106j = false;
        c1162a0.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C1162a0 c1162a0 = this.mFragments.f17023a.f17028d;
            c1162a0.f17058H = false;
            c1162a0.f17059I = false;
            c1162a0.f17065O.f17106j = false;
            c1162a0.t(4);
        }
        this.mFragments.f17023a.f17028d.y(true);
        this.mFragmentLifecycleRegistry.e(EnumC1203m.ON_START);
        C1162a0 c1162a1 = this.mFragments.f17023a.f17028d;
        c1162a1.f17058H = false;
        c1162a1.f17059I = false;
        c1162a1.f17065O.f17106j = false;
        c1162a1.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C1162a0 c1162a0 = this.mFragments.f17023a.f17028d;
        c1162a0.f17059I = true;
        c1162a0.f17065O.f17106j = true;
        c1162a0.t(4);
        this.mFragmentLifecycleRegistry.e(EnumC1203m.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable androidx.core.app.P p3) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(@Nullable androidx.core.app.P p3) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i7, @Nullable Bundle bundle) {
        if (i7 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i7, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i7, @Nullable Intent intent, int i10, int i11, int i12, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i7 == -1) {
            startIntentSenderForResult(intentSender, i7, intent, i10, i11, i12, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i7, intent, i10, i11, i12, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i7) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i7) {
        startActivityFromFragment(fragment, intent, i7, (Bundle) null);
    }
}
