package com.transsnet.palmpay.custom_view.async;

import Ad.c0;
import C0.G;
import Lb.b;
import Lb.d;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.t0;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.transsnet.palmpay.custom_view.x;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/custom_view/async/AsyncViewStub;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getInflatedView", "()Landroid/view/View;", "a", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsyncViewStub extends View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31184d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f31186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f31187c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @JvmOverloads
    public AsyncViewStub(@Nullable Context context) {
        this(context, null, 6, 0);
    }

    public final void a(View view, Function1 function1) {
        if (getParent() == null || !(getParent() instanceof ViewGroup)) {
            return;
        }
        this.f31186b = view;
        ViewParent parent = getParent();
        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int iIndexOfChild = viewGroup.indexOfChild(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        view.setLayoutParams(layoutParams);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(view, iIndexOfChild);
        function1.invoke(view);
    }

    public final void b(boolean z3, Function1 block) {
        String hexString;
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.f31185a == 0) {
            throw new RuntimeException("Please set layout in xml");
        }
        if (!z3) {
            this.f31187c = AbstractC0780y.m(AbstractC0777v.b(), null, null, new Lb.a(this, block, null), 3);
            return;
        }
        if (ActivityUtils.isValidGlideContext(getContext())) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i7 = this.f31185a;
            c0 callback = new c0(22, this, block);
            Handler handler = d.f5620a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(context).cloneInContext(context);
            try {
                hexString = context.getResources().getResourceEntryName(i7);
            } catch (Exception unused) {
                hexString = Integer.toHexString(i7);
            }
            String strO = G.o("PpAsyncInflate/", hexString);
            if (strO.length() > 100) {
                strO = strO.substring(0, 100);
                Intrinsics.checkNotNullExpressionValue(strO, "substring(...)");
            }
            String str = strO;
            Object value = d.f5621b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ExecutorService) value).execute(new b(context, str, layoutInflaterCloneInContext, i7, callback, 0));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getInflatedView, reason: from getter */
    public final View getF31186b() {
        return this.f31186b;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        t0 t0Var = this.f31187c;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        super.onDetachedFromWindow();
    }

    @JvmOverloads
    public AsyncViewStub(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ AsyncViewStub(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public AsyncViewStub(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.e(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.AsyncViewStub);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f31185a = typedArrayObtainStyledAttributes.getResourceId(x.AsyncViewStub_layout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
