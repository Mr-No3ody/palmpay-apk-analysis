package androidx.navigation.fragment;

import C0.AbstractC0130w;
import C0.C0127t;
import C0.P;
import C0.i0;
import C0.j0;
import E0.o;
import E0.p;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NavigationRes;
import androidx.camera.core.impl.utils.n;
import androidx.camera.video.u;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.Z;
import androidx.navigation.NavHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavHost;", "<init>", "()V", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,407:1\n181#2,2:408\n1#3:410\n232#4,3:411\n232#4,3:414\n*S KotlinDebug\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n*L\n210#1:408,2\n283#1:411,3\n291#1:414,3\n*E\n"})
public class NavHostFragment extends Fragment implements NavHost {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17502e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f17503a = C2131j.b(new C0127t(this, 1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f17504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17506d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NavHostFragment create$default(a aVar, int i7, Bundle bundle, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                bundle = null;
            }
            return aVar.create(i7, bundle);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final NavHostFragment create(@NavigationRes int i7) {
            return create$default(this, i7, null, 2, null);
        }

        @JvmStatic
        @NotNull
        public final AbstractC0130w findNavController(@NotNull Fragment fragment) {
            Dialog dialog;
            Window window;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).f();
                }
                Fragment fragment2 = parentFragment.getParentFragmentManager().f17090y;
                if (fragment2 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragment2).f();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return n.j(view);
            }
            View decorView = null;
            DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return n.j(decorView);
            }
            throw new IllegalStateException(u.m("Fragment ", fragment, " does not have a NavController set"));
        }

        private a() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final NavHostFragment create(@NavigationRes int i7, @Nullable Bundle bundle) {
            Bundle bundle2;
            if (i7 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt("android-support-nav:fragment:graphId", i7);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle("android-support-nav:fragment:startDestinationArgs", bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }
    }

    public final P f() {
        return (P) this.f17503a.getValue();
    }

    @Override // androidx.navigation.NavHost
    public final AbstractC0130w getNavController() {
        return f();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.f17506d) {
            Z parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C1161a c1161a = new C1161a(parentFragmentManager);
            c1161a.o(this);
            c1161a.h(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        f();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f17506d = true;
            Z parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C1161a c1161a = new C1161a(parentFragmentManager);
            c1161a.o(this);
            c1161a.h(false);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = o.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id2);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f17504b;
        if (view != null && n.j(view) == f()) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTag(i0.nav_controller_view_tag, null);
        }
        this.f17504b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, j0.NavHost);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j0.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f17505c = resourceId;
        }
        Unit unit = Unit.f38893a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, p.NavHostFragment);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(p.NavHostFragment_defaultNavHost, false)) {
            this.f17506d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f17506d) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        P pF = f();
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(i0.nav_controller_view_tag, pF);
        if (view.getParent() != null) {
            Object parent = view.getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f17504b = view2;
            if (view2.getId() == getId()) {
                View view3 = this.f17504b;
                Intrinsics.e(view3);
                P pF2 = f();
                Intrinsics.checkNotNullParameter(view3, "view");
                view3.setTag(i0.nav_controller_view_tag, pF2);
            }
        }
    }
}
