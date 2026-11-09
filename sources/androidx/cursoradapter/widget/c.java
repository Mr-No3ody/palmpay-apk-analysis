package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.T0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f16381a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((T0) this.f16381a).convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorRunQueryOnBackgroundThread = ((T0) this.f16381a).runQueryOnBackgroundThread(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorRunQueryOnBackgroundThread != null) {
            filterResults.count = cursorRunQueryOnBackgroundThread.getCount();
            filterResults.values = cursorRunQueryOnBackgroundThread;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f16381a;
        Cursor cursor = bVar.f16376c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((T0) bVar).changeCursor((Cursor) obj);
    }
}
