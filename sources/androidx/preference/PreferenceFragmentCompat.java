package androidx.preference;

import Gb.HandlerC0283f;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements PreferenceManager$OnPreferenceTreeClickListener, PreferenceManager$OnDisplayPreferenceDialogListener, PreferenceManager$OnNavigateToScreenListener, DialogPreference.TargetFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f17585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f17586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17588e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17584a = new l(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17589f = y.preference_list_fragment;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HandlerC0283f f17590g = new HandlerC0283f(this, 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.customview.widget.e f17591i = new androidx.customview.widget.e(this, 3);

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(@NonNull PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(PreferenceFragmentCompat preferenceFragmentCompat, PreferenceScreen preferenceScreen);
    }

    public final void f() {
        PreferenceScreen preferenceScreen = this.f17585b.f17664g;
        if (preferenceScreen != null) {
            RecyclerView recyclerView = this.f17586c;
            p pVar = new p();
            pVar.f17651f = new androidx.customview.widget.e(pVar, 4);
            pVar.f17646a = preferenceScreen;
            pVar.f17650e = new Handler();
            preferenceScreen.f17570v0 = pVar;
            pVar.f17647b = new ArrayList();
            pVar.f17648c = new ArrayList();
            pVar.f17649d = new ArrayList();
            pVar.setHasStableIds(preferenceScreen.f17599I0);
            pVar.d();
            recyclerView.setAdapter(pVar);
            preferenceScreen.i();
        }
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    public final Preference findPreference(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        r rVar = this.f17585b;
        if (rVar == null || (preferenceScreen = rVar.f17664g) == null) {
            return null;
        }
        return preferenceScreen.x(charSequence);
    }

    public abstract void g();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(v.preferenceTheme, typedValue, true);
        int i7 = typedValue.resourceId;
        if (i7 == 0) {
            i7 = A.PreferenceThemeOverlay;
        }
        getActivity().getTheme().applyStyle(i7, false);
        Context context = getContext();
        r rVar = new r();
        rVar.f17659b = 0L;
        rVar.f17658a = context;
        rVar.f17663f = context.getPackageName() + "_preferences";
        rVar.f17660c = null;
        this.f17585b = rVar;
        rVar.f17667j = this;
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        g();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, B.PreferenceFragmentCompat, v.preferenceFragmentCompatStyle, 0);
        this.f17589f = typedArrayObtainStyledAttributes.getResourceId(B.PreferenceFragmentCompat_android_layout, this.f17589f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(B.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(B.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(B.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(getContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f17589f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!getContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(x.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(y.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAccessibilityDelegateCompat(new t(recyclerView));
        }
        this.f17586c = recyclerView;
        l lVar = this.f17584a;
        recyclerView.addItemDecoration(lVar);
        if (drawable != null) {
            lVar.getClass();
            lVar.f17638b = drawable.getIntrinsicHeight();
        } else {
            lVar.f17638b = 0;
        }
        lVar.f17637a = drawable;
        lVar.f17640d.f17586c.invalidateItemDecorations();
        if (dimensionPixelSize != -1) {
            lVar.f17638b = dimensionPixelSize;
            lVar.f17640d.f17586c.invalidateItemDecorations();
        }
        lVar.f17639c = z3;
        if (this.f17586c.getParent() == null) {
            viewGroup2.addView(this.f17586c);
        }
        this.f17590g.post(this.f17591i);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        HandlerC0283f handlerC0283f = this.f17590g;
        handlerC0283f.removeCallbacks(this.f17591i);
        handlerC0283f.removeMessages(1);
        if (this.f17587d) {
            this.f17586c.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f17585b.f17664g;
            if (preferenceScreen != null) {
                preferenceScreen.m();
            }
        }
        this.f17586c = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.PreferenceManager$OnDisplayPreferenceDialogListener
    public final void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        if (!(getActivity() instanceof OnPreferenceDisplayDialogCallback ? ((OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference) : false) && getFragmentManager().E("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.f17562p;
                multiSelectListPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.f17562p;
                multiSelectListPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.f17562p;
                multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle3);
            }
            multiSelectListPreferenceDialogFragmentCompat.setTargetFragment(this, 0);
            multiSelectListPreferenceDialogFragmentCompat.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // androidx.preference.PreferenceManager$OnNavigateToScreenListener
    public final void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        if (getActivity() instanceof OnPreferenceStartScreenCallback) {
            ((OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.PreferenceManager$OnPreferenceTreeClickListener
    public final boolean onPreferenceTreeClick(Preference preference) {
        if (preference.f17569v == null) {
            return false;
        }
        if (getActivity() instanceof OnPreferenceStartFragmentCallback ? ((OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference) : false) {
            return true;
        }
        Z supportFragmentManager = requireActivity().getSupportFragmentManager();
        if (preference.f17571w == null) {
            preference.f17571w = new Bundle();
        }
        Bundle bundle = preference.f17571w;
        Fragment fragmentA = supportFragmentManager.J().a(requireActivity().getClassLoader(), preference.f17569v);
        fragmentA.setArguments(bundle);
        fragmentA.setTargetFragment(this, 0);
        C1161a c1161a = new C1161a(supportFragmentManager);
        c1161a.e(((View) getView().getParent()).getId(), fragmentA, null);
        c1161a.c(null);
        c1161a.h(false);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.f17585b.f17664g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        r rVar = this.f17585b;
        rVar.f17665h = this;
        rVar.f17666i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        r rVar = this.f17585b;
        rVar.f17665h = null;
        rVar.f17666i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen = this.f17585b.f17664g) != null) {
            preferenceScreen.a(bundle2);
        }
        if (this.f17587d) {
            f();
        }
        this.f17588e = true;
    }
}
