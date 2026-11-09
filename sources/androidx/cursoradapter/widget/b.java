package androidx.cursoradapter.widget;

import C0.G;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.C0884t0;
import androidx.appcompat.widget.T0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable, CursorFilter$CursorFilterClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f16376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f16378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0884t0 f16379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f16380g;

    public abstract void a(View view, Cursor cursor);

    public abstract View b(ViewGroup viewGroup);

    public void changeCursor(Cursor cursor) {
        Cursor cursor2 = this.f16376c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f16378e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                C0884t0 c0884t0 = this.f16379f;
                if (c0884t0 != null) {
                    cursor2.unregisterDataSetObserver(c0884t0);
                }
            }
            this.f16376c = cursor;
            if (cursor != null) {
                a aVar2 = this.f16378e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                C0884t0 c0884t1 = this.f16379f;
                if (c0884t1 != null) {
                    cursor.registerDataSetObserver(c0884t1);
                }
                this.f16377d = cursor.getColumnIndexOrThrow("_id");
                this.f16374a = true;
                notifyDataSetChanged();
            } else {
                this.f16377d = -1;
                this.f16374a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence convertToString(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f16374a || (cursor = this.f16376c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public final Cursor getCursor() {
        return this.f16376c;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f16374a) {
            return null;
        }
        this.f16376c.moveToPosition(i7);
        if (view == null) {
            T0 t1 = (T0) this;
            view = t1.f12825o.inflate(t1.f12824j, viewGroup, false);
        }
        a(view, this.f16376c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f16380g == null) {
            c cVar = new c();
            cVar.f16381a = this;
            this.f16380g = cVar;
        }
        return this.f16380g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        Cursor cursor;
        if (!this.f16374a || (cursor = this.f16376c) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f16376c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        Cursor cursor;
        if (this.f16374a && (cursor = this.f16376c) != null && cursor.moveToPosition(i7)) {
            return this.f16376c.getLong(this.f16377d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f16374a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f16376c.moveToPosition(i7)) {
            throw new IllegalStateException(G.m(i7, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = b(viewGroup);
        }
        a(view, this.f16376c);
        return view;
    }
}
