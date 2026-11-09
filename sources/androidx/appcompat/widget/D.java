package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.view.C1052d;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    @DoNotInline
    public static boolean a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            androidx.core.view.N.m(textView, new C1052d(dragEvent.getClipData(), 3, 0).build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    @DoNotInline
    public static boolean b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        androidx.core.view.N.m(view, new C1052d(dragEvent.getClipData(), 3, 0).build());
        return true;
    }
}
