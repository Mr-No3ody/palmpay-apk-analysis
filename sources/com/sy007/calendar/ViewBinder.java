package com.sy007.calendar;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p081f8.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sy007/calendar/ViewBinder;", "Landroid/view/View;", "T", "", "Landroid/view/ViewGroup;", "parent", "create", "(Landroid/view/ViewGroup;)Landroid/view/View;", "view", "Lf8/b;", "calendarDay", "", "onBind", "(Landroid/view/View;Lf8/b;)V", "calendar-view_release"}, k = 1, mv = {1, 4, 0})
public interface ViewBinder<T extends View> {
    @NotNull
    T create(@NotNull ViewGroup parent);

    void onBind(@NotNull T view, @NotNull b calendarDay);
}
