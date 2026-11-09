package p189me.jessyan.autosize;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.V;
import androidx.fragment.app.Z;

/* JADX INFO: loaded from: classes4.dex */
public class FragmentLifecycleCallbacksImplToAndroidx extends V {
    private AutoAdaptStrategy mAutoAdaptStrategy;

    public FragmentLifecycleCallbacksImplToAndroidx(AutoAdaptStrategy autoAdaptStrategy) {
        this.mAutoAdaptStrategy = autoAdaptStrategy;
    }

    @Override // androidx.fragment.app.V
    public void onFragmentCreated(Z z3, Fragment fragment, Bundle bundle) {
        AutoAdaptStrategy autoAdaptStrategy = this.mAutoAdaptStrategy;
        if (autoAdaptStrategy != null) {
            autoAdaptStrategy.applyAdapt(fragment, fragment.getActivity());
        }
    }

    public void setAutoAdaptStrategy(AutoAdaptStrategy autoAdaptStrategy) {
        this.mAutoAdaptStrategy = autoAdaptStrategy;
    }
}
