package androidx.preference;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.preference.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1216a implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DropDownPreference f17627a;

    public C1216a(DropDownPreference dropDownPreference) {
        this.f17627a = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j6) {
        if (i7 >= 0) {
            DropDownPreference dropDownPreference = this.f17627a;
            String string = dropDownPreference.f17524J0[i7].toString();
            if (string.equals(dropDownPreference.f17525K0)) {
                return;
            }
            dropDownPreference.getClass();
            dropDownPreference.x(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
