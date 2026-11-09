package p352xc;

import Bc.p;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.text.ImageTextView;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p059e1.a;
import p141j9.C1798f;
import p220oa.h;
import p236pc.b;
import p236pc.d;
import p236pc.f;
import p295tc.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1798f f43845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f43846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f43847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f43848d;

    public c(ViewStub viewStub, C1798f c1798f) {
        View viewInflate;
        this.f43845a = c1798f;
        if (viewStub != null) {
            try {
                viewInflate = viewStub.inflate();
            } catch (Exception unused) {
            }
        } else {
            viewInflate = null;
        }
        this.f43846b = viewInflate;
        View view = this.f43846b;
        if (view != null) {
            int i7 = d.jpWhoInviteExpand;
            ImageTextView imageTextView = (ImageTextView) a.m(i7, view);
            if (imageTextView != null) {
                i7 = d.rvWhoInvite;
                RecyclerView recyclerView = (RecyclerView) a.m(i7, view);
                if (recyclerView != null) {
                    i7 = d.tvWhoInviteTitle;
                    TextView textView = (TextView) a.m(i7, view);
                    if (textView != null) {
                        this.f43847c = new p((LinearLayout) view, imageTextView, recyclerView, textView);
                        Context context = view.getContext();
                        n nVar = new n(new C1798f(this, 24));
                        nVar.f42582c = 5;
                        nVar.a();
                        this.f43848d = nVar;
                        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                        recyclerView.setNestedScrollingEnabled(false);
                        C1548f c1548f = new C1548f(context.getColor(b.jp_invite_divider_line), CommonViewExtKt.getDp(1.0f), CommonViewExtKt.getDp(12.0f), CommonViewExtKt.getDp(12.0f));
                        c1548f.f31336e = false;
                        recyclerView.addItemDecoration(c1548f);
                        recyclerView.setAdapter(nVar);
                        imageTextView.setOnClickListener(new p327vd.c(this, 7));
                        View view2 = this.f43846b;
                        if (view2 != null) {
                            h.s(view2, false);
                            return;
                        }
                        return;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
        }
    }

    public final void a() {
        p pVar = this.f43847c;
        if (pVar != null) {
            ImageTextView imageTextView = (ImageTextView) pVar.f812c;
            n nVar = this.f43848d;
            if (nVar == null || nVar.f42583d.size() <= nVar.f42582c) {
                h.c(imageTextView);
                return;
            }
            h.C(imageTextView);
            Context context = imageTextView.getContext();
            boolean z3 = nVar.f42581b;
            AppCompatTextView textView = imageTextView.getTextView();
            if (textView != null) {
                textView.setText(z3 ? f.jp_hide : k.core_more);
            }
            S6.a aVar = z3 ? S6.a.pay_ArrowUp : S6.a.pay_Arrowdown;
            AppCompatImageView imageView = imageTextView.getImageView();
            if (imageView != null) {
                Intrinsics.e(context);
                imageView.setImageDrawable(G8.a.x(context, aVar, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, context)), null, 14.0f, 116));
            }
        }
    }

    public final void b(List list) {
        View view = this.f43846b;
        List list2 = list;
        n nVar = this.f43848d;
        if (list2 != null && !list2.isEmpty()) {
            if (view != null) {
                h.s(view, true);
            }
            if (nVar != null) {
                if (list == null) {
                    list = z.f38935a;
                }
                nVar.f42583d = list;
                nVar.f42581b = false;
                nVar.a();
            }
            a();
            return;
        }
        if (nVar != null) {
            z zVar = z.f38935a;
            int i7 = n.f42579e;
            nVar.f42583d = zVar;
            nVar.f42581b = false;
            nVar.a();
        }
        p pVar = this.f43847c;
        if (pVar != null) {
            h.c((ImageTextView) pVar.f812c);
        }
        if (view != null) {
            h.s(view, false);
        }
    }
}
