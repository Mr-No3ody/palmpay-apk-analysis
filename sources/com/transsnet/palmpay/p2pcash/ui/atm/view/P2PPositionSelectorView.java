package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.c;
import W8.o;
import Xc.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment;
import com.transsnet.palmpay.p2pcash.bean.rsp.AreaBean;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PPositionSelectorView;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public class P2PPositionSelectorView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f33029A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f33031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f33032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f33033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f33035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f33036g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OnSelectStateListener f33037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnSelectLGAListener f33038j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnAreaChangedListener f33039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f33040p;
    public final ArrayList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AreaBean f33041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AreaBean f33042w;

    public interface OnAreaChangedListener {
        void onAreaChange();
    }

    public interface OnSelectLGAListener {
        void onSelect(String str);
    }

    public interface OnSelectStateListener {
        void onSelect(String str);
    }

    public P2PPositionSelectorView(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAreaByCountry(BaseApplication.getCountryLocale()).k(f.f42629b).i(b.a()).subscribe(new j(this, 0));
    }

    public String getSelectAreaId() {
        AreaBean areaBean = this.f33042w;
        if (areaBean != null) {
            return areaBean.areaCode;
        }
        return null;
    }

    public void setOnAreaChangedListener(OnAreaChangedListener onAreaChangedListener) {
        this.f33039o = onAreaChangedListener;
    }

    public void setOnSelectGovernmentListener(OnSelectStateListener onSelectStateListener) {
        this.f33037i = onSelectStateListener;
    }

    public void setOnSelectStateListener(OnSelectLGAListener onSelectLGAListener) {
        this.f33038j = onSelectLGAListener;
    }

    public P2PPositionSelectorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public P2PPositionSelectorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f33040p = new ArrayList();
        this.t = new ArrayList();
        this.f33041v = null;
        this.f33042w = null;
        this.f33030a = context;
        View.inflate(context, c.p2p_position_selector_view_layout, this);
        this.f33031b = findViewById(Sc.b.p2p_state);
        this.f33033d = (TextView) findViewById(Sc.b.p2p_state_tx);
        this.f33032c = findViewById(Sc.b.p2p_government_area);
        this.f33034e = (TextView) findViewById(Sc.b.p2p_government_area_tx);
        this.f33035f = (ImageView) findViewById(Sc.b.p2p_state_arrow);
        this.f33036g = (ImageView) findViewById(Sc.b.p2p_lga_arrow);
        final int i10 = 0;
        this.f33031b.setOnClickListener(new View.OnClickListener(this) { // from class: Xc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ P2PPositionSelectorView f11127b;

            {
                this.f11127b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        final P2PPositionSelectorView p2PPositionSelectorView = this.f11127b;
                        ArrayList arrayList = p2PPositionSelectorView.f33040p;
                        if (!arrayList.isEmpty()) {
                            final int i11 = 0;
                            PickStateDialogFragment pickStateDialogFragmentNewInstance = PickStateDialogFragment.f31255Q.newInstance(new PickStateDialogFragment.OnAreaSelectedListener() { // from class: Xc.i
                                @Override // com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment.OnAreaSelectedListener
                                public final void onAreaSelected(Object obj) {
                                    AreaBean areaBean;
                                    AreaBean areaBean2;
                                    AreaBean areaBean3 = (AreaBean) obj;
                                    switch (i11) {
                                        case 0:
                                            P2PPositionSelectorView p2PPositionSelectorView2 = p2PPositionSelectorView;
                                            if (areaBean3 == null || (areaBean = p2PPositionSelectorView2.f33041v) == null || !areaBean3.areaCode.equals(areaBean.areaCode)) {
                                                p2PPositionSelectorView2.f33041v = areaBean3;
                                                p2PPositionSelectorView2.f33033d.setText(areaBean3.areaName);
                                                TextView textView = p2PPositionSelectorView2.f33033d;
                                                int i12 = Sc.a.p2p_theme_color;
                                                Context context2 = p2PPositionSelectorView2.f33030a;
                                                textView.setTextColor(context2.getColor(i12));
                                                p2PPositionSelectorView2.f33035f.setColorFilter(context2.getColor(Sc.a.p2p_theme_color));
                                                P2PPositionSelectorView.OnSelectStateListener onSelectStateListener = p2PPositionSelectorView2.f33037i;
                                                if (onSelectStateListener != null) {
                                                    onSelectStateListener.onSelect(areaBean3.areaCode);
                                                }
                                                p2PPositionSelectorView2.f33042w = null;
                                                p2PPositionSelectorView2.f33034e.setText(context2.getString(Sc.e.p2p_str_government_area));
                                                int color = context2.getColor(L6.b.ppColorTextPrimary);
                                                p2PPositionSelectorView2.f33034e.setTextColor(color);
                                                p2PPositionSelectorView2.f33036g.setColorFilter(color);
                                                ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAreaByParent(areaBean3.areaCode).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new j(p2PPositionSelectorView2, 1));
                                            }
                                            break;
                                        default:
                                            P2PPositionSelectorView p2PPositionSelectorView3 = p2PPositionSelectorView;
                                            if (areaBean3 == null || (areaBean2 = p2PPositionSelectorView3.f33042w) == null || !areaBean3.areaCode.equals(areaBean2.areaCode)) {
                                                p2PPositionSelectorView3.f33042w = areaBean3;
                                                p2PPositionSelectorView3.f33034e.setText(areaBean3.areaName);
                                                TextView textView2 = p2PPositionSelectorView3.f33034e;
                                                int i13 = Sc.a.p2p_theme_color;
                                                Context context3 = p2PPositionSelectorView3.f33030a;
                                                textView2.setTextColor(context3.getColor(i13));
                                                p2PPositionSelectorView3.f33036g.setColorFilter(context3.getColor(Sc.a.p2p_theme_color));
                                                P2PPositionSelectorView.OnSelectLGAListener onSelectLGAListener = p2PPositionSelectorView3.f33038j;
                                                if (onSelectLGAListener != null) {
                                                    onSelectLGAListener.onSelect(areaBean3.areaCode);
                                                }
                                                P2PPositionSelectorView.OnAreaChangedListener onAreaChangedListener = p2PPositionSelectorView3.f33039o;
                                                if (onAreaChangedListener != null) {
                                                    onAreaChangedListener.onAreaChange();
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, arrayList, p2PPositionSelectorView.f33041v, "State");
                            Context context2 = p2PPositionSelectorView.f33030a;
                            if (context2 instanceof E) {
                                pickStateDialogFragmentNewInstance.show(((E) context2).getSupportFragmentManager(), "showStateSelectorDialog");
                            }
                        } else {
                            p2PPositionSelectorView.a();
                        }
                        break;
                    default:
                        final P2PPositionSelectorView p2PPositionSelectorView2 = this.f11127b;
                        AreaBean areaBean = p2PPositionSelectorView2.f33041v;
                        Context context3 = p2PPositionSelectorView2.f33030a;
                        if (areaBean != null) {
                            ArrayList arrayList2 = p2PPositionSelectorView2.t;
                            if (!arrayList2.isEmpty()) {
                                final int i12 = 1;
                                PickStateDialogFragment pickStateDialogFragmentNewInstance2 = PickStateDialogFragment.f31255Q.newInstance(new PickStateDialogFragment.OnAreaSelectedListener() { // from class: Xc.i
                                    @Override // com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment.OnAreaSelectedListener
                                    public final void onAreaSelected(Object obj) {
                                        AreaBean areaBean2;
                                        AreaBean areaBean3;
                                        AreaBean areaBean4 = (AreaBean) obj;
                                        switch (i12) {
                                            case 0:
                                                P2PPositionSelectorView p2PPositionSelectorView3 = p2PPositionSelectorView2;
                                                if (areaBean4 == null || (areaBean2 = p2PPositionSelectorView3.f33041v) == null || !areaBean4.areaCode.equals(areaBean2.areaCode)) {
                                                    p2PPositionSelectorView3.f33041v = areaBean4;
                                                    p2PPositionSelectorView3.f33033d.setText(areaBean4.areaName);
                                                    TextView textView = p2PPositionSelectorView3.f33033d;
                                                    int i13 = Sc.a.p2p_theme_color;
                                                    Context context4 = p2PPositionSelectorView3.f33030a;
                                                    textView.setTextColor(context4.getColor(i13));
                                                    p2PPositionSelectorView3.f33035f.setColorFilter(context4.getColor(Sc.a.p2p_theme_color));
                                                    P2PPositionSelectorView.OnSelectStateListener onSelectStateListener = p2PPositionSelectorView3.f33037i;
                                                    if (onSelectStateListener != null) {
                                                        onSelectStateListener.onSelect(areaBean4.areaCode);
                                                    }
                                                    p2PPositionSelectorView3.f33042w = null;
                                                    p2PPositionSelectorView3.f33034e.setText(context4.getString(Sc.e.p2p_str_government_area));
                                                    int color = context4.getColor(L6.b.ppColorTextPrimary);
                                                    p2PPositionSelectorView3.f33034e.setTextColor(color);
                                                    p2PPositionSelectorView3.f33036g.setColorFilter(color);
                                                    ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAreaByParent(areaBean4.areaCode).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new j(p2PPositionSelectorView3, 1));
                                                }
                                                break;
                                            default:
                                                P2PPositionSelectorView p2PPositionSelectorView4 = p2PPositionSelectorView2;
                                                if (areaBean4 == null || (areaBean3 = p2PPositionSelectorView4.f33042w) == null || !areaBean4.areaCode.equals(areaBean3.areaCode)) {
                                                    p2PPositionSelectorView4.f33042w = areaBean4;
                                                    p2PPositionSelectorView4.f33034e.setText(areaBean4.areaName);
                                                    TextView textView2 = p2PPositionSelectorView4.f33034e;
                                                    int i14 = Sc.a.p2p_theme_color;
                                                    Context context5 = p2PPositionSelectorView4.f33030a;
                                                    textView2.setTextColor(context5.getColor(i14));
                                                    p2PPositionSelectorView4.f33036g.setColorFilter(context5.getColor(Sc.a.p2p_theme_color));
                                                    P2PPositionSelectorView.OnSelectLGAListener onSelectLGAListener = p2PPositionSelectorView4.f33038j;
                                                    if (onSelectLGAListener != null) {
                                                        onSelectLGAListener.onSelect(areaBean4.areaCode);
                                                    }
                                                    P2PPositionSelectorView.OnAreaChangedListener onAreaChangedListener = p2PPositionSelectorView4.f33039o;
                                                    if (onAreaChangedListener != null) {
                                                        onAreaChangedListener.onAreaChange();
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, arrayList2, p2PPositionSelectorView2.f33042w, "LGA");
                                if (context3 instanceof E) {
                                    pickStateDialogFragmentNewInstance2.show(((E) context3).getSupportFragmentManager(), "showLGADialog");
                                }
                            } else {
                                ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAreaByParent(p2PPositionSelectorView2.f33041v.areaCode).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new j(p2PPositionSelectorView2, 1));
                            }
                        } else {
                            ToastUtils.showLong(context3.getString(Sc.e.p2p_str_please_select_government));
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f33032c.setOnClickListener(new View.OnClickListener(this) { // from class: Xc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ P2PPositionSelectorView f11127b;

            {
                this.f11127b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        final P2PPositionSelectorView p2PPositionSelectorView = this.f11127b;
                        ArrayList arrayList = p2PPositionSelectorView.f33040p;
                        if (!arrayList.isEmpty()) {
                            final int i12 = 0;
                            PickStateDialogFragment pickStateDialogFragmentNewInstance = PickStateDialogFragment.f31255Q.newInstance(new PickStateDialogFragment.OnAreaSelectedListener() { // from class: Xc.i
                                @Override // com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment.OnAreaSelectedListener
                                public final void onAreaSelected(Object obj) {
                                    AreaBean areaBean2;
                                    AreaBean areaBean3;
                                    AreaBean areaBean4 = (AreaBean) obj;
                                    switch (i12) {
                                        case 0:
                                            P2PPositionSelectorView p2PPositionSelectorView3 = p2PPositionSelectorView;
                                            if (areaBean4 == null || (areaBean2 = p2PPositionSelectorView3.f33041v) == null || !areaBean4.areaCode.equals(areaBean2.areaCode)) {
                                                p2PPositionSelectorView3.f33041v = areaBean4;
                                                p2PPositionSelectorView3.f33033d.setText(areaBean4.areaName);
                                                TextView textView = p2PPositionSelectorView3.f33033d;
                                                int i13 = Sc.a.p2p_theme_color;
                                                Context context4 = p2PPositionSelectorView3.f33030a;
                                                textView.setTextColor(context4.getColor(i13));
                                                p2PPositionSelectorView3.f33035f.setColorFilter(context4.getColor(Sc.a.p2p_theme_color));
                                                P2PPositionSelectorView.OnSelectStateListener onSelectStateListener = p2PPositionSelectorView3.f33037i;
                                                if (onSelectStateListener != null) {
                                                    onSelectStateListener.onSelect(areaBean4.areaCode);
                                                }
                                                p2PPositionSelectorView3.f33042w = null;
                                                p2PPositionSelectorView3.f33034e.setText(context4.getString(Sc.e.p2p_str_government_area));
                                                int color = context4.getColor(L6.b.ppColorTextPrimary);
                                                p2PPositionSelectorView3.f33034e.setTextColor(color);
                                                p2PPositionSelectorView3.f33036g.setColorFilter(color);
                                                ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAreaByParent(areaBean4.areaCode).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new j(p2PPositionSelectorView3, 1));
                                            }
                                            break;
                                        default:
                                            P2PPositionSelectorView p2PPositionSelectorView4 = p2PPositionSelectorView;
                                            if (areaBean4 == null || (areaBean3 = p2PPositionSelectorView4.f33042w) == null || !areaBean4.areaCode.equals(areaBean3.areaCode)) {
                                                p2PPositionSelectorView4.f33042w = areaBean4;
                                                p2PPositionSelectorView4.f33034e.setText(areaBean4.areaName);
                                                TextView textView2 = p2PPositionSelectorView4.f33034e;
                                                int i14 = Sc.a.p2p_theme_color;
                                                Context context5 = p2PPositionSelectorView4.f33030a;
                                                textView2.setTextColor(context5.getColor(i14));
                                                p2PPositionSelectorView4.f33036g.setColorFilter(context5.getColor(Sc.a.p2p_theme_color));
                                                P2PPositionSelectorView.OnSelectLGAListener onSelectLGAListener = p2PPositionSelectorView4.f33038j;
                                                if (onSelectLGAListener != null) {
                                                    onSelectLGAListener.onSelect(areaBean4.areaCode);
                                                }
                                                P2PPositionSelectorView.OnAreaChangedListener onAreaChangedListener = p2PPositionSelectorView4.f33039o;
                                                if (onAreaChangedListener != null) {
                                                    onAreaChangedListener.onAreaChange();
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, arrayList, p2PPositionSelectorView.f33041v, "State");
                            Context context2 = p2PPositionSelectorView.f33030a;
                            if (context2 instanceof E) {
                                pickStateDialogFragmentNewInstance.show(((E) context2).getSupportFragmentManager(), "showStateSelectorDialog");
                            }
                        } else {
                            p2PPositionSelectorView.a();
                        }
                        break;
                    default:
                        final P2PPositionSelectorView p2PPositionSelectorView2 = this.f11127b;
                        AreaBean areaBean = p2PPositionSelectorView2.f33041v;
                        Context context3 = p2PPositionSelectorView2.f33030a;
                        if (areaBean != null) {
                            ArrayList arrayList2 = p2PPositionSelectorView2.t;
                            if (!arrayList2.isEmpty()) {
                                final int i13 = 1;
                                PickStateDialogFragment pickStateDialogFragmentNewInstance2 = PickStateDialogFragment.f31255Q.newInstance(new PickStateDialogFragment.OnAreaSelectedListener() { // from class: Xc.i
                                    @Override // com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment.OnAreaSelectedListener
                                    public final void onAreaSelected(Object obj) {
                                        AreaBean areaBean2;
                                        AreaBean areaBean3;
                                        AreaBean areaBean4 = (AreaBean) obj;
                                        switch (i13) {
                                            case 0:
                                                P2PPositionSelectorView p2PPositionSelectorView3 = p2PPositionSelectorView2;
                                                if (areaBean4 == null || (areaBean2 = p2PPositionSelectorView3.f33041v) == null || !areaBean4.areaCode.equals(areaBean2.areaCode)) {
                                                    p2PPositionSelectorView3.f33041v = areaBean4;
                                                    p2PPositionSelectorView3.f33033d.setText(areaBean4.areaName);
                                                    TextView textView = p2PPositionSelectorView3.f33033d;
                                                    int i14 = Sc.a.p2p_theme_color;
                                                    Context context4 = p2PPositionSelectorView3.f33030a;
                                                    textView.setTextColor(context4.getColor(i14));
                                                    p2PPositionSelectorView3.f33035f.setColorFilter(context4.getColor(Sc.a.p2p_theme_color));
                                                    P2PPositionSelectorView.OnSelectStateListener onSelectStateListener = p2PPositionSelectorView3.f33037i;
                                                    if (onSelectStateListener != null) {
                                                        onSelectStateListener.onSelect(areaBean4.areaCode);
                                                    }
                                                    p2PPositionSelectorView3.f33042w = null;
                                                    p2PPositionSelectorView3.f33034e.setText(context4.getString(Sc.e.p2p_str_government_area));
                                                    int color = context4.getColor(L6.b.ppColorTextPrimary);
                                                    p2PPositionSelectorView3.f33034e.setTextColor(color);
                                                    p2PPositionSelectorView3.f33036g.setColorFilter(color);
                                                    ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAreaByParent(areaBean4.areaCode).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new j(p2PPositionSelectorView3, 1));
                                                }
                                                break;
                                            default:
                                                P2PPositionSelectorView p2PPositionSelectorView4 = p2PPositionSelectorView2;
                                                if (areaBean4 == null || (areaBean3 = p2PPositionSelectorView4.f33042w) == null || !areaBean4.areaCode.equals(areaBean3.areaCode)) {
                                                    p2PPositionSelectorView4.f33042w = areaBean4;
                                                    p2PPositionSelectorView4.f33034e.setText(areaBean4.areaName);
                                                    TextView textView2 = p2PPositionSelectorView4.f33034e;
                                                    int i15 = Sc.a.p2p_theme_color;
                                                    Context context5 = p2PPositionSelectorView4.f33030a;
                                                    textView2.setTextColor(context5.getColor(i15));
                                                    p2PPositionSelectorView4.f33036g.setColorFilter(context5.getColor(Sc.a.p2p_theme_color));
                                                    P2PPositionSelectorView.OnSelectLGAListener onSelectLGAListener = p2PPositionSelectorView4.f33038j;
                                                    if (onSelectLGAListener != null) {
                                                        onSelectLGAListener.onSelect(areaBean4.areaCode);
                                                    }
                                                    P2PPositionSelectorView.OnAreaChangedListener onAreaChangedListener = p2PPositionSelectorView4.f33039o;
                                                    if (onAreaChangedListener != null) {
                                                        onAreaChangedListener.onAreaChange();
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, arrayList2, p2PPositionSelectorView2.f33042w, "LGA");
                                if (context3 instanceof E) {
                                    pickStateDialogFragmentNewInstance2.show(((E) context3).getSupportFragmentManager(), "showLGADialog");
                                }
                            } else {
                                ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAreaByParent(p2PPositionSelectorView2.f33041v.areaCode).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new j(p2PPositionSelectorView2, 1));
                            }
                        } else {
                            ToastUtils.showLong(context3.getString(Sc.e.p2p_str_please_select_government));
                        }
                        break;
                }
            }
        });
        post(new o(this, 4));
    }
}
