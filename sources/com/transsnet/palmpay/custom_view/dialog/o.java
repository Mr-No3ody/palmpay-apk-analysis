package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f31291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f31292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, int i7, CharSequence[] charSequenceArr, Context context2, int[] iArr, int i10) {
        super(context, i7, charSequenceArr);
        this.f31291a = context2;
        this.f31292b = iArr;
        this.f31293c = i10;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i7) {
        return (CharSequence) super.getItem(i7);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        q qVar;
        LayoutInflater layoutInflater = (LayoutInflater) this.f31291a.getSystemService("layout_inflater");
        if (view == null) {
            view = layoutInflater.inflate(com.transsnet.palmpay.custom_view.t.cv_layout_dialog_single_choice_item, (ViewGroup) null);
            qVar = new q();
            qVar.f31295a = (ImageView) view.findViewById(com.transsnet.palmpay.custom_view.s.ivIcon);
            qVar.f31296b = (TextView) view.findViewById(com.transsnet.palmpay.custom_view.s.textViewText);
            view.setTag(qVar);
        } else {
            qVar = (q) view.getTag();
        }
        int[] iArr = this.f31292b;
        if (iArr != null && i7 < iArr.length) {
            qVar.f31296b.setCompoundDrawablePadding(SizeUtils.dp2px(8.0f));
            qVar.f31296b.setCompoundDrawablesWithIntrinsicBounds(iArr[i7], 0, 0, 0);
        }
        qVar.f31296b.setText((CharSequence) super.getItem(i7));
        if (this.f31293c == i7) {
            qVar.f31295a.setVisibility(0);
            return view;
        }
        qVar.f31295a.setVisibility(4);
        return view;
    }
}
