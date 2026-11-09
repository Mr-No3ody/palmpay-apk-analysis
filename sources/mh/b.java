package mh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends qh.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f39769f;

    public b(e eVar) {
        this.f39769f = eVar;
        this.f41526a = null;
        this.f41527b = false;
        this.f41528c = 3;
        this.f41529d = false;
        this.f41530e = -1;
    }

    @Override // qh.a
    public final View a(int i7, View view) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from((Context) this.f39769f.f10089b).inflate(p349x8.b.mtn_wheel_item_layout, (ViewGroup) null);
            aVar = new a();
            aVar.f39768a = (TextView) view.findViewById(p349x8.a.mtn_txt);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f39768a.setText((CharSequence) this.f41526a.get(i7));
        return view;
    }
}
