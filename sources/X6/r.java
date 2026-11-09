package X6;

import Ad.C0058e;
import N8.C0463g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.picker.picker.PickerView;
import com.palmpay.lib.ui.picker.picker.interfac.IPickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0058e f11048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public N6.d f11049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f11051g;

    @Override // V6.a
    public final void c(ViewBinding viewBinding) {
        N6.b binding = (N6.b) viewBinding;
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.e(binding);
        View viewInflate = LayoutInflater.from(getContext()).inflate(L6.g.lib_ui_layout_picker, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        PickerView pickerView = (PickerView) viewInflate;
        this.f11049e = new N6.d(pickerView, pickerView, 0);
        binding.f6086b.addView(pickerView);
        C0463g c0463g = new C0463g(this, 25);
        TextView tvPositive = (TextView) binding.f6087c.f748b;
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new q(tvPositive, this, c0463g, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f11051g;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((IPickerItem) it.next()).getItemName());
            }
        }
        N6.d dVar = this.f11049e;
        if (dVar == null) {
            Intrinsics.n("pickerBinding");
            throw null;
        }
        PickerView.d(dVar.f6095c, new p(0, arrayList), null, null, 14);
        N6.d dVar2 = this.f11049e;
        if (dVar2 == null) {
            Intrinsics.n("pickerBinding");
            throw null;
        }
        dVar2.f6095c.getOneWheelView().setCurrentItem(this.f11050f);
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new q(tvPositive, this, c0463g, 1));
    }

    @Override // V6.a
    public final ViewBinding d() {
        return N6.b.a(getLayoutInflater());
    }
}
