package Sb;

import B5.c;
import F6.d;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.indexrecycleview.IndexFastScrollRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f8835A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f8836B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8837C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f8838D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f8839E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f8840F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public c f8841G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IndexFastScrollRecyclerView f8852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SectionIndexer f8853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f8854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RectF f8855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f8860s;
    public Boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f8861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f8862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8866z;

    public final boolean a(float f10, float f11) {
        RectF rectF = this.f8855n;
        if (f10 < rectF.left) {
            return false;
        }
        float f12 = rectF.top;
        return f11 >= f12 && f11 <= rectF.height() + f12;
    }

    public final int b(float f10) {
        String[] strArr = this.f8854m;
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        RectF rectF = this.f8855n;
        float f11 = rectF.top;
        if (f10 < this.f8843b + f11) {
            return 0;
        }
        float fHeight = rectF.height() + f11;
        float f12 = this.f8843b;
        if (f10 >= fHeight - f12) {
            return this.f8854m.length - 1;
        }
        RectF rectF2 = this.f8855n;
        return (int) (((f10 - rectF2.top) - f12) / ((rectF2.height() - (this.f8843b * 2.0f)) / this.f8854m.length));
    }

    public final void c() {
        try {
            int positionForSection = this.f8853l.getPositionForSection(this.f8850i);
            RecyclerView.LayoutManager layoutManager = this.f8852k.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(positionForSection, 0);
            } else {
                layoutManager.scrollToPosition(positionForSection);
            }
        } catch (Exception unused) {
            d.h("INDEX_BAR", 3, "Data size returns null");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        super.onChanged();
        this.f8854m = (String[]) this.f8853l.getSections();
    }
}
