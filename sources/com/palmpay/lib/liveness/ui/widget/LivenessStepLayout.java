package com.palmpay.lib.liveness.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p232p6.p;
import p232p6.q;
import p232p6.s;
import p232p6.t;
import p232p6.u;
import r6.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/palmpay/lib/liveness/ui/widget/LivenessStepLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LivenessStepLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f23918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f23919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f23920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f23921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f23922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f23923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f23924g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LivenessStepLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f23919b.setBackgroundColor(getContext().getColor(q.face_step_line_unchecked_color));
        this.f23921d.setBackgroundColor(getContext().getColor(q.face_step_line_unchecked_color));
        this.f23923f.setBackgroundColor(getContext().getColor(q.face_step_line_unchecked_color));
        this.f23918a.setBackground(getContext().getDrawable(s.lib_liveness_step_shape));
        this.f23920c.setBackground(getContext().getDrawable(s.lib_liveness_step_shape));
        this.f23922e.setBackground(getContext().getDrawable(s.lib_liveness_step_shape));
        this.f23924g.setBackground(getContext().getDrawable(s.lib_liveness_step_shape));
    }

    public final void b(int i7) {
        if (i7 == 1) {
            c();
            return;
        }
        if (i7 == 2) {
            d();
            return;
        }
        if (i7 == 3) {
            e();
        } else {
            if (i7 != 4) {
                a();
                return;
            }
            e();
            this.f23924g.setBackground(getContext().getDrawable(s.lib_liveness_checked));
        }
    }

    public final void c() {
        a();
        this.f23919b.setBackgroundColor(getContext().getColor(q.face_step_line_checked_color));
        this.f23918a.setBackground(getContext().getDrawable(s.lib_liveness_checked));
    }

    public final void d() {
        c();
        this.f23921d.setBackgroundColor(getContext().getColor(q.face_step_line_checked_color));
        this.f23920c.setBackground(getContext().getDrawable(s.lib_liveness_checked));
    }

    public final void e() {
        d();
        this.f23923f.setBackgroundColor(getContext().getColor(q.face_step_line_checked_color));
        this.f23922e.setBackground(getContext().getDrawable(s.lib_liveness_checked));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LivenessStepLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LivenessStepLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LivenessStepLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        List list;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, u.lib_liveness_steps, this);
        ImageView imageView = (ImageView) findViewById(t.tv_step_1);
        this.f23918a = imageView;
        View viewFindViewById = findViewById(t.tv_step_1_line);
        this.f23919b = viewFindViewById;
        ImageView imageView2 = (ImageView) findViewById(t.tv_step_2);
        this.f23920c = imageView2;
        View viewFindViewById2 = findViewById(t.tv_step_2_line);
        this.f23921d = viewFindViewById2;
        ImageView imageView3 = (ImageView) findViewById(t.tv_step_3);
        this.f23922e = imageView3;
        View viewFindViewById3 = findViewById(t.tv_step_3_line);
        this.f23923f = viewFindViewById3;
        ImageView imageView4 = (ImageView) findViewById(t.tv_step_4);
        this.f23924g = imageView4;
        a aVar = p.f41237d;
        int size = (aVar == null || (list = aVar.f41586r) == null) ? 0 : list.size();
        if (size == 2) {
            imageView.setVisibility(0);
            viewFindViewById.setVisibility(0);
            imageView2.setVisibility(0);
            return;
        }
        if (size == 3) {
            imageView.setVisibility(0);
            viewFindViewById.setVisibility(0);
            imageView2.setVisibility(0);
            viewFindViewById2.setVisibility(0);
            imageView3.setVisibility(0);
            return;
        }
        if (size != 4) {
            return;
        }
        imageView.setVisibility(0);
        viewFindViewById.setVisibility(0);
        imageView2.setVisibility(0);
        viewFindViewById2.setVisibility(0);
        imageView3.setVisibility(0);
        viewFindViewById3.setVisibility(0);
        imageView4.setVisibility(0);
    }
}
