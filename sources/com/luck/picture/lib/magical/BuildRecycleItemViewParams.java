package com.luck.picture.lib.magical;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BuildRecycleItemViewParams {
    private static final List<ViewParams> viewParams = new ArrayList();

    public static void clear() {
        List<ViewParams> list = viewParams;
        if (list.size() > 0) {
            list.clear();
        }
    }

    private static void fillPlaceHolder(List<View> list, int i7, int i10, int i11) {
        if (i10 > 0) {
            while (i10 >= 1) {
                list.add(0, null);
                i10--;
            }
        }
        if (i11 < i7) {
            for (int i12 = (i7 - 1) - i11; i12 >= 1; i12--) {
                list.add(null);
            }
        }
    }

    public static void generateViewParams(ViewGroup viewGroup, int i7) {
        int childCount;
        int count;
        int firstVisiblePosition;
        int lastVisiblePosition;
        ArrayList arrayList = new ArrayList();
        boolean z3 = viewGroup instanceof RecyclerView;
        if (z3) {
            childCount = ((RecyclerView) viewGroup).getChildCount();
        } else {
            if (!(viewGroup instanceof ListView)) {
                throw new IllegalArgumentException(viewGroup.getClass().getCanonicalName() + " Must be " + RecyclerView.class + " or " + ListView.class);
            }
            childCount = ((ListView) viewGroup).getChildCount();
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        if (z3) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) viewGroup).getLayoutManager();
            if (gridLayoutManager == null) {
                return;
            }
            count = gridLayoutManager.getItemCount();
            firstVisiblePosition = gridLayoutManager.findFirstVisibleItemPosition();
            lastVisiblePosition = gridLayoutManager.findLastVisibleItemPosition();
        } else {
            ListView listView = (ListView) viewGroup;
            ListAdapter adapter = listView.getAdapter();
            if (adapter == null) {
                return;
            }
            count = adapter.getCount();
            firstVisiblePosition = listView.getFirstVisiblePosition();
            lastVisiblePosition = listView.getLastVisiblePosition();
        }
        if (lastVisiblePosition > count) {
            lastVisiblePosition = count - 1;
        }
        fillPlaceHolder(arrayList, count, firstVisiblePosition, lastVisiblePosition);
        viewParams.clear();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            View view = (View) arrayList.get(i11);
            ViewParams viewParams2 = new ViewParams();
            if (view == null) {
                viewParams2.setLeft(0);
                viewParams2.setTop(0);
                viewParams2.setWidth(0);
                viewParams2.setHeight(0);
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                viewParams2.setLeft(iArr[0]);
                viewParams2.setTop(iArr[1] - i7);
                viewParams2.setWidth(view.getWidth());
                viewParams2.setHeight(view.getHeight());
            }
            viewParams.add(viewParams2);
        }
    }

    public static ViewParams getItemViewParams(int i7) {
        List<ViewParams> list = viewParams;
        if (list.size() > i7) {
            return list.get(i7);
        }
        return null;
    }
}
