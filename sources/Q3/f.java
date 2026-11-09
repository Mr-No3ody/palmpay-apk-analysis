package Q3;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p215o4.b implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x4.j f7602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f7603f;

    @Override // p215o4.b
    public final void a() {
        View viewFindViewById = findViewById(p.fb_viewRoot);
        int i7 = p.fb_feeList;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewFindViewById);
        if (recyclerView != null) {
            i7 = p.fb_ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                i7 = p.fb_tvConfirm;
                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewFindViewById);
                if (ppButton != null) {
                    i7 = p.fb_tvTitle;
                    TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                    if (textView != null) {
                        i7 = p.fb_tvTotalAmount;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewFindViewById);
                        if (textView2 != null) {
                            i7 = p.fb_tvTotalName;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewFindViewById);
                            if (textView3 != null) {
                                this.f7602e = new x4.j((ConstraintLayout) viewFindViewById, recyclerView, iconicsImageView, ppButton, textView, textView2, textView3, 1);
                                this.f7603f = new e(q.fb_layout_tax_detail_item, null);
                                x4.j jVar = this.f7602e;
                                if (jVar != null) {
                                    jVar.f43619c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                                }
                                x4.j jVar2 = this.f7602e;
                                if (jVar2 != null) {
                                    jVar2.f43619c.setAdapter(this.f7603f);
                                }
                                x4.j jVar3 = this.f7602e;
                                if (jVar3 != null) {
                                    jVar3.f43620d.setOnClickListener(this);
                                }
                                x4.j jVar4 = this.f7602e;
                                if (jVar4 != null) {
                                    jVar4.f43621e.setOnClickListener(this);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }
}
