package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Z0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public final class ExpandedMenuView extends ListView implements MenuBuilder$ItemInvoker, MenuView, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f12342b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f12343a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void initialize(k kVar) {
        this.f12343a = kVar;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$ItemInvoker
    public final boolean invokeItem(m mVar) {
        return this.f12343a.performItemAction(mVar, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        invokeItem((m) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        Z0 z0F = Z0.f(context, attributeSet, f12342b, i7, 0);
        TypedArray typedArray = z0F.f12863b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(z0F.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(z0F.b(1));
        }
        z0F.g();
    }
}
