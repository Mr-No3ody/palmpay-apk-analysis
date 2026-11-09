package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final ArrayAdapter f17516N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public Spinner f17517O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final C1216a f17518P0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v.dropdownPreferenceStyle);
    }

    @Override // androidx.preference.Preference
    public final void g() {
        super.g();
        ArrayAdapter arrayAdapter = this.f17516N0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void k(u uVar) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) uVar.itemView.findViewById(x.spinner);
        this.f17517O0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f17516N0);
        this.f17517O0.setOnItemSelectedListener(this.f17518P0);
        Spinner spinner2 = this.f17517O0;
        String str = this.f17525K0;
        if (str == null || (charSequenceArr = this.f17524J0) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!charSequenceArr[length].equals(str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.k(uVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void l() {
        this.f17517O0.performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        this.f17518P0 = new C1216a(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.f17516N0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f17523I0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }
}
