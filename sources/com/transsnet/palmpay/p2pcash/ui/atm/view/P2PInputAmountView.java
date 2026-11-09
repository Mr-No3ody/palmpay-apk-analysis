package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Ed.ViewOnFocusChangeListenerC0235o;
import Sc.b;
import Sc.c;
import Uc.I0;
import Xc.g;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class P2PInputAmountView extends FrameLayout {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f33006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatEditText f33007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f33008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f33010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f33011g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f33012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Listener f33013j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f33014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f33015p;

    public interface Listener {
        void onNumChanged(long j6);
    }

    public P2PInputAmountView(@NonNull Context context) {
        this(context, null);
    }

    public void setData(List<Long> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = this.f33011g;
        arrayList.clear();
        arrayList.addAll(list);
        g gVar = this.f33012i;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public void setListener(Listener listener) {
        this.f33013j = listener;
    }

    public P2PInputAmountView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public P2PInputAmountView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f33011g = new ArrayList();
        this.f33015p = 50000L;
        this.f33005a = context;
        View.inflate(context, c.p2p_input_amount_view_layout, this);
        this.f33007c = (AppCompatEditText) findViewById(b.p2p_edit);
        this.f33006b = (RecyclerView) findViewById(b.p2p_money_list);
        this.f33008d = findViewById(b.p2p_line);
        this.f33009e = (TextView) findViewById(b.p2p_error);
        this.f33010f = (ImageView) findViewById(b.p2p_clear);
        this.f33012i = new g(this);
        this.f33010f.setOnClickListener(new I0(this, 22));
        this.f33007c.setRawInputType(2);
        this.f33007c.setFilters(new InputFilter[]{new B8.b(2)});
        this.f33007c.addTextChangedListener(new a(this));
        this.f33007c.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 8));
    }
}
