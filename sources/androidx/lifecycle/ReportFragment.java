package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "<init>", "()V", "ActivityInitializationListener", "a", "b", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({p192n.c.f39802c})
public class ReportFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17398b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L f17399a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "onCreate", "", "onResume", "onStart", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void get$annotations(Activity activity) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final void dispatch$lifecycle_runtime_release(@NotNull Activity activity, @NotNull EnumC1203m event) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(event, "event");
            if (activity instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner) activity).getLifecycle().e(event);
            } else if (activity instanceof LifecycleOwner) {
                AbstractC1205o lifecycle = ((LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof C1212w) {
                    ((C1212w) lifecycle).e(event);
                }
            }
        }

        @JvmName(name = "get")
        @NotNull
        public final ReportFragment get(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.f(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment) fragmentFindFragmentByTag;
        }

        @JvmStatic
        public final void injectIfNeededIn(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                b.Companion.registerIn(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private a() {
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {

        @NotNull
        public static final a Companion = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final void registerIn(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new b());
            }

            private a() {
            }
        }

        @JvmStatic
        public static final void registerIn(@NotNull Activity activity) {
            Companion.registerIn(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.f17398b.dispatch$lifecycle_runtime_release(activity, EnumC1203m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.f17398b.dispatch$lifecycle_runtime_release(activity, EnumC1203m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.f17398b.dispatch$lifecycle_runtime_release(activity, EnumC1203m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.f17398b.dispatch$lifecycle_runtime_release(activity, EnumC1203m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.f17398b.dispatch$lifecycle_runtime_release(activity, EnumC1203m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.f17398b.dispatch$lifecycle_runtime_release(activity, EnumC1203m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public final void a(EnumC1203m enumC1203m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            f17398b.dispatch$lifecycle_runtime_release(activity, enumC1203m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC1203m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC1203m.ON_DESTROY);
        this.f17399a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC1203m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        L l5 = this.f17399a;
        if (l5 != null) {
            l5.onResume();
        }
        a(EnumC1203m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        L l5 = this.f17399a;
        if (l5 != null) {
            l5.onStart();
        }
        a(EnumC1203m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC1203m.ON_STOP);
    }
}
