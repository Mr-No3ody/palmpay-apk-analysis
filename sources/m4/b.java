package m4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p278s4.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f39476f;

    public b(Context context) {
        this.f42015c = 3;
        this.f42017e = -1;
        this.f39476f = context;
    }

    @Override // p278s4.a
    public final View a(int i7, View view) {
        View viewInflate;
        a aVar;
        if (view == null) {
            aVar = new a();
            viewInflate = LayoutInflater.from(this.f39476f).inflate(q.fb_item_pick_time, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(p.fb_item_name);
            Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f39475a = (TextView) viewFindViewById;
            viewInflate.setTag(aVar);
        } else {
            Object tag = view.getTag();
            Intrinsics.f(tag, "null cannot be cast to non-null type com.flexibank.sdk.customview.adapter.FlexiBankDatePickWheelAdapter.ViewHolder");
            a aVar2 = (a) tag;
            viewInflate = view;
            aVar = aVar2;
        }
        TextView textView = aVar.f39475a;
        Intrinsics.e(textView);
        List list = this.f42013a;
        String str = list != null ? (String) CollectionsKt.G(i7, list) : null;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        return viewInflate;
    }
}
