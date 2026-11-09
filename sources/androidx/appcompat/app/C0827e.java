package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: renamed from: androidx.appcompat.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0827e extends CursorAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f12217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0832j f12218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0830h f12219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0827e(C0830h c0830h, ContextThemeWrapper contextThemeWrapper, Cursor cursor, AlertController$RecycleListView alertController$RecycleListView, C0832j c0832j) {
        super((Context) contextThemeWrapper, cursor, false);
        this.f12219e = c0830h;
        this.f12217c = alertController$RecycleListView;
        this.f12218d = c0832j;
        Cursor cursor2 = getCursor();
        this.f12215a = cursor2.getColumnIndexOrThrow(c0830h.f12235K);
        this.f12216b = cursor2.getColumnIndexOrThrow(c0830h.f12236L);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f12215a));
        this.f12217c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f12216b) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12219e.f12239b.inflate(this.f12218d.f12274L, viewGroup, false);
    }
}
