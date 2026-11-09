package com.transsnet.palmpay.base;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.l;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/base/BasePreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BasePreferenceFragment extends PreferenceFragmentCompat {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LoadingDialog f26651j;

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View viewFindViewById = viewOnCreateView.findViewById(R.id.list);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, viewFindViewById.getPaddingTop(), 0, viewFindViewById.getPaddingBottom());
        }
        ListView listView = (ListView) viewFindViewById;
        if (listView != null) {
            listView.setDivider(null);
        }
        l lVar = this.f17584a;
        lVar.f17638b = 0;
        lVar.f17637a = null;
        lVar.f17640d.f17586c.invalidateItemDecorations();
        return viewOnCreateView;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2 = this.f26651j;
        if (loadingDialog2 != null && loadingDialog2.isShowing() && (loadingDialog = this.f26651j) != null) {
            loadingDialog.dismiss();
        }
        this.f26651j = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void g() {
    }
}
