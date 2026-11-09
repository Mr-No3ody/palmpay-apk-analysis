package com.luck.picture.lib.widget;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class SlideSelectionHandler implements SlideSelectTouchListener.OnAdvancedSlideSelectListener {
    private HashSet<Integer> mOriginalSelection;
    private final ISelectionHandler mSelectionHandler;
    private ISelectionStartFinishedListener mStartFinishedListener = null;

    public interface ISelectionHandler {
        void changeSelection(int i7, int i10, boolean z3, boolean z8);

        Set<Integer> getSelection();
    }

    public interface ISelectionStartFinishedListener {
        void onSelectionFinished(int i7);

        void onSelectionStarted(int i7, boolean z3);
    }

    public SlideSelectionHandler(ISelectionHandler iSelectionHandler) {
        this.mSelectionHandler = iSelectionHandler;
    }

    private void checkedChangeSelection(int i7, int i10, boolean z3) {
        this.mSelectionHandler.changeSelection(i7, i10, z3, false);
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnSlideSelectListener
    public void onSelectChange(int i7, int i10, boolean z3) {
        while (i7 <= i10) {
            checkedChangeSelection(i7, i7, z3 != this.mOriginalSelection.contains(Integer.valueOf(i7)));
            i7++;
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnAdvancedSlideSelectListener
    public void onSelectionFinished(int i7) {
        this.mOriginalSelection = null;
        ISelectionStartFinishedListener iSelectionStartFinishedListener = this.mStartFinishedListener;
        if (iSelectionStartFinishedListener != null) {
            iSelectionStartFinishedListener.onSelectionFinished(i7);
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnAdvancedSlideSelectListener
    public void onSelectionStarted(int i7) {
        this.mOriginalSelection = new HashSet<>();
        Set<Integer> selection = this.mSelectionHandler.getSelection();
        if (selection != null) {
            this.mOriginalSelection.addAll(selection);
        }
        boolean zContains = this.mOriginalSelection.contains(Integer.valueOf(i7));
        this.mSelectionHandler.changeSelection(i7, i7, !this.mOriginalSelection.contains(Integer.valueOf(i7)), true);
        ISelectionStartFinishedListener iSelectionStartFinishedListener = this.mStartFinishedListener;
        if (iSelectionStartFinishedListener != null) {
            iSelectionStartFinishedListener.onSelectionStarted(i7, zContains);
        }
    }

    public SlideSelectionHandler withStartFinishedListener(ISelectionStartFinishedListener iSelectionStartFinishedListener) {
        this.mStartFinishedListener = iSelectionStartFinishedListener;
        return this;
    }
}
